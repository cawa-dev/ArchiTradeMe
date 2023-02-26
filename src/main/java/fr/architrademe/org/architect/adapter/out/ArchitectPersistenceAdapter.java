package fr.architrademe.org.architect.adapter.out;

import fr.architrademe.org.architect.application.port.out.CreateArchitectPort;
import fr.architrademe.org.architect.application.port.out.LoadArchitectPort;
import fr.architrademe.org.architect.application.port.out.LoadArchitectsByNamePort;
import fr.architrademe.org.architect.application.port.out.UpdateArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectException;
import fr.architrademe.org.architect.domain.ArchitectId;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@SuppressWarnings("all")
public class ArchitectPersistenceAdapter implements CreateArchitectPort, UpdateArchitectPort, LoadArchitectPort, LoadArchitectsByNamePort {

    private final ArchitectEntityRepository architectEntityRepository;

    public ArchitectPersistenceAdapter(ArchitectEntityRepository architectEntityRepository) {
        this.architectEntityRepository = architectEntityRepository;
    }

    @Override
    public ArchitectId nextId() {
        return ArchitectId.of(UUID.randomUUID());
    }

    @Override
    public void save(Architect architect) {
        var architectEntity = new ArchitectEntity(
                architect.id().value(),
                architect.firstname(),
                architect.lastname(),
                architect.experiences(),
                architect.averageDailyRates(),
                architect.availablity(),
                architect.modality());
        architectEntityRepository.save(architectEntity);
    }

    @Override
    public void update(Architect architect) {
        var architectEntity = ArchitectEntityMapper.toEntity(architect);
        architectEntityRepository.save(architectEntity);
    }

    @Override
    public Architect load(ArchitectId architectId) {
        var architectEntity = architectEntityRepository.findById(architectId.value());

        return architectEntity
                .map(ArchitectEntityMapper::toDomain)
                .orElseThrow(() -> ArchitectException.notFoundArchitectId(ArchitectId.of(UUID.fromString(architectEntity
                        .get().getArchitectID()))));
    }

    @Override
    public List<Architect> loads(String firstname) {
        List<ArchitectEntity> architectEntities = architectEntityRepository.findArchitectEntitiesByFirstname(firstname);
        return architectEntities.stream()
                .map(ArchitectEntityMapper::toDomain)
                .collect(Collectors.toList());
    }
}
package fr.architrademe.org.architect.adapter.out;

import fr.architrademe.org.architect.application.port.out.CreateArchitectPort;
import fr.architrademe.org.architect.application.port.out.LoadArchitectPort;
import fr.architrademe.org.architect.application.port.out.UpdateArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectException;
import fr.architrademe.org.architect.domain.ArchitectId;

import java.util.Optional;
import java.util.UUID;

public class ArchitectPersistenceAdapter implements CreateArchitectPort, UpdateArchitectPort, LoadArchitectPort {

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
        var architectEntity = new ArchitectEntity(
                architect.id().value(),
                architect.firstname(),
                architect.lastname(),
                architect.experiences(),
                architect.averageDailyRates(),
                architect.availablity(),
                architect.modality()
        );
        architectEntityRepository.save(architectEntity);
    }

    @Override
    public Architect load(ArchitectId architectId) {
        Optional<ArchitectEntity> optionalArchitectEntity = architectEntityRepository.findById(architectId.value());
        if (optionalArchitectEntity.isPresent()) {
            var architectEntity = optionalArchitectEntity.get();
            ArchitectId architectIdFromEntity = ArchitectId
                    .of(UUID.fromString(architectEntity.getArchitectID()));

            return new Architect(
                    architectIdFromEntity,
                    architectEntity.getFirstname(),
                    architectEntity.getLastname(),
                    architectEntity.getExperiences(),
                    architectEntity.getAverageDailyRates(),
                    architectEntity.getAvailablity(),
                    architectEntity.getModality()
            );
        }

        throw ArchitectException.notFoundArchitectId(architectId);
    }
}
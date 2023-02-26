package fr.architrademe.org.architect.adapter.out;

import fr.architrademe.org.architect.application.port.out.CreateArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;

import java.util.UUID;

public class ArchitectPersistenceAdapter implements CreateArchitectPort {

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
}
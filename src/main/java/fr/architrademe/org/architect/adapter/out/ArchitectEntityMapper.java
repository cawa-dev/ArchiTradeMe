package fr.architrademe.org.architect.adapter.out;

import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;

import java.util.UUID;

public interface ArchitectEntityMapper {

    static Architect toDomain(ArchitectEntity architectEntity) {
        return new Architect(
                ArchitectId.of(UUID.fromString(architectEntity.getArchitectID())),
                architectEntity.getFirstname(),
                architectEntity.getLastname(),
                architectEntity.getExperiences(),
                architectEntity.getAverageDailyRates(),
                architectEntity.getAvailablity(),
                architectEntity.getModality()
        );
    }

    static ArchitectEntity toEntity(Architect architect) {
        return new ArchitectEntity(
                architect.id().value(),
                architect.firstname(),
                architect.lastname(),
                architect.experiences(),
                architect.averageDailyRates(),
                architect.availablity(),
                architect.modality()
        );
    }
}
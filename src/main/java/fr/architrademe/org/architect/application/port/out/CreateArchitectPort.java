package fr.architrademe.org.architect.application.port.out;

import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;

public interface CreateArchitectPort {
    ArchitectId nextId();

    void save(Architect architect);
}
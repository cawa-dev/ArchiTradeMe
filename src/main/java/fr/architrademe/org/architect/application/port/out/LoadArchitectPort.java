package fr.architrademe.org.architect.application.port.out;

import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;

public interface LoadArchitectPort {

    Architect load(ArchitectId architectId);
}
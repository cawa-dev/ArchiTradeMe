package fr.architrademe.org.architect.application;

import fr.architrademe.org.architect.domain.ArchitectId;
import kernel.ApplicationException;

public final class ArchitectApplicationException extends ApplicationException {

    private ArchitectApplicationException(String message) {
        super(message);
    }
}
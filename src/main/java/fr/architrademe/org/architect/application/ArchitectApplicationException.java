package fr.architrademe.org.architect.application;

import kernel.ApplicationException;

public final class ArchitectApplicationException extends ApplicationException {

    private ArchitectApplicationException(String message) {
        super(message);
    }

}

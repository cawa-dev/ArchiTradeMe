package fr.architrademe.org.architect.application;

public final class ArchitectApplicationException extends RuntimeException {

    private ArchitectApplicationException(String message) {
        super(message);
    }
}
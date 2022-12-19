package fr.architrademe.org.architect.domain;

// Tactical DDD Exception
public class ArchitectException extends RuntimeException {

    private ArchitectException() {
        throw new AssertionError();
    }

    public static ArchitectException create() {
        throw new ArchitectException();
    }
}

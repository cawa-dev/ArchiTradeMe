package fr.architrademe.org.architect.domain;

// Tactical DDD Exception
public class ArchitectException extends RuntimeException{

    public ArchitectException(String message) {
        super(message);
    }
}

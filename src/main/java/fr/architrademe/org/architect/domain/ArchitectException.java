package fr.architrademe.org.architect.domain;

public final class ArchitectException extends RuntimeException {
    private ArchitectException(String message) {
        super(message);
    }

    public static ArchitectException notFoundArchitectId(ArchitectId architectId) {
        return new ArchitectException(String.format("%s not found.", architectId.value()));
    }
}
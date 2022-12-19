package fr.architrademe.org.architect.domain;

import java.util.Objects;
import java.util.UUID;

// VO ID for Architect Entity
public final class ArchitectID {

    private final UUID value;

    private ArchitectID(UUID value) {
        this.value = value;
    }

    // static factory method to instantiate our Object
    public static ArchitectID of(UUID value) {
        return new ArchitectID(value);
    }

    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchitectID that = (ArchitectID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    
    @Override
    public String toString() {
        return "ArchitectID{" +
                "value=" + value +
                '}';
    }
}

package fr.architrademe.org.architect.domain;

import java.util.Objects;
import java.util.UUID;

public final class ArchitectId {

    private final UUID value;

    private ArchitectId(UUID value) {
        this.value = value;
    }

    public static ArchitectId of(UUID value) {
        return new ArchitectId(value);
    }

    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchitectId that = (ArchitectId) o;
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

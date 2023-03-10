package fr.architrademe.org.architect.domain;

import java.util.List;
import java.util.Objects;

public final class Architect {

    private final ArchitectId architectId;
    private String firstname;
    private String lastname;
    private List<String> experiences;
    private String averageDailyRates;
    private String availablity;
    private String modality;

    public Architect(
            ArchitectId architectId,
            String firstname,
            String lastname,
            List<String> experiences,
            String averageDailyRates,
            String availablity,
            String modality
    ) {
        this.architectId = architectId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.experiences = experiences;
        this.averageDailyRates = averageDailyRates;
        this.availablity = availablity;
        this.modality = modality;
    }

    //TODO: Implements Business Method

    public ArchitectId id() {
        return architectId;
    }

    public String firstname() {
        return firstname;
    }

    public String lastname() {
        return lastname;
    }

    public List<String> experiences() {
        return experiences;
    }

    public String averageDailyRates() {
        return averageDailyRates;
    }

    public String availablity() {
        return availablity;
    }

    public String modality() {
        return modality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Architect architect = (Architect) o;
        return Objects.equals(architectId, architect.architectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architectId);
    }

    @Override
    public String toString() {
        return "Architect{" +
                "architectID=" + architectId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", experiences=" + experiences +
                ", averageDailyRates='" + averageDailyRates + '\'' +
                ", availablity='" + availablity + '\'' +
                ", modality='" + modality + '\'' +
                '}';
    }
}
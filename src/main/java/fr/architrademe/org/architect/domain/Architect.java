package fr.architrademe.org.architect.domain;

import java.util.List;
import java.util.Objects;

// Entity
public final class Architect {

    // Entity VO ID
    private final ArchitectID architectID;
    private String firstname;
    private String lastname;
    // Expériences VO
    private List<Experiences> experiences;
    // TJM VO
    private AverageDailyRates averageDailyRates;
    // Disponibilités VO
    private Availablity availablity;
    // Modalité VO
    private Modality modality;

    public Architect(ArchitectID architectID,
                     String firstname,
                     String lastname,
                     List<Experiences> experiences,
                     AverageDailyRates averageDailyRates,
                     Availablity availablity,
                     Modality modality
    ) {
        this.architectID = architectID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.experiences = experiences;
        this.averageDailyRates = averageDailyRates;
        this.availablity = availablity;
        this.modality = modality;
    }

    // TODO: Implements Business Method

    public ArchitectID id() {
        return architectID;
    }

    public String firstname() {
        return firstname;
    }

    public String lastname() {
        return lastname;
    }

    public List<Experiences> experiences() {
        return experiences;
    }

    public AverageDailyRates averageDailyRates() {
        return averageDailyRates;
    }

    public Availablity availablity() {
        return availablity;
    }

    public Modality modality() {
        return modality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Architect architect = (Architect) o;
        return Objects.equals(architectID, architect.architectID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architectID);
    }
}

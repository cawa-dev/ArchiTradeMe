package fr.architrademe.org.architect.adapter.out;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_ARCHITECT")
public class ArchitectEntity {

    @Id
    private String architectID;
    private String firstname;
    private String lastname;
    @ElementCollection
    private List<String> experiences;
    private String averageDailyRates;
    private String availablity;
    private String modality;

    public ArchitectEntity(
            String architectID,
            String firstname,
            String lastname,
            List<String> experiences,
            String averageDailyRates,
            String availablity,
            String modality
    ) {
        this.architectID = architectID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.experiences = experiences;
        this.averageDailyRates = averageDailyRates;
        this.availablity = availablity;
        this.modality = modality;
    }

    public ArchitectEntity() {
    }

    public String getArchitectID() {
        return architectID;
    }

    public void setArchitectID(String architectID) {
        this.architectID = architectID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<String> experiences) {
        this.experiences = experiences;
    }

    public String getAverageDailyRates() {
        return averageDailyRates;
    }

    public void setAverageDailyRates(String averageDailyRates) {
        this.averageDailyRates = averageDailyRates;
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}

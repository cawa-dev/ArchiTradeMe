package fr.architrademe.org.architect.adapter.in;

import java.util.List;

public class FindArchitectResponse {

    public final String architectId;
    public final String firstname;
    public final String lastname;
    public final List<String> experiences;
    public final String averageDailyRates;
    public final String availabilty;
    public final String modality;

    public FindArchitectResponse(
            String architectId,
            String firstname,
            String lastname,
            List<String> experiences,
            String averageDailyRates,
            String availabilty,
            String modality
    ) {
        this.architectId = architectId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.experiences = experiences;
        this.averageDailyRates = averageDailyRates;
        this.availabilty = availabilty;
        this.modality = modality;
    }
}
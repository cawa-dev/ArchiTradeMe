package fr.architrademe.org.architect.application.port.in;

import kernel.Command;

import javax.validation.constraints.NotNull;
import java.util.List;

public final class UpdateArchitectCommand implements Command {

    @NotNull
    public final String architectId;
    public final String firstname;
    public final String lastname;
    public final List<String> experiences;
    public final String averageDailyRates;
    public final String availablity;
    public final String modality;


    public UpdateArchitectCommand(
            String architectId,
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
}
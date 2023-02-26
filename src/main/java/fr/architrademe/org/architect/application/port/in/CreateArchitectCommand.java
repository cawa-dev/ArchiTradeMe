package fr.architrademe.org.architect.application.port.in;

import kernel.Command;

import javax.validation.constraints.NotNull;
import java.util.List;

public final class CreateArchitectCommand implements Command {

    @NotNull
    public final String firstname;
    @NotNull
    public final String lastname;
    @NotNull
    public final List<String> experiences;
    @NotNull
    public final String averageDailyRates;
    @NotNull
    public final String availablity;
    @NotNull
    public final String modality;


    public CreateArchitectCommand(
            String firstname,
            String lastname,
            List<String> experiences,
            String averageDailyRates,
            String availablity,
            String modality
    ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.experiences = experiences;
        this.averageDailyRates = averageDailyRates;
        this.availablity = availablity;
        this.modality = modality;
    }
}

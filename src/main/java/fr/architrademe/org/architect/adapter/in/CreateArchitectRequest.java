package fr.architrademe.org.architect.adapter.in;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateArchitectRequest {
    @NotNull
    public String firstname;
    @NotNull
    public String lastname;
    @NotNull
    public List<String> experiences;
    @NotNull
    public String averageDailyRates;
    @NotNull
    public String availablity;
    @NotNull
    public String modality;
}

import fr.architrademe.org.architect.domain.*;

import java.util.Arrays;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        // VO ID
        ArchitectID architectID = ArchitectID.of(UUID.randomUUID());
        // VO
        Experiences experiences1 = Experiences.of("toto", "reara", 3);
        Experiences experiences2 = Experiences.of("toto", "reara", 3);
        Experiences experiences3 = Experiences.of("toto", "reara", 3);
        // VO
        AverageDailyRates averageDailyRates = new AverageDailyRates();
        // VO
        Availablity availablity = new Availablity();
        // VO
        Modality modality = new Modality();

        // Entity
        Architect architect = new Architect(
                architectID,
                "Sacha",
                "MOUCHON",
                Arrays.asList(experiences1, experiences2, experiences3),
                averageDailyRates,
                availablity,
                modality
        );

        System.out.println(architectID);
    }
}

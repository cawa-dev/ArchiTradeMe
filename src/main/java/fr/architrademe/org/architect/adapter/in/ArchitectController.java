package fr.architrademe.org.architect.adapter.in;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import kernel.CommandBus;

import java.util.List;

public final class ArchitectController {

    private final CommandBus commandBus;

    public ArchitectController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    public String create(
            String firstname,
            String lastname,
            List<String> experiences,
            String averageDailyRates,
            String availability,
            String modality
    ) {
        return (String) commandBus.post(new CreateArchitectCommand(
                firstname,
                lastname,
                experiences,
                averageDailyRates,
                availability,
                modality
        ));
    }
}
package fr.architrademe.org.architect.adapter.in;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import kernel.CommandBus;
import kernel.QueryBus;

import java.util.List;

public final class ArchitectController {

    private final CommandBus commandBus;
    private final QueryBus queryBus;

    public ArchitectController(CommandBus commandBus, QueryBus queryBus) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
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

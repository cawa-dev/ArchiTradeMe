package fr.architrademe.org.architect.application.services;


import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.port.out.CreateArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import kernel.CommandHandler;

public final class CreateArchitectService implements CommandHandler<CreateArchitectCommand, String> {

    private final CreateArchitectPort createArchitectPort;

    public CreateArchitectService(CreateArchitectPort createArchitectPort) {
        this.createArchitectPort = createArchitectPort;
    }

    @Override
    public String handle(CreateArchitectCommand command) {
        var architectId = createArchitectPort.nextId();
        var architect = new Architect(
                architectId,
                command.firstname,
                command.lastname,
                command.experiences,
                command.averageDailyRates,
                command.availablity,
                command.modality
        );
        createArchitectPort.save(architect);
        return architectId.value();
    }
}

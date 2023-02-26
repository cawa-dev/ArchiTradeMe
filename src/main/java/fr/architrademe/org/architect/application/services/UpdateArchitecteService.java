package fr.architrademe.org.architect.application.services;

import fr.architrademe.org.architect.application.port.in.UpdateArchitectCommand;
import fr.architrademe.org.architect.application.port.out.UpdateArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;
import kernel.CommandHandler;

import java.util.UUID;

public class UpdateArchitecteService implements CommandHandler<UpdateArchitectCommand, String> {

    private final UpdateArchitectPort updateArchitectPort;

    public UpdateArchitecteService(UpdateArchitectPort updateArchitectPort) {
        this.updateArchitectPort = updateArchitectPort;
    }

    @Override
    public String handle(UpdateArchitectCommand command) {
        var architectId = ArchitectId.of(UUID.fromString(command.architectId));
        var newArchitect = new Architect(
                architectId,
                command.firstname,
                command.lastname,
                command.experiences,
                command.averageDailyRates,
                command.availablity,
                command.modality
        );
        updateArchitectPort.update(newArchitect);

        return architectId.value();
    }
}
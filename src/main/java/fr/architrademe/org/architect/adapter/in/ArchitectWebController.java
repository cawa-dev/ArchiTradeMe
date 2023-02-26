package fr.architrademe.org.architect.adapter.in;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import kernel.CommandBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/architects")
@SuppressWarnings("all")
public class ArchitectWebController {

    private final CommandBus commandBus;

    @Autowired
    private ArchitectWebController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateArchitectResponse create(@RequestBody @Valid CreateArchitectRequest createArchitectRequest) {
        var architectId = (String) commandBus.post(new CreateArchitectCommand(
                createArchitectRequest.firstname,
                createArchitectRequest.lastname,
                createArchitectRequest.experiences,
                createArchitectRequest.averageDailyRates,
                createArchitectRequest.availablity,
                createArchitectRequest.modality
        ));
        return new CreateArchitectResponse(architectId);
    }
}

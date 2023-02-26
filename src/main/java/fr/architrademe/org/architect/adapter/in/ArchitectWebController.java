package fr.architrademe.org.architect.adapter.in;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.port.in.LoadArchitectQuery;
import fr.architrademe.org.architect.application.port.in.LoadArchitectsByNameQuery;
import fr.architrademe.org.architect.application.port.in.UpdateArchitectCommand;
import fr.architrademe.org.architect.domain.Architect;
import kernel.CommandBus;
import kernel.QueryBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/architects")
@SuppressWarnings("all")
public class ArchitectWebController {

    private final CommandBus commandBus;

    private final QueryBus queryBus;

    @Autowired
    private ArchitectWebController(CommandBus commandBus, QueryBus queryBus) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CreateArchitectResponse create(
            @RequestBody @Valid CreateArchitectRequest createArchitectRequest
    ) {
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

    @PutMapping(
            path = "/{architectId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public UpdateArchitectResponse update(
            @RequestBody @Valid UpdateArchitectRequest updateArchitectRequest,
            @PathVariable String architectId
    ) {
        commandBus.post(new UpdateArchitectCommand(
                architectId,
                updateArchitectRequest.firstname,
                updateArchitectRequest.lastname,
                updateArchitectRequest.experiences,
                updateArchitectRequest.averageDailyRates,
                updateArchitectRequest.availablity,
                updateArchitectRequest.modality
        ));
        return new UpdateArchitectResponse(architectId);
    }

    @GetMapping(
            path = "/id/{architectId}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public FindArchitectResponse findById(
            @PathVariable String architectId
    ) {
        var architect = (Architect) queryBus.post(new LoadArchitectQuery(architectId));
        return new FindArchitectResponse(
                architect.id().value(),
                architect.firstname(),
                architect.lastname(),
                architect.experiences(),
                architect.averageDailyRates(),
                architect.availablity(),
                architect.modality()
        );
    }

    @GetMapping(
            path = "/firstname/{firstname}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public FindAllArchitectsByNameResponse findAllByName(
            @PathVariable String firstname
    ) {
        var architects = (List<Architect>) queryBus.post(new LoadArchitectsByNameQuery(firstname));
        return new FindAllArchitectsByNameResponse(
                architects
        );
    }
}
package fr.architrademe.org.architect;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.port.in.LoadArchitectQuery;
import fr.architrademe.org.architect.application.port.in.LoadArchitectsByNameQuery;
import fr.architrademe.org.architect.application.port.in.UpdateArchitectCommand;
import fr.architrademe.org.architect.application.services.CreateArchitectService;
import fr.architrademe.org.architect.application.services.GetArchitectByNameService;
import fr.architrademe.org.architect.application.services.GetArchitectService;
import fr.architrademe.org.architect.application.services.UpdateArchitecteService;
import kernel.CommandBus;
import kernel.QueryBus;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private final CommandBus commandBus;
    private final QueryBus queryBus;
    private final CreateArchitectService createArchitectService;
    private final UpdateArchitecteService updateArchitecteService;
    private final GetArchitectService getArchitectService;
    private final GetArchitectByNameService getArchitectByNameService;


    public StartupApplicationListener(
            CommandBus commandBus,
            QueryBus queryBus,
            CreateArchitectService createArchitectService,
            UpdateArchitecteService updateArchitecteService,
            GetArchitectService getArchitectService,
            GetArchitectByNameService getArchitectByNameService
    ) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
        this.createArchitectService = createArchitectService;
        this.updateArchitecteService = updateArchitecteService;
        this.getArchitectService = getArchitectService;
        this.getArchitectByNameService = getArchitectByNameService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        commandBus.register(CreateArchitectCommand.class, createArchitectService);
        commandBus.register(UpdateArchitectCommand.class, updateArchitecteService);
        queryBus.register(LoadArchitectQuery.class, getArchitectService);
        queryBus.register(LoadArchitectsByNameQuery.class, getArchitectByNameService);
    }
}
package fr.architrademe.org.architect;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.services.CreateArchitectService;
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


    public StartupApplicationListener(CommandBus commandBus, QueryBus queryBus, CreateArchitectService createArchitectService) {
        this.commandBus = commandBus;
        this.queryBus = queryBus;
        this.createArchitectService = createArchitectService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        commandBus.register(CreateArchitectCommand.class, createArchitectService);
    }
}

package fr.architrademe.org.architect;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.services.CreateArchitectService;
import kernel.CommandBus;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private final CommandBus commandBus;
    private final CreateArchitectService createArchitectService;


    public StartupApplicationListener(CommandBus commandBus, CreateArchitectService createArchitectService) {
        this.commandBus = commandBus;
        this.createArchitectService = createArchitectService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        commandBus.register(CreateArchitectCommand.class, createArchitectService);
    }
}
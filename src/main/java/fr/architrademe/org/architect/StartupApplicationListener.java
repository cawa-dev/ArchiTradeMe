package fr.architrademe.org.architect;

import fr.architrademe.org.architect.application.port.in.CreateArchitectCommand;
import fr.architrademe.org.architect.application.port.in.UpdateArchitectCommand;
import fr.architrademe.org.architect.application.services.CreateArchitectService;
import fr.architrademe.org.architect.application.services.UpdateArchitecteService;
import kernel.CommandBus;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private final CommandBus commandBus;
    private final CreateArchitectService createArchitectService;
    private final UpdateArchitecteService updateArchitecteService;


    public StartupApplicationListener(CommandBus commandBus, CreateArchitectService createArchitectService, UpdateArchitecteService updateArchitecteService) {
        this.commandBus = commandBus;
        this.createArchitectService = createArchitectService;
        this.updateArchitecteService = updateArchitecteService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        commandBus.register(CreateArchitectCommand.class, createArchitectService);
        commandBus.register(UpdateArchitectCommand.class, updateArchitecteService);
    }
}
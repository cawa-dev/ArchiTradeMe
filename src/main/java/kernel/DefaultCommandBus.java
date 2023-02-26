package kernel;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Map;
import java.util.Set;

final class DefaultCommandBus<C extends Command> implements CommandBus<C> {

    private final Map<Class<C>, CommandHandler> registry;
    private final Validator validator;

    DefaultCommandBus(Map<Class<C>, CommandHandler> registry, Validator validator) {
        this.registry = registry;
        this.validator = validator;
    }

    @Override
    public <R> R post(C command) {
        final Set<ConstraintViolation<C>> violations = validator.validate(command);
        if (!violations.isEmpty()) {
            throw new ApplicationException(violations.toString());
        }

        try {
            var commandHandler = registry.get(command.getClass());
            return (R) commandHandler.handle(command);
        } catch (Exception e) {
            throw new ApplicationException(String.format("Can't execute %s", command.name()), e);
        }
    }

    @Override
    public <R> void register(Class<C> commandClass, CommandHandler<C, R> commandHandler) {
        registry.putIfAbsent(commandClass, commandHandler);
    }
}
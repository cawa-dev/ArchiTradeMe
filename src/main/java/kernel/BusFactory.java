package kernel;

import java.util.HashMap;

public final class BusFactory {

    private BusFactory() {
        throw new AssertionError();
    }

    public static CommandBus defaultCommandBus() {
        return new DefaultCommandBus(new HashMap<>(), UseCaseValidator.getInstance().validator());
    }
}
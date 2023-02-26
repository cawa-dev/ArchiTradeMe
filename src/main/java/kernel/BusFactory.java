package kernel;

import java.util.HashMap;

public final class BusFactory {

    private BusFactory() {
        throw new AssertionError();
    }

    public static CommandBus defaultCommandBus() {
        return new DefaultCommandBus(new HashMap<>(), UseCaseValidator.getInstance().validator());
    }

    public static QueryBus defaultQueryBus() {
        return new DefaultQueryBus(new HashMap<>(), UseCaseValidator.getInstance().validator());
    }
}
package kernel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KernelConfiguration {

    @Bean
    public CommandBus commandBus() {
        return BusFactory.defaultCommandBus();
    }
}
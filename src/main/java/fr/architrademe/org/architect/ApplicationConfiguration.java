package fr.architrademe.org.architect;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import fr.architrademe.org.architect.adapter.in.ArchitectSerializer;
import fr.architrademe.org.architect.adapter.out.ArchitectEntityRepository;
import fr.architrademe.org.architect.adapter.out.ArchitectPersistenceAdapter;
import fr.architrademe.org.architect.application.services.CreateArchitectService;
import fr.architrademe.org.architect.application.services.GetArchitectByNameService;
import fr.architrademe.org.architect.application.services.GetArchitectService;
import fr.architrademe.org.architect.application.services.UpdateArchitecteService;
import fr.architrademe.org.architect.domain.Architect;
import kernel.KernelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({KernelConfiguration.class, JpaConfiguration.class})
@SuppressWarnings("all")
public class ApplicationConfiguration {

    @Autowired
    private ArchitectEntityRepository architectEntityRepository;

    @Bean
    public ArchitectPersistenceAdapter persistenceAdapter() {
        return new ArchitectPersistenceAdapter(architectEntityRepository);
    }

    @Bean
    public CreateArchitectService createArchitectService() {
        return new CreateArchitectService(persistenceAdapter());
    }

    @Bean
    public UpdateArchitecteService updateArchitecteService() {
        return new UpdateArchitecteService(persistenceAdapter());
    }

    @Bean
    public GetArchitectService getArchitectService() {
        return new GetArchitectService(persistenceAdapter());
    }

    @Bean
    public GetArchitectByNameService getArchitectByNameService() {
        return new GetArchitectByNameService(persistenceAdapter());
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(Architect.class, new ArchitectSerializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
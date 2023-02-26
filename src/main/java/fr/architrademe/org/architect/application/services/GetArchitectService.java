package fr.architrademe.org.architect.application.services;

import fr.architrademe.org.architect.application.port.in.LoadArchitectQuery;
import fr.architrademe.org.architect.application.port.out.LoadArchitectPort;
import fr.architrademe.org.architect.domain.Architect;
import fr.architrademe.org.architect.domain.ArchitectId;
import kernel.QueryHandler;

import java.util.UUID;

public final class GetArchitectService implements QueryHandler<LoadArchitectQuery, Architect> {

    private final LoadArchitectPort loadAccountPort;

    public GetArchitectService(LoadArchitectPort loadAccountPort) {
        this.loadAccountPort = loadAccountPort;
    }

    @Override
    public Architect handle(LoadArchitectQuery query) {
        return loadAccountPort
                .load(ArchitectId.of(UUID.fromString(query.architectId)));
    }
}
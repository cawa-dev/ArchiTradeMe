package fr.architrademe.org.architect.application.services;

import fr.architrademe.org.architect.application.port.in.LoadArchitectsByNameQuery;
import fr.architrademe.org.architect.application.port.out.LoadArchitectsByNamePort;
import fr.architrademe.org.architect.domain.Architect;
import kernel.QueryHandler;

import java.util.List;

public final class GetArchitectByNameService implements QueryHandler<LoadArchitectsByNameQuery, List<Architect>> {

    private final LoadArchitectsByNamePort loadArchitectsByNamePort;

    public GetArchitectByNameService(LoadArchitectsByNamePort loadArchitectsByNamePort) {
        this.loadArchitectsByNamePort = loadArchitectsByNamePort;
    }

    @Override
    public List<Architect> handle(LoadArchitectsByNameQuery query) {
        return loadArchitectsByNamePort.loads(query.firstname);
    }
}
package fr.architrademe.org.architect.application.port.out;

import fr.architrademe.org.architect.domain.Architect;

import java.util.List;

public interface LoadArchitectsByNamePort {

    List<Architect> loads(String firstname);
}
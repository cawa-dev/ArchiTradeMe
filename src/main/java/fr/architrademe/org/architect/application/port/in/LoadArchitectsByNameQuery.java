package fr.architrademe.org.architect.application.port.in;

import kernel.Query;

import javax.validation.constraints.NotNull;

public class LoadArchitectsByNameQuery implements Query {

    @NotNull
    public final String firstname;

    public LoadArchitectsByNameQuery(String firstname) {
        this.firstname = firstname;
    }
}
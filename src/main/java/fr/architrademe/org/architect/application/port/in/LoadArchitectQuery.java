package fr.architrademe.org.architect.application.port.in;

import kernel.Query;

import javax.validation.constraints.NotNull;

public class LoadArchitectQuery implements Query {

    @NotNull
    public final String architectId;

    public LoadArchitectQuery(String architectId) {
        this.architectId = architectId;
    }
}
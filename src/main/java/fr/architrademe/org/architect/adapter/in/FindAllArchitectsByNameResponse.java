package fr.architrademe.org.architect.adapter.in;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.architrademe.org.architect.domain.Architect;

import java.util.List;

public class FindAllArchitectsByNameResponse {

    @JsonProperty
    public final List<Architect> architects;

    public FindAllArchitectsByNameResponse(List<Architect> architects) {
        this.architects = architects;
    }
}
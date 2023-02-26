package fr.architrademe.org.architect.adapter.in;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import fr.architrademe.org.architect.domain.Architect;

import java.io.IOException;

public class ArchitectSerializer extends JsonSerializer<Architect> {

    @Override
    public void serialize(
            Architect architect,
            JsonGenerator jsonGenerator,
            SerializerProvider serializerProvider
    ) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("architectId", architect.id().value());
        jsonGenerator.writeStringField("firstname", architect.firstname());
        jsonGenerator.writeStringField("lastname", architect.lastname());
        jsonGenerator.writeObjectField("experiences", architect.experiences());
        jsonGenerator.writeStringField("averageDailyRates", architect.averageDailyRates());
        jsonGenerator.writeStringField("availablity", architect.availablity());
        jsonGenerator.writeStringField("modality", architect.modality());
        jsonGenerator.writeEndObject();
    }
}
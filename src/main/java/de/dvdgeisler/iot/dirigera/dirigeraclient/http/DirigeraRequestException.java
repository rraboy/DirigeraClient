package de.dvdgeisler.iot.dirigera.dirigeraclient.http;

import java.io.IOException;
import java.util.Map;

public class DirigeraRequestException extends IOException {

    public DirigeraRequestException(final String error, final String message) {
        super(String.format("Error while requesting Dirigera: error=%s, message=%s",error,message));
    }
    public DirigeraRequestException(final Map<String, Object> response) {
        this(response.getOrDefault("error", "Unknown").toString(), response.getOrDefault("message", "No error message available").toString());
    }
}
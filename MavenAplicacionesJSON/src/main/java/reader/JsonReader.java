package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import modelos.User;
import utilities.Logs;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private final static String userPath = "src/main/resources/data/user.json";

    public static User leerUsuarioJson() {
        final var objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(new File(userPath), User.class);
        } catch (IOException ioException) {
            Logs.error("ioException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}

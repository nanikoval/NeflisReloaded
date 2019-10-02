package persistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Contenido;
import model.Serie;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class NeflisStorage {
    private ObjectMapper objectMapper;

    public NeflisStorage(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Contenido> contenidos() {
        try {
            return objectMapper.readValue
                    (new File("/Users/Marina/Desktop/demo/src/main/resources/contents.json"),
                            new TypeReference<List<Serie>>() {
                            }
                    );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void wirteSerie (Serie serie) {
        try {
            objectMapper.writeValue(new File("/Users/Marina/Desktop/demo/src/main/resources/contents.json"),
                    serie);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

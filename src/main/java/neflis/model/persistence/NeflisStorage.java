package neflis.model.persistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import neflis.model.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class NeflisStorage {
    @Autowired
    private ObjectMapper objectMapper;

    public List<Contenido> contenidos() {
        try {
            return objectMapper.readValue
                    (new File("src/main/resources/contents.json"),
                            new TypeReference<List<Contenido>>() {
                            }
                    );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}

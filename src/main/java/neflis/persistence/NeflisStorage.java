package neflis.persistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import neflis.model.Contenido;
import neflis.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class NeflisStorage {
    @Autowired
    private ObjectMapper objectMapper;
    public List<Content> contents() {
        try {
            return objectMapper.readValue
                    (new File("/C:/Users/Marina/Desktop/NeflisReloaded/src/main/resources/contents.json"),
                            new TypeReference<List<Content>>() {
                            }
                    );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
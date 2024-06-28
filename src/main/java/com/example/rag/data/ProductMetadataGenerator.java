package com.example.rag.data;
import org.springframework.ai.reader.JsonMetadataGenerator;


import java.util.Map;

public class ProductMetadataGenerator implements JsonMetadataGenerator {

    @Override
    public Map<String, Object> generate(Map<String, Object> jsonMap) {
        return Map.of("name", jsonMap.get("name"),
                "shortDescription", jsonMap.get("shortDescription"));
    }

}

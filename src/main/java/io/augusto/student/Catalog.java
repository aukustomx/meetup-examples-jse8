package io.augusto.student;

import java.util.HashMap;
import java.util.Map;

public interface Catalog {

    String getKey();
    String getValue();

    default Map<String, String> asCatalogMap() {
        Map<String, String> map =  new HashMap<>();
        map.put("key", getKey());
        map.put("value", getValue());
        return map;
    }
}

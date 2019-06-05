package org.madsol.tas;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private final Map<String, Object> shelf;

    public Context() {
        this.shelf = new HashMap<>();
        set(Metadata.EXECUTION_LEVEL, 1);
    }

    public Context(Map<String, Object> shelf) {
        this.shelf = shelf;
    }

    public Object get(String key) {
        return shelf.get(key);
    }

    public void set(String key, Object value) {
        shelf.put(key, value);
    }

    public static class Metadata {

        public static final String EXECUTION_LEVEL = "EXECUTION_LEVEL";
    }
}

package cv.mikusher.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParameterMap implements Map<String, String> {

    private Map<String, String> map = new HashMap<String, String>();

    @Override
    public  void clear() {
        map.clear();
    }

    @Override
    public  boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public  boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public  Set<java.util.Map.Entry<String, String>> entrySet() {
        return map.entrySet();
    }

    @Override
    public  String get(Object key) {
        return map.get(key);
    }

    @Override
    public  boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public  Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public  String put(String key, String value) {
        return map.put(key, value);
    }

    @Override
    public  void putAll(Map<? extends String, ? extends String> arg) {
        map.putAll(arg);
    }

    @Override
    public  String remove(Object key) {
        return map.remove(key);
    }

    @Override
    public  int size() {
        return map.size();
    }

    @Override
    public  Collection<String> values() {
        return map.values();
    }

    /**
     * Convenience method returns this class so multiple calls can be chained.
     *
     * @param name
     * @param value
     * @return This map
     */
    public  ParameterMap add(String name, String value) {
        map.put(name, value);
        return this;
    }

    //todo: convert to Json Object

}

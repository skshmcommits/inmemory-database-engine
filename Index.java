import java.util.*;

class Index {
    Map<String, List<Row>> indexMap = new HashMap<>();

    void add(String key, Row row) {
        indexMap.computeIfAbsent(key, k -> new ArrayList<>()).add(row);
    }

    List<Row> get(String key) {
        return indexMap.getOrDefault(key, new ArrayList<>());
    }
}

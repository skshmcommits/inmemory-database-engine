import java.util.*;

class Table {
    List<Row> rows = new ArrayList<>();
    Index ageIndex = new Index();

    void insert(Row row) {
        rows.add(row);
        ageIndex.add(row.get("age"), row);
    }

    List<Row> getAllRows() {
        return rows;
    }

    // Full scan
    List<Row> scan(String column, String value) {
        List<Row> result = new ArrayList<>();

        for (Row row : rows) {
            if (Objects.equals(row.get(column), value)) {
                result.add(row);
            }
        }

        return result;
    }

    List<Row> indexSearch(String value) {
        return ageIndex.get(value);
    }
}

import java.util.*;

class QueryEngine {

    Table table;

    QueryEngine(Table table) {
        this.table = table;
    }

    List<Row> query(String column, String value, boolean useIndex) {
        if (useIndex) {
            return table.indexSearch(value);
        } else {
            return table.scan(column, value);
        }
    }
}

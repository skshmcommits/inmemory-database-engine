import java.util.Map;

class Row {
    Map<String, String> data;

    Row(Map<String, String> data) {
        this.data = data;
    }

    String get(String column) {
        return data.get(column);
    }
}

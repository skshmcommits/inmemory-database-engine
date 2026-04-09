import java.util.*;

public class Main {
    public static void main(String[] args) {

        Table table = new Table();

        // Insert sample data
        for (int i = 0; i < 1000; i++) {
            Map<String, String> data = new HashMap<>();
            data.put("id", String.valueOf(i));
            data.put("name", "User" + i);
            data.put("age", String.valueOf(i % 50));
            table.insert(new Row(data));
        }

        QueryEngine engine = new QueryEngine(table);

        // Scan query
        long start = System.nanoTime();
        List<Row> result1 = engine.query("age", "30", false);
        long end = System.nanoTime();
        System.out.println("Scan time: " + (end - start) + " ns");

        // Index query
        start = System.nanoTime();
        List<Row> result2 = engine.query("age", "30", true);
        end = System.nanoTime();
        System.out.println("Index time: " + (end - start) + " ns");

        System.out.println("Rows found: " + result2.size());
    }
}

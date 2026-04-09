🚀 In-Memory Database with Indexing (Java)

A lightweight in-memory database engine built in Java to simulate core DBMS concepts such as table storage, full table scans, and hash-based indexing for efficient query execution.

📌 Features
🗄️ Table Storage using in-memory data structures (List<Row>)
🔍 Full Table Scan (O(n)) for querying without indexes
⚡ Hash-Based Indexing (O(1)) for fast lookups
🧠 Query Engine to switch between scan and index-based execution
📊 Performance Benchmarking using System.nanoTime()
🧩 Flexible Schema using key-value row representation
🏗️ Project Structure
project/
 ├── Main.java          # Entry point + benchmarking
 ├── Row.java           # Row abstraction (key-value pairs)
 ├── Table.java         # Storage + scan + index integration
 ├── Index.java         # Hash-based index implementation
 └── QueryEngine.java   # Query execution logic
⚙️ How It Works
1. Data Storage
Each row is stored as a Map<String, String>
All rows are maintained in a list inside the table
2. Full Scan (Brute Force)
Iterates over all rows
Time Complexity: O(n)
3. Indexing
Uses a HashMap<String, List<Row>>
Maps column values → corresponding rows
Time Complexity: O(1) lookup
4. Query Execution
QueryEngine decides:
Scan → when no index used
Index lookup → when enabled
🧪 Example Execution
javac *.java
java Main
Sample Output
Scan time: 50000 ns
Index time: 5000 ns
Rows found: 20
📈 Performance Insight
Operation	Time Complexity
Full Scan	O(n)
Index Lookup	O(1)

👉 Demonstrates the classic DB trade-off:

Faster reads with indexing
Slight overhead during inserts
🧠 Key Concepts Demonstrated
Database indexing fundamentals
Query execution strategies
Time complexity trade-offs
In-memory data modeling
Basic system design for data storage
🔥 Limitations (Intentional)

This project is designed for learning core concepts, so it does not include:

SQL parsing
Joins or aggregations
Multiple indexes
Disk persistence
Query optimization
🚀 Future Improvements
Support indexing on multiple columns
Add simple query parser (SQL-like syntax)
Implement composite indexes
Add persistence (file-based storage)
Introduce query optimizer
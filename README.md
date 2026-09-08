# Software Construction — Lab 4: Data Types, Mutability, and Collections

## Objective
Apply concepts of mutability, interface implementations (List, Map, Set), and safe
iterator traversal using Java Collections.

## What I Implemented
- **StringPerformance.java** — compares `String` concatenation (`s = s + i`) vs
  `StringBuilder.append()` for n = 10000, timing both to show the O(n²) vs O(n)
  performance difference.
- **CourseManager.java** — demonstrates `ConcurrentModificationException` when
  removing items from a `List` during a for-each loop, then fixes it using
  `Iterator.remove()` in a `while(iter.hasNext())` loop.
- **TreasureMap.java** — builds a `HashMap<String, Double>`, updates `"palm"`'s
  value using the map's size, and sums all values with a for-each loop over
  `treasures.values()`.
- **zoo.java** — wraps a mutable `List<String>` with `Collections.unmodifiableList()`
  and catches the `UnsupportedOperationException` thrown when trying to modify it.
- **LabTests.java** — JUnit 5 tests covering all four tasks above.

## How to Run

### Requirements
- JDK 17+
- Maven (for dependency management / running tests)

### Run each class

# Reflection — 13 August 2026

**Topic:** Drawing a Static Square with Java Swing and Java 2D  
**Location:** `Class Activity/lab01/src/main/java/com/example/SwingSquare.java`

---

### Overview
In this session, I learned how to build a desktop GUI application using Java Swing and render geometric shapes using the Java 2D graphics API. The activity focused on rendering a centered, hollow square inside a custom window.

---

### Learning Objectives
* Create and manage application windows using `JFrame`.
* Implement a custom drawing surface by extending `JPanel`.
* Override `paintComponent(Graphics g)` for custom rendering.
* Dynamically center shapes based on current panel dimensions.
* Launch the GUI safely using Swing's Event Dispatch Thread (EDT).

---

### Key Classes Used
* **`JFrame`**: Top-level container representing the main application window.
* **`JPanel`**: Lightweight container providing the drawing surface.
* **`Graphics` / `Graphics2D`**: Drawing context providing rendering methods like `drawRect()`.
* **`Color`**: Sets foreground drawing and background colors.
* **`SwingUtilities`**: Ensures thread-safe UI creation via `invokeLater()`.

---

### Implementation Details

1. **Custom Painting (`paintComponent`)**:
   Always invoke `super.paintComponent(g)` first to clear the background properly before drawing.
   ```java
   super.paintComponent(g);
   ```

2. **Centering the Square**:
   The top-left coordinates $(x, y)$ are calculated dynamically from panel dimensions so the square remains centered even if resized:
   ```java
   int size = 200;
   int x = (getWidth() - size) / 2;
   int y = (getHeight() - size) / 2;
   g.setColor(Color.BLACK);
   g.drawRect(x, y, size, size); // drawRect creates a hollow square
   ```

3. **Thread Safety**:
   GUI initialization is scheduled on the Event Dispatch Thread:
   ```java
   SwingUtilities.invokeLater(() -> {
       // initialize JFrame & components
   });
   ```

---

### Build & Run
From `Class Activity/lab01`:
```powershell
mvn clean compile exec:java
```

---

### Key Takeaways
* **Swing vs Java 2D**: Swing manages the GUI component hierarchy, while Java 2D handles rendering.
* **Rendering Lifecycle**: Custom drawing belongs strictly inside `paintComponent()`, not constructors.
* **Responsive Layouts**: Recalculating coordinates from component dimensions enables responsive rendering.

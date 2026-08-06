# CSC360 Course Notes

## Questions & Answers

### 1. What is the difference between Computer graphics and Digital Image Processing?
* **Computer Graphics (CG)**: The process of generating, manipulating, and rendering digital visual content from abstract mathematical descriptions, models, or data structures.
  $$\text{Data/Models} \rightarrow \text{Image}$$
* **Digital Image Processing (DIP)**: The process of applying mathematical operations to existing digital images to analyze, enhance, restore, or compress them.
  $$\text{Image} \rightarrow \text{Processed Image / Feature Data}$$

### 2. What are the geometric primitives of drawing?
Geometric primitives are the fundamental vector objects used by graphics systems to build complex shapes. They include:
* **Points**: Coordinates defining a single position in space (e.g., $(x, y)$ or $(x, y, z)$).
* **Lines / Line Segments**: Straight paths connecting two points.
* **Polygons**: Closed shapes formed by connecting line segments (triangles are the most common primitive in 3D graphics).
* **Curves / Circles / Ellipses**: Non-linear paths defined by mathematical equations.

### 3. Describe the graphical framework in Java.
Java offers several graphical toolkits and APIs:
* **AWT (Abstract Window Toolkit)**: The original Java library using native OS components (heavyweight).
* **Swing**: Built on top of AWT, offering platform-independent, customizable GUI components (lightweight).
* **Java 2D API**: Extends AWT/Swing to provide advanced two-dimensional rendering, alpha compositing, coordinate transformations, and text styling.
* **JavaFX**: The modern successor to Swing, featuring a scene graph architecture, FXML for UI design, CSS styling, and built-in hardware acceleration.

### 4. What is the Design Patterns for User Interface?
Common design patterns to organize user interfaces and manage user interactions include:
* **Architectural Patterns**:
  * **MVC (Model-View-Controller)**: Separates data model, UI representation, and control logic.
  * **MVP (Model-View-Presenter)**: View is passive; the presenter handles UI logic and pushes updates directly.
  * **MVVM (Model-View-ViewModel)**: Connects the view and model using declarative data binding.
* **Behavioral Patterns**:
  * **Observer**: Notifies UI components of data model changes.
  * **Command**: Encapsulates actions (e.g., button clicks) to support queuing and undo/redo operations.
  * **Composite**: Represents nested UI component hierarchies (containers containing other components).

### 5. How is tstatic graphocs different from interactive graphics
* **Static Graphics**: Fixed images where the content is pre-rendered and cannot change in response to user actions (e.g., JPEG photos, printed charts).
* **Interactive Graphics**: Real-time graphics that react dynamically to inputs (mouse clicks, movement, key presses), updating the internal state and re-rendering the output dynamically (e.g., video games, CAD software).

### 6. How is curve connected with calculus?
Calculus provides the mathematical tools to define, analyze, and render smooth curves:
* **Tangents and Rates of Change**: The first derivative ($C^1$ continuity) defines the tangent vector (direction) of a parametric curve at any point.
* **Curvature**: The second derivative ($C^2$ continuity) measures how sharply the curve bends.
* **Arc Length**: Integration is used to compute the precise length of a curved path by summing up infinitesimal line segments along the curve.
* **Bézier Curves & Splines**: Continuity conditions (e.g., $C^0, C^1, C^2$) ensure curves meet smoothly at their control points.

### 7. Describe ssh and https protocols for accessing git repositories.
* **HTTPS (`https://`)**:
  * Uses SSL/TLS encryption over port 443 (usually open on all networks).
  * Uses Personal Access Tokens (PATs) or credential managers for authentication.
* **SSH (`git@github.com:...`)**:
  * Runs over port 22.
  * Relies on asymmetric key pair authentication. Once configured, it does not require password prompts.

### 8. Mention the tools used ssh operation.
* `ssh`: Core command-line client used to connect to remote hosts.
* `ssh-keygen`: Tool used to generate public and private key pairs.
* `ssh-agent`: Background manager that holds decrypted keys in memory.
* `ssh-add`: Utility to register private keys with `ssh-agent`.
* **Config File (`~/.ssh/config`)**: Used to configure connection settings for different hosts.

### 9. What are public key and private keys?
They are components of asymmetric cryptography:
* **Public Key**: Shared openly and uploaded to servers (e.g., GitHub). Used to encrypt data sent to you or to verify your digital signature.
* **Private Key**: Kept strictly secret on your local device. Used to decrypt data encrypted with your public key or to generate digital signatures to prove your identity.
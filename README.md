Here’s a full and detailed `README.md` for your project:

---

# **CSE 64_K Word Cloud with Java**

This repository contains a Java program that generates a colorful word cloud in the console. The word cloud is created using a list of names, randomized colors, and a structured pattern to produce visually appealing output.

---

## **Features**
- 🎨 Generates a word cloud using random names and colors.
- 💡 Outputs a structured, colorful design in the console.
- 🔄 Randomized names and colors ensure different results with every run.

---

## **Getting Started**

### Prerequisites
To run this program, ensure you have:
- **Java Development Kit (JDK)** installed. You can check by running:
  ```bash
  java -version
  javac -version
  ```
  If not installed, download it [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

- A console or terminal to execute Java commands.

---

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/mriiidul/Word_Cloud
   ```

2. Navigate to the project directory:
   ```bash
   cd Word_Cloud
   ```

3. Verify the project files:
   Ensure `DrawCSE.java` is present in the directory.

---

### Running the Program

1. **Compile the Java file**:
   ```bash
   javac DrawCSE.java
   ```

2. **Run the compiled program**:
   ```bash
   java DrawCSE
   ```

3. **Output**:
   The program will generate a colorful word cloud directly in the console. Each time you run it, the names and colors will be randomized.

---

## **Code Explanation**
The program works as follows:
- A list of predefined names is randomized for the word cloud.
- ANSI escape codes are used to apply colors to the names.
- The program uses nested loops to print patterns (borders, shapes, etc.) in the console.

---

## **Example Output**

![image](https://github.com/user-attachments/assets/5e6711d4-25ca-49dc-8f8e-fd02375ff4aa)

https://github.com/user-attachments/assets/3b2cf344-43a3-4e1f-9db4-bfefb3f0dadb

## **Customization**
Feel free to modify the program:
1. **Add more names**:
   Update the `names` list in `DrawCSE.java` to include more names.
2. **Change dimensions**:
   Modify the `height` and `width` variables for larger or smaller word clouds.
3. **Experiment with colors**:
   Update the `colors` array with new ANSI codes or custom formatting.

---

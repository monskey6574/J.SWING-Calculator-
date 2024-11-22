import java.awt.Font;
import javax.swing.*;

class MyCalculator extends JFrame { // MyCalculator extends JFrame

    JButton button;

    MyCalculator() { // Constructor of MyCalculator class to set up the layout of the frame
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);

        // Set a layout manager
        setLayout(null); // Use null for absolute positioning

        button = new JButton();
        button.setText("Click me");
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBounds(150, 150, 100, 50); // x, y, width, height

        add(button); // Add the button to the frame

        setVisible(true); // Make the frame visible after adding components
    }
}

class Calculator {
    public static void main(String[] args) {
        new MyCalculator(); // Create an object of MyCalculator class
    }
}

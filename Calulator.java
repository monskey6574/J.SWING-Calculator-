import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCalculator extends JFrame implements ActionListener {

    JButton[] buttonArr = new JButton[16];
    String[] buttons = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "C", "0", "=", "-"};
    JTextField display; // Text field to show input and results
    String currentInput = ""; // Keeps track of the current input
    String operator = ""; // Stores the operator
    double num1 = 0; // Stores the first number for calculations

    MyCalculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false); // Prevent user typing
        add(display, BorderLayout.NORTH);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 grid
        add(buttonPanel, BorderLayout.CENTER);

        // Initialize buttons
        for (int i = 0; i < buttons.length; i++) {
            buttonArr[i] = new JButton(buttons[i]);
            buttonArr[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttonArr[i].addActionListener(this); // Add action listener
            buttonPanel.add(buttonArr[i]);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Get the text of the button clicked

        if (command.matches("[0-9]")) { // If it's a number
            currentInput += command; // Append to current input
            display.setText(currentInput);
        } else if (command.matches("[+\\-*/]")) { // If it's an operator
            operator = command; // Store the operator
            num1 = Double.parseDouble(currentInput); // Store the first number
            currentInput = ""; // Reset input for the second number
        } else if (command.equals("=")) { // If it's the equals button
            double num2 = Double.parseDouble(currentInput); // Parse the second number
            double result = performOperation(num1, num2, operator); // Perform calculation
            display.setText(String.valueOf(result)); // Display the result
            currentInput = ""; // Reset input
        } else if (command.equals("C")) { // If it's the clear button
            currentInput = "";
            operator = "";
            num1 = 0;
            display.setText("");
        }
    }

    // Helper method to perform the operation
    private double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num2 != 0 ? num1 / num2 : 0; // Prevent division by zero
            default: return 0;
        }
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}

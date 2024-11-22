import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

class MyCalculator extends JFrame { // MyCalculator extends JFrame

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel label;

    MyCalculator() { // Constructor of MyCalculator class to set up the layout of the frame
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,4));

        JButton[] buttonArr = new JButton[16];

        String[] buttons = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "C", "0", "=", "-"};

        for(int i = 0; i<buttons.length;i++){
            buttonArr[i]=new JButton(buttons[i]);
            buttonArr[i].setFont(new Font(getName(), Font.BOLD, 20));
            add(buttonArr[i]);

        }





        // Set a layout manager

        // button1 = new JButton();
        // button1.setText("Click me");
        // button1.setFont(new Font("Arial", Font.BOLD, 20));
        // button1.setBounds(150, 150, 100, 50); // x, y, width, height

        // button2 = new JButton();
        // button2.setText("Click me");
        // button2.setFont(new Font("Arial", Font.BOLD, 20));
        // button2.setBounds(150, 150, 100, 50); // x, y, width, height

        // button3 = new JButton();
        // button3.setText("Click me");
        // button3.setFont(new Font("Arial", Font.BOLD, 20));
        // button3.setBounds(150, 150, 100, 50); // x, y, width, height

        // button4 = new JButton();
        // button4.setText("Click me");
        // button4.setFont(new Font("Arial", Font.BOLD, 20));
        // button4.setBounds(150, 150, 100, 50); // x, y, width, height


        // label = new JLabel();
        // label.setText("Hello World");
        // label.setFont(new Font("Arial", Font.BOLD, 20));
        // label.setBounds(150, 100, 100, 50); // x, y, width, height


        // add(button1); // Add the button to the frame
        // add(button2); // Add the button to the frame
        // add(button3); // Add the button to the frame
        // add(button4); // Add the button to the frame

        setVisible(true); // Make the frame visible after adding components
    }
}

class Calculator {
    public static void main(String[] args) {
        new MyCalculator(); // Create an object of MyCalculator class
    }
}

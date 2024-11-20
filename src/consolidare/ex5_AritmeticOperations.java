package consolidare;
// 5. Write a function that does the following for the given values: add, subtract, divide and multiply.
// These are simply referred to as the basic arithmetic operations.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex5_AritmeticOperations {
    public static void main(String args[]) {

        //create the frame
        createFrame();

    }

    public static void createFrame() {
        // Create the frame
        JFrame frame = new JFrame("Arithmetic Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        // Create text fields
        JLabel label1 = new JLabel("Number 1: ");
        JTextField textField1 = new JTextField(15);
        frame.add(label1);
        frame.add(textField1);

        JLabel label2 = new JLabel("Number 2: ");
        JTextField textField2 = new JTextField(15);
        frame.add(label2);
        frame.add(textField2);


        // Create the buttonS
        JButton buttonAdd = new JButton("ADD: + ");
        buttonAdd.setPreferredSize(new Dimension(250,30));
        frame.add(buttonAdd);

        JButton buttonSubtract = new JButton("SUBTRACT: - ");
        buttonSubtract.setPreferredSize(new Dimension(250,30));
        frame.add(buttonSubtract);

        JButton buttonDivide = new JButton("DIVIDE: /");
        buttonDivide.setPreferredSize(new Dimension(250,30));
        frame.add(buttonDivide);

        JButton buttonMultiply = new JButton("MULTIPLY: * ");
        buttonMultiply.setPreferredSize(new Dimension(250,30));
        frame.add(buttonMultiply);

        // CREATE Text field for results
        frame.add(new JLabel("RESULT:") );

        JTextField textFieldResult = new JTextField(15);
        frame.add(textFieldResult);

        // Add action listener to the button ADD
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed1(ActionEvent e) {
                // Get THE NUMBERS FROM TEXT FIELDS AND APPLY + operation
                int sum = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
                textFieldResult.setText(String.valueOf(sum));

            }
        });

        // Add action listener to the button SUBTRACT
        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get THE NUMBERS FROM TEXT FIELDS AND APPLY + operation
                int subtract = Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText());
                textFieldResult.setText(String.valueOf(subtract));

            }
        });

        // Add action listener to the button divide
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get THE NUMBERS FROM TEXT FIELDS AND APPLY + operation
                int divide = Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText());
                textFieldResult.setText(String.valueOf(divide));

            }
        });

        // Add action listener to the button multiply
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get THE NUMBERS FROM TEXT FIELDS AND APPLY + operation
                int multiply = Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText());
                textFieldResult.setText(String.valueOf(multiply));

            }
        });

        // Set the frame to be visible
        frame.setVisible(true);


    }


}

package TEXTfIELDS_LEARN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class textFieldReader {
        public static void main(String[] args) {
            // Create the frame
            JFrame frame = new JFrame("Text Field Reader");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new FlowLayout());

            // Create the text field
            JTextField textField = new JTextField(15);
            frame.add(textField);

            // Create the button
            JButton button = new JButton("Print to Console");
            frame.add(button);
            JButton buttonTwo = new JButton("Print to textField");
            frame.add(buttonTwo);
            JTextField textFieldtWO = new JTextField(15);
            frame.add(textFieldtWO);

            JButton exitButton = new JButton("EXIT");
            frame.add(exitButton);

            // Add action listener to the button
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Get the text from the text field and print it to the console
                    String text = textField.getText();
                    System.out.println(text);

                }
            });

            // Add action listener to the button
            buttonTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Get the text from the text field and print it to the console
                    String text = textField.getText();
                    textFieldtWO.setText(text);

                }
            });
            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You pressed exit!");
                   // frame.setVisible(false);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



                }
            });

            // Set the frame to be visible
            frame.setVisible(true);
        }
    }


import javax.swing.*;
import java.awt.event.*;

public class ResumeAssistant {

    public static void main(String[] args) {

        // Create window
        JFrame frame = new JFrame("AI Resume Assistant");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Name label
        JLabel nameLabel = new JLabel("Enter Your Name:");
        nameLabel.setBounds(30, 30, 150, 25);
        frame.add(nameLabel);

        // Name text field
        JTextField nameField = new JTextField();
        nameField.setBounds(180, 30, 150, 25);
        frame.add(nameField);

        // Skill label
        JLabel skillLabel = new JLabel("Your Skill:");
        skillLabel.setBounds(30, 70, 150, 25);
        frame.add(skillLabel);

        // Skill text field
        JTextField skillField = new JTextField();
        skillField.setBounds(180, 70, 150, 25);
        frame.add(skillField);

        // Button
        JButton button = new JButton("Generate Resume");
        button.setBounds(100, 120, 180, 30);
        frame.add(button);

        // Output area
        JTextArea output = new JTextArea();
        output.setBounds(30, 170, 300, 60);
        frame.add(output);

        // Button action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String skill = skillField.getText();

                output.setText(
                    "Name: " + name +
                    "\nRole: Java Developer" +
                    "\nSkill: " + skill +
                    "\nStatus: Ready for Hiring!"
                );
            }
        });

        // Show window
        frame.setVisible(true);
    }
}
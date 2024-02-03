import javax.swing.*;
import java.awt.*;

public class GUIForm extends JFrame {
    JTextField n = new JTextField(), a = new JTextField();
    JComboBox<String> g = new JComboBox<>(new String[]{"Male", "Female", "Others"});

    GUIForm() {
        setTitle("GUI FORM USING SWING");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));

        add(new JLabel("Name: ")); add(n);
        add(new JLabel("Age: ")); add(a);
        add(new JLabel("Gender: ")); add(g);

        JButton b = new JButton("Submit");
        b.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Name: " + n.getText() + "Age: " + a.getText() + "Gender: " + g.getSelectedItem(), "Form Submitted", JOptionPane.INFORMATION_MESSAGE )
                );

        add(b);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUIForm::new);
    }
}
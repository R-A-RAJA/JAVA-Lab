import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_3702 {
    private JTextField nameField;
    private JTextField ageField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JComboBox<String> courseComboBox;
    private JButton submitButton;
    private JTextArea displayArea;

    public GUI_3702() {
        JFrame frame = new JFrame("3702 - Student Details Form");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameField = new JTextField(15);
        ageField = new JTextField(3);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        String[] courses = {"Computer Technology", "Information Technology", "Electronics","Robotics","Rubber and Plastic","Mechanical","IOT"};
        courseComboBox = new JComboBox<>(courses);
        submitButton = new JButton("Submit");
        displayArea = new JTextArea(5, 30);
        displayArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.black);
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(6, 6, 6, 6);

        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel name=new JLabel("NAME:");
        name.setForeground(Color.WHITE);
        panel.add(name,c);

        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 75;
        c.ipady = 0;
        panel.add(nameField,c);

        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel age=new JLabel("AGE:");
        age.setForeground(Color.WHITE);
        panel.add(age,c);

        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(ageField,c);

        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel gender=new JLabel("GENDER:");
        gender.setForeground(Color.WHITE);
        panel.add(gender,c);

        c.gridx = 1;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(maleRadioButton,c);

        c.gridx = 2;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(femaleRadioButton,c);

        c.gridx = 0;
        c.gridy = 3;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel course=new JLabel("COURSE:");
        course.setForeground(Color.WHITE);
        panel.add(course,c);

        c.gridx = 1;
        c.gridy = 3;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(courseComboBox,c);

        c.gridx = 1;
        c.gridy = 4;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(submitButton,c);

        c.gridx = 1;
        c.gridy = 5;
        c.ipadx = 15;
        c.ipady = 50;
        panel.add(new JScrollPane(displayArea),c);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String course = (String) courseComboBox.getSelectedItem();

                displayArea.setText("Student Details:\n");
                displayArea.append("Name: " + name + "\n");
                displayArea.append("Age: " + age + "\n");
                displayArea.append("Gender: " + gender + "\n");
                displayArea.append("Course: " + course + "\n");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_3702();
    }
}

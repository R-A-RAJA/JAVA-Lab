import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GoogleForm_3702 extends JFrame {

    private JTextField firstNameField, lastNameField, usernameField, phoneField, recoveryEmailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> monthDropdown, dayDropdown, yearDropdown, genderDropdown;
    private JLabel firstNameError, lastNameError, usernameError, passwordError, confirmPasswordError, phoneError, recoveryEmailError, birthdayError;
    private JButton seePasswordButton, seeConfirmPasswordButton;

    public GoogleForm_3702() {
        setTitle("Create your Google Account 3702");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        firstNameField = new JTextField(15);
        setPlaceholder(firstNameField, "First name");
        firstNameField.setForeground(Color.BLACK);
        firstNameField.setBackground(Color.WHITE);
        firstNameField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        firstNameError = new JLabel("Enter first name");
        firstNameError.setForeground(Color.RED);
        firstNameError.setVisible(false);

        lastNameField = new JTextField(15);
        setPlaceholder(lastNameField, "Last name");
        lastNameField.setForeground(Color.BLACK);
        lastNameField.setBackground(Color.WHITE);
        lastNameField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        lastNameError = new JLabel("Enter last name");
        lastNameError.setForeground(Color.RED);
        lastNameError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 0;
        add(firstNameField, gbc);
        gbc.gridx = 1;
        add(lastNameField, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        add(firstNameError, gbc);
        gbc.gridx = 1;
        add(lastNameError, gbc);

        usernameField = new JTextField(15);
        setPlaceholder(usernameField, "Username");
        usernameField.setText("Username (your email)");
        usernameField.setForeground(Color.BLACK);
        usernameField.setBackground(Color.WHITE);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        usernameError = new JLabel("Choose a Gmail address");
        usernameError.setForeground(Color.RED);
        usernameError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 2;
        add(usernameField, gbc);
        gbc.gridx = 1;
        add(new JLabel("@gmail.com"), gbc);
        gbc.gridx = 0; gbc.gridy = 3;
        add(usernameError, gbc);

        passwordField = new JPasswordField(15);
        setPlaceholder(passwordField, "Password");
        passwordField.setForeground(Color.CYAN);
        passwordField.setBackground(Color.WHITE);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        passwordError = new JLabel("Use 8 or more characters with a mix of letters, numbers & symbols");
        passwordError.setForeground(Color.RED);
        passwordError.setVisible(false);

        confirmPasswordField = new JPasswordField(15);
        setPlaceholder(confirmPasswordField, "Confirm");
        confirmPasswordField.setForeground(Color.CYAN);
        confirmPasswordField.setBackground(Color.WHITE);
        confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        
        confirmPasswordError = new JLabel("Passwords don't match");
        confirmPasswordError.setForeground(Color.RED);
        confirmPasswordError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 4;
        add(passwordField, gbc);
        gbc.gridx = 1;
        add(confirmPasswordField, gbc);
        gbc.gridx = 0; gbc.gridy = 5;
        add(passwordError, gbc);
        gbc.gridx = 1;
        add(confirmPasswordError, gbc);

        seePasswordButton = new JButton("👁️");
        seePasswordButton.addActionListener(e -> togglePasswordVisibility(passwordField, seePasswordButton,confirmPasswordField, seeConfirmPasswordButton));
        gbc.gridx = 1;
        add(seePasswordButton, gbc);

        phoneField = new JTextField(15);
        setPlaceholder(phoneField, "Phone number");
        phoneField.setForeground(Color.BLACK);
        phoneField.setBackground(Color.WHITE);
        phoneField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        phoneError = new JLabel("This phone number format is not recognized.");
        phoneError.setForeground(Color.RED);
        phoneError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 6;
        add(phoneField, gbc);
        gbc.gridx = 0; gbc.gridy = 7;
        add(phoneError, gbc);
        JLabel phoneInfoLabel = new JLabel("We'll use your number for account security, it won't be visible to others.");
        phoneInfoLabel.setForeground(Color.GRAY);
        gbc.gridy = 8;
        add(phoneInfoLabel, gbc);

        recoveryEmailField = new JTextField(15);
        recoveryEmailField.setForeground(Color.BLACK);
        recoveryEmailField.setBackground(Color.WHITE);
        recoveryEmailField.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        setPlaceholder(recoveryEmailField, "Recovery email (optional)");
        recoveryEmailError = new JLabel("This email is not valid.");
        recoveryEmailError.setForeground(Color.RED);
        recoveryEmailError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 9;
        add(recoveryEmailField, gbc);
        gbc.gridx = 0; gbc.gridy = 10;
        add(recoveryEmailError, gbc);
        JLabel recoveryInfoLabel = new JLabel("We'll use it to keep your account secure.");
        recoveryInfoLabel.setForeground(Color.GRAY);
        gbc.gridy = 11;
        add(recoveryInfoLabel, gbc);

        JLabel birthdayLabel = new JLabel("Your Birthday");
        String[] months = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthDropdown = new JComboBox<>(months);

        String[] days = new String[32];
        days[0] = "Day";
        for (int i = 1; i <= 31; i++) {
            days[i] = Integer.toString(i);
        }
        dayDropdown = new JComboBox<>(days);

        String[] years = new String[122];
        years[0] = "Year";
        for (int i = 1900, j = 1; i <= 2020; i++, j++) {
            years[j] = Integer.toString(i);
        }
        yearDropdown = new JComboBox<>(years);
        birthdayError = new JLabel("Enter a valid birthday");
        birthdayError.setForeground(Color.RED);
        birthdayError.setVisible(false);

        gbc.gridx = 0; gbc.gridy = 12;
        add(birthdayLabel, gbc);
        gbc.gridx = 1;
        add(monthDropdown, gbc);
        gbc.gridx = 2;
        add(dayDropdown, gbc);
        gbc.gridx = 3;
        add(yearDropdown, gbc);
        gbc.gridx = 0; gbc.gridy = 13;
        add(birthdayError, gbc);

        JLabel genderLabel = new JLabel("Gender");
        String[] genders = {"Select Gender", "Male", "Female", "Other"};
        genderDropdown = new JComboBox<>(genders);

        gbc.gridx = 0; gbc.gridy = 14;
        add(genderLabel, gbc);
        gbc.gridx = 1;
        add(genderDropdown, gbc);

        JPanel buttonPanel = new JPanel();
        JButton createButton = new JButton("Create Account");
        createButton.setBackground(Color.RED);
        createButton.setForeground(Color.WHITE);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateForm();
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> System.exit(0));

        buttonPanel.add(createButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(cancelButton);

        gbc.gridx = 0; gbc.gridy = 15; gbc.gridwidth = 4;
        add(buttonPanel, gbc);

        setVisible(true);
    }

    private void togglePasswordVisibility(JPasswordField passwordField, JButton button,JPasswordField passwordField1, JButton button1) {
        if (passwordField.getEchoChar() == '\u2022') {
            passwordField.setEchoChar((char) 0);
            button.setText("👁️‍"); 
            passwordField1.setEchoChar((char) 0);
            button1.setText("👁️‍");
        } else {
            passwordField.setEchoChar('\u2022');
            button.setText("👁️"); 
            passwordField1.setEchoChar('\u2022');
            button1.setText("👁️");
        }
    }

    private void setPlaceholder(JTextComponent field, String placeholder) {
        field.setText(placeholder);
        field.setForeground(Color.GRAY);

        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(Color.GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    private void resetForm() {
        firstNameField.setText("");
        lastNameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        phoneField.setText("");
        recoveryEmailField.setText("");
        monthDropdown.setSelectedIndex(0);
        dayDropdown.setSelectedIndex(0);
        yearDropdown.setSelectedIndex(0);
        genderDropdown.setSelectedIndex(0);

        firstNameError.setVisible(false);
        lastNameError.setVisible(false);
        usernameError.setVisible(false);
        passwordError.setVisible(false);
        confirmPasswordError.setVisible(false);
        phoneError.setVisible(false);
        recoveryEmailError.setVisible(false);
        birthdayError.setVisible(false);
    }

    private void validateForm() {
        boolean isValid = true;

        if (firstNameField.getText().trim().isEmpty()) {
            firstNameError.setVisible(true);
            firstNameField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            firstNameError.setVisible(false);
            firstNameField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        if (lastNameField.getText().trim().isEmpty()) {
            lastNameError.setVisible(true);
            lastNameField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            lastNameError.setVisible(false);
            lastNameField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        String email = usernameField.getText().trim();
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            usernameError.setVisible(true);
            usernameField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            usernameError.setVisible(false);
            usernameField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        String password = new String(passwordField.getPassword());
        if (password.length() < 8) {
            passwordError.setVisible(true);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            passwordError.setVisible(false);
            passwordField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        String confirmPassword = new String(confirmPasswordField.getPassword());
        if (!password.equals(confirmPassword)) {
            confirmPasswordError.setVisible(true);
            confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            confirmPasswordError.setVisible(false);
            confirmPasswordField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        String phone = phoneField.getText().trim();
        if (!phone.matches("\\d{10}")) {
            phoneError.setVisible(true);
            phoneField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            phoneError.setVisible(false);
            phoneField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        String recoveryEmail = recoveryEmailField.getText().trim();
        if (!recoveryEmail.isEmpty() && !recoveryEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            recoveryEmailError.setVisible(true);
            recoveryEmailField.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            recoveryEmailError.setVisible(false);
            recoveryEmailField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        if (monthDropdown.getSelectedIndex() == 0 || dayDropdown.getSelectedIndex() == 0 || yearDropdown.getSelectedIndex() == 0) {
            birthdayError.setVisible(true);
            isValid = false;
        } else {
            birthdayError.setVisible(false);
        }

        if (isValid) {
            JOptionPane.showMessageDialog(this, "Account created successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please correct the errors and try again.");
        }
    }
    

    public static void main(String[] args) {
        new GoogleForm_3702();
    }
}

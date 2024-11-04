import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_3702 {
    private JTextField displayField;
    private StringBuilder currentInput;

    public Calculator_3702() {
        JFrame frame = new JFrame("Simple Calculator 3702");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setPreferredSize(new Dimension(0, 40));

        currentInput = new StringBuilder();

        JPanel buttonPanel1 = createButtonPanel("0", "1", "2", "3");
        JPanel buttonPanel2 = createButtonPanel("4", "5", "6", "7");
        JPanel buttonPanel3 = createButtonPanel("8", "9", "+", "-");
        JPanel buttonPanel4 = createButtonPanel("*", "/", "=", "C");

        frame.add(displayField);
        frame.add(buttonPanel1);
        frame.add(buttonPanel2);
        frame.add(buttonPanel3);
        frame.add(buttonPanel4);

        addButtonActions();

        frame.setVisible(true);
    }

    private JPanel createButtonPanel(String... labels) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));
        for (String label : labels) {
            JButton button = new JButton(label);
            panel.add(button);
        }
        return panel;
    }

    private void addButtonActions() {
        for (Component component : displayField.getParent().getComponents()) {
            if (component instanceof JPanel) {
                for (Component button : ((JPanel) component).getComponents()) {
                    ((JButton) button).addActionListener(new ButtonClickListener());
                }
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "=":
                    try {
                        double result = evaluate(currentInput.toString());
                        displayField.setText(String.valueOf(result));
                        currentInput.setLength(0);
                    } catch (Exception ex) {
                        displayField.setText("Error");
                        currentInput.setLength(0);
                    }
                    break;
                case "C":
                    currentInput.setLength(0);
                    displayField.setText("");
                    break;
                default:
                    currentInput.append(command);
                    displayField.setText(currentInput.toString());
                    break;
            }
        }
    }

    private double evaluate(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double nextValue = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += nextValue;
                    break;
                case "-":
                    result -= nextValue;
                    break;
                case "*":
                    result *= nextValue;
                    break;
                case "/":
                    if (nextValue != 0) {
                        result /= nextValue;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Calculator_3702();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition_3702 {
    private JTextField n1;
    private JTextField n2;
    private JButton addButton;
    private JTextArea resField;
    public Addition_3702() {
        JFrame frame = new JFrame("ADDITION");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        n1 = new JTextField(3);
        n2 = new JTextField(3);
        addButton = new JButton("ADD");
        resField = new JTextArea(3, 3);
        resField.setEditable(false);

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
        JLabel num1=new JLabel("1st Number:");
        num1.setForeground(Color.WHITE);
        panel.add(num1,c);

        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 75;
        c.ipady = 0;
        panel.add(n1,c);

        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel num2=new JLabel("2nd Number:");
        num2.setForeground(Color.WHITE);
        panel.add(num2,c);

        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 75;
        c.ipady = 0;
        panel.add(n2,c);

        c.gridx = 1;
        c.gridy = 2;
        c.ipadx = 0;
        c.ipady = 0;
        panel.add(addButton,c);

        c.gridx = 0;
        c.gridy = 3;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel resl=new JLabel("Result:");
        resl.setForeground(Color.WHITE);
        panel.add(resl,c);

        c.gridx = 1;
        c.gridy = 3;
        c.ipadx = 40;
        c.ipady = 0;
        panel.add(new JScrollPane(resField),c);

        c.gridx = 0;
        c.gridy = 4;
        c.ipadx = 0;
        c.ipady = 0;
        JLabel proof=new JLabel("By ATHITHRAJA R");
        proof.setForeground(Color.WHITE);
        panel.add(proof,c);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int a = Integer.parseInt(n1.getText());
                    int b = Integer.parseInt(n2.getText());
                    resField.setText(String.valueOf(a+b));
                }
                catch(Exception s){
                    resField.setText("Error");
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Addition_3702();
    }
}

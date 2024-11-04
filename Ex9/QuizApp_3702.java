import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApp_3702 {
    private JFrame frame;
    private JPanel panel;
    private JLabel questionLabel;
    private JRadioButton[] options;
    private ButtonGroup optionsGroup;
    private JButton nextButton;
    private int currentQuestionIndex;
    private int score;
    
    private String[] questions = {
            "Who is the founder of MIT?",
            "How many departments in MIT?",
            "In MIT, CB Block full form?",
            "Next CM 2026?",
            "In MIT, CT full form?"
    };

    private String[][] optionsData = {
            {"A.P.J Abdul Kalam", "Rajam", "Stalin", "Modi"},
            {"9", "2", "6", "20"},
            {"Chicken Box Block", "Cringe Big Block", "Charles Babbage Block", "Cat Bag Block"},
            {"Thalapathy Vijay", "Stalin", "Modi", "Dr. Divagar"},
            {"Critical Thinking", "Computer Technology", "Computer Teaching", "Cat Tom"}
    };

    private int[] correctAnswers = {1, 0, 2, 0, 1};

    public QuizApp_3702() {
        frame = new JFrame("Quiz Application 3702");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        questionLabel = new JLabel();
        questionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(questionLabel);

        options = new JRadioButton[4];
        optionsGroup = new ButtonGroup();
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton();
            options[i].setAlignmentX(Component.LEFT_ALIGNMENT);
            options[i].setFont(new Font("Arial", Font.PLAIN, 14));
            optionsGroup.add(options[i]);
            panel.add(options[i]);
        }

        nextButton = new JButton("Next");
        nextButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.setBackground(new Color(100, 150, 250));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                currentQuestionIndex++;
                if (currentQuestionIndex < questions.length) {
                    loadQuestion(currentQuestionIndex);
                } else {
                    showResult();
                }
            }
        });
        panel.add(nextButton);

        frame.add(panel, BorderLayout.WEST);
        frame.setVisible(true);

        currentQuestionIndex = 0;
        score = 0;
        loadQuestion(currentQuestionIndex);
    }

    private void loadQuestion(int questionIndex) {
        questionLabel.setText(questions[questionIndex]);
        for (int i = 0; i < options.length; i++) {
            options[i].setText(optionsData[questionIndex][i]);
            options[i].setSelected(false);
        }
    }

    private void checkAnswer() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected() && i == correctAnswers[currentQuestionIndex]) {
                score++;
            }
        }
    }

    private void showResult() {
        String message;
        if (score == 5) {
            message = "Quiz Over! Your score is: " + score + "\nAmazing :)";
        } else if (score >= 3) {
            message = "Quiz Over! Your score is: " + score + "\nKeep It Up :)";
        } else {
            message = "Quiz Over! Your score is: " + score + "\nBetter luck Next Time :(";
        }
        JOptionPane.showMessageDialog(frame, message);
        frame.dispose();
    }

    public static void main(String[] args) {
        new QuizApp_3702();
    }
}

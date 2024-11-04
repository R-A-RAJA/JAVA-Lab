import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class LibraryGUI_3702 extends JFrame {
    private ArrayList<String> books;
    private JTextField searchField;
    private JTextArea resultArea;

    public LibraryGUI_3702() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Database Systems");

        setTitle("Library Book Search");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel searchLabel = new JLabel("Enter Book Title:");
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                searchBook(searchText);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(searchLabel);
        panel.add(searchField);
        panel.add(searchButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        setVisible(true);
    }

    private void searchBook(String title) {
        resultArea.setText("");
        boolean found = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(title)) {
                resultArea.append("Book found: " + book + "\n");
                found = true;
            }
        }
        if (!found) {
            resultArea.append("Book not found.\n");
        }
    }

    public static void main(String[] args) {
        new LibraryGUI_3702();
    }
}

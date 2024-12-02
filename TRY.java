import javax.swing.JOptionPane;

public class TRY {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your birth year:"));
        int currentYear = 2024;
        int age = currentYear - birthYear;
        JOptionPane.showMessageDialog(null, "Hello " + name + ", you are " + age + " years old.");
    }
}
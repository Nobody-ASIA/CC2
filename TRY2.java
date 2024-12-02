import javax.swing.JOptionPane;

public class TRY2 {
    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog(null, "Enter the first number:", "Input",
                JOptionPane.QUESTION_MESSAGE);
        String secondNumber = JOptionPane.showInputDialog(null, "Enter the second number:", "Input",
                JOptionPane.QUESTION_MESSAGE);
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum, "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }

}

package Module2;
import javax.swing.JOptionPane;

public class SumValues {
    public static void main(String[] args) {

        String first = JOptionPane.showInputDialog("5");
        String second = JOptionPane.showInputDialog("3");

        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "Sum is " + sum);
    }

}

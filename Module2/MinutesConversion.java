package Module2;
import javax.swing.JOptionPane;

public class MinutesConversion {
     public static void main(String[] args) {

        double minutes = Double.parseDouble(
                JOptionPane.showInputDialog("Enter number of minutes:")
        );

        double hours = minutes / 60;
        double days = minutes / 1440;   // 60 * 24

        System.out.println(minutes + " minutes equals " + hours + " hours");
        System.out.println(minutes + " minutes equals " + days + " days");
    }
}

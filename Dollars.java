import javax.swing.JOptionPane;

public class Dollars {
    public static void main(String[] args) {
        int dollars = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of dollars:")
        );

        int twenties = dollars / 20;
        dollars = dollars % 20;

        int tens = dollars / 10;
        dollars = dollars % 10;

        int fives = dollars / 5;
        dollars = dollars % 5;

        int ones = dollars;

        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);
    }
}

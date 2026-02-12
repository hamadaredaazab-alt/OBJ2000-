import javax.swing.JOptionPane;

public class ElectionStatistics {
      public static void main(String[] args) {

        String p1 = JOptionPane.showInputDialog("Party 1:");
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Votes:"));

        String p2 = JOptionPane.showInputDialog("Party 2:");
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Votes:"));

        String p3 = JOptionPane.showInputDialog("Party 3:");
        int v3 = Integer.parseInt(JOptionPane.showInputDialog("Votes:"));

        int total = v1 + v2 + v3;

        System.out.println(p1 + " " + (v1 * 100.0 / total) + "%");
        System.out.println(p2 + " " + (v2 * 100.0 / total) + "%");
        System.out.println(p3 + " " + (v3 * 100.0 / total) + "%");
    }
}

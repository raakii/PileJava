
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialogInFrame extends JFrame {

    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Input Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    private void closeIt() {

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    public static void testPile() {
        InputDialogInFrame frame = new InputDialogInFrame();
        String m = JOptionPane.showInputDialog(frame, "Donner la capacité de la pile", 0);
        System.out.println(m);
        if (m == null) {
            frame.closeIt();
        } else {
            if (m.equals("0")) {

                testPile("Veuillez donner une capacité supérieure à 0");
            } else {
                System.out.println(m);
            }
        }

    }

    public static void testPile(String message) {
        InputDialogInFrame frame = new InputDialogInFrame();
        String m = JOptionPane.showInputDialog(frame, message, 0);
        if (m == null) {
            frame.closeIt();
        } else {
            if (m.equals("0")) {
                testPile(m);
            } else {
                System.out.println(m);
            }
        }
    }

    public static void main(String[] args) {
        testPile();
    }

}
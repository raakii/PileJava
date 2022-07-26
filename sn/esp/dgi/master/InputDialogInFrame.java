package sn.esp.dgi.master;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ca.quens.sat.master.Pile;
import fr.saclay.mai.master.Fraction;

public class InputDialogInFrame extends JFrame {

    private static int optionType;
    private static int messageType;

    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Input Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    public static int débuter() {
        String lesTextes[] = { "Pile", "Fraction" };
        String message = "Quelle classe voulez vous tester";
        int retour = JOptionPane.showOptionDialog(null, message, "Java Project",
                optionType, messageType, null, lesTextes, null);
        System.out.println(retour);
        return retour;
    }

    public static Pile InitPile() {
        String m = JOptionPane.showInputDialog(null, "Donner la capacité de la pile", 0);
        System.out.println(m);

        while (m.equals("0")) {

            System.out.println("Veuillez donner une capacité supérieure à 0");
            m = JOptionPane.showInputDialog(null, "Donner la capacité de la pile", 0);
        }
        int capacite = Integer.parseInt(m);
        Pile p = new Pile(capacite);

        System.out.println("pile de capacité " + capacite + " créée");
        return p;

    }

    public static void testPile(Pile p) {

        String lesTextes[] = { "empiler", "depiler", "getSommet", "afficher", "retour" };
        String message = "Que voulez vous?";
        int retour = JOptionPane.showOptionDialog(null, message, "Java Project",
                optionType, messageType, null, lesTextes, null);
        if (retour == 0) {
            if (p.estPleine()) {
                JOptionPane.showMessageDialog(null, "Impossible d'empiler la pile est pleine");
                testPile(p);
            } else {
                String n = JOptionPane.showInputDialog(null, "Entrer la valeur à empiler", 0);
                System.out.println(n);
                if (n != null) {
                    int l = Integer.parseInt(n);
                    p.empile(l);

                    JOptionPane.showMessageDialog(null, "l'élément " + l + " a été empilé.");
                    testPile(p);
                }

            }
        }

        if (retour == 1) {
            if (p.estVide()) {
                JOptionPane.showMessageDialog(null, "Impossible de dépiler la pile est vide");
                testPile(p);
            } else {
                int t = p.depile();

                JOptionPane.showMessageDialog(null, "l'élément " + t + " a été dépilé.");
                testPile(p);

            }
        }

        if (retour == 2) {
            if (p.estVide()) {
                JOptionPane.showMessageDialog(null, "Impossible d'obtenir le sommet! la pile est vide");
                testPile(p);
            } else {

                JOptionPane.showMessageDialog(null, "Le sommet de la pile est " + p.getSommet());
                testPile(p);
            }
        }

        if (retour == 3) {
            if (p.estVide()) {
                JOptionPane.showMessageDialog(null, "Impossible d'obtenir le sommet! la pile est vide");
                testPile(p);
            } else {

                JOptionPane.showMessageDialog(null, "L'état de la pile est " + p.versChaine());
                testPile(p);
            }
        }

        if (retour == 4) {
            débuter();
        }
    }

    public static Fraction initFraction() {
        JTextField numerateur = new JTextField();
        JTextField denominateur = new JTextField();
        Object[] message = {
                "Numerateur:", numerateur,
                "Denominateur", denominateur
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        Fraction f = null;
        if (option == JOptionPane.OK_OPTION) {
            if (denominateur != null && numerateur != null) {
                if (Integer.parseInt(denominateur.getText()) == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Impossible d'initialiser cette fraction! Entrer un numerateur non nul");
                    initFraction();
                } else {
                    int num = Integer.parseInt(numerateur.getText());
                    int den = Integer.parseInt(denominateur.getText());
                    f = new Fraction(num, den);
                }
            }
        }
        return f;
    }

    public static void TestFraction(Fraction f1, Fraction f2) {
        String lesTextes[] = { "additionner", "soustraire", "multiplier", "diviser", "reduire", "retour" };
        String message = "Fraction1 : " + f1.getFraction().num + "/" + f1.getFraction().den + " , Fraction2 : "
                + f2.getFraction().num + "/" + f2.getFraction().den
                + "\nQue voulez vous?";
        int retour = JOptionPane.showOptionDialog(null, message, "Java Project",
                optionType, messageType, null, lesTextes, null);

        if (retour == 0) {
            Fraction a1 = f1.Plus(f2);
            JOptionPane.showMessageDialog(null,
                    "La somme de " + f1.getFraction().num + "/" + f1.getFraction().den + " et " + f2.getFraction().num
                            + "/" + f2.getFraction().den + " est " + a1.getFraction().num + "/"
                            + a1.getFraction().den);
            TestFraction(f1, f2);
        }

        if (retour == 1) {
            Fraction s1 = f1.Moins(f2);
            JOptionPane.showMessageDialog(null,
                    "La différence de " + f1.getFraction().num + "/" + f1.getFraction().den + " et "
                            + f2.getFraction().num + "/"
                            + f2.getFraction().den + " est " + s1.getFraction().num + "/" + s1.getFraction().den);
            TestFraction(f1, f2);
        }

        if (retour == 2) {
            Fraction m1 = f1.MultipliePar(f2);
            JOptionPane.showMessageDialog(null,
                    "Le produit de " + f1.getFraction().num + "/" + f1.getFraction().den + " et " + f2.getFraction().num
                            + "/"
                            + f2.getFraction().den + " est " + m1.getFraction().num + "/" + m1.getFraction().den);
            TestFraction(f1, f2);
        }

        if (retour == 3) {
            Fraction d1 = f1.DiviserPar(f2);
            JOptionPane.showMessageDialog(null,
                    "Le rapport de " + f1.getFraction().num + "/" + f1.getFraction().den + " et " + f2.getFraction().num
                            + "/"
                            + f2.getFraction().den + " est " + d1.getFraction().num + "/" + d1.getFraction().den);
            TestFraction(f1, f2);
        }

        if (retour == 4) {
            Fraction r1 = Fraction.reduce(f1);
            Fraction r2 = Fraction.reduce(f2);
            JOptionPane.showMessageDialog(null,
                    "Après réduction \n Fraction1 : " + r1.getFraction().num + "/" + r1.getFraction().den
                            + " , Fraction2 : " + r2.getFraction().num + "/" + r2.getFraction().den);
            TestFraction(f1, f2);
        }

        if (retour == 5) {
            débuter();
        }
    }

}

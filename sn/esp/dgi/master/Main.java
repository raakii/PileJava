package sn.esp.dgi.master;

import ca.quens.sat.master.Pile;
import fr.saclay.mai.master.Fraction;

public class Main {

    public static void main(String[] args) {

        int retour = InputDialogInFrame.débuter();

        if (retour == 0) {
            Pile p = InputDialogInFrame.InitPile();
            InputDialogInFrame.testPile(p);
        }

        else if (retour == 1) {
            Fraction f1 = InputDialogInFrame.initFraction();
            Fraction f2 = InputDialogInFrame.initFraction();
            InputDialogInFrame.TestFraction(f1, f2);

        }

    }

}

// javac -d "./bin" ./sn/esp/dgi/master/Main.java // Raki li moy compiler
// java -cp "./bin" sn.esp.dgi.master.Main // Raki li moy executer

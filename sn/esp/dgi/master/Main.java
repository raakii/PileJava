package sn.esp.dgi.master;

import ca.quens.sat.master.Pile;
import fr.saclay.mai.master.Fraction;


public class Main {
    
    
    
    public static void main(String[] args) {
        
        Pile p = new Pile(5);
        p.empile(4);
        System.out.println(p.getSommet());

        Fraction f = new Fraction(2, 3);
        f.afficher();

    
    }


}
// javac -d "./bin"   ./sn/esp/dgi/master/Main.java   
// java -cp "./bin" sn.esp.dgi.master.Main 

import fr.saclay.mai.master.Fraction;

public class TestFraction {
    public static void main(String[] args) {
		Fraction f1= new Fraction(-1, 2);
        f1.afficher();
        System.out.println("La fraction inversee:");
       Fraction f2 = f1.inverser();
       f2.afficher();
       System.out.println("La soustraction des deux fractions:");
       Fraction f3 = (f2.Plus(f1));
       f3.afficher();
	}
}
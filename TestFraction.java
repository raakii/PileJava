import fr.saclay.mai.master.Fraction;

public class TestFraction {
    public static void main(String[] args) {
		Fraction f1= new Fraction(-1, 2);
        Fraction f2 = new Fraction (4,2);
        f1.afficher();
        reduce(f1);
        f2.afficher();
        Fraction somme = f1.Plus(f2);
        Fraction difference = f1.Moins(f2);
        Fraction produit = f1.MultipliePar(f2);
        Fraction diviseur = f1.DiviserPar(f2);
        System.out.println("Somme:");
        somme.afficher();
        System.out.println("Différence:");
        difference.afficher();
        System.out.println("Produit:");
        produit.afficher();
        System.out.println("Division:");
        diviseur.afficher();
	}

    private static void reduce(Fraction f1) {
    }
}
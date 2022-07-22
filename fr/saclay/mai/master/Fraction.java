package fr.saclay.mai.master;
//Définition du package

//package fr.upmc.masterc;

//Classe de gestion de fractions
/**
 * Code de la classe de gestion de Fractions
 * ligne 2
 * ligne 3
 */
public class Fraction {
	/* Champs1: numerateur */
	int num;
	/* Champs1: dénominateur */
	int den;

	/**
	 * Contructeur de la classe
	 * 
	 * @param le numérateur et le denominateur
	 *           ligne 3
	 */

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	/**
	 * Methode 1
	 * Permet d'inverser la fraction sur laquelle elle est appelée
	 * 
	 * @return le resultat sous la forme d'une autre fraction
	 */
	public Fraction inverser() {
		if (this.num != 0)// on check d'abord si le numérateur est nul ou pas (il devient ainsi le
							// dénominateur de la fraction inverse)
		{
			int n1 = this.den;
			int n2 = this.num;
			return reduce(new Fraction(n1, n2));
		} else
			return null;
	}

	/**
	 * Methode 2
	 * Permet d'afficher la fraction sur laquelle elle est appelée
	 *
	 */
	public void afficher() {
		int n1 = this.num;
		int n2 = this.den;
		Fraction aff = reduce(new Fraction(n1, n2));
		
		System.out.println("la fraction est:"+aff.num +"/"+ aff.den);
			

		
			
	}

	/**
	 * Methode 3
	 * Permet d'additionner deux fractions quelconques
	 *
	 */
	public Fraction Plus(Fraction f) {
		int n2 = this.den * f.den;
		int n1 = (this.num * f.den) + (f.num * this.den);
		Fraction fractionadd = reduce(new Fraction(n1, n2));
		return fractionadd;
	}

	/**
	 * Methode 4
	 * Permet de faire la différence de deux fractions quelconques
	 *
	 */
	public Fraction Moins(Fraction f) {

		int n2 = this.den * f.den;
		int n1 = (this.num * f.den) - (f.num * this.den);

		Fraction fractionmoins = reduce(new Fraction(n1, n2));
		return fractionmoins;
	}

	/**
	 * Methode 5
	 * Permet de multiplier deux fractions
	 * 
	 * @return
	 *
	 */
	public Fraction MultipliePar(Fraction f) {
		int n1 = this.den * f.den;
		int n2 = this.num * f.num;

		Fraction fractionproduit = reduce(new Fraction(n1, n2));
		return fractionproduit;
	}

	/**
	 * Methode 6
	 * Permet de diviser une fraction donnée par une autre
	 *
	 */
	public Fraction DiviserPar(Fraction f) {
		int n1 = this.num * f.den;
		int n2 = this.den * f.num;

		Fraction fractiondiv = reduce(new Fraction(n1, n2));
		return fractiondiv;
	}

	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	private static Fraction reduce(Fraction f) {
		int num = f.num;
		int den = f.den;
		boolean neg = (num < 0) != (den < 0);
		num = Math.abs(num);
		den = Math.abs(den);
		// obtain the GCD of the non-negative values.
		int g = gcd(num, den);

		num /= g;
		den /= g;
		if (neg)
			num *= -1;
		return (new Fraction(num, den));
	}
}

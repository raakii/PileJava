package fr.saclay.mai.master;
//Définition du package
//package fr.upmc.masterc;

//Classe de gestion de fractions
/**
* Code de la classe de gestion de Fractions
* ligne 2
* ligne 3
*/
public class Fraction{
	/*Champs1: numerateur*/
	int num;
    /*Champs1: dénominateur*/
	int den;
/**
* Contructeur de la classe
* @param le numérateur et le denominateur
* ligne 3
*/

		
public Fraction(int num, int den) {
	this.num=num;
	this.den=den;
}

/**
*Methode 1
* Permet d'inverser la fraction sur laquelle elle est appelée
* @return le resultat sous la forme d'une autre fraction
*/
	public Fraction inverser(){
		if(this.num!=0)//on check d'abord si le numérateur est nul ou pas (il devient ainsi le dénominateur de la fraction inverse)
		{
			int n1=this.den;
			int n2=this.num;
			int temp1 = n1;
			int temp2 = n2; 
 
			while (n1 != n2){
			if(n1 > n2)
				 n1 = n1 - n2;
		  		else
			 n2 = n2 - n1;
		}      
 
	   int n3 = temp1 / n1 ;
	   int n4 = temp2 / n1 ;
			return new Fraction(n3,n4);
		} 
		else return null; 
		}
/**
*Methode 2
* Permet d'afficher la fraction sur laquelle elle est appelée
*
*/
	public void afficher(){
		if(this.num%this.den==0)
		{
			System.out.println(this.num/this.den);
		}
		else System.out.println(this.num+"/"+this.den);
		}
/**
*Methode 3
* Permet d'additionner deux fractions quelconques
*
*/
	public Fraction Plus(Fraction f){
		int n2=this.den * f.den;
		int n1=(this.num * f.den)+(f.num * this.den);
		Fraction fractionadd = new Fraction(n1,n2);
		return fractionadd;
	}
/**
*Methode 4
* Permet de faire la différence de deux fractions quelconques
*
*/
	public Fraction Moins(Fraction f){

		int n2=this.den * f.den;
		int n1=(this.num * f.den) - (f.num * this.den);
		int temp1 = n1;
		int temp2 = n2; 
 
		while (n1!=n2){
		  if(n1 > n2)
			 n1 = n1 - n2;
		  else
			 n2 = n2 - n1;
		}      
 
	   int n3 = temp1 / n2 ;
	   int n4 = temp2 / n2 ;
		Fraction fractionmoins = new Fraction(n3,n4);
		return fractionmoins;
	}
/**
*Methode 5
* Permet de multiplier deux fractions
 * @return 
*
*/
	public Fraction MultipliePar(Fraction f){
		int n1 = this.den * f.den;
		int n2 = this.num*f.num;
		int temp1 = n1;
		int temp2 = n2; 
 
		while (n1 != n2){
		  if(n1 > n2)
			 n1 = n1 - n2;
		  else
			 n2 = n2 - n1;
		}      
 
	   int n3 = temp1 / n1 ;
	   int n4 = temp2 / n1 ;
		Fraction fractionproduit = new Fraction(n3,n4);
		return fractionproduit;
	}
/**
*Methode 6
* Permet de diviser une fraction donnée par une autre
*
*/
	public Fraction DiviserPar(Fraction f){
		int n1 = this.num * f.den;
		int n2 = this.den * f.num;
		int temp1 = n1;
		int temp2 = n2; 
 
		while (n1 != n2){
		  if(n1 > n2)
			 n1 = n1 - n2;
		  else
			 n2 = n2 - n1;
		}      
 
	   int n3 = temp1 / n1 ;
	   int n4 = temp2 / n1 ;
		Fraction fractiondiv = new Fraction(n3,n4);
		return fractiondiv;
	}
	public static Fraction simplify (Fraction f){
		int n1 = f.num;
		int n2 = f.den; 
		int temp1 = n1;
		int temp2 = n2; 
 
		while (n1 != n2){
		  if(n1 > n2)
			 n1 = n1 - n2;
		  else
			 n2 = n2 - n1;
		}      
 
	   int n3 = temp1 / n1 ;
	   int n4 = temp2 / n1 ;
	return(new Fraction(n3, n4));
	}
}

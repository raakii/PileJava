package ca.quens.sat.master;

public class Pile {

  private int sommet;
  int capacite;
  private int[] piles;

  public Pile(int capacite) {
    this.capacite = capacite;
    piles = new int[capacite]; // créer une nouvelle pile vide de taille maximal capacite
    sommet = -1; // lorsque tu auras empiler un élément tu l'obtiendras à piles[0]
  }

  public int getSommet() {
    if (estVide()) {
      System.out.println("La pile est vide elle n'a pas de sommet");

    }
    return piles[sommet];

  }

  public boolean estVide() {
    if (sommet == -1) {
      return true;
    }
    return false;
  }

  public boolean estPleine() {
    if (sommet + 1 == piles.length) {
      return true;
    }
    return false;
  }

  public void empile(int element) {
    if (this.estPleine()) {
      System.out.println("La pile est pleine impossible d'empiler");

    } else {

      piles[sommet + 1] = element;
      sommet++;
    }

  }

  public int depile() {
    if (estVide()) {
      System.out.println("La pile est vide impossible de depiler");
    } else {
      sommet--;
    } // inutile de la remplacer par une valeur 0 ou null car c'est avec l'indice
      // sommet que tu y accèdes.
    return piles[sommet + 1]; // on retourne la valeur que nous avons depiler
  }

  public String versChaine() { // Pour visualiser ta pile
    if (estVide()) {
      return "[]";
    }
    if (sommet == 0) {
      return "[" + getSommet() + "]";
    }
    int i = 0;
    String chaine = "[ ";
    while (i <= sommet) {
      chaine = chaine + " " + piles[i];
      i++;
    }
    chaine = chaine + " ]";
    return chaine;
  }

}
public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile(3);
        System.out.println(pile.estVide());
        System.out.println(pile.estPleine());
        pile.empile(2);
        pile.empile(3);
        pile.depile();
        System.out.println(pile.getSommet());
    }
}

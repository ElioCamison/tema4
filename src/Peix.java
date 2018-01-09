/**
 * 2- Realitza una classe anomenada «Peix», que tingui una variable membre anomenada «nom».
 * Fes un mètode «setNom(String nom)» i un mètode «getNom()» (que retorna el nom del peix).
 * Implementa un constructor «còpia», que a partir d'un objecte «Peix» generi un nou objecte «Peix».
 * Implementa el mètode «public boolean equals(Peix p)» per poder comparar objectes «Peix» i comprova que funciona correctament.
 * Finalment, a la classe, implementa una variable «count» que compti quants de peixos hem creat.
 *
 */

public class Peix {

    private String nom;
    private int cont;

    public Peix(String nom) {
        this.nom = nom;
    }

    /*public Peix(Peix p) {

    }*/


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Peix{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public boolean equals(Peix p) {
        boolean peixosIguals = false;

        if(p.equals(p)){

        }

        return peixosIguals;
    }

    public static void main(String[] args) {
        Peix bacoreta = new Peix("bacoreta");
        Peix donzella = new Peix("donzella");
        Peix esparrall = new Peix("esparrall");
        Peix gerret = new Peix("gerret");
        Peix orada = new Peix("orada");

        System.out.println(bacoreta.getNom());
        System.out.println(donzella.getNom());
        System.out.println(esparrall.getNom());
        System.out.println(gerret.getNom());
        System.out.println(orada.getNom());
    }



}
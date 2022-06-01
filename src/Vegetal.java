
import java.time.LocalDate;

public class Vegetal {

    // Declaration de mes variables
    public String nom;
    public Categorie categorie;
    public int stock;
    public LocalDate dateLimiteConsommation;
    public Color color;

    // It's a constructor.
    public Vegetal(String nom, LocalDate dateLimiteConsommation, int stock, Categorie categorie, Color color) {
        this.nom = nom;
        this.categorie = categorie;
        this.stock = stock;
        this.dateLimiteConsommation = dateLimiteConsommation;
        this.color = color;
    }

    @Override
    public String toString() {
        String m = "Nom : " + this.nom + " | " + " dateLimiteConsommation " + this.dateLimiteConsommation
                + " | " + "Stock : "
                + this.stock + " | " + " | " + "Catégorie : " + this.categorie + " | ";
        return m;
    }

}

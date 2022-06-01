import java.time.LocalDate;

public class Fruits extends Vegetal {


    public Fruits(String nom, LocalDate dateLimiteConsommation, int stock,
            Color color, Categorie categorie) {
        super(nom, dateLimiteConsommation, stock, categorie, color);

    }

    @Override
    public String toString() {
        String comm = super.toString();
        return comm + nom + ',' + "FRUIT , " +stock + "kg en stock , périme dans " + dateLimiteConsommation;
    }

}

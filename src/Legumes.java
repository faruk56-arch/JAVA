import java.time.LocalDate;

public class Legumes extends Vegetal {

    public Legumes(String nom, LocalDate dateLimiteConsommation, int stock,
            Color color, Categorie categorie) {
        super(nom, dateLimiteConsommation, stock, categorie, color);

    }

    @Override
    public String toString() {
        String comm = super.toString();
        return comm + nom + ',' + "LEGUME , " + stock + "kg en stock , périme dans " + dateLimiteConsommation;
    }

}

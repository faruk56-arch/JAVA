import java.time.LocalDate;

public class Fleurs extends Vegetal {

    public Fleurs(String nom, LocalDate dateLimiteConsommation, int stock, Color color,
            Categorie categorie) {
        super(nom, dateLimiteConsommation, stock, categorie, color);
    }

    @Override
    public String toString() {
        String comm = super.toString();
        return comm + nom + ',' + "FLEUR de couleur dominante, " + color + " , " + stock + " en stock , périme dans "
                + dateLimiteConsommation;
    }

}

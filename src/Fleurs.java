import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fleurs extends Vegetal {
    int nbTiges;

    public Fleurs(String nom, LocalDate dateLimiteConsommation, int stock, Color color,
            Categorie categorie) {
        super(nom, dateLimiteConsommation, stock, categorie, color);
    }

    @Override
    public String toString() {
        return nom + ',' + "FLEUR de couleur dominante, " + color + " , " + stock + " en stock , périme dans "
                + ChronoUnit.DAYS.between(LocalDate.now(), dateLimiteConsommation) + " jours";
    }

}

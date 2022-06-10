import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Creating a new class called Fleurs that inherits from the Vegetal class.
public class Fleurs extends Vegetal {

    public Fleurs(String nom, LocalDate dateLimiteConsommation, int stock, Color color,
            Categorie categorie) {
        // Calling the constructor of the parent class.
        super(nom, dateLimiteConsommation, stock, categorie, color);
    }

    @Override
    public String toString() {
        return nom + " FLEUR de couleur dominante, " + color + " , " + stock + " en stock , périme dans "
                + ChronoUnit.DAYS.between(LocalDate.now(), dateLimiteConsommation) + " jours" + " | ";
    }

}

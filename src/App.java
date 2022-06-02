
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.nio.file.Files;

public class App {

    public static void main(String[] args) throws Exception {

        Path _path = Path.of("./list.txt");
        // Reading the file and putting it into a list.
        List<String> lines = Files.readAllLines(_path);
        // System.out.println("Lines: " + lines);

        Map<Categorie, List<Vegetal>> Mapvegetals = new HashMap<>();
        List<Vegetal> fleursList = new ArrayList<>();
        List<Vegetal> legumesList = new ArrayList<>();
        List<Vegetal> fruitsList = new ArrayList<>();

        for (String line : lines) {
            String[] split = line.split(";");
            Categorie categorie = Categorie.valueOf(split[0]);
            String nom = split[1];

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateLimiteConsommation = LocalDate.parse(split[2], dtf);
            int stock = Integer.parseInt(split[3]);

            Color color = null;
            try {
                color = Color.valueOf(split[4]);
            } catch (Exception e) {
            }

            if (categorie == Categorie.FLEUR) {
                Fleurs flower = new Fleurs(nom, dateLimiteConsommation, stock, color, categorie);
                fleursList.add(flower);
            } else if (categorie == Categorie.LEGUME) {
                Legumes legume = new Legumes(nom, dateLimiteConsommation, stock, color, categorie);
                legumesList.add(legume);
            } else if (categorie == Categorie.FRUIT) {
                Fruits fruit = new Fruits(nom, dateLimiteConsommation, stock, color, categorie);
                fruitsList.add(fruit);
            }
        }

        // Putting the list of flowers into the map.
        Mapvegetals.put(Categorie.FLEUR, fleursList);
        Mapvegetals.put(Categorie.LEGUME, legumesList);
        Mapvegetals.put(Categorie.FRUIT, fruitsList);

        // It's looping through the keys of the map.
        for (Categorie categorie : Mapvegetals.keySet()) {
            System.out.println(categorie.toString() + " : " + Mapvegetals.get(categorie).size());
            System.out.println(categorie.toString() + " : " + Mapvegetals.get(categorie));
        }
    }

}
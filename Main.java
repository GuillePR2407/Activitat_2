import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Crear una lista de dispositivos
        List<Dispositiu> dispositius = new ArrayList<>();
        
        // Crear 5 dispositivos y añadirlos a la lista
        dispositius.add(new AltreDispositiu("Rellotge Intel·ligent", "Xiaomi", 100));
        dispositius.add(new Smartphone("OnePlus", "nord2", 300, "Android", "Hardware2", false, false));
        dispositius.add(new Smartphone("iPhone", "19 PRO MAX", 500, "iOS", "Hardware3", true, true));
        dispositius.add(new Tablet("Tablet", "Modelo4", 400, 10.1));
        dispositius.add(new AltreDispositiu("Otro Dispositivo", "Modelo5", 200, "Descripción del otro dispositivo"));

        // Mostrar los dispositivos
        int contador = 1;
        for (Dispositiu dispositiu:dispositius) {
            System.out.println("Dispositiu " + contador + ":");
            System.out.println(dispositiu);
            System.out.println();
            contador++;
        }
        System.out.println("Dispositivos de gamma alta:");
        for (Dispositiu dispositiu:dispositius) {
            if (dispositiu.isGammaAlta())
            System.out.println(dispositiu.getMarca().concat(dispositiu.getModel()));
            contador++;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Crear una lista de dispositivos
        List<Dispositiu> dispositius = new ArrayList<>();
        
        // Crear 5 dispositivos y añadirlos a la lista
        dispositius.add(new AltreDispositiu("Xiaomi", "Mi Band", 100));
        dispositius.add(new Smartphone("OnePlus", "Nord 2", 300, "Android", "Hardware2", false, false));
        dispositius.add(new Smartphone("iPhone", "19 PRO MAX", 500, "iOS", "Hardware3", true, true));
        dispositius.add(new Tablet("Samsung", "Galaxy Tab 12", 400, 10.1));
        dispositius.add(new AltreDispositiu("Philips", "Mega Toaster 2000", 200, "Toasts good bread"));

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

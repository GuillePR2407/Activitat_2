public class Main {
    public static void main(String[] args) {
        // Crear 5 dispositivos
        Dispositiu rellotgeIntelligent = new AltreDispositiu("Rellotge Intel·ligent", "Xiaomi", 100);
        Smartphone mobilAndroid = new Smartphone("OnePlus", "nord2", 300, "Android", "Hardware2", false, false);
        Smartphone iPhone = new Smartphone("iPhone", "19 PRO MAX", 500, "iOS", "Hardware3", true, true);
        Tablet tablet = new Tablet("Tablet", "Modelo4", 400, 10.1);
        AltreDispositiu altres = new AltreDispositiu("Otro Dispositivo", "Modelo5", 200, "Descripción del otro dispositivo");

        // Crear una lista de dispositivos
        Dispositiu[] dispositius = { rellotgeIntelligent, mobilAndroid, iPhone, tablet, altres };

        // Mostrar los dispositivos
        for (int i = 0; i < dispositius.length; i++) {
            System.out.println("Dispositiu " + (i + 1) + ":");
            System.out.println(dispositius[i]);
            System.out.println();
        }
    }
}

/* Clase AltreDispositiu con sus métodos y constructores, que serán
utilizados en Dispositiu.java */
public class AltreDispositiu extends Dispositiu {
    private String descripcio="No hi ha descripció per aquest dispositiu";

    // Constructores
    public AltreDispositiu(String marca, String model, double preuBase) {
        super(marca, model, preuBase);
    }

    public AltreDispositiu(String marca, String model, double preuBase,String descripcio) {
        super(marca, model, preuBase);
        setDescripcio(descripcio);
    }
    // Métodos
    public void setDescripcio(String descripcio) {
        if (descripcio != null) {
            this.descripcio = descripcio;    
        } else { 
            this.descripcio = "No hi ha descripció per aquest dispositiu";
        }
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s\n Model: %s\n Preu: %s\n Preu Final: %s\n Descripció: %s", getMarca(), getModel(), getPreuBase(), preuFinal(), getDescripcio());
    }
}
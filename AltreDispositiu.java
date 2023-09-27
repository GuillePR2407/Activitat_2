/* Clase AltreDispositiu con sus métodos y constructores, que serán
utilizados en Dispositiu.java */
public class AltreDispositiu extends Dispositiu {
    private String descripcio;

    // Constructores
    public AltreDispositiu() {
        descripcio = "No hi ha descripció per aquest dispositiu";
    }

    public AltreDispositiu(String descripcio) {
        this.descripcio = descripcio;
    }
    
    // Métodos
    public void setDescripcio(String descripcio) {
        if (descripcio != null) {
            this.descripcio = descripcio;    
        } else { this.descripcio = "No hi ha descripció per aquest dispositiu";}
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s\n Model: %s\n Preu: %d\n Descripció: %s", getMarca(), getModel(), getPreu(), getDescripcio());
    }
}
/* 
 * Creación de la clase Dispositiu, en la que tenemos tres valores:
 * marca, model y preuBase, los cuales tienen sus getters y setters.
 * 
 * Se trata de una superclass, la cual se extiende en las clases:
 * Smartphone, Tablet y AltreDispositiu.
 * 
 * Tiene un constructor el cual define sus valores.
*/

class Dispositiu {
    private String marca;
    private String model;
    private double preuBase;
    
    // Setter y Getter de Marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

     // Setter y Getter de Model
    public String getModel(){
        return this.model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }

     // Setter y Getter de PreuBase
    public double getPreuBase(){
        return this.preuBase;
    }
    public void setPreuBase(double newPreuBase){
        this.preuBase = newPreuBase;
    }

    // Constructor
    public Dispositiu(String newMarca, String newModel, double newPreuBase) {
        setMarca(newMarca);
        setModel(newModel);
        setPreuBase(newPreuBase);
    }

    // Métodos
    public double preuFinal() {
        return preuBase * 2;
    }

    public boolean isGammaAlta(){
        return false;
    }
}
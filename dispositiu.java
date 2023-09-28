/* 
 * Creación de la clase Dispositiu, en la que tenemos tres valores:
 * marca, model y preuBase, los cuales tienen sus getters y setters.
 * 
 * Se trata de una superclass, la cual se extiende en las clases:
 * Smartphone, Tablet y AltreDispositiu.
*/

class Dispositiu {
    private String marca;
    private String model;
    private int preuBase;
    
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
    public int getPreuBase(){
        return this.preuBase;
    }
    public void setPreuBase(int newPreuBase){
        this.preuBase = newPreuBase;
    }
}
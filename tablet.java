public class Tablet extends Dispositiu{
    private int polsades;
	public Tablet(String marca, String model, double preuBase,int pos){
        super(marca, model, preuBase);
        setPolsades(pos);
    }
    public void setPolsades(int pos) {
        this.polsades = pos;
    }
    public int getPolsades(){
        return polsades;
    }
    @Override
    public String toString() {
        String text = String.format("Marca: %s\n    Modelo: %s\n    Preu: %s\n    Polsades: %s ps" , getMarca(), getModel(), getPreuBase(), getPolsades());
        return text;
    }
}
    
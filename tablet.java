public class Tablet extends Dispositiu{
    private double polsades;
    public Tablet(String marca, String model, double preuBase){
        super(marca, model, preuBase);
    }
	public Tablet(String marca, String model, double preuBase,double pos){
        super(marca, model, preuBase);
        setPolsades(pos);
    }
    public void setPolsades(double pos) {
        this.polsades = pos;
    }
    public double getPolsades(){
        return polsades;
    }
    @Override
    public String toString() {
        String text = String.format("Marca: %s\n    Modelo: %s\n    Preu: %s\n    Polsades: %s ps" , getMarca(), getModel(), getPreuBase(), getPolsades());
        return text;
    }
}
    
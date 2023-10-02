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
    public boolean isGammaAlta() {
        return this.preuFinal() > 900;
    }
    @Override
    public String toString() {
        String text = String.format("\n Marca: %s\n Modelo: %s\n Polsades: %s\n Preu: %s\n Preu Final: %s\n" , getMarca(), getModel(), getPolsades(), getPreuBase(), preuFinal());
        return text;
    }
}
    

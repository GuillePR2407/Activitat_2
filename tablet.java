public class Tablet extends Dispositiu{
    private int polsades;
    public Tablet(){}
	public Tablet(int pos){setPolsades(pos);}
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
    
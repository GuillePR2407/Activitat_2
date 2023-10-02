class Smartphone extends Dispositiu implements GammaAlta{
    private String sistemaOperatiu;
    private String hardware;
    private boolean accelerometre = false;
    private boolean gps = true;


    public Smartphone(String marca, String model, double preuBase,String sistemaOperatiu, String hardware){
        super(marca, model, preuBase);
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
    }
    public Smartphone(String marca, String model, double preuBase,String sistemaOperatiu, String hardware, boolean accelerometre){
        super(marca, model, preuBase);
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
        setAccelerometre(accelerometre);
    }

    public Smartphone(String marca, String model, double preuBase,String sistemaOperatiu, String hardware, boolean accelerometre,boolean gps){
        super(marca, model, preuBase);
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
        setAccelerometre(accelerometre);
        setGps(gps);
    }

    public void setSistemaOperatiu(String sistemaOperatiu){
        this.sistemaOperatiu=sistemaOperatiu;
    }
    public String getSistemaOperatiu(){
        return this.sistemaOperatiu;
    }
    public void setHardware(String hardware){
        this.hardware=hardware;
    }
    public String getHardware(){
        return this.hardware;
    }
    public void setAccelerometre(boolean accelerometre){
        this.accelerometre=accelerometre;
    }
    public boolean getAccelerometre(){
        return this.accelerometre;
    }
    public void setGps(boolean gps){
        this.gps=gps;
    }
    public boolean getGps(){
        return this.gps;
    }

    public boolean isGammaAlta() {
        return this.preuFinal() > 700;
    }
    @Override
    public String toString() {
        String text = String.format("\n Marca: %s\n Model: %s\n Sistema Operatiu: %s\n Hardware: %s\n Accelerometre: %s\n GPS: %s\n Preu: %s\n Preu Final: %s\n",
        getMarca(), getModel(), getSistemaOperatiu(),getHardware(),getAccelerometre(),getGps(),getPreuBase(),preuFinal());
        return text;
    }

    // Métodos
    @Override
    public double preuFinal() {
        double preuFinal = getPreuBase() * 2;

        if (getAccelerometre()) { // Si tiene acelerómetro, su precio sube un 10%
            preuFinal += (getPreuBase() / 100 * 10);
            if (getGps()) { // Si además tiene un gps, sube 5% más.
                preuFinal += (getPreuBase() / 100 * 5);
            }
        }
        return preuFinal;
    }
}
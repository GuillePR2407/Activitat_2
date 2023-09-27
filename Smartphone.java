class Smartphone extends Dispositiu{
    private String sistemaOperatiu;
    private String hardware;
    private boolean accelerometre = false;
    private boolean gps = true;


    public Smartphone(String sistemaOperatiu, String hardware){
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
    }
    public Smartphone(String sistemaOperatiu, String hardware, boolean accelerometre){
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
        setAccelerometre(accelerometre);
    }

    public Smartphone(String sistemaOperatiu, String hardware, boolean accelerometre,boolean gps){
        setSistemaOperatiu(sistemaOperatiu);
        setHardware(hardware);
        setAccelerometre(accelerometre);
        setGps(gps);
    }

    public void setSistemaOperatiu(String sistemaOperatiu){
        this.sistemaOperatiu=sistemaOperatiu;
    }
    public String getSistemaOperatiu(String sistemaOperatiu){
        return this.sistemaOperatiu;
    }
    public void setHardware(String hardware){
        this.hardware=hardware;
    }
    public String getHardware(String hardware){
        return this.hardware;
    }
    public void setAccelerometre(boolean accelerometre){
        this.accelerometre=accelerometre;
    }
    public boolean getAccelerometre(boolean accelerometre){
        return this.accelerometre;
    }
    public void setGps(boolean gps){
        this.gps=gps;
    }
    public boolean getGps(boolean gps){
        return this.gps;
    }
    @Override
    public String toString() {
        String text = String.format("\n  Marca: %s\n Model: %s\n Sistema Operatiu: %s\n    Hardware: %s\n    Accelerometre: %s\n    GPS: %s\n  Preu: %s\n ",getMarca(), getModel(),getSistemaOperatiu(),getHardware(),getAccelerometre(),getGps(),getPreuBase());
        return text;
    }
}
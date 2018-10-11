public class Zmogus {
    private boolean isMoteris;
    private String ak;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;

    public Zmogus(boolean isMoteris, String ak, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva) {
        this.isMoteris = isMoteris;
        this.ak = ak;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
    }

    public boolean isMoteris() {
        return isMoteris;
    }

    public String getAk() {
        return ak;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public double getUgis() {
        return ugis;
    }

    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    public void setPlaukuSpalva(String plaukuSpalva){
        this.plaukuSpalva = plaukuSpalva;
    }

    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }
}

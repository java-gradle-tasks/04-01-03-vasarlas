public class Vasarlas {
    private String vasarlo;
    private String arucikk;
    private int egysegar;
    private int mennyiseg;

    public Vasarlas(String vasarlo, String arucikk, int egysegar, int mennyiseg) {
        this.vasarlo = vasarlo;
        this.arucikk = arucikk;
        this.egysegar = egysegar;
        this.mennyiseg = mennyiseg;
    }

    public String getVasarlo() {
        return vasarlo;
    }

    public void setVasarlo(String vasarlo) {
        this.vasarlo = vasarlo;
    }

    public String getArucikk() {
        return arucikk;
    }

    public void setArucikk(String arucikk) {
        this.arucikk = arucikk;
    }

    public int getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(int egysegar) {
        this.egysegar = egysegar;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return "Vasarlas{" +
                "vasarlo='" + vasarlo + '\'' +
                ", arucikk='" + arucikk + '\'' +
                ", egysegar=" + egysegar +
                ", mennyiseg=" + mennyiseg +
                '}';
    }
}

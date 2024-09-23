package pertemuan4.praktikum;

public class Kubus {
    private double S;
    public Kubus(double sisi){
        this.S = sisi;
    }
    public double hitungvolume(){
        return S * S * S;
    }
    public double hitungluas(){
        return 6*S*S;
    }
}
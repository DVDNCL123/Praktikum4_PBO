package pertemuan4.praktikum;

public class Balok {
    private double P, L, T;
    public Balok(double Panjang, double Lebar, double Tinggi){
        this.P = Panjang;
        this.L = Lebar;
        this. T = Tinggi;
    }
    public double hitungvolume(){
        return P * L * T;
    }
    public double hitungluas(){
        return 2*( P*L + P*T + L*T );
    }
}
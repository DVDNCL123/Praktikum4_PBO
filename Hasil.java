package pertemuan4.praktikum;

public class Hasil {
    public static void main(String[] args) {
        
        Kubus Kubus = new Kubus(3);
        System.out.println("Hasil perhitungan volume kubus =  " +Kubus.hitungvolume());
        System.out.println("Hasil perhitungan luas permukaan kubus = "+Kubus.hitungluas());
        System.out.println();
        
        Balok balok = new Balok(2,3,5);
        System.out.println("Hasil perhitungan volume Balok = " +balok.hitungvolume());
        System.out.println("Hasil perhitungan luas permukaan Balok = "+ balok.hitungluas());
        System.out.println();
        
    }   
}

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CountLogic {

  public double hitungDrUmur(int umur, double t) {
    double berat = 0;
    if (umur <= 10) {
      berat = (umur * 2) + 8;
    } else if (umur > 10 && umur <= 70) {
      berat = (t - 100) * 0.9;// - ((t - 100) * 0.1);
    }
    return berat;
  }

  public double dariKakiLengan(String kelamin, String dasar, int umur, int panjang) {
    double berat = 0;
    double tinggi = 0;
    if (kelamin.equals("Pria") && dasar.equals("lutut")) {
      tinggi = 6.50 + (1.38 + panjang) - (0.08 * umur);
    } else if (kelamin.equals("Pria") && dasar.equals("lengan")) {
      tinggi = 118.24 + (0.28 * panjang) - (0.07 * umur);
    } else if (kelamin.equals("Wanita") && dasar.equals("lutut")) {
      tinggi = 89.68 + (1.53 * panjang) - (0.17 * umur);
    } else if (kelamin.equals("Wanita") && dasar.equals("lengan")) {
      tinggi = 63.18 + (0.63 * panjang) - (0.17 * umur);
    }
    berat = hitungDrUmur(umur, tinggi);
    BigDecimal beratDibulatkan = new BigDecimal(berat);
    beratDibulatkan = beratDibulatkan.setScale(2, RoundingMode.HALF_UP);
    return beratDibulatkan.doubleValue();
  }

  public String isNormal(double bb, double bbi) {
    String[] araistatus = {"Kurus", "NormaL", "OverWeight", "Obesity"};
    String status = "";
    if (bb < bbi - (bbi * 0.1)) {
      status = araistatus[0];
    } else if ((bb >= bbi - (bbi * 0.1)) && (bb <= bbi + (bbi * 0.1))) {
      status = araistatus[1];
    } else if ((bb >= bbi + (bbi * 0.1)) && (bb <= bbi + (bbi * 0.2))) {
      status = araistatus[2];
    } else if (bb > bbi + (bbi * 0.2)) {
      status = araistatus[3];
    }
    return status;
  }

  public static void main(String[] args) {
    System.out.println(new CountLogic().hitungDrUmur(30, 165));
  }
}

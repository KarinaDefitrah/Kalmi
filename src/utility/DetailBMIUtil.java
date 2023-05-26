/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utility;

/**
 *
 * @author ruffi
 */
public interface DetailBMIUtil {
    default String detailBMI(double bmi) {
        String category = CategoryBMIUtil.categoryBMI(bmi);
        String kalimat = "";
        if (category.equalsIgnoreCase("Kekurangan Berat Badan")){
            kalimat = """
                      <html>Anda berada dalam kategori kekurangan berat badan<br> 
                      Perbanyaklah konsumsi makanan bernutrisi dan padat kalori
                      """;
        } else if (category.equalsIgnoreCase("Berat Badan Normal")) {
            kalimat = """
                      <html>Anda berada dalam kategori berat badan yang normal<br>
                      <html>Tetap pertahankan berat badan Anda dan jaga berat badan Anda<br>
                      dengan mengatur keseimbangan antara pola makan dan aktivitas fisik Anda
                      """;
        } else if (category.equalsIgnoreCase("Kelebihan Berat Badan")){
            kalimat = """
                      Cara terbaik untuk menurunkan berat badan adalah dengan mengatur kalor makanan yang dikonsumsi dan berolahraga.
                      Jika BMI Anda berada dalam kategori ini maka Anda dianjurkan untuk menurunkan berat badan hingga batas normal.
                      """;
        } else if (category.equalsIgnoreCase("Obesitas")){
            kalimat = """
                      <html><center>Usahakan untuk menurunkan berat badan dan menerapkan</center></br>
                      <center>pola hidup sehat dengan menjaga makan dan aktivitas fisik</center><br>
                      <center>Segera kunjungi dokter untuk dilakukan pemeriksaan kesehatan lanjutan<br>
                      <center>untuk mengetahui risiko yang Anda miliki terkait berat badan Anda</html>
                      """;
        }
        return kalimat;
    }
}

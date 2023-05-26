/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author ruffi
 */
public class Wanita extends General{
    private double indeksMassaWanita = 0.9;

    public Wanita(){
        super();
    }
    
    public Wanita(int tinggi, int berat) {
        super(tinggi, berat);
    }

    @Override
    public double calculateBMI(double tingi, double berat) {
        double tampung = super.calculateBMI(tingi, berat);
        return indeksMassaWanita * tampung;
    }

    public double calculateBMI(double tinggi, double berat, boolean inci, boolean pound) {
        // CHECK APAKAH SATUAN PANJANG CM ATAU INCI
        if (inci){
            tinggi = tinggi * 0.0254;
        } else{
            tinggi = tinggi / 100;
        }
        
        // CHECK APAKAH SATUAN BERAT KG ATAU POUND
        if (pound){
            berat = berat * 0.453592;
        }
        return calculateBMI(tinggi, berat);
    }
    
    @Override
    public double idealMass(double tinggi) {
        double beratBadanIdeal = 0;
        double indeksWanita = 0.15;
        beratBadanIdeal = (tinggi - 100) - ((tinggi - 100) * indeksWanita);
        return beratBadanIdeal;
    }

}

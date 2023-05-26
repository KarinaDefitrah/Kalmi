/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

import utility.CategoryBMIUtil;
import utility.DetailBMIUtil;
import utility.IdealMassUtil;

/**
 *
 * @author ruffi
 */
public class Pria extends General implements DetailBMIUtil{
    private double indeksMassaPria = 1.1;

    public Pria(){
        super();
    }
    
    public Pria(int tinggi, int berat) {
        super(tinggi, berat);
    }

    @Override
    public double calculateBMI(double tingi, double berat) {
        double tampung = super.calculateBMI(tingi, berat);
        return indeksMassaPria * tampung;
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
        double indeksPria = 0.1;
        beratBadanIdeal = (tinggi - 100) - ((tinggi - 100) * indeksPria);
        return beratBadanIdeal;
    }

}

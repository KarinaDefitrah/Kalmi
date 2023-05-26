/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

import utility.DetailBMIUtil;
import utility.IdealMassUtil;

/**
 *
 * @author ruffi
 */
public abstract class General implements  DetailBMIUtil, IdealMassUtil{
    private double tinggi;
    private double berat;
    private double bmi;

    public General(){
        tinggi = 0;
        berat = 0;
        bmi = 0.0;
    }
    
    public General(int tinggi, int berat) {
        this();
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double calculateBMI(double tingi, double berat) {
        return berat / (tingi * tingi);
    } 

}

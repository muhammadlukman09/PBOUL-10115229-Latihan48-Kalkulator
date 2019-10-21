/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan48.kalkulator;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG 
 */
public class Value {
    private double value1;
    private double value2;
    
    public Value(){
        //Constructor
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(){
        System.out.println("Project Calculator");
    }
    
    public double add(double val1, double val2){
        double result;
        result = val1+val2;
        return result;
    }
    public double minus(double val1, double val2){
        double result;
        result = val1-val2;
        return result;
    }
    public double multiplication(double val1, double val2){
        double result;
        result = val1*val2;
        return result;
    }
    public double division(double val1, double val2){
        double result;
        result = val1/val2;
        return result;
        
    }
    
}

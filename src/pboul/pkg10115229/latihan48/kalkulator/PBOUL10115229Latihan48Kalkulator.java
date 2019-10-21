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
public class PBOUL10115229Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Value value = new Value();
        value.setValue1(7);
        value.setValue2(5);
        
        double val1 = value.getValue1();
        double val2 = value.getValue2();
        
        System.out.println("VALUE 1 : "+value.getValue1());
        System.out.println("VALUE 1 : "+value.getValue2());
        value.setNameProject();
        value.setNoteProject();
        System.out.println("Result Add is = "+value.add(val1, val2));
        System.out.println("Result Minus is = "+value.minus(val1, val2));
        System.out.println("Result Multiple is = "+value.multiplication(val1, val2));
        System.out.println("Result Division is = "+value.division(val1, val2));   
    }
    
}

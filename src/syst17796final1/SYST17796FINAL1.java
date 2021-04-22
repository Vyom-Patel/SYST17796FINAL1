/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796final1;
import java.util.Scanner;
/**
 *
 * @author 14373
 */
public class SYST17796FINAL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println(calculateNet(40,14.25,10));
    }
    
    public static double calculateNet(double hours ,double rate, double tax){
        double gross = hours * rate;
        double net = gross - tax;
        return net;
    }
    
}

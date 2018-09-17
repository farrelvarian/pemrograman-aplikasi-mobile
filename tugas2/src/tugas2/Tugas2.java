/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int umur = 25;
       String paras = "cantik";
       String knowledge = "pintar";
       if (umur <= 23 && umur >= 20 && knowledge == "pintar" && paras == "cantik") {
           System.out.println("Pasti Mau!");
       } else if (umur <= 23 && umur >= 20 && paras == "cantik") {
           System.out.println("OK Lah");
       } else if (umur >= 23 && paras == "cantik") {
           System.out.println("Saya pikir dulu");
       } else {
           System.out.println("No Way!");
       }
    }
    
}

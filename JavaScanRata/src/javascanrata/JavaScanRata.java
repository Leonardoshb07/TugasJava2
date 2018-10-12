/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javascanrata;
import java.util.Scanner;

import java.io.IOException;

/**
 *
 * @author dharyl
 */
public class JavaScanRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a1,a2,a3;

        double rata;

        try{

            System.out.print("Masukkan Angka 1 = ");

            a1 = input.nextInt();

            System.out.print("Masukkan Angka 2 = ");

            a2 = input.nextInt();

            System.out.print("Masukkan Angka 3 = ");

            a3 = input.nextInt();

            rata = (a1+a2+a3)/3;

            System.out.println("Rata-rata = " + rata);

        } catch (Exception e) {

            System.out.println("Error!");

        }

    }
}

    


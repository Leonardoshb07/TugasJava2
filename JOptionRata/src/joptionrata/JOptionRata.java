/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionrata;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;

/**
 *
 * @author dharyl
 */
public class JOptionRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bil1, bil2,bil3;

        double rata;

        try {

            bil1 = Integer.parseInt(JOptionPane.showInputDialog("Angka 1 = "));

            bil2 = Integer.parseInt(JOptionPane.showInputDialog("Angka 2 = "));

            bil3 = Integer.parseInt(JOptionPane.showInputDialog("Angka 3 = "));

            rata = (bil1+bil2+bil3)/3;

            String msg = "Rata-rata = " + rata;

                JOptionPane.showMessageDialog(null,msg);

        }catch(HeadlessException | NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Error!");

        }

    }

    

}
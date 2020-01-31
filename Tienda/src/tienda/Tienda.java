/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author PC-4
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String dire = "Archivos/Stock.txt";
        File entregado = new File(dire);
         try (BufferedWriter z = new BufferedWriter(new FileWriter(dire))) {
        } catch (Exception e) {
        }
      String dire1 = "Archivos/Ventas.txt";
        File entregado1 = new File(dire);
         try (BufferedWriter z = new BufferedWriter(new FileWriter(dire1))) {
        } catch (Exception e) {
        }   
        
      new Store().setVisible(true);
    }
    
}

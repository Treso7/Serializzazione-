/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tresoldi.lorenzo
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException  {
        Studente stud = new Studente("francesco", "sium", 467375);
        
        try {
//            FileOutputStream FO = new FileOutputStream("test.ser");
//            ObjectOutputStream OS = new ObjectOutputStream(FO);        
//        OS.writeObject(9);
//        OS.writeObject("ciao");
//        OS.writeObject(0.444324);
//        OS.writeObject('a');
//        OS.flush();
//        OS.close();
//        FO.close();

        FileInputStream FI = new FileInputStream("test.ser");
        ObjectInputStream IS = new ObjectInputStream(FI);
            int v1 = (int) IS.readObject();
            System.out.println("V1:" + v1);
            String v2 = (String) IS.readObject();
            System.out.println("ciao  :" + v1);
        
        
        } catch (FileNotFoundException ex) {
            System.out.println("file non trovto");
        }
         catch (IOException ex) {
             System.out.println("hai rotto il java");
        
        
    }



    }
}
    


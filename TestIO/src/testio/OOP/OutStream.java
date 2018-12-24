/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio.OOP;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kridtakom
 */
public class OutStream {
    public static void main(String[] args) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("oop.dat",true);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(1);
            oos.writeUTF("boom");
            oos.writeUTF("aaaa");
            oos.writeInt(2);
            oos.writeUTF("moob");
            oos.writeUTF("zzzzz");
            oos.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

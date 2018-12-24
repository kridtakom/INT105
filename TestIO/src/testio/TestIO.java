/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Kridtakom
 */
public class TestIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String a = "aaaaaaaaa";
            String b = "bbbbbb";
            String c = "ccccc";
            FileOutputStream file = new FileOutputStream("test.dat");
            DataOutputStream dos = new DataOutputStream(file);
            dos.writeUTF(a);
            dos.writeUTF(b);
            dos.writeUTF(c);
            dos.close();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException IOEx){
            System.out.println(IOEx);
        }
    }

}

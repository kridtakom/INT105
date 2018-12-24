/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kridtakom
 */
public class TestInput {

    public static void main(String[] args) {
        FileInputStream fis;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("test.dat");
            dis = new DataInputStream(fis);
            while (true) {
                System.out.println(dis.readUTF());
            }
        } catch (EOFException eof) {
            try {
                dis.close();
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}

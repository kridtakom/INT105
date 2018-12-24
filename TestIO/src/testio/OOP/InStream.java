/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio.OOP;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kridtakom
 */
public class InStream {

    public static void main(String[] args) {
        FileInputStream fis;
        ObjectInputStream ois = null;
        
        ArrayList<Student> stdlist = new ArrayList<Student>();
        try {
            fis = new FileInputStream("oop.dat");
            ois = new ObjectInputStream(fis);
            while (true) {
                int id = ois.readInt();
                String name = ois.readUTF();
                String lastname = ois.readUTF();
                Student std = new Student(id, name, lastname);
                stdlist.add(std);
                
            }
            for(Student show : stdlist){
                System.out.println(show);
            }
        } catch (EOFException eof) {
            try {
                ois.close();
            } catch (IOException io) {
                System.out.println(io);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}

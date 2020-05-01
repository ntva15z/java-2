/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luufile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author HOANG
 */
public class ghiObject {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("obj.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //String[] strs = new String[]{"mot","hai","ba"};
        Product[] prds = new Product[]{
          new Product("1","Suger",30.5),
          new Product("1","Rice",15.5)
        };
        oos.writeObject(oos);
        oos.close();
    }
}

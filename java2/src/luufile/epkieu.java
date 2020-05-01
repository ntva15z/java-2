/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luufile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author HOANG
 */
public class epkieu {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try {
            FileInputStream fis = new FileInputStream("obj.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product[] prds = (Product[]) ois.readObject();
        for(Product prd:prds){
            System.out.println(prd.toString());
        }
        ois.close();
        fis.close();
    
        } catch (Exception e) {
            System.out.println("co loi:" +e);
        }
        
}
}

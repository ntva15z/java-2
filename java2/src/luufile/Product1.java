/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luufile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANG
 */
public class Product1 {
    public void readAllObject() throws IOException{
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
    public void writeObject() throws IOException{
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
    ////////////
    public void writeObject(List<Product> list) throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream("listproduct.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //String[] strs = new String[]{"mot","hai","ba"};
//        Product[] prds = new Product[]{
//          new Product("1","Suger",30.5),
//          new Product("1","Rice",15.5)
//        };
//        Product1[] prd =(Product1[]) list.toArray();
        oos.writeObject(list);
        oos.close();
        } catch (Exception e) {
            e.toString();
        }
        
    }
    public void readFileDat() throws Exception{
        FileInputStream fis = new FileInputStream("vd1.dat");
        int c;
        while((c=fis.read())!=-1){
        System.out.println((char)c);
    }
        fis.close();
    }
    public void writeFileDat() throws Exception{
        try {
            FileOutputStream fos = new FileOutputStream("vd1.dat");
        String txt = "Ghi doan nay vao file";
        byte[] b = txt.getBytes();
        fos.write(b);
        } catch (Exception e) {
            
            Logger.getLogger(ghifile.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}

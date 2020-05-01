/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luufile;

import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANG
 */
public class ghifile {
    public static void main(String[] args) {
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

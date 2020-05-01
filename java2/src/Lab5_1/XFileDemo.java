/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_1;

import java.io.IOException;

/**
 *
 * @author HOANG
 */
public class XFileDemo {
    public static void main(String[] args) throws IOException {
        byte[] data = XFile.read("c:/temp/a.gif");
        XFile.write("c:/temp/b.gif",data);
    }
}

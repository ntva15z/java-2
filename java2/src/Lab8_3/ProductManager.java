/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_3;


/**
 *
 * @author HOANG
 */
public class ProductManager {

    public static void main(String[] args) throws Exception {
        Product p1 = new Product("Iphone9",1000.0);
        Product p2 = new Product("Samsung", 3000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.load("C:\\Users\\HOANG\\Desktop\\luufile\\lab8.txt");
        ProductDAO dao2 = new ProductDAO();
        dao2.store("C:\\Users\\HOANG\\Desktop\\luufile\\lab8.txt");
        Product p = dao2.find("Iphone9");
        try {
            
            System.out.println("Name: " + p.name);
            System.out.println("Price: " + p.price);
        } catch (Exception e) {
            throw new Exception("khong tim thay mat hang nay");
        }
        
    }
}

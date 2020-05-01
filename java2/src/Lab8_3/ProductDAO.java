/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_3;


import java.io.Serializable;
import static java.util.Collections.list;

/**
 *
 * @author HOANG
 */
public class ProductDAO extends DAO<Product>{

    @Override
    public void update(Product entyti) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(entyti.name)) {
                list.set(i, entyti);
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for (Product p : list) {
            if (p.name.equals(id)) {
                return p;
            }
        }
        return null;
    }

}


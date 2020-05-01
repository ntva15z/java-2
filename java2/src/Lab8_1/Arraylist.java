/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOANG
 */
public class Arraylist {
    public List<Integer> listInt;
    public List<Double> listDou;
    public List<Boolean> listBoolean;
    public List<String> listString;
    
    public Arraylist(){
        listInt = new ArrayList<>();
        listDou = new ArrayList<>();
        listBoolean = new ArrayList<>();
        listString = new ArrayList<>();
    }
    
    public Arraylist(List<Integer> listInt ,List<Double> listDou, List<Boolean> listBoolean,List<String> listString){
        this.listInt = listInt;
        this.listDou = listDou;
        this.listBoolean = listBoolean;
        this.listString = listString;
    }

    public List<Integer> getListInt() {
        return listInt;
    }

    public void setListInt(List<Integer> listInt) {
        this.listInt = listInt;
    }

    public List<Double> getListDou() {
        return listDou;
    }

    public void setListDou(List<Double> listDou) {
        this.listDou = listDou;
    }

    public List<Boolean> getListBoolean() {
        return listBoolean;
    }

    public void setListBoolean(List<Boolean> listBoolean) {
        this.listBoolean = listBoolean;
    }

    public List<String> getListString() {
        return listString;
    }

    public void setListString(List<String> listString) {
        this.listString = listString;
    }
    
    public void printInt(){
        listInt.add(12);
        listInt.add(2);
        listInt.add(12);
        listInt.add(2);
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.toString());
            break;
        }
    }
    
    public void printDouble(){
        listDou.add(3.5);
        listDou.add(4.5);
        listDou.add(5.5);
        listDou.add(6.5);
        for (int i = 0; i < listDou.size(); i++) {
            System.out.println(listDou.toString());
            break;
        }
    }
    public boolean printBoolean() {
        listBoolean.add(10 > 9);
        listBoolean.add(3 > 4);
        listBoolean.add(4 < 10);
        listBoolean.add(5 > 6);
        for (int i = 0; i < listBoolean.size(); i++) {
            System.out.println(listBoolean.toString());
            break;
        }
        return false;
    }
    public void printString(){
        listString.add("Minh");
        listString.add("Lương");
        listString.add("VŨ");
        listString.add("Hiếu");
        for(int i=0;i<listString.size();i++){
            System.out.println(listString.toString());
            break;
        }
    }
}



    


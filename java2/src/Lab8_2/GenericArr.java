/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOANG
 */
public class GenericArr {
    private ArrayList<Integer> myArr;
    private Scanner scanner;

    public GenericArr() {
        myArr = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public GenericArr(ArrayList<Integer> myArr, Scanner scanner) {
        this.myArr = myArr;
        this.scanner = scanner;
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            myArr.add(scanner.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myArr.get(i) + "\t");
        }
    }
}

class Main1 {

    public static void main(String[] args) {
        GenericArr Garr = new GenericArr();
        Garr.print();
    }
}

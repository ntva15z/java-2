/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_1;

/**
 *
 * @author HOANG
 */
public class StudentFPL {
    private String Fullname;
    private careerr c;
    
    
    public void printSdt(){
        System.out.println(this.Fullname);
        switch (c) {
            case LTMB:
                System.out.println("Ho Ten: " + Fullname + " ,Nganh: " +c);
                break;
            case TKDH:
                System.out.println("Ho Ten: " + Fullname + " ,Nganh: " +c);
                break;
            case UDPM:
                System.out.println("Ho Ten: " + Fullname + " ,Nganh: " +c);
                break;
            case TKTW:
                System.out.println("Ho Ten: " + Fullname + " ,Nganh: " +c);
                break;
                
            default:
                break;
        }
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public careerr getC() {
        return c;
    }

    public void setC(careerr c) {
        this.c = c;
    }
    
}

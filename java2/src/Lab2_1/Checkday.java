/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_1;

import java.util.Scanner;

/**
 *
 * @author HOANG
 */
public class Checkday {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhập số");
		int day = Integer.parseInt(sc.nextLine());
		/*if(day == Weekday.Sunday){
			System.out.println("Chủ nhật");
		}else if(day== Weekday.Monday){
			System.out.println("Thứ hai");
		}else if(day ==Weekday.Tuesday){
			System.out.println("Thứ ba");
		}else if(day==Weekday.Wednesday){
			System.out.println("Thứ tư");
		}else if(day==Weekday.Thursday){
			System.out.println("Thứ năm");
		}else if(day==Weekday.Friday){
			System.out.println("Thứ sáu");
		}else{
			System.out.println("Thứ bảy");
		}*/
		switch (day) {
			case Weekday.Sunday:
				System.out.println("Chủ nhật");
				break;
			case Weekday.Monday:
				System.out.println("Thứ hai"); break;
			case Weekday.Tuesday:
				System.out.println("Thứ ba");break;
			case Weekday.Wednesday:
				System.out.println("Thứ tư");break;
			case Weekday.Thursday:
				System.out.println("Thứ năm");break;
			case Weekday.Friday:
				System.out.println("Thứ sáu");break;
			case Weekday.Saturday:
				System.out.println("Thứ bảy");break;
			default:
				System.out.println("Không có lựa chọn này");break;
		}
	}
}

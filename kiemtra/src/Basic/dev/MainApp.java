package Basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.Viết chương trình nhập vào 3 số nguyên.Kiểm tra 3 số có phải là độ dài 3 cạnh của 1 tam giác
//2.Viết chương trình khai báo mảng số nguyên 10 phần tử
//a)Tạo giá trị ngẫu nhiên cho mảng
//b)Đếm xem mảng có bao nhiêu số chẵn số lẻ

//1.
		Scanner sc = new Scanner (System.in);
		
		System.out.format("Nhap canh a : ");
		int a = sc.nextInt();
		System.out.format("Nhap canh b : ");
		int b = sc.nextInt();
		System.out.format("Nhap canh c : ");
		int c = sc.nextInt();
		
		if((a + b > c)|| (a + c > b)|| (b + c > a)) {;
		  System.out.println("a b c la 3 canh cua 1 tam giac"); 
		} else {
			System.out.println("a b c khong phai la 3 canh cua 1 tam giac");
		}
	} 
}



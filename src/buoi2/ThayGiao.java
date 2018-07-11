package buoi2;

import java.util.Scanner;

public class ThayGiao {
  @Override
	public String toString() {
		return "ThayGiao [ma=" + ma + ", ten=" + ten + "]";
	}
public ThayGiao() {
		super();
	}
public ThayGiao(String ma, String ten) {
		super();
		ThayGiao.ma = ma;
		ThayGiao.ten = ten;
	}
public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		ThayGiao.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		ThayGiao.ten = ten;
	}
	public void nhap (){
		System.out.println("Moi nhap ma:");
		scanner = new Scanner(System.in);
		ma= scanner.nextLine();
		System.out.println("Moi nhap ten:");
		ten=scanner.nextLine();
		
	}
	public  void hienthi(){
		System.out.println(toString());
	}
private static String ma;
  private static String ten;
private Scanner scanner;
}

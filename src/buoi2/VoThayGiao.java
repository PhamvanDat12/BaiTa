package buoi2;

import java.util.Scanner;

public class VoThayGiao {
	public VoThayGiao(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public VoThayGiao(){
		super();
	}
	private  String ma;
	private  String ten;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		return "VoThayGiao [ma=" + ma + ", ten=" + ten + "]";
	}
	public void nhap (){
		
		System.out.println("Moi nhap ma:");
		ma= new Scanner(System.in).nextLine();
		System.out.println("Moi nhap ten:");
		ten=new Scanner(System.in).nextLine();
		
		
	}
	public  void hienthi(){
		
		System.out.println(toString());
		
	}
	
}

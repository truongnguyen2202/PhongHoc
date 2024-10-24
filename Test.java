package nguyenTienTruong_20003065;

public class Test {
	public static void main(String[] args) throws Exception {
		ListPH ph=new ListPH();
		ph.themPH(new PhongLT("A01","Day A",50,50,true));
		ph.themPH(new PhongTN("B02","Day B",70,60,"Tin",40,true));
		System.out.println(ph);
	}
}

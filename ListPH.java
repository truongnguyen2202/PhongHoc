package nguyenTienTruong_20003065;

import java.util.ArrayList;
import java.util.List;

public class ListPH {
	private List<PhongHoc> dSP;
	public ListPH() {
		dSP=new ArrayList<PhongHoc>();
	}
	public boolean themPH(PhongHoc p) {
		if(dSP.contains(p))
			return false;
		dSP.add(p);
		return true;
	}
	public PhongHoc timPH(String maPhong) {
		for(PhongHoc p:dSP) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}return null;
			
	}
	public List<PhongHoc> danhSachDC(){
		List<PhongHoc> dSDC=new ArrayList<PhongHoc>();
		for(PhongHoc p:dSP)
			if(p.getDatChuan())
				dSDC.add(p);
		return dSDC;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(PhongHoc p :dSP)
			sb.append(p.toString()).append("/n");
		return sb.toString();
	}
}
package nguyenTienTruong_20003065;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong,dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	
	public PhongHoc() throws Exception {
		this("","",0.0,0);
	}

	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws Exception {
		if(maPhong==null)
			throw new Exception("Loi");
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws Exception {
		if(dayNha==null)
			throw new Exception("Loi");
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws Exception {
		if(dienTich<=0)
			throw new Exception("Loi");
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception {
		if(soBongDen<=0)
			throw new Exception("Loi");
		this.soBongDen = soBongDen;
	}
	public boolean duSang() {
		return (getDienTich()/getSoBongDen()<=10);
	}
	public abstract boolean getDatChuan();
	@Override
	public String toString() {
		String s="";
		s+=String.format("|-10%s|-10%s|-10%s|-10%s|",getMaPhong(),getDayNha(),getDienTich(),getSoBongDen());
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
}

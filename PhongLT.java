package nguyenTienTruong_20003065;

public class PhongLT extends PhongHoc {
	private boolean coMayChieu;
	
	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}	
	public PhongLT() throws Exception {
		super();
		this.coMayChieu = false;
	}
	public boolean isCoMayChieu() {
		return coMayChieu;
	}
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	@Override
	public boolean getDatChuan() {
		return (duSang() && coMayChieu);
	}
	@Override
	public String toString() {
		String mayChieu=coMayChieu?"co":"Khong";
		return super.toString()+String.format("", mayChieu);
	}
}

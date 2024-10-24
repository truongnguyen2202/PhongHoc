package nguyenTienTruong_20003065;

public class PhongTN extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean coBonRua) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	public PhongTN() throws Exception {
		super();
		this.coBonRua = false;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	@Override
	public boolean getDatChuan() {
		return (duSang()&&coBonRua);
	}
	@Override
	public String toString() {
		String bonRua=coBonRua?"Co":"Khong";
		return super.toString()+String.format("%s;%s;%s",getChuyenNganh(),getSucChua(),bonRua);
	}
}

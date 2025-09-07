package Model;

import java.sql.Date;

public class ModelInforUserPlayer {
	private String id;
	private String HoDem;
	private String ten;
	private Date ngaySinh;
	private String GioiTinh;
	private String tenDangNhap;
	private String matKhau;
	private String soDienThoai;
	private String diaChi;
	private String tenNganHang;
	private String soTaiKhoanNganHang;
	public ModelInforUserPlayer(String id, String hoDem, String ten, Date ngaySinh, String gioiTinh, String tenDangNhap,
			String matKhau, String soDienThoai, String diaChi, String tenNganHang, String soTaiKhoanNganHang) {
		this.id = id;
		HoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.tenNganHang = tenNganHang;
		this.soTaiKhoanNganHang = soTaiKhoanNganHang;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the hoDem
	 */
	public String getHoDem() {
		return HoDem;
	}
	/**
	 * @param hoDem the hoDem to set
	 */
	public void setHoDem(String hoDem) {
		HoDem = hoDem;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * @return the ngaySinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}
	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return GioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the tenNganHang
	 */
	public String getTenNganHang() {
		return tenNganHang;
	}
	/**
	 * @param tenNganHang the tenNganHang to set
	 */
	public void setTenNganHang(String tenNganHang) {
		this.tenNganHang = tenNganHang;
	}
	/**
	 * @return the soTaiKhoanNganHang
	 */
	public String getSoTaiKhoanNganHang() {
		return soTaiKhoanNganHang;
	}
	/**
	 * @param soTaiKhoanNganHang the soTaiKhoanNganHang to set
	 */
	public void setSoTaiKhoanNganHang(String soTaiKhoanNganHang) {
		this.soTaiKhoanNganHang = soTaiKhoanNganHang;
	}
	
	
	
}

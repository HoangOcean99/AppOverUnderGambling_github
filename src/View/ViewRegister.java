package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.View;

import Controller.ControllerRegister;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class ViewRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_hoDem;
	private JTextField textField_ten;
	private JTextField textField_TenDangNhap;
	private JTextField textField_matKhau;
	private JTextField textField_xacNhanMatKhau;
	private JTextField textField_SoDT;
	public static ViewRegister frame;
	private JTextField textField_nhapMaCapcha;
	public static ViewLogin viewlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		viewlogin = new ViewLogin();
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					frame = new ViewRegister();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewRegister() {
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setTitle("Đăng kí tài khoản");
		this.setIconImage(Toolkit.getDefaultToolkit().createImage(ViewRegister.class.getResource("TieuDeRegister.png")));
		//setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(0, 500));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setSize(500, 600);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ControllerRegister controllerregister = new ControllerRegister(this);
		
		JLabel label_dangNhap = new JLabel("Đăng kí thành viên mới");
		label_dangNhap.setForeground(Color.RED);
		label_dangNhap.setFont(new Font("Times New Roman", Font.BOLD, 40));
		label_dangNhap.setBounds(42, 24, 404, 47);
		contentPane.add(label_dangNhap);
		
		JLabel lblNewLabel_hodem = new JLabel("Họ đệm:");
		lblNewLabel_hodem.setForeground(new Color(255, 255, 255));
		lblNewLabel_hodem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_hodem.setBounds(24, 101, 65, 21);
		contentPane.add(lblNewLabel_hodem);
		
		JLabel lblTn_ten = new JLabel("Tên:");
		lblTn_ten.setForeground(new Color(255, 255, 255));
		lblTn_ten.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTn_ten.setBounds(286, 105, 45, 13);
		contentPane.add(lblTn_ten);
		
		JLabel lblNewLabel_ngaySinh = new JLabel("Ngày sinh:");
		lblNewLabel_ngaySinh.setForeground(new Color(255, 255, 255));
		lblNewLabel_ngaySinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_ngaySinh.setBounds(24, 150, 75, 13);
		contentPane.add(lblNewLabel_ngaySinh);
		
		JLabel lblNewLabel_gioiTinh = new JLabel("Giới tính:");
		lblNewLabel_gioiTinh.setForeground(new Color(255, 255, 255));
		lblNewLabel_gioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_gioiTinh.setBounds(317, 147, 75, 18);
		contentPane.add(lblNewLabel_gioiTinh);
		
		JLabel lblNewLabel_tenDangNhap = new JLabel("Tên đăng nhập:");
		lblNewLabel_tenDangNhap.setForeground(new Color(255, 255, 255));
		lblNewLabel_tenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_tenDangNhap.setBounds(24, 195, 109, 13);
		contentPane.add(lblNewLabel_tenDangNhap);
		
		JLabel lblNewLabel_matKhau = new JLabel("Mật khẩu:");
		lblNewLabel_matKhau.setForeground(new Color(255, 255, 255));
		lblNewLabel_matKhau.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_matKhau.setBounds(24, 238, 88, 13);
		contentPane.add(lblNewLabel_matKhau);
		
		JLabel lblNewLabel_xacNhanMatKhau = new JLabel("Xác nhận mật khẩu:");
		lblNewLabel_xacNhanMatKhau.setForeground(new Color(255, 255, 255));
		lblNewLabel_xacNhanMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_xacNhanMatKhau.setBounds(24, 281, 129, 13);
		contentPane.add(lblNewLabel_xacNhanMatKhau);
		
		JLabel lblNewLabel_SoDT = new JLabel("Số điện thoại: ");
		lblNewLabel_SoDT.setForeground(new Color(255, 255, 255));
		lblNewLabel_SoDT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_SoDT.setBounds(24, 326, 104, 13);
		contentPane.add(lblNewLabel_SoDT);
		
		JButton btnNewButton_dieuKhoanSuDung = new JButton("Điều khoản sử dụng");
		btnNewButton_dieuKhoanSuDung.setBackground(new Color(0, 191, 255));
		btnNewButton_dieuKhoanSuDung.setForeground(new Color(255, 255, 255));
		btnNewButton_dieuKhoanSuDung.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_dieuKhoanSuDung.setBounds(24, 485, 174, 21);
		contentPane.add(btnNewButton_dieuKhoanSuDung);
		
		JCheckBox chckbxNewCheckBox_dongYDieuKhoan = new JCheckBox("Đồng ý điều khoản");
		chckbxNewCheckBox_dongYDieuKhoan.setBackground(new Color(0, 191, 255));
		chckbxNewCheckBox_dongYDieuKhoan.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_dongYDieuKhoan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox_dongYDieuKhoan.setBounds(302, 485, 163, 21);
		contentPane.add(chckbxNewCheckBox_dongYDieuKhoan);
		
		JLabel lblNewLabel_diaChi = new JLabel("Địa chỉ:");
		lblNewLabel_diaChi.setForeground(new Color(255, 255, 255));
		lblNewLabel_diaChi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_diaChi.setBounds(24, 373, 75, 13);
		contentPane.add(lblNewLabel_diaChi);
		
		textField_hoDem = new JTextField();
		textField_hoDem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_hoDem.setBounds(99, 98, 159, 29);
		contentPane.add(textField_hoDem);
		textField_hoDem.setColumns(10);
		
		textField_ten = new JTextField();
		textField_ten.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_ten.setBounds(324, 98, 141, 29);
		contentPane.add(textField_ten);
		textField_ten.setColumns(10);
		
		textField_TenDangNhap = new JTextField();
		textField_TenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_TenDangNhap.setBounds(181, 188, 214, 29);
		contentPane.add(textField_TenDangNhap);
		textField_TenDangNhap.setColumns(10);
		
		textField_matKhau = new JTextField();
		textField_matKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_matKhau.setBounds(181, 274, 180, 29);
		contentPane.add(textField_matKhau);
		textField_matKhau.setColumns(10);
		
		textField_xacNhanMatKhau = new JTextField();
		textField_xacNhanMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_xacNhanMatKhau.setBounds(181, 231, 180, 29);
		contentPane.add(textField_xacNhanMatKhau);
		textField_xacNhanMatKhau.setVerifyInputWhenFocusTarget(true);
		textField_xacNhanMatKhau.setColumns(10);
		
		textField_SoDT = new JTextField();
		textField_SoDT.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_SoDT.setBounds(181, 274, 180, 29);
		contentPane.add(textField_SoDT);
		textField_SoDT.setColumns(10);
		
		String[] gioiTinh = {"Nam", "Nữ", "Khác"};
		JComboBox<String> comboBox_gioiTinh = new JComboBox<String>();
		comboBox_gioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ArrayList<String> arraylistGioiTinh = new ArrayList<String>();
		comboBox_gioiTinh.addItem("");
		for (String GioiTinh : gioiTinh) {
			arraylistGioiTinh.add(GioiTinh);
			comboBox_gioiTinh.addItem(GioiTinh);
		}
		comboBox_gioiTinh.setBounds(398, 143, 67, 29);
		contentPane.add(comboBox_gioiTinh);
		
		JComboBox comboBox_ngaysinh = new JComboBox();
		comboBox_ngaysinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_ngaysinh.setBounds(99, 143, 36, 29);
		contentPane.add(comboBox_ngaysinh);
		
		JComboBox comboBox_thangSinh = new JComboBox();
		comboBox_thangSinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_thangSinh.setBounds(162, 143, 36, 29);
		contentPane.add(comboBox_thangSinh);
		
		JComboBox comboBox_namSinh = new JComboBox();
		comboBox_namSinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox_namSinh.setBounds(229, 143, 57, 29);
		contentPane.add(comboBox_namSinh);
		
		JTextArea textArea_diaChi = new JTextArea();
		textArea_diaChi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea_diaChi.setBounds(181, 374, 239, 55);
		contentPane.add(textArea_diaChi);
		
		JLabel lblNewLabel_set1 = new JLabel("/");
		lblNewLabel_set1.setForeground(new Color(255, 255, 255));
		lblNewLabel_set1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_set1.setBounds(141, 150, 17, 13);
		contentPane.add(lblNewLabel_set1);
		
		JLabel lblNewLabel_set2 = new JLabel("/");
		lblNewLabel_set2.setForeground(new Color(255, 255, 255));
		lblNewLabel_set2.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_set2.setBounds(208, 150, 17, 13);
		contentPane.add(lblNewLabel_set2);
		
		textField_nhapMaCapcha = new JTextField();
		textField_nhapMaCapcha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_nhapMaCapcha.setColumns(10);
		textField_nhapMaCapcha.setBounds(181, 446, 180, 29);
		contentPane.add(textField_nhapMaCapcha);
		
		JButton btnNewButton_quayLai = new JButton("Quay lại");
		btnNewButton_quayLai.setBackground(new Color(0, 255, 0));
		btnNewButton_quayLai.setForeground(new Color(255, 255, 255));
		btnNewButton_quayLai.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_quayLai.setBounds(84, 521, 96, 21);
		btnNewButton_quayLai.addActionListener(controllerregister);
		contentPane.add(btnNewButton_quayLai);
		
		
		JButton btnNewButton_dangKi = new JButton("Đăng kí");
		btnNewButton_dangKi.setBackground(new Color(0, 255, 0));
		btnNewButton_dangKi.setForeground(new Color(255, 255, 255));
		btnNewButton_dangKi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_dangKi.setBounds(302, 521, 96, 21);
		contentPane.add(btnNewButton_dangKi);
		
		JPanel panel_chuaMaCapcha = new JPanel();
		panel_chuaMaCapcha.setBackground(new Color(230, 230, 250));
		panel_chuaMaCapcha.setBounds(24, 450, 80, 21);
		contentPane.add(panel_chuaMaCapcha);
		panel_chuaMaCapcha.setLayout(null);
		
		JLabel lblNewLabel_MaCapcha = new JLabel("J23JD");
		lblNewLabel_MaCapcha.setBounds(0, 0, 80, 21);
		panel_chuaMaCapcha.add(lblNewLabel_MaCapcha);
		lblNewLabel_MaCapcha.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_MaCapcha.setBackground(new Color(119, 136, 153));
		lblNewLabel_MaCapcha.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton button_seenMK = new JButton("");
		button_seenMK.setIcon(new ImageIcon("D:\\Hoc_tap\\Eclipse_hoc_java\\Hoc_hibernate_spring_tool\\FullAppGameCaCuocTaiXiu1\\icons8-eye-16.png"));
		button_seenMK.setBounds(380, 231, 29, 29);
		button_seenMK.setBackground(new Color(0, 191, 255));
		contentPane.add(button_seenMK);
		
		JButton button_seenXacNhanMK = new JButton("");
		button_seenXacNhanMK.setIcon(new ImageIcon("D:\\Hoc_tap\\Eclipse_hoc_java\\Hoc_hibernate_spring_tool\\FullAppGameCaCuocTaiXiu1\\icons8-eye-16.png"));
		button_seenXacNhanMK.setBounds(380, 274, 29, 29);
		button_seenXacNhanMK.setBackground(new Color(0, 191, 255));
		contentPane.add(button_seenXacNhanMK);
	}
}

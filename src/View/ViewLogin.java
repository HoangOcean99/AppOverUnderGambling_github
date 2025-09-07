package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerLogin;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField_tenDangNhap;
	public JTextField textField_matKhau;
	public static ViewLogin frame;
	public static ViewRegister viewregister;
	public static ViewDienTKNganHang viewdiennganhang;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ViewLogin() {
		viewregister = new ViewRegister();
		viewdiennganhang = new ViewDienTKNganHang();
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setTitle("Đăng nhập");
		this.setSize(500, 560);
		//setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().createImage(ViewLogin.class.getResource("TieuDeLogin.png")));
		contentPane = new JPanel();
		contentPane.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ControllerLogin controllerlogin = new ControllerLogin(this);
		
		JLabel label_dangNhap = new JLabel("Đăng nhập");
		label_dangNhap.setForeground(Color.RED);
		label_dangNhap.setFont(new Font("Times New Roman", Font.BOLD, 40));
		label_dangNhap.setBounds(146, 38, 195, 47);
		contentPane.add(label_dangNhap);
		
		JLabel lblNewLabel_tenDangNhap = new JLabel("Tên đăng nhập:");
		lblNewLabel_tenDangNhap.setForeground(new Color(245, 255, 250));
		lblNewLabel_tenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_tenDangNhap.setBounds(33, 113, 128, 23);
		contentPane.add(lblNewLabel_tenDangNhap);
		
		JLabel lblNewLabel_headerMatKhau = new JLabel("Mật khẩu:");
		lblNewLabel_headerMatKhau.setForeground(new Color(245, 255, 250));
		lblNewLabel_headerMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_headerMatKhau.setBounds(33, 181, 116, 30);
		contentPane.add(lblNewLabel_headerMatKhau);
		
		textField_tenDangNhap = new JTextField();
		textField_tenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_tenDangNhap.setBounds(171, 110, 279, 33);
		contentPane.add(textField_tenDangNhap);
		textField_tenDangNhap.setColumns(10);
		
		textField_matKhau = new JTextField();
		textField_matKhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_matKhau.setBounds(171, 182, 244, 33);
		contentPane.add(textField_matKhau);
		textField_matKhau.setColumns(10);
		
		JButton btnNewButton_dangNhap = new JButton("Đăng nhập");
		btnNewButton_dangNhap.setForeground(new Color(255, 250, 250));
		btnNewButton_dangNhap.setBackground(new Color(0, 255, 0));
		btnNewButton_dangNhap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_dangNhap.setBounds(33, 289, 417, 30);
		btnNewButton_dangNhap.addActionListener(controllerlogin);
		contentPane.add(btnNewButton_dangNhap);
		
		JLabel lblNewLabel_hoac = new JLabel("Hay đăng nhập bằng: ");
		lblNewLabel_hoac.setBackground(new Color(240, 240, 240));
		lblNewLabel_hoac.setForeground(new Color(248, 248, 255));
		lblNewLabel_hoac.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_hoac.setBounds(170, 343, 159, 23);
		contentPane.add(lblNewLabel_hoac);
		
		JButton btnNewButton_facebook = new JButton("");
		btnNewButton_facebook.setBackground(new Color(0, 191, 255));
		btnNewButton_facebook.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-facebook-48.png"));
		btnNewButton_facebook.setBounds(146, 387, 36, 38);
		contentPane.add(btnNewButton_facebook);
		
		JButton btnNewButton_google = new JButton("");
		btnNewButton_google.setBackground(new Color(0, 191, 255));
		btnNewButton_google.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-google-30.png"));
		btnNewButton_google.setBounds(218, 387, 36, 38);
		contentPane.add(btnNewButton_google);
		
		JButton btnNewButton_microsoft = new JButton("");
		btnNewButton_microsoft.setForeground(new Color(60, 179, 113));
		btnNewButton_microsoft.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-microsoft-48.png"));
		btnNewButton_microsoft.setBounds(293, 387, 36, 38);
		btnNewButton_microsoft.setBackground(new Color(0, 191, 255));
		contentPane.add(btnNewButton_microsoft);
		
		JButton btnNewButton_quenMatKhau = new JButton("Quên mật khẩu");
		btnNewButton_quenMatKhau.setForeground(new Color(255, 255, 255));
		btnNewButton_quenMatKhau.setBackground(new Color(0, 191, 255));
		btnNewButton_quenMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_quenMatKhau.setBounds(33, 244, 143, 21);
		contentPane.add(btnNewButton_quenMatKhau);
		
		JCheckBox chckbxNewCheckBox_nhoMatKhau = new JCheckBox("Nhớ mật khẩu");
		chckbxNewCheckBox_nhoMatKhau.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_nhoMatKhau.setBackground(new Color(0, 191, 255));
		chckbxNewCheckBox_nhoMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		chckbxNewCheckBox_nhoMatKhau.setBounds(341, 244, 109, 21);
		contentPane.add(chckbxNewCheckBox_nhoMatKhau);
		
		JButton btnNewButton_đangKiTaiKhoan = new JButton("Đăng ký tài khoản");
		btnNewButton_đangKiTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_đangKiTaiKhoan.setForeground(new Color(255, 255, 255));
		btnNewButton_đangKiTaiKhoan.setBackground(new Color(0, 191, 255));
		btnNewButton_đangKiTaiKhoan.setBounds(157, 461, 159, 21);
		
		contentPane.add(btnNewButton_đangKiTaiKhoan);
		btnNewButton_đangKiTaiKhoan.addActionListener(controllerlogin);
	}
}

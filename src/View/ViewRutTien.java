package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerRegister;
import Controller.ControllerRutTien;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ViewRutTien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_SoTien;
	public static ViewRutTien frame;
	public static ViewHome2 viewHome2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			

			public void run() {
				try {
					frame = new ViewRutTien();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewRutTien() {
		ControllerRutTien controllerruttien = new ControllerRutTien(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_headerRutTien = new JLabel("Rút tiền");
		lblNewLabel_headerRutTien.setForeground(new Color(255, 0, 0));
		lblNewLabel_headerRutTien.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblNewLabel_headerRutTien.setBounds(152, 3, 153, 67);
		contentPane.add(lblNewLabel_headerRutTien);
		
		JButton btnNewButton_RutTien = new JButton("Rút tiền");
		btnNewButton_RutTien.setBackground(new Color(0, 255, 0));
		btnNewButton_RutTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_RutTien.setBounds(242, 212, 100, 30);
		contentPane.add(btnNewButton_RutTien);
		
		JLabel lblNewLabel_headerNganHang = new JLabel("Ngân hàng:");
		lblNewLabel_headerNganHang.setForeground(new Color(255, 255, 255));
		lblNewLabel_headerNganHang.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_headerNganHang.setBounds(46, 85, 71, 19);
		contentPane.add(lblNewLabel_headerNganHang);
		
		JLabel lblNewLabel_headerTenTK = new JLabel("Tên TK: ");
		lblNewLabel_headerTenTK.setForeground(new Color(255, 255, 255));
		lblNewLabel_headerTenTK.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_headerTenTK.setBounds(46, 120, 71, 28);
		contentPane.add(lblNewLabel_headerTenTK);
		
		JLabel lblNewLabel_headerSoTien = new JLabel("Số tiền: ");
		lblNewLabel_headerSoTien.setForeground(new Color(255, 255, 255));
		lblNewLabel_headerSoTien.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_headerSoTien.setBounds(46, 160, 71, 28);
		contentPane.add(lblNewLabel_headerSoTien);
		
		JPanel panel_nganHang = new JPanel();
		panel_nganHang.setBackground(new Color(230, 230, 250));
		panel_nganHang.setBounds(157, 80, 235, 30);
		contentPane.add(panel_nganHang);
		panel_nganHang.setLayout(null);
		
		JLabel lblNewLabel_TenNganHang = new JLabel("Ngân hàng");
		lblNewLabel_TenNganHang.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_TenNganHang.setBounds(10, 0, 225, 30);
		panel_nganHang.add(lblNewLabel_TenNganHang);
		
		JPanel panel_TenTk = new JPanel();
		panel_TenTk.setBackground(new Color(230, 230, 250));
		panel_TenTk.setBounds(157, 120, 235, 30);
		contentPane.add(panel_TenTk);
		panel_TenTk.setLayout(null);
		
		JLabel lblNewLabel_TenTk = new JLabel("Tên chủ tài khoản");
		lblNewLabel_TenTk.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_TenTk.setBounds(10, 0, 225, 30);
		panel_TenTk.add(lblNewLabel_TenTk);
		
		JPanel panel_NhapTien = new JPanel();
		panel_NhapTien.setBackground(new Color(255, 255, 255));
		panel_NhapTien.setBounds(157, 160, 235, 30);
		contentPane.add(panel_NhapTien);
		panel_NhapTien.setLayout(null);
		
		textField_SoTien = new JTextField();
		textField_SoTien.setBounds(0, 0, 190, 30);
		panel_NhapTien.add(textField_SoTien);
		textField_SoTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_SoTien.setColumns(10);
		
		JLabel lblNewLabel_donViTienViet = new JLabel("VNĐ");
		lblNewLabel_donViTienViet.setForeground(new Color(255, 0, 0));
		lblNewLabel_donViTienViet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_donViTienViet.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_donViTienViet.setBounds(190, 0, 45, 30);
		panel_NhapTien.add(lblNewLabel_donViTienViet);
		
		JButton btnNewButton_Huy = new JButton("Hủy");
		btnNewButton_Huy.setBackground(new Color(0, 255, 0));
		btnNewButton_Huy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_Huy.setBounds(89, 212, 100, 30);
		btnNewButton_Huy.addActionListener(controllerruttien);
		contentPane.add(btnNewButton_Huy);
	}
}

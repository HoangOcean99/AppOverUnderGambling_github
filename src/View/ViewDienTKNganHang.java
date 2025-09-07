package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerDienTKNganHang;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class ViewDienTKNganHang extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ViewDienTKNganHang frame;
	private JTextField textField_nhapSoTK;
	public static ViewHome2 viewHome2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					frame = new ViewDienTKNganHang();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewDienTKNganHang() {
		setTitle("Điền thông tin tài khoản ngân hàng");
		setSize(500, 500);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().createImage(ViewDienTKNganHang.class.getResource("TieuDeDienTKNH.png")));
		contentPane = new JPanel();
		contentPane.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ControllerDienTKNganHang ctlDienTKNH = new ControllerDienTKNganHang(this);
		
		JLabel lblNewLabel_headerLienKenganHang = new JLabel("Liên kết ngân hàng");
		lblNewLabel_headerLienKenganHang.setForeground(new Color(255, 0, 0));
		lblNewLabel_headerLienKenganHang.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_headerLienKenganHang.setBounds(59, 10, 352, 53);
		contentPane.add(lblNewLabel_headerLienKenganHang);
		
		JLabel lblNewLabel_headerNganHang = new JLabel("Tên ngân hàng:");
		lblNewLabel_headerNganHang.setForeground(new Color(255, 255, 255));
		lblNewLabel_headerNganHang.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_headerNganHang.setBounds(43, 86, 116, 29);
		contentPane.add(lblNewLabel_headerNganHang);
		
		JLabel lblNewLabel_headerSoTk = new JLabel("Số tài khoản:");
		lblNewLabel_headerSoTk.setForeground(new Color(255, 255, 255));
		lblNewLabel_headerSoTk.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_headerSoTk.setBounds(43, 139, 128, 29);
		contentPane.add(lblNewLabel_headerSoTk);
		
		textField_nhapSoTK = new JTextField();
		textField_nhapSoTK.setBounds(195, 140, 188, 29);
		contentPane.add(textField_nhapSoTK);
		textField_nhapSoTK.setColumns(10);
		
		JComboBox comboBox_tenNganHang = new JComboBox();
		comboBox_tenNganHang.setBounds(195, 88, 188, 29);
		contentPane.add(comboBox_tenNganHang);
		
		JButton btnNewButton_tiepTuc = new JButton("Tiếp tục");
		btnNewButton_tiepTuc.addActionListener(ctlDienTKNH);
		btnNewButton_tiepTuc.setBackground(new Color(0, 255, 0));
		btnNewButton_tiepTuc.setForeground(new Color(255, 255, 255));
		btnNewButton_tiepTuc.setBounds(173, 210, 85, 21);
		contentPane.add(btnNewButton_tiepTuc);
	}
}

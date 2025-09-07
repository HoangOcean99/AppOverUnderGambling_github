package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Controller.ControllerHome;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Panel;

public class ViewHome2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nhapTienCuoc;
	public static ViewHome2 frame;
	public static ViewCachChoi viewCachChoi;
	public static ViewNapTien viewNapTien;
	public static ViewRutTien viewRutTien;
	public static ViewLogin viewLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {


			public void run() {
				try {
					frame = new ViewHome2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewHome2() {
		viewCachChoi = new ViewCachChoi();
		viewNapTien = new ViewNapTien();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 650);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.ITALIC, 10));
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		ControllerHome ctlHome = new ControllerHome(this);
		
		JButton btnNewButton_Allin = new JButton("All-in");
		btnNewButton_Allin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_Allin.setBounds(279, 515, 85, 21);
		contentPane.add(btnNewButton_Allin);
		
		JButton btnNewButton_CuocTien = new JButton("Đặt cược");
		btnNewButton_CuocTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_CuocTien.setBounds(402, 515, 96, 21);
		contentPane.add(btnNewButton_CuocTien);
		
		JButton btnNewButton_Huy = new JButton("Hủy");
		btnNewButton_Huy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_Huy.setBounds(525, 515, 85, 21);
		contentPane.add(btnNewButton_Huy);
		
		JButton btnNewButton_NapTien = new JButton("");
		btnNewButton_NapTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewNapTien.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				viewNapTien.setVisible(true);
			}
		});
		btnNewButton_NapTien.setBackground(new Color(0, 191, 255));
		btnNewButton_NapTien.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-add-32.png"));
		btnNewButton_NapTien.setBounds(554, 21, 34, 34);
		contentPane.add(btnNewButton_NapTien);
		
		JButton btnNewButton_Logout = new JButton("Đăng xuất");
		btnNewButton_Logout.addActionListener(ctlHome);
		btnNewButton_Logout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_Logout.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_Logout.setBackground(new Color(0, 191, 255));
		btnNewButton_Logout.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-logout-24.png"));
		btnNewButton_Logout.setBounds(753, 0, 133, 34);
		contentPane.add(btnNewButton_Logout);
		
		JLabel lblNewLabel_AnhMatNguoi = new JLabel("");
		lblNewLabel_AnhMatNguoi.setBackground(new Color(0, 191, 255));
		lblNewLabel_AnhMatNguoi.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-human-40.png"));
		lblNewLabel_AnhMatNguoi.setBounds(20, 10, 42, 45);
		contentPane.add(lblNewLabel_AnhMatNguoi);
		
		JButton btnNewButton_RutTien = new JButton("Rút tiền");
		btnNewButton_RutTien.addActionListener(ctlHome);
		btnNewButton_RutTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_RutTien.setBounds(636, 21, 96, 30);
		contentPane.add(btnNewButton_RutTien);
		
		JPanel panel_TienDangCo = new JPanel();
		panel_TienDangCo.setBounds(327, 28, 217, 27);
		contentPane.add(panel_TienDangCo);
		panel_TienDangCo.setLayout(null);
		
		JLabel lblNewLabel_TienDangCo = new JLabel("0");
		lblNewLabel_TienDangCo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_TienDangCo.setBounds(1, 0, 175, 27);
		panel_TienDangCo.add(lblNewLabel_TienDangCo);
		lblNewLabel_TienDangCo.setBackground(new Color(248, 248, 255));
		
		JLabel lblNewLabel_donViTienDangCo = new JLabel("VNĐ");
		lblNewLabel_donViTienDangCo.setBounds(182, -2, 35, 30);
		panel_TienDangCo.add(lblNewLabel_donViTienDangCo);
		lblNewLabel_donViTienDangCo.setForeground(new Color(220, 20, 60));
		lblNewLabel_donViTienDangCo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel panel_TenChuTK = new JPanel();
		panel_TenChuTK.setBounds(61, 20, 172, 30);
		contentPane.add(panel_TenChuTK);
		panel_TenChuTK.setLayout(null);
		
		JLabel lblNewLabel_tenChuTK = new JLabel("Ocean Hoàng");
		lblNewLabel_tenChuTK.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_tenChuTK.setBounds(10, 0, 130, 30);
		panel_TenChuTK.add(lblNewLabel_tenChuTK);
		
		JPanel panel_TienCuoc = new JPanel();
		panel_TienCuoc.setBackground(new Color(255, 255, 255));
		panel_TienCuoc.setBounds(345, 449, 210, 30);
		contentPane.add(panel_TienCuoc);
		panel_TienCuoc.setLayout(null);
		
		textField_nhapTienCuoc = new JTextField();
		textField_nhapTienCuoc.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField_nhapTienCuoc.setBounds(0, 1, 176, 30);
		panel_TienCuoc.add(textField_nhapTienCuoc);
		textField_nhapTienCuoc.setColumns(10);
		
		JLabel lblNewLabel_DonViTienCuoc = new JLabel("VNĐ");
		lblNewLabel_DonViTienCuoc.setForeground(new Color(255, 0, 0));
		lblNewLabel_DonViTienCuoc.setBounds(177, 0, 33, 29);
		panel_TienCuoc.add(lblNewLabel_DonViTienCuoc);
		lblNewLabel_DonViTienCuoc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel panel_HomeChinhTaiXiu = new JPanel();
		panel_HomeChinhTaiXiu.setBackground(new Color(255, 127, 80));
		panel_HomeChinhTaiXiu.setBounds(46, 137, 803, 287);
		contentPane.add(panel_HomeChinhTaiXiu);
		panel_HomeChinhTaiXiu.setLayout(null);
		
		JPanel panel_ChuaXucSac = new JPanel();
		panel_ChuaXucSac.setBackground(new Color(0, 0, 0));
		panel_ChuaXucSac.setBounds(296, 39, 210, 194);
		panel_HomeChinhTaiXiu.add(panel_ChuaXucSac);
		panel_ChuaXucSac.setLayout(null);
		
		JLabel lblNewLabel_Dice1 = new JLabel("");
		lblNewLabel_Dice1.setBackground(new Color(222, 184, 135));
		lblNewLabel_Dice1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Dice1.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\red_dice_6.png"));
		lblNewLabel_Dice1.setBounds(20, 57, 64, 64);
		panel_ChuaXucSac.add(lblNewLabel_Dice1);
		
		JLabel lblNewLabel_Dice2 = new JLabel("");
		lblNewLabel_Dice2.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\red_dice_6.png"));
		lblNewLabel_Dice2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Dice2.setBounds(102, 112, 64, 64);
		panel_ChuaXucSac.add(lblNewLabel_Dice2);
		
		JLabel lblNewLabel_Dice3 = new JLabel("");
		lblNewLabel_Dice3.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\red_dice_6.png"));
		lblNewLabel_Dice3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Dice3.setBounds(115, 22, 64, 64);
		panel_ChuaXucSac.add(lblNewLabel_Dice3);
		
		Panel panel_ChuaSoDemNGuoc = new Panel();
		panel_ChuaSoDemNGuoc.setBounds(0, 0, 210, 194);
		panel_ChuaXucSac.add(panel_ChuaSoDemNGuoc);
		panel_ChuaSoDemNGuoc.setBackground(new Color(0, 0, 0));
		panel_ChuaSoDemNGuoc.setLayout(null);
		
		JLabel lblNewLabel_SoDemNguoc = new JLabel("25");
		lblNewLabel_SoDemNguoc.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_SoDemNguoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_SoDemNguoc.setFont(new Font("Times New Roman", Font.BOLD, 99));
		lblNewLabel_SoDemNguoc.setBounds(0, 5, 210, 189);
		lblNewLabel_SoDemNguoc.setForeground(Color.WHITE);
		panel_ChuaSoDemNGuoc.add(lblNewLabel_SoDemNguoc);
		
		JPanel panel_chuaTienLenSan = new JPanel();
		panel_chuaTienLenSan.setBounds(296, 243, 210, 30);
		panel_HomeChinhTaiXiu.add(panel_chuaTienLenSan);
		panel_chuaTienLenSan.setBackground(new Color(240, 255, 240));
		panel_chuaTienLenSan.setLayout(null);
		
		JLabel lblNewLabel_TienLenSan = new JLabel("0");
		lblNewLabel_TienLenSan.setBounds(10, 0, 190, 30);
		panel_chuaTienLenSan.add(lblNewLabel_TienLenSan);
		lblNewLabel_TienLenSan.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_TienLenSan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel panel_Tai = new JPanel();
		panel_Tai.setBackground(new Color(220, 20, 60));
		panel_Tai.setBounds(34, 39, 205, 195);
		panel_HomeChinhTaiXiu.add(panel_Tai);
		panel_Tai.setLayout(null);
		
		JLabel lblNewLabel_tai = new JLabel("Tài");
		lblNewLabel_tai.setBounds(28, 10, 142, 100);
		panel_Tai.add(lblNewLabel_tai);
		lblNewLabel_tai.setForeground(new Color(0, 0, 0));
		lblNewLabel_tai.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_tai.setFont(new Font("Times New Roman", Font.BOLD, 90));
		
		JButton btnNewButton_CuocTai = new JButton("Đặt cược\r\n");
		
		btnNewButton_CuocTai.setBounds(53, 132, 104, 34);
		panel_Tai.add(btnNewButton_CuocTai);
		btnNewButton_CuocTai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JPanel panel_Xiu = new JPanel();
		panel_Xiu.setForeground(Color.LIGHT_GRAY);
		panel_Xiu.setBackground(Color.YELLOW);
		panel_Xiu.setBounds(566, 39, 205, 195);
		panel_HomeChinhTaiXiu.add(panel_Xiu);
		panel_Xiu.setLayout(null);
		
		JLabel lblNewLabel_Xiu = new JLabel("Xỉu");
		lblNewLabel_Xiu.setBounds(34, 10, 142, 100);
		panel_Xiu.add(lblNewLabel_Xiu);
		lblNewLabel_Xiu.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_Xiu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Xiu.setFont(new Font("Times New Roman", Font.BOLD, 90));
		
		JButton btnNewButton_CuocXiu = new JButton("Đặt cược");
		
		
		btnNewButton_CuocXiu.setBounds(52, 130, 104, 34);
		panel_Xiu.add(btnNewButton_CuocXiu);
		btnNewButton_CuocXiu.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewCachChoi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				viewCachChoi.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-question-30.png"));
		btnNewButton.setBounds(20, 569, 34, 34);
		contentPane.add(btnNewButton);
	}
}



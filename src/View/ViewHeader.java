package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerHeader;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewHeader extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ViewHeader frame;
	public static ViewLogin viewlogin;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewHeader();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewHeader() {
		viewlogin = new ViewLogin();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		this.setTitle("Cá cược tài xỉu");
		this.setSize(700, 700);
		setIconImage(Toolkit.getDefaultToolkit().createImage(ViewHeader.class.getResource("TieuDeHeader.png")));
		//this.setLocationRelativeTo(null);
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_header_game = new JLabel("Game ");
		label_header_game.setBounds(270, 150, 139, 58);
		label_header_game.setForeground(Color.RED);
		label_header_game.setFont(new Font("Perpetua", Font.BOLD, 50));
		contentPane.add(label_header_game);
		
		JLabel label_header_caCuocTaiXiu = new JLabel("Cá cược tài xỉu");
		label_header_caCuocTaiXiu.setBounds(93, 265, 535, 105);
		label_header_caCuocTaiXiu.setForeground(new Color(255, 0, 0));
		label_header_caCuocTaiXiu.setFont(new Font("Tahoma", Font.BOLD, 70));
		contentPane.add(label_header_caCuocTaiXiu);
		
		ControllerHeader controllerheader = new ControllerHeader(this);
		JButton button_tieptuc = new JButton("Ấn để tiếp tục");
		button_tieptuc.setBounds(0, 363, 686, 300);
		button_tieptuc.setIconTextGap(100);
		button_tieptuc.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-doorbell-24.png"));
		button_tieptuc.setForeground(new Color(245, 255, 250));
		button_tieptuc.setFont(new Font("Times New Roman", Font.BOLD, 30));
		button_tieptuc.setBorderPainted(false);
		button_tieptuc.setBackground(Color.GREEN);
		button_tieptuc.setBackground(new Color(0, 191, 255));
		contentPane.add(button_tieptuc);
		button_tieptuc.addActionListener(controllerheader);
		
		JLabel label_2xucXac = new JLabel("");
		label_2xucXac.setBounds(61, 68, 84, 98);
		label_2xucXac.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_2xucXac.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-dice-68.png"));
		contentPane.add(label_2xucXac);
		
		JLabel label_1xucXac = new JLabel("");
		label_1xucXac.setBounds(522, 61, 105, 105);
		label_1xucXac.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-dice-100.png"));
		contentPane.add(label_1xucXac);
		
		JLabel Label_meo_than_tai = new JLabel("");
		Label_meo_than_tai.setBounds(293, 34, 67, 88);
		Label_meo_than_tai.setIcon(new ImageIcon("D:\\Hình Ảnh\\Ảnh học tập đại học\\Ảnh hoc_Java\\icons8-prosperity-64.png"));
		contentPane.add(Label_meo_than_tai);
	}
}

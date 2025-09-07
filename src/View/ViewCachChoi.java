package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCachChoi;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCachChoi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ViewHome2 viewHome2;
	public static ViewCachChoi frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewCachChoi();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewCachChoi() {
		ControllerCachChoi controllercachchoi = new ControllerCachChoi(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_headerCachChoi = new JLabel("Cách chơi");
		lblNewLabel_headerCachChoi.setForeground(new Color(255, 0, 0));
		lblNewLabel_headerCachChoi.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblNewLabel_headerCachChoi.setBounds(133, -2, 194, 67);
		contentPane.add(lblNewLabel_headerCachChoi);
		
		JTextPane txtpnBnSDng_cachChoi = new JTextPane();
		txtpnBnSDng_cachChoi.setForeground(new Color(0, 0, 128));
		txtpnBnSDng_cachChoi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnBnSDng_cachChoi.setBackground(new Color(255, 192, 203));
		txtpnBnSDng_cachChoi.setText("Tài xỉu là một trò chơi dân gian có xuất xứ từ Trung Quốc. Người dân của xứ “tỷ dân” đã ưa thích và chơi tài xỉu từ thời xa xưa trong quá khứ nhưng trò chơi này chỉ thực sự thu hút được sự chú ý khi nó du nhập sang Mỹ vào thời điểm đầu thế kỷ XX. Những người nhập cư từ Trung Quốc đã đem tài xỉu đến “xứ sở cờ hoa” và sau đó nó nhận được sự yêu thích rất lớn. \n\nBạn sử dụng 3 viên xúc xắc (hay còn gọi là xí ngầu). Mỗi viên xúc xắc có 6 mặt và người chơi sẽ đặt cược kết quả sau khi nhà cái lắc xúc xắc. Nếu kết quả trên tổng 3 mặt của xúc xắc là 4 đến 10 thì đó gọi là “Xỉu”, còn nếu là 11 đến 17 thì đó là “Tài”.");
		txtpnBnSDng_cachChoi.setBounds(33, 61, 375, 164);
		contentPane.add(txtpnBnSDng_cachChoi);
		
		JButton Button_xacNhan = new JButton("Ok");
		Button_xacNhan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Button_xacNhan.setBackground(new Color(255, 192, 203));
		Button_xacNhan.setBounds(177, 240, 74, 21);
		Button_xacNhan.addActionListener(controllercachchoi);
		contentPane.add(Button_xacNhan);
		
	}
}

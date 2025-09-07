package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.ViewHome2;
import View.ViewLogin;
import View.ViewRutTien;

public class ControllerHome implements ActionListener{
	private ViewHome2 viewhome2;
	

	public ControllerHome(ViewHome2 viewhome2) {
 		this.viewhome2 = viewhome2;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Đăng xuất")) {
			viewhome2.viewLogin = new ViewLogin();
			viewhome2.viewLogin.setVisible(true);
			viewhome2.setVisible(false);
		}
		else if(src.equals("Rút tiền")) {
			viewhome2.viewRutTien = new ViewRutTien();
			viewhome2.viewRutTien.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			viewhome2.viewRutTien.setVisible(true);
		}
		
	}

}

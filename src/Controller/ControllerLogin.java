package Controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import View.ViewDienTKNganHang;
import View.ViewLogin;
import View.ViewRegister;

public class ControllerLogin implements ActionListener{
	ViewLogin viewlogin;
	
	public ControllerLogin(ViewLogin viewlogin) {
		this.viewlogin = viewlogin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Đăng ký tài khoản")) {
			viewlogin.viewregister = new ViewRegister();
			viewlogin.viewregister.setVisible(true);
			viewlogin.dispose();
		}
		
		else if(src.equals("Đăng nhập")) {
			viewlogin.viewdiennganhang = new ViewDienTKNganHang();
			viewlogin.viewdiennganhang.setVisible(true);
			viewlogin.setVisible(false);
			
		}
		
	}
	
	
	
}

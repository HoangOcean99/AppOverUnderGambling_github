package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ViewDienTKNganHang;
import View.ViewHome2;
import View.ViewLogin;

public class ControllerDienTKNganHang implements ActionListener {
	private ViewDienTKNganHang viewdiennganhang;

	
	public ControllerDienTKNganHang(ViewDienTKNganHang viewdiennganhang) {
		this.viewdiennganhang = viewdiennganhang;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Tiếp tục")) {
			viewdiennganhang.viewHome2 = new ViewHome2();
			viewdiennganhang.viewHome2.setVisible(true);
			viewdiennganhang.setVisible(false);
		}
		
	}
	
	
	
	

}

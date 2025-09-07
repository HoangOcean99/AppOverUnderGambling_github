package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.ViewNapTien;

public class ControllerNapTien implements ActionListener{
	private ViewNapTien viewnaptien;

	

	public ControllerNapTien(ViewNapTien viewnaptien) {
		this.viewnaptien = viewnaptien;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Hủy")) {
			//ViewHome2 viewHome2 = new ViewHome2();
			viewnaptien.setVisible(false);
			
		}
		
	}




}

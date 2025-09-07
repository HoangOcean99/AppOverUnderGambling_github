package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import View.ViewNapTien;
import View.ViewRutTien;

public class ControllerRutTien implements ActionListener{
	private ViewRutTien viewruttien;
	

	public ControllerRutTien(ViewRutTien viewruttien) {
		this.viewruttien = viewruttien;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Hủy")) {
			//ViewHome2 viewHome2 = new ViewHome2();
			viewruttien.setVisible(false);
			
		}
		
	}
	
	

}

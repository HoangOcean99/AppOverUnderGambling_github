package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.ViewLogin;
import View.ViewRegister;

public class ControllerRegister implements ActionListener{
	ViewRegister viewregister;
	
	public ControllerRegister(ViewRegister viewregister) {
		this.viewregister = viewregister;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Quay lại")){
			
			viewregister.viewlogin = new ViewLogin();
			//viewregister.setSize(500, 560);
			viewregister.viewlogin.setVisible(true);
			viewregister.dispose();
			//viewregister.viewlogin.pack();
		}
		
	}
	
	
	

}

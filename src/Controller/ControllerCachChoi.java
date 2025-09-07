package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ViewCachChoi;
import View.ViewHome2;

public class ControllerCachChoi implements ActionListener{
	private ViewCachChoi viewcachchoi;

	public ControllerCachChoi(ViewCachChoi viewcachchoi) {
		this.viewcachchoi = viewcachchoi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Ok")) {
			//ViewHome2 viewHome2 = new ViewHome2();
			viewcachchoi.setVisible(false);
			
		}
		
	}
	
	
	
}

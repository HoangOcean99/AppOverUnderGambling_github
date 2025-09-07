package Controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import View.ViewHeader;

public class ControllerHeader implements ActionListener{
	ViewHeader viewheader;
	
	public ControllerHeader(ViewHeader viewheader) {
		this.viewheader = viewheader;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Ấn để tiếp tục")) {
			viewheader.dispose();;
			viewheader.viewlogin.setVisible(true);
			
			
			
		}
		
	}
	
	

}

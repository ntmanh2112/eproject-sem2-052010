package common;

import gui.Wellcome;
import javax.swing.UIManager;

public class LeaveManagementSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e) {
                	e.printStackTrace();
                }
               
              new  Wellcome().setVisible(true);
            }
	 });
}
	}



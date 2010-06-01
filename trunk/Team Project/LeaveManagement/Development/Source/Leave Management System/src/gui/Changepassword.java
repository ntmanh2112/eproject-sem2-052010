package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Changepassword extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JPasswordField txtOldpassword = null;
	private JPasswordField txtNewpassword = null;
	private JPasswordField txtConfirmpassword = null;
	private JButton btnChange = null;
	private JButton btnReset = null;
	private JButton btnExit = null;

	/**
	 * @param owner
	 */
	public Changepassword(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(503, 344);
		this.setTitle("Change Password");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Confirm Password");
			jLabel3.setSize(new Dimension(186, 23));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3.setLocation(new Point(15, 194));
			jLabel2 = new JLabel();
			jLabel2.setText("Your New Password");
			jLabel2.setSize(new Dimension(186, 23));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(15, 135));
			jLabel1 = new JLabel();
			jLabel1.setText("Your Old Password ");
			jLabel1.setSize(new Dimension(186, 23));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 75));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(145, 9, 211, 39));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Change Password");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 18));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtOldpassword(), null);
			jContentPane.add(getTxtNewpassword(), null);
			jContentPane.add(getTxtConfirmpassword(), null);
			jContentPane.add(getBtnChange(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtOldpassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtOldpassword() {
		if (txtOldpassword == null) {
			txtOldpassword = new JPasswordField();
			txtOldpassword.setLocation(new Point(210, 75));
			txtOldpassword.setSize(new Dimension(254, 23));
		}
		return txtOldpassword;
	}

	/**
	 * This method initializes txtNewpassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtNewpassword() {
		if (txtNewpassword == null) {
			txtNewpassword = new JPasswordField();
			txtNewpassword.setLocation(new Point(210, 135));
			txtNewpassword.setSize(new Dimension(254, 23));
		}
		return txtNewpassword;
	}

	/**
	 * This method initializes txtConfirmpassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtConfirmpassword() {
		if (txtConfirmpassword == null) {
			txtConfirmpassword = new JPasswordField();
			txtConfirmpassword.setLocation(new Point(210, 194));
			txtConfirmpassword.setSize(new Dimension(254, 23));
		}
		return txtConfirmpassword;
	}

	/**
	 * This method initializes btnChange	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnChange() {
		if (btnChange == null) {
			btnChange = new JButton();
			btnChange.setText("Change");
			btnChange.setSize(new Dimension(107, 27));
			btnChange.setLocation(new Point(44, 244));
		}
		return btnChange;
	}

	/**
	 * This method initializes btnReset	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton();
			btnReset.setText("Reset");
			btnReset.setSize(new Dimension(107, 27));
			btnReset.setLocation(new Point(185, 244));
		}
		return btnReset;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(107, 27));
			btnExit.setLocation(new Point(330, 244));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

package gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbLogin = null;
	private JLabel lbUsername = null;
	private JLabel lbPassword = null;
	private JTextField txtUserName = null;
	private JLabel lbUsernameMess = null;
	private JPasswordField txtPassword = null;
	private JLabel lbPasswordMess = null;
	private JButton btnOk = null;
	private JButton btnExit = null;
	/**
	 * This is the default constructor
	 */
	public SignIn() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(364, 310);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbPasswordMess = new JLabel();
			lbPasswordMess.setText("");
			lbPasswordMess.setSize(new Dimension(194, 20));
			lbPasswordMess.setLocation(new Point(135, 164));
			lbUsernameMess = new JLabel();
			lbUsernameMess.setText("");
			lbUsernameMess.setSize(new Dimension(194, 20));
			lbUsernameMess.setLocation(new Point(135, 104));
			lbPassword = new JLabel();
			lbPassword.setFont(new Font("Dialog", Font.BOLD, 18));
			lbPassword.setLocation(new Point(15, 135));
			lbPassword.setSize(new Dimension(110, 31));
			lbPassword.setText("Password");
			lbUsername = new JLabel();
			lbUsername.setText("User Name");
			lbUsername.setSize(new Dimension(110, 31));
			lbUsername.setFont(new Font("Dialog", Font.BOLD, 18));
			lbUsername.setLocation(new Point(15, 75));
			lbLogin = new JLabel();
			lbLogin.setBounds(new Rectangle(118, 4, 76, 43));
			lbLogin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbLogin.setForeground(Color.blue);
			lbLogin.setText("Login");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lbLogin, null);
			jContentPane.add(lbUsername, null);
			jContentPane.add(lbPassword, null);
			jContentPane.add(getTxtUserName(), null);
			jContentPane.add(lbUsernameMess, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(lbPasswordMess, null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUserName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUserName() {
		if (txtUserName == null) {
			txtUserName = new JTextField();
			txtUserName.setLocation(new Point(135, 74));
			txtUserName.setSize(new Dimension(165, 31));
		}
		return txtUserName;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setLocation(new Point(135, 135));
			txtPassword.setSize(new Dimension(165, 31));
		}
		return txtPassword;
	}

	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("Ok");
			btnOk.setSize(new Dimension(70, 35));
			btnOk.setLocation(new Point(96, 210));
		}
		return btnOk;
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
			btnExit.setSize(new Dimension(70, 35));
			btnExit.setLocation(new Point(196, 210));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

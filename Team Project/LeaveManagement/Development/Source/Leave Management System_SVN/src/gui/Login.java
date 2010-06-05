package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import business.UserService;

import common.Enumeration.loginResult;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbLogin = null;
	private JLabel lbUsername = null;
	private JLabel lbPassword = null;
	private JTextField txtUsername = null;
	private JLabel lbUsernameMess = null;
	private JPasswordField txtPassword = null;
	private JLabel lbPasswordMess = null;
	private JButton btnOk = null;
	private JButton btnExit = null;
		/**
	 * This is the default constructor
	 */
	public Login() {
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
		this.setResizable(false);
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
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(lbUsernameMess, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(lbPasswordMess, null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setLocation(new Point(135, 74));
			txtUsername.setSize(new Dimension(165, 31));
		}
		return txtUsername;
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
			btnOk.setSize(new Dimension(90, 35));
			btnOk.setIcon(new ImageIcon(getClass().getResource("/image/changepass1.png")));
			btnOk.setLocation(new Point(76, 210));
			btnOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String username = txtUsername.getText();
					String password = String.valueOf(txtPassword.getPassword());
					try{
						UserService service = new UserService();
						loginResult result = service.loginUser(username, password);
						if(result == loginResult.boss){
							
							Login.this.dispose();
						}else if (result == loginResult.managerbusiness){
							
							
							Login.this.dispose();
						}else if (result == loginResult.manager) {
							
							Login.this.dispose();
							
						}
						else if (result == loginResult.lock){
							JOptionPane.showMessageDialog(null, "your permission is not enough for using this program");
							Login.this.dispose();
						}
						else if (result == loginResult.fail){
							JOptionPane.showMessageDialog(null, "this username or password is wrong");
						}
					}
							
					catch(Exception E){
						JOptionPane.showMessageDialog(null,"CONECTION FAIL");
						E.printStackTrace();
						
					}
				}

			});
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
			btnExit.setSize(new Dimension(91, 35));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/button-cancel-icon.png")));
			btnExit.setLocation(new Point(196, 210));
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Login.this.dispose();
				}
			});
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

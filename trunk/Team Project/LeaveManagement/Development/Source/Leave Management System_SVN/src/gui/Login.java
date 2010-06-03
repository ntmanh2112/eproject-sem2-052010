package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import business.UserService;

import common.Enumeration.loginResult;

public class Login extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JTextField txtUsername = null;
	private JPasswordField txtPassword = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * @param owner
	 */
	public Login(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(414, 334);
		this.setTitle("Login Form");
		this.setContentPane(getJContentPane());
		this.setContentPane(getJContentPane());
		this.getRootPane().setDefaultButton(btnOk);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Password");
			jLabel2.setSize(new Dimension(101, 30));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(31, 148));
			jLabel1 = new JLabel();
			jLabel1.setText("User Name");
			jLabel1.setSize(new Dimension(101, 30));
			jLabel1.setHorizontalTextPosition(SwingConstants.LEFT);
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(30, 89));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(174, 26, 87, 35));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel.setVerticalAlignment(SwingConstants.CENTER);
			jLabel.setText("Login");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
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
			txtUsername.setLocation(new Point(150, 89));
			txtUsername.setSize(new Dimension(213, 30));
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
			txtPassword.setLocation(new Point(150, 150));
			txtPassword.setSize(new Dimension(213, 30));
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
			btnOk.setSize(new Dimension(101, 30));
			btnOk.setLocation(new Point(75, 211));
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
							new ManagerBusinessCP().setVisible(true);
							Login.this.dispose();
						}else if (result == loginResult.manager) {
							new ManagerBusinessCP().setVisible(true);
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
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Login.this.dispose();
				}
			});
			btnCancel.setSize(new Dimension(101, 30));
			btnCancel.setLocation(new Point(211, 211));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

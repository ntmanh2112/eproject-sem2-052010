package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import model.*;
import business.Method;
import business.UserService;
import javax.swing.ImageIcon;

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
	private int id = 0;
	private User user = new User();  //  @jve:decl-index=0:
	private UserService service = new  UserService();  //  @jve:decl-index=0:
	private JLabel lbOldPassMess = null;
	private JLabel lbNewPassMess = null;
	private JLabel lbConfirmPassMess = null;

	/**
	 * @param owner
	 */
	public Changepassword(Frame owner) {
		super(owner,true);
		initialize();
	}
	public Changepassword(Frame owner,int id){
		super(owner);
		this.id = id;
		this.user = service.loadUser(id);
		initialize();
		
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(503, 344);
		this.setTitle("Welcome to Change Password");
		this.setContentPane(getJContentPane());
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getSize();
		Dimension dialogSize = this.getSize();
		this.setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbConfirmPassMess = new JLabel();
			lbConfirmPassMess.setText("");
			lbConfirmPassMess.setSize(new Dimension(254, 23));
			lbConfirmPassMess.setLocation(new Point(210, 217));
			lbNewPassMess = new JLabel();
			lbNewPassMess.setText("");
			lbNewPassMess.setSize(new Dimension(254, 23));
			lbNewPassMess.setLocation(new Point(210, 158));
			lbOldPassMess = new JLabel();
			lbOldPassMess.setText("");
			lbOldPassMess.setSize(new Dimension(254, 23));
			lbOldPassMess.setLocation(new Point(210, 98));
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
			jLabel.setBounds(new Rectangle(145, 14, 211, 39));
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
			jContentPane.add(lbOldPassMess, null);
			jContentPane.add(lbNewPassMess, null);
			jContentPane.add(lbConfirmPassMess, null);
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
			txtOldpassword.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = String.valueOf(txtOldpassword.getPassword());
					if (a.length()>20 || a.length()<8) {
						lbOldPassMess.setText("8-20 chars!! Please type again");
						lbOldPassMess.setForeground(Color.red);
						txtOldpassword.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtOldpassword.setText(null);
						}else {
							lbOldPassMess.setText("OK");
							lbOldPassMess.setForeground(Color.green);
					}
				}}
			});
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
			txtNewpassword.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = String.valueOf(txtNewpassword.getPassword());
					if (a.length()>20 || a.length()<8) {
						lbNewPassMess.setText("8-20 chars!! Please type again");
						lbNewPassMess.setForeground(Color.red);
						txtNewpassword.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtNewpassword.setText(null);
						}else {
							lbNewPassMess.setText("OK");
							lbNewPassMess.setForeground(Color.green);
					}
				}}
			});
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
			txtConfirmpassword.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = String.valueOf(txtConfirmpassword.getPassword());
					if (a.length()>20 || a.length()<8) {
						lbConfirmPassMess.setText("8-20 chars!! Please type again");
						lbConfirmPassMess.setForeground(Color.red);
						txtConfirmpassword.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtConfirmpassword.setText(null);
						}else {
							lbConfirmPassMess.setText("OK");
							lbConfirmPassMess.setForeground(Color.green);
					}
				}}
			});
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
			btnChange.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnChange.setLocation(new Point(44, 244));
			btnChange.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String oldpass = String.valueOf(txtOldpassword.getPassword());
					String newpass = String.valueOf(txtNewpassword.getPassword());
					String confirmpass = String.valueOf(txtConfirmpassword.getPassword());
					
					if(oldpass.isEmpty()||newpass.isEmpty()||confirmpass.isEmpty()){
						JOptionPane.showMessageDialog(null, "Please input full of column!!");
					}
					
					else {
						if(newpass.equalsIgnoreCase(confirmpass)){
							try {
								String pass = service.selectPass(id);
								if(oldpass.equalsIgnoreCase(pass)) {
									int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to Change Password ?");
									if(sr==0){
							
										try{
											service.changePass(confirmpass, id);
											JOptionPane.showMessageDialog(null, "change pass successfull");
											Changepassword.this.dispose();
										}catch (Exception e2) {
											e2.printStackTrace();
										}
									}
								}else {
									JOptionPane.showMessageDialog(null, "old password is wrong!!");
								}
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}
						
						else {
							JOptionPane.showMessageDialog(null, "new pass va confirm pass ko giong nhau");
						}
						}	
					
				}
			});
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
			btnReset.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnReset.setLocation(new Point(185, 244));
			btnReset.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					txtConfirmpassword.setText("");
					txtNewpassword.setText("");
					txtOldpassword.setText("");
				}
			});
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
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Cancel-2-icon.png")));
			btnExit.setLocation(new Point(330, 244));
			btnExit.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
						Changepassword.this.dispose();
					}
				}
			});
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.User;
import business.Method;
import business.UserService;

import common.AddUser.addResult;

public class Addmember extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel lbUsername = null;
	private JLabel lbPass = null;
	private JLabel lbFullname = null;
	private JLabel lbBirthday = null;
	private JLabel lbPhone = null;
	private JLabel lbAddress = null;
	private JLabel lbSex = null;
	private JTextField txtUsername = null;
	private JPasswordField txtPassword = null;
	private JTextField txtFullname = null;
	private JTextField txtPhone = null;
	private JTextField txtAddress = null;
	private JComboBox cbxSex = null;
	private JButton btnAdd = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmail = null;
	private JLabel lbIDmess = null;
	private JLabel lbPassmess = null;
	private JLabel lbPhonemess = null;
	private JLabel lbAdressmess = null;
	private JLabel lbEmailmess = null;
	private JLabel lbNamemess = null;
	private JLabel jLabel2 = null;
	private JComboBox cbxYear = null;
	private JLabel lbMonth = null;
	private JComboBox cbxMonth = null;
	private JLabel lbDay = null;
	private JComboBox cbxDay = null;
	/**
	 * @param owner
	 */
	public Addmember(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(462, 535);
		this.setTitle("Add User");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbDay = new JLabel();
			lbDay.setBounds(new Rectangle(348, 226, 31, 16));
			lbDay.setText("Day");
			lbMonth = new JLabel();
			lbMonth.setBounds(new Rectangle(254, 226, 38, 16));
			lbMonth.setText("Month");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(158, 226, 38, 16));
			jLabel2.setText("Year");
			lbNamemess = new JLabel();
			lbNamemess.setText("");
			lbNamemess.setSize(new Dimension(228, 20));
			lbNamemess.setLocation(new Point(150, 190));
			lbEmailmess = new JLabel();
			lbEmailmess.setText("");
			lbEmailmess.setSize(new Dimension(228, 20));
			lbEmailmess.setLocation(new Point(150, 410));
			lbAdressmess = new JLabel();
			lbAdressmess.setText("");
			lbAdressmess.setSize(new Dimension(228, 20));
			lbAdressmess.setLocation(new Point(150, 367));
			lbPhonemess = new JLabel();
			lbPhonemess.setText("");
			lbPhonemess.setSize(new Dimension(228, 20));
			lbPhonemess.setLocation(new Point(150, 321));
			lbPassmess = new JLabel();
			lbPassmess.setText("");
			lbPassmess.setSize(new Dimension(228, 20));
			lbPassmess.setLocation(new Point(150, 143));
			lbIDmess = new JLabel();
			lbIDmess.setText("");
			lbIDmess.setSize(new Dimension(228, 20));
			lbIDmess.setLocation(new Point(150, 95));
			jLabel1 = new JLabel();
			jLabel1.setText("Email");
			jLabel1.setSize(new Dimension(108, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 390));
			lbSex = new JLabel();
			lbSex.setText("Gender(*)");
			lbSex.setSize(new Dimension(89, 20));
			lbSex.setFont(new Font("Dialog", Font.BOLD, 18));
			lbSex.setLocation(new Point(15, 255));
			lbAddress = new JLabel();
			lbAddress.setText("Address(*)");
			lbAddress.setSize(new Dimension(108, 20));
			lbAddress.setFont(new Font("Dialog", Font.BOLD, 18));
			lbAddress.setLocation(new Point(15, 345));
			lbPhone = new JLabel();
			lbPhone.setText("Phone(*)");
			lbPhone.setSize(new Dimension(98, 20));
			lbPhone.setFont(new Font("Dialog", Font.BOLD, 18));
			lbPhone.setLocation(new Point(15, 300));
			lbBirthday = new JLabel();
			lbBirthday.setText("Birthday(*)");
			lbBirthday.setSize(new Dimension(102, 20));
			lbBirthday.setFont(new Font("Dialog", Font.BOLD, 18));
			lbBirthday.setLocation(new Point(15, 225));
			lbFullname = new JLabel();
			lbFullname.setText("Full Name(*)");
			lbFullname.setSize(new Dimension(122, 20));
			lbFullname.setFont(new Font("Dialog", Font.BOLD, 18));
			lbFullname.setLocation(new Point(14, 165));
			lbPass = new JLabel();
			lbPass.setText("Pass word(*)");
			lbPass.setSize(new Dimension(122, 20));
			lbPass.setFont(new Font("Dialog", Font.BOLD, 18));
			lbPass.setLocation(new Point(15, 120));
			lbUsername = new JLabel();
			lbUsername.setText("User Name(*)");
			lbUsername.setSize(new Dimension(121, 20));
			lbUsername.setFont(new Font("Dialog", Font.BOLD, 18));
			lbUsername.setLocation(new Point(15, 71));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(112, 19, 167, 28));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
			jLabel.setText("Add User");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
			jContentPane.add(jLabel, null);
			jContentPane.add(lbUsername, null);
			jContentPane.add(lbPass, null);
			jContentPane.add(lbFullname, null);
			jContentPane.add(lbBirthday, null);
			jContentPane.add(lbPhone, null);
			jContentPane.add(lbAddress, null);
			jContentPane.add(lbSex, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getCbxSex(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(lbIDmess, null);
			jContentPane.add(lbPassmess, null);
			jContentPane.add(lbPhonemess, null);
			jContentPane.add(lbAdressmess, null);
			jContentPane.add(lbEmailmess, null);
			jContentPane.add(lbNamemess, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getCbxYear(), null);
			jContentPane.add(lbMonth, null);
			jContentPane.add(getCbxMonth(), null);
			jContentPane.add(lbDay, null);
			jContentPane.add(getCbxDay(), null);
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
			txtUsername.setLocation(new Point(150, 71));
			txtUsername.setSize(new Dimension(228, 20));
			txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtUsername.getText();
					if (txtUsername.getText().length()>10||txtUsername.getText().length()<3) {
						lbIDmess.setForeground(Color.red);
						lbIDmess.setText("Please input 3-10 characters!!!");
						txtUsername.setText("");
					} else if(Method.CheckBlankCharacter(a) ) {
									lbIDmess.setForeground(Color.red);
									lbIDmess.setText("Don't input character blank!!!");
					}else {
							if(Method.CheckSpecialCharacter(a)) {
								JOptionPane.showMessageDialog(null, "Don't input special character!!!");
								txtUsername.setText("");
							} else {
								lbIDmess.setForeground(Color.green);
								lbIDmess.setText("OK");
							}
						}
				}
				
			});
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
			txtPassword.setLocation(new Point(150, 120));
			txtPassword.setSize(new Dimension(228, 20));
			txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = String.valueOf(txtPassword.getPassword());
					if (a.length()>20 || a.length()<8) {
						lbPassmess.setText("8-20 chars!! Please type again");
						lbPassmess.setForeground(Color.red);
						txtPassword.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtPassword.setText(null);
						}else {
						lbPassmess.setText("OK");
						lbPassmess.setForeground(Color.green);
					}
				}}
			});
		}
		return txtPassword;
	}

	/**
	 * This method initializes txtFullname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFullname() {
		if (txtFullname == null) {
			txtFullname = new JTextField();
			txtFullname.setLocation(new Point(150, 165));
			txtFullname.setSize(new Dimension(228, 20));
			txtFullname.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtFullname.getText();
					if (a.length()>30 || a.length()<10) {
						lbNamemess.setText("10-30 chars!! Please type again");
						lbNamemess.setForeground(Color.red);
						txtUsername.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtUsername.setText(null);
						}else {
						lbNamemess.setText("OK");
						lbNamemess.setForeground(Color.green);
						}
					}
				}
			});
		}
		return txtFullname;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(150, 300));
			txtPhone.setSize(new Dimension(228, 20));
			txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtPhone.getText();
					char[] array = a.toCharArray();
					int t = 0;
					if (a.length()>20){
						JOptionPane.showMessageDialog(null, "Phone is not more than 20 chars!!");
						lbPhonemess.setForeground(Color.red);
						txtPhone.setText("");
						txtPhone.requestFocus();
					}
						
					for (int i = 0 ; i < array.length ; i++){
						if (array[i]!='0' && array[i]!='1' && array[i]!='2' &&
							array[i]!='3' && array[i]!='4' && array[i]!='5' &&
							array[i]!='6' && array[i]!='7' && array[i]!='8' &&
							array[i]!='9'){
							t = 1;
							break;
						}
					}
					if (t == 1){
						lbPhonemess.setText("Phone is number only");
						lbPhonemess.setForeground(Color.red);
						txtPhone.setText("");
					}else {
						lbPhonemess.setText("OK");
						lbPhonemess.setForeground(Color.green);
					}
				}
			});
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(150, 345));
			txtAddress.setSize(new Dimension(228, 20));
			txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtAddress.getText();
					if (a.length()>30) {
						lbAdressmess.setText("Address is not more than 30 chars!!");
						lbAdressmess.setForeground(Color.red);
						txtAddress.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtAddress.setText(null);
						}else {
							lbAdressmess.setText("OK");
							lbAdressmess.setForeground(Color.green);
						}
					}
				}
			});
		}
		return txtAddress;
	}

	/**
	 * This method initializes cbxSex	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxSex() {
		if (cbxSex == null) {
			String[] data = {"Male","Female"};
			cbxSex = new JComboBox(data);
			cbxSex.setLocation(new Point(150, 255));
			cbxSex.setSize(new Dimension(65, 20));
			
			
		}
		return cbxSex;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(106, 30));
			btnAdd.setLocation(new Point(16, 435));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					User user = new User();
					user.setUsername(txtUsername.getText())  ;
					user.setPassword(String.valueOf(txtPassword.getPassword())) ;
					user.setFullname(txtFullname.getText());
					SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
					try {
					java.util.Date date = format.parse(cbxYear.getSelectedItem().toString()+"/"+cbxMonth.getSelectedItem().toString()+"/"+cbxDay.getSelectedItem().toString());
					Date birthday = new Date(date.getTime());
					user.setBirthday(birthday);
					user.setAddress( txtAddress.getText());
					user.setGender(cbxSex.getSelectedItem().toString()) ;
					user.setPhone(txtPhone.getText());
					user.setEmail( txtEmail.getText());
					}catch (Exception ex){
						ex.printStackTrace();
					}
					try{
						UserService service = new UserService();
						addResult result = service.addUser(user);
						if(result == addResult.fail){
							JOptionPane.showMessageDialog(null,"Please input all field (*)!!");
						}
						else if (result == addResult.incorrect) {
							JOptionPane.showMessageDialog(null, "This USERNAME is exist!!");
						}
						else if (result == addResult.sucessful) {
							JOptionPane.showMessageDialog(null, "Add member successfully!!");
							Addmember.this.dispose();
						}
					}catch (Exception ex) {
						ex.printStackTrace();
					}
					
				}
			});
		}
		return btnAdd;
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
			btnReset.setSize(new Dimension(106, 30));
			btnReset.setLocation(new Point(145, 435));
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
			btnExit.setSize(new Dimension(106, 30));
			btnExit.setLocation(new Point(270, 435));
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Addmember.this.dispose();
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setLocation(new Point(150, 390));
			txtEmail.setSize(new Dimension(228, 20));
			txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtEmail.getText();
					if (txtEmail.getText().length()>30) {
						lbEmailmess.setForeground(Color.red);
						lbEmailmess.setText("Max chars is 30!!!");
						txtEmail.setText("");
					}else {
						if(!Method.checkEmail(a)){
						lbEmailmess.setText("Email is not correct syntax!!");
						lbEmailmess.setForeground(Color.red);
						txtEmail.setText("");
					}
						else {
							if(Method.CheckSpecialCharacter(a)) {
								JOptionPane.showMessageDialog(null, "Don't input special character!!!");
								txtEmail.setText(null);
							}else {
								lbEmailmess.setText("OK");
								lbEmailmess.setForeground(Color.green);
							}
						}
					}		
				}
					
			});
		}
		return txtEmail;
	}

	/**
	 * This method initializes cbxYear	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxYear() {
		if (cbxYear == null) {
			cbxYear = new JComboBox();
			cbxYear.setBounds(new Rectangle(196, 224, 51, 25));
			for (int i = 1975; i < 1995; i++){
				cbxYear.addItem(i);
			}
		}
		return cbxYear;
	}

	/**
	 * This method initializes cbxMonth	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxMonth() {
		if (cbxMonth == null) {
			cbxMonth = new JComboBox();
			cbxMonth.setBounds(new Rectangle(295, 226, 45, 25));
			for(int j=1;j<13;j++){
				cbxMonth.addItem(j);
			}
		}
		return cbxMonth;
	}

	/**
	 * This method initializes cbxDay	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDay() {
		if (cbxDay == null) {
			cbxDay = new JComboBox();
			cbxDay.setBounds(new Rectangle(385, 226, 43, 25));
			for(int i = 1 ; i<32;i++){
				cbxDay.addItem(i);
			}
		}
		return cbxDay;
	}

}  //  @jve:decl-index=0:visual-constraint="10,30"

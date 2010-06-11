package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.User;
import business.Method;
import business.UserService;

public class Editprofile extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JTextField txtFullname = null;
	private JTextField txtEmail = null;
	private JTextField txtAddress = null;
	private JButton btnUpdate = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	private JLabel lbYear = null;
	private JComboBox cbxYear = null;
	private JLabel lbMonth = null;
	private JComboBox cbxMonth = null;
	private JLabel lbDay = null;
	private JComboBox cbxDay = null;
	private JLabel lbPhone = null;
	private JTextField txtPhone = null;
	private int id = 0;
	private User user = new User();
	private UserService service = new  UserService();
	private JLabel lbFullnamemess = null;
	private JLabel lbBirthdaymess = null;
	private JComboBox cbxSex = null;
	private JLabel lbAddressmess = null;
	private JLabel lbEmailmess = null;
	private JLabel lbPhonemess = null;
	/**
	 * @param owner
	 */
	public Editprofile(Frame owner) {
		super(owner,true);
		initialize();
	}
	
	public Editprofile(Frame owner,int id){
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
		this.setSize(505, 542);
		this.setTitle("Edit Profile");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbPhonemess = new JLabel();
			lbPhonemess.setText("");
			lbPhonemess.setSize(new Dimension(228, 25));
			lbPhonemess.setLocation(new Point(150, 418));
			lbEmailmess = new JLabel();
			lbEmailmess.setText("");
			lbEmailmess.setSize(new Dimension(228, 25));
			lbEmailmess.setLocation(new Point(150, 354));
			lbAddressmess = new JLabel();
			lbAddressmess.setText("");
			lbAddressmess.setSize(new Dimension(228, 25));
			lbAddressmess.setLocation(new Point(150, 289));
			lbBirthdaymess = new JLabel();
			lbBirthdaymess.setText("");
			lbBirthdaymess.setSize(new Dimension(228, 25));
			lbBirthdaymess.setLocation(new Point(150, 180));
			lbFullnamemess = new JLabel();
			lbFullnamemess.setText("");
			lbFullnamemess.setSize(new Dimension(228, 25));
			lbFullnamemess.setLocation(new Point(150, 79));
			lbPhone = new JLabel();
			lbPhone.setText("Phone");
			lbPhone.setSize(new Dimension(121, 25));
			lbPhone.setFont(new Font("Dialog", Font.BOLD, 18));
			lbPhone.setLocation(new Point(15, 394));
			lbDay = new JLabel();
			lbDay.setText("Day");
			lbDay.setSize(new Dimension(92, 25));
			lbDay.setLocation(new Point(390, 120));
			lbMonth = new JLabel();
			lbMonth.setText("Month");
			lbMonth.setSize(new Dimension(92, 25));
			lbMonth.setLocation(new Point(271, 120));
			lbYear = new JLabel();
			lbYear.setText("Year");
			lbYear.setSize(new Dimension(92, 25));
			lbYear.setLocation(new Point(149, 120));
			jLabel5 = new JLabel();
			jLabel5.setText("Email");
			jLabel5.setSize(new Dimension(121, 25));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5.setLocation(new Point(15, 330));
			jLabel4 = new JLabel();
			jLabel4.setText("Address");
			jLabel4.setSize(new Dimension(121, 25));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(14, 266));
			jLabel3 = new JLabel();
			jLabel3.setText("Gender");
			jLabel3.setSize(new Dimension(121, 25));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3.setLocation(new Point(14, 210));
			jLabel2 = new JLabel();
			jLabel2.setText("Birthday");
			jLabel2.setSize(new Dimension(121, 25));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(15, 121));
			jLabel1 = new JLabel();
			jLabel1.setText("Full Name");
			jLabel1.setSize(new Dimension(121, 25));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 56));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(177, 1, 134, 28));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Edit Profile");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(lbYear, null);
			jContentPane.add(getCbxYear(), null);
			jContentPane.add(lbMonth, null);
			jContentPane.add(getCbxMonth(), null);
			jContentPane.add(lbDay, null);
			jContentPane.add(getCbxDay(), null);
			jContentPane.add(lbPhone, null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(lbFullnamemess, null);
			jContentPane.add(lbBirthdaymess, null);
			jContentPane.add(getCbxSex(), null);
			jContentPane.add(lbAddressmess, null);
			jContentPane.add(lbEmailmess, null);
			jContentPane.add(lbPhonemess, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtFullname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFullname() {
		if (txtFullname == null) {
			txtFullname = new JTextField(user.getFullname());
			txtFullname.setLocation(new Point(150, 56));
			txtFullname.setSize(new Dimension(228, 25));
			txtFullname.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtFullname.getText();
					if (a.length()>30 || a.length()<10) {
						lbFullnamemess.setText("10-30 chars!! Please type again");
						lbFullnamemess.setForeground(Color.red);
						lbFullnamemess.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							lbFullnamemess.setText(null);
						}else {
							lbFullnamemess.setText("OK");
							lbFullnamemess.setForeground(Color.green);
						}
					}
				}
			});
		}
		return txtFullname;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField(user.getEmail());
			txtEmail.setLocation(new Point(150, 330));
			txtEmail.setSize(new Dimension(228, 25));
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
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField(user.getAddress());
			txtAddress.setLocation(new Point(150, 266));
			txtAddress.setSize(new Dimension(228, 25));
			txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtAddress.getText();
					if (a.length()>30) {
						lbAddressmess.setText("Address is not more than 30 chars!!");
						lbAddressmess.setForeground(Color.red);
						txtAddress.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							txtAddress.setText(null);
						}else {
							lbAddressmess.setText("OK");
							lbAddressmess.setForeground(Color.green);
						}
					}
				}
			});
		}
		return txtAddress;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("Update");
			btnUpdate.setSize(new Dimension(106, 30));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnUpdate.setLocation(new Point(75, 464));
			btnUpdate.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					User user = new User();
					user.setId_user(id);
					SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
					if(txtFullname.getText().isEmpty()||
							txtAddress.getText().isEmpty()||
							txtEmail.getText().isEmpty()||
							txtPhone.getText().isEmpty()||
							cbxSex.getSelectedItem().toString().isEmpty()||
							cbxYear.getSelectedItem().toString().isEmpty()||
							cbxMonth.getSelectedItem().toString().isEmpty()||
							cbxDay.getSelectedItem().toString().isEmpty()||
							cbxSex.getSelectedItem().toString().isEmpty() ){
						JOptionPane.showMessageDialog(null, "Please input full of column!!");
						}else{
							try {
								
								java.util.Date date = format.parse(cbxYear.getSelectedItem().toString()+"/"+cbxMonth.getSelectedItem().toString()+"/"+cbxDay.getSelectedItem().toString());
								Date birthday = new Date(date.getTime());
								user.setFullname(txtFullname.getText());
								user.setBirthday(birthday);
								user.setAddress( txtAddress.getText());
								user.setGender(cbxSex.getSelectedItem().toString()) ;
								user.setPhone(txtPhone.getText());
								user.setEmail( txtEmail.getText());
							}catch (Exception ex){
								ex.printStackTrace();
							}
							try{
								int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to edit ?");
								if(sr==0){
									UserService service = new UserService();
									service.updateUser(user);
									JOptionPane.showMessageDialog(null, "edit successfull");	
									Editprofile.this.dispose();
								}
							
							}catch(Exception ex){
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "edit fail");
							}
						}
							
				}
				
			});
		}
		return btnUpdate;
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
			btnReset.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnReset.setLocation(new Point(194, 464));
			btnReset.addActionListener(new java.awt.event.ActionListener() {   
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					txtAddress.setText("");
					txtEmail.setText("");
					txtFullname.setText("");
					txtPhone.setText("");
					
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
			btnExit.setLocation(new Point(315, 464));
			btnExit.setText("Exit");
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Cancel-2-icon.png")));
			btnExit.setSize(new Dimension(106, 30));
			btnExit.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
						Editprofile.this.dispose();
					}
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes cbxYear	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxYear() {
		if (cbxYear == null) {
			cbxYear = new JComboBox();
			cbxYear.setLocation(new Point(149, 146));
			cbxYear.setSize(new Dimension(92, 25));
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
			cbxMonth.setLocation(new Point(271, 146));
			cbxMonth.setSize(new Dimension(92, 25));
			for(int j=1; j<13 ;j++){
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
			cbxDay.setLocation(new Point(390, 146));
			cbxDay.setSize(new Dimension(92, 25));
			for(int j=1;j<32;j++){
				cbxDay.addItem(j);
			}
		
		}
		return cbxDay;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField(user.getPhone());
			txtPhone.setLocation(new Point(150, 394));
			txtPhone.setSize(new Dimension(228, 25));
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
	 * This method initializes cbxSex	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxSex() {
		if (cbxSex == null) {
			String data[] ={"Male","Female"};
			cbxSex = new JComboBox(data);
			cbxSex.setSize(new Dimension(121, 25));
			cbxSex.setLocation(new Point(150, 210));
		}
		return cbxSex;
	}

} 

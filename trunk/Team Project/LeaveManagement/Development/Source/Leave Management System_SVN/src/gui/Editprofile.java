package gui;

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
import javax.swing.JTextField;

import model.User;
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
	private JComboBox cbxSex = null;
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

	/**
	 * @param owner
	 */
	public Editprofile(Frame owner) {
		super(owner);
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
		this.setSize(543, 384);
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
			lbPhone = new JLabel();
			lbPhone.setText("Phone");
			lbPhone.setSize(new Dimension(121, 20));
			lbPhone.setLocation(new Point(15, 266));
			lbDay = new JLabel();
			lbDay.setBounds(new Rectangle(376, 107, 38, 16));
			lbDay.setText("Day");
			lbMonth = new JLabel();
			lbMonth.setBounds(new Rectangle(270, 107, 38, 16));
			lbMonth.setText("Month");
			lbYear = new JLabel();
			lbYear.setBounds(new Rectangle(149, 104, 39, 16));
			lbYear.setText("Year");
			jLabel5 = new JLabel();
			jLabel5.setText("Email");
			jLabel5.setSize(new Dimension(121, 20));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5.setLocation(new Point(15, 236));
			jLabel4 = new JLabel();
			jLabel4.setText("Address");
			jLabel4.setSize(new Dimension(121, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(15, 191));
			jLabel3 = new JLabel();
			jLabel3.setText("Sex");
			jLabel3.setSize(new Dimension(121, 20));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3.setLocation(new Point(15, 146));
			jLabel2 = new JLabel();
			jLabel2.setText(" Birthday");
			jLabel2.setSize(new Dimension(121, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(14, 101));
			jLabel1 = new JLabel();
			jLabel1.setText("Full Name");
			jLabel1.setSize(new Dimension(121, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 56));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(120, 3, 134, 28));
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
			jContentPane.add(getCbxSex(), null);
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
			txtFullname.setSize(new Dimension(228, 20));
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
			txtEmail.setLocation(new Point(150, 236));
			txtEmail.setSize(new Dimension(228, 20));
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
			txtAddress.setLocation(new Point(150, 191));
			txtAddress.setSize(new Dimension(228, 20));
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
			cbxSex.setLocation(new Point(150, 147));
			cbxSex.setSize(new Dimension(66, 20));
		}
		return cbxSex;
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
			btnUpdate.setLocation(new Point(15, 303));
			btnUpdate.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					User user = new User();
					user.setId_user(id);
					SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
					if(txtFullname.getText().isEmpty()||
							txtAddress.getText().isEmpty()||
							txtEmail.getText().isEmpty()||
							txtPhone.getText().isEmpty()|| 
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
								UserService service = new UserService();
								service.updateUser(user);
								JOptionPane.showMessageDialog(null, "edit successfull");
								Editprofile.this.dispose();
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
			btnReset.setLocation(new Point(138, 303));
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
			btnExit.setLocation(new Point(255, 301));
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(106, 30));
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Editprofile.this.dispose();
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
			cbxYear.setBounds(new Rectangle(194, 104, 65, 25));
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
			cbxMonth.setBounds(new Rectangle(316, 103, 54, 25));
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
			cbxDay.setBounds(new Rectangle(420, 104, 52, 25));
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
			txtPhone.setLocation(new Point(150, 266));
			txtPhone.setSize(new Dimension(228, 20));
		}
		return txtPhone;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
		this.setSize(432, 535);
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
			jLabel1 = new JLabel();
			jLabel1.setText("Email");
			jLabel1.setSize(new Dimension(108, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 390));
			lbSex = new JLabel();
			lbSex.setText("Sex(*)");
			lbSex.setSize(new Dimension(65, 20));
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
			lbBirthday.setLocation(new Point(15, 211));
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
			cbxSex = new JComboBox();
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
		}
		return txtEmail;
	}

}  //  @jve:decl-index=0:visual-constraint="10,30"

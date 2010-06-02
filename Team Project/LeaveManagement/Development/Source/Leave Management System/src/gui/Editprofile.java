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
import javax.swing.JTextField;

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

	/**
	 * @param owner
	 */
	public Editprofile(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(411, 384);
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
			txtFullname = new JTextField();
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
			txtEmail = new JTextField();
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
			txtAddress = new JTextField();
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
			cbxSex = new JComboBox();
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
			btnUpdate.setLocation(new Point(15, 286));
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
			btnReset.setLocation(new Point(146, 286));
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
			btnExit.setLocation(new Point(271, 286));
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(106, 30));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

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
import javax.swing.JTextField;

public class CreateLeaveapp extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField txtUsername = null;
	private JTextField txtReason = null;
	private JTextField txtAddress = null;
	private JTextField txtPhone = null;
	private JButton btnSend = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	private JLabel lbDateto = null;
	private JLabel lbYear = null;
	/**
	 * @param owner
	 */
	public CreateLeaveapp(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(468, 496);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbYear = new JLabel();
			lbYear.setBounds(new Rectangle(165, 104, 48, 16));
			lbYear.setText("Year");
			lbDateto = new JLabel();
			lbDateto.setText("Date to (*)");
			lbDateto.setLocation(new Point(15, 151));
			lbDateto.setFont(new Font("Dialog", Font.BOLD, 18));
			lbDateto.setSize(new Dimension(107, 20));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone(*)");
			jLabel6.setSize(new Dimension(121, 20));
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel6.setLocation(new Point(17, 298));
			jLabel5 = new JLabel();
			jLabel5.setText("Address(*)");
			jLabel5.setSize(new Dimension(121, 20));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5.setLocation(new Point(15, 255));
			jLabel4 = new JLabel();
			jLabel4.setText("Reason(*)");
			jLabel4.setSize(new Dimension(121, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(15, 196));
			jLabel2 = new JLabel();
			jLabel2.setText("Date from(*)");
			jLabel2.setSize(new Dimension(121, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(15, 105));
			jLabel1 = new JLabel();
			jLabel1.setText("Full Name");
			jLabel1.setSize(new Dimension(121, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 56));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(172, 3, 111, 37));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Leav app");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtReason(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(getBtnSend(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(lbDateto, null);
			jContentPane.add(lbYear, null);
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
			txtUsername.setLocation(new Point(165, 56));
			txtUsername.setSize(new Dimension(271, 20));
		}
		return txtUsername;
	}

	/**
	 * This method initializes txtReason	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtReason() {
		if (txtReason == null) {
			txtReason = new JTextField();
			txtReason.setLocation(new Point(164, 196));
			txtReason.setSize(new Dimension(271, 40));
		}
		return txtReason;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(165, 255));
			txtAddress.setSize(new Dimension(271, 20));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(165, 298));
			txtPhone.setSize(new Dimension(271, 20));
		}
		return txtPhone;
	}

	/**
	 * This method initializes btnSend	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton();
			btnSend.setFont(new Font("Dialog", Font.BOLD, 14));
			btnSend.setLocation(new Point(30, 345));
			btnSend.setSize(new Dimension(106, 30));
			btnSend.setText("Send");
		}
		return btnSend;
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
			btnReset.setLocation(new Point(164, 345));
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
			btnExit.setLocation(new Point(301, 345));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

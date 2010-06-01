package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Viewhistory extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JTextField txtFullname = null;
	private JTextField txtTotalappleave = null;
	private JTextField txtTotalnotappleave = null;
	private JTextField txtTotaldaycanleave = null;
	private JTextField txtTotaldaynotleave = null;
	private JButton btnExit = null;

	/**
	 * @param owner
	 */
	public Viewhistory(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(410, 406);
		this.setTitle("View history of leave day since joining the  company");
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
			jLabel5.setBounds(new Rectangle(151, -1, 145, 37));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel5.setText("View History");
			jLabel4 = new JLabel();
			jLabel4.setText(" Total not approval leave");
			jLabel4.setSize(new Dimension(239, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(15, 146));
			jLabel3 = new JLabel();
			jLabel3.setText("Total approval leave ");
			jLabel3.setSize(new Dimension(209, 20));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3.setLocation(new Point(15, 101));
			jLabel2 = new JLabel();
			jLabel2.setText("Total day can leave");
			jLabel2.setSize(new Dimension(239, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(15, 191));
			jLabel1 = new JLabel();
			jLabel1.setText("Total day can not leave");
			jLabel1.setSize(new Dimension(240, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 236));
			jLabel = new JLabel();
			jLabel.setText("Full Name");
			jLabel.setSize(new Dimension(121, 20));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel.setLocation(new Point(15, 59));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtTotalappleave(), null);
			jContentPane.add(getTxtTotalnotappleave(), null);
			jContentPane.add(getTxtTotaldaycanleave(), null);
			jContentPane.add(getTxtTotaldaynotleave(), null);
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
			txtFullname.setLocation(new Point(149, 59));
			txtFullname.setSize(new Dimension(229, 20));
		}
		return txtFullname;
	}

	/**
	 * This method initializes txtTotalappleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotalappleave() {
		if (txtTotalappleave == null) {
			txtTotalappleave = new JTextField();
			txtTotalappleave.setBounds(new Rectangle(254, 101, 122, 20));
		}
		return txtTotalappleave;
	}

	/**
	 * This method initializes txtTotalnotappleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotalnotappleave() {
		if (txtTotalnotappleave == null) {
			txtTotalnotappleave = new JTextField();
			txtTotalnotappleave.setLocation(new Point(254, 146));
			txtTotalnotappleave.setSize(new Dimension(122, 20));
		}
		return txtTotalnotappleave;
	}

	/**
	 * This method initializes txtTotaldaycanleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotaldaycanleave() {
		if (txtTotaldaycanleave == null) {
			txtTotaldaycanleave = new JTextField();
			txtTotaldaycanleave.setLocation(new Point(254, 191));
			txtTotaldaycanleave.setSize(new Dimension(122, 20));
		}
		return txtTotaldaycanleave;
	}

	/**
	 * This method initializes txtTotaldaynotleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotaldaynotleave() {
		if (txtTotaldaynotleave == null) {
			txtTotaldaynotleave = new JTextField();
			txtTotaldaynotleave.setLocation(new Point(254, 236));
			txtTotaldaynotleave.setSize(new Dimension(122, 20));
		}
		return txtTotaldaynotleave;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setBounds(new Rectangle(230, 301, 86, 24));
			btnExit.setText("Exit");
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

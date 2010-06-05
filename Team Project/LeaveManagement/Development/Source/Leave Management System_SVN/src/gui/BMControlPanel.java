package gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

public class BMControlPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnUser = null;
	private JMenu Manager = null;
	private JMenu mnView = null;
	private JMenu mnHelp = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JTextField txtUsername = null;
	private JTextField txtPosition = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JTextField txtGender = null;
	private JTextField txtAddress = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel8 = null;
	private JTextField txtEmail = null;
	private JTextField txtBirthday = null;
	private JTextField txtFullname = null;
	private JTextField txtPhone = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel songaynghikhongphep = null;
	private JLabel jLabel12 = null;
	private JTextField txtSongaynghi = null;
	private JTextField txtSongaynghicophep = null;
	private JTextField txtSongaynghikhongphep = null;
	private JTextField txtSongaynghicothenghi = null;
	private JLabel jLabel13 = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel pnManagerUser = null;
	private JPanel pnViewLeaveappvalid = null;
	private JButton btnEdit = null;
	private JButton btnAdd = null;
	private JButton btnLock = null;
	private JButton btnUnlock = null;
	private JTabbedPane jTabbedPane1 = null;
	private JPanel pnValid = null;
	private JPanel pnApprove = null;
	private JPanel pnReject = null;
	private JPanel pnFinish = null;
	private JPanel pnReport = null;
	private JTabbedPane jTabbedPane2 = null;
	private JPanel pnReportMonth = null;
	private JPanel pnReportYear = null;
	private JTabbedPane jTabbedPane3 = null;
	private JPanel pnManagerBusiness = null;
	private JPanel pnManager = null;
	private JPanel pnEngineer = null;
	/**
	 * This is the default constructor
	 */
	public BMControlPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(800, 600);
		this.setJMenuBar(getJJMenuBar());
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
			jLabel13 = new JLabel();
			jLabel13.setText("");
			jLabel13.setBounds(new Rectangle(0, 0, 0, 0));
			jLabel12 = new JLabel();
			jLabel12.setText("Songayconcothenghi");
			jLabel12.setBounds(new Rectangle(637, 172, 119, 16));
			songaynghikhongphep = new JLabel();
			songaynghikhongphep.setText("songaynghikhongphep");
			songaynghikhongphep.setBounds(new Rectangle(622, 151, 128, 16));
			jLabel11 = new JLabel();
			jLabel11.setText("Songaynghicophep");
			jLabel11.setBounds(new Rectangle(632, 89, 108, 16));
			jLabel10 = new JLabel();
			jLabel10.setText("Songaydanghi");
			jLabel10.setBounds(new Rectangle(646, 35, 80, 16));
			jLabel9 = new JLabel();
			jLabel9.setText("History");
			jLabel9.setBounds(new Rectangle(666, 0, 40, 16));
			jLabel8 = new JLabel();
			jLabel8.setText("Email");
			jLabel8.setBounds(new Rectangle(320, 64, 31, 16));
			jLabel4 = new JLabel();
			jLabel4.setText("Birthday");
			jLabel4.setBounds(new Rectangle(1, 92, 47, 16));
			jLabel7 = new JLabel();
			jLabel7.setText("Address");
			jLabel7.setBounds(new Rectangle(313, 87, 48, 16));
			jLabel6 = new JLabel();
			jLabel6.setText("Gender");
			jLabel6.setBounds(new Rectangle(319, 40, 41, 16));
			jLabel5 = new JLabel();
			jLabel5.setText("Phone");
			jLabel5.setBounds(new Rectangle(316, 15, 36, 16));
			jLabel3 = new JLabel();
			jLabel3.setText("Position");
			jLabel3.setBounds(new Rectangle(2, 63, 46, 16));
			jLabel2 = new JLabel();
			jLabel2.setText("Full Name");
			jLabel2.setBounds(new Rectangle(1, 41, 55, 16));
			jLabel1 = new JLabel();
			jLabel1.setText("User Name");
			jLabel1.setBounds(new Rectangle(0, 19, 63, 16));
			jLabel = new JLabel();
			jLabel.setText("User Information");
			jLabel.setBounds(new Rectangle(1, 0, 95, 16));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtPosition(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtGender(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getTxtBirthday(), null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(jLabel10, null);
			jContentPane.add(jLabel11, null);
			jContentPane.add(songaynghikhongphep, null);
			jContentPane.add(jLabel12, null);
			jContentPane.add(getTxtSongaynghi(), null);
			jContentPane.add(getTxtSongaynghicophep(), null);
			jContentPane.add(getTxtSongaynghikhongphep(), null);
			jContentPane.add(getTxtSongaynghicothenghi(), null);
			jContentPane.add(jLabel13, null);
			jContentPane.add(getJTabbedPane(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getMnUser());
			jJMenuBar.add(getManager());
			jJMenuBar.add(getMnView());
			jJMenuBar.add(getMnHelp());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes mnUser	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnUser() {
		if (mnUser == null) {
			mnUser = new JMenu();
			mnUser.setText("User");
		}
		return mnUser;
	}

	/**
	 * This method initializes Manager	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getManager() {
		if (Manager == null) {
			Manager = new JMenu();
			Manager.setText("Manager");
		}
		return Manager;
	}

	/**
	 * This method initializes mnView	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnView() {
		if (mnView == null) {
			mnView = new JMenu();
			mnView.setText("View");
		}
		return mnView;
	}

	/**
	 * This method initializes mnHelp	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu();
			mnHelp.setText("Help");
		}
		return mnHelp;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setPreferredSize(new Dimension(220, 20));
			txtUsername.setBounds(new Rectangle(70, 16, 220, 20));
		}
		return txtUsername;
	}

	/**
	 * This method initializes txtPosition	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPosition() {
		if (txtPosition == null) {
			txtPosition = new JTextField();
			txtPosition.setPreferredSize(new Dimension(220, 20));
			txtPosition.setBounds(new Rectangle(54, 63, 220, 20));
		}
		return txtPosition;
	}

	/**
	 * This method initializes txtGender	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtGender() {
		if (txtGender == null) {
			txtGender = new JTextField();
			txtGender.setPreferredSize(new Dimension(220, 10));
			txtGender.setBounds(new Rectangle(383, 50, 220, 20));
		}
		return txtGender;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setPreferredSize(new Dimension(220, 10));
			txtAddress.setBounds(new Rectangle(389, 71, 220, 36));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setPreferredSize(new Dimension(220, 10));
			txtEmail.setBounds(new Rectangle(391, 135, 220, 20));
		}
		return txtEmail;
	}

	/**
	 * This method initializes txtBirthday	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtBirthday() {
		if (txtBirthday == null) {
			txtBirthday = new JTextField();
			txtBirthday.setPreferredSize(new Dimension(220, 20));
			txtBirthday.setBounds(new Rectangle(55, 88, 220, 20));
		}
		return txtBirthday;
	}

	/**
	 * This method initializes txtFullname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFullname() {
		if (txtFullname == null) {
			txtFullname = new JTextField();
			txtFullname.setPreferredSize(new Dimension(220, 20));
			txtFullname.setBounds(new Rectangle(63, 41, 220, 20));
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
			txtPhone.setPreferredSize(new Dimension(220, 20));
			txtPhone.setBounds(new Rectangle(376, 19, 220, 20));
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtSongaynghi	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSongaynghi() {
		if (txtSongaynghi == null) {
			txtSongaynghi = new JTextField();
			txtSongaynghi.setBounds(new Rectangle(764, 16, 4, 54));
		}
		return txtSongaynghi;
	}

	/**
	 * This method initializes txtSongaynghicophep	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSongaynghicophep() {
		if (txtSongaynghicophep == null) {
			txtSongaynghicophep = new JTextField();
			txtSongaynghicophep.setBounds(new Rectangle(764, 70, 4, 54));
		}
		return txtSongaynghicophep;
	}

	/**
	 * This method initializes txtSongaynghikhongphep	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSongaynghikhongphep() {
		if (txtSongaynghikhongphep == null) {
			txtSongaynghikhongphep = new JTextField();
			txtSongaynghikhongphep.setBounds(new Rectangle(764, 124, 4, 70));
		}
		return txtSongaynghikhongphep;
	}

	/**
	 * This method initializes txtSongaynghicothenghi	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSongaynghicothenghi() {
		if (txtSongaynghicothenghi == null) {
			txtSongaynghicothenghi = new JTextField();
			txtSongaynghicothenghi.setBounds(new Rectangle(764, 194, 4, 54));
		}
		return txtSongaynghicothenghi;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setBounds(new Rectangle(1, 191, 782, 348));
			jTabbedPane.addTab("Manager User", new ImageIcon("D:/icon/Clients-icon.png"), getPnManagerUser(), null);
			jTabbedPane.addTab("LeaveApp ", null, getPnViewLeaveappvalid(), "");
			jTabbedPane.addTab("Report", null, getPnReport(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes pnManagerUser	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManagerUser() {
		if (pnManagerUser == null) {
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.fill = GridBagConstraints.BOTH;
			gridBagConstraints27.gridy = 0;
			gridBagConstraints27.weightx = 1.0;
			gridBagConstraints27.weighty = 1.0;
			gridBagConstraints27.gridwidth = 1;
			gridBagConstraints27.gridheight = 4;
			gridBagConstraints27.gridx = 0;
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 1;
			gridBagConstraints23.weighty = 1.0D;
			gridBagConstraints23.gridy = 3;
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.gridx = 1;
			gridBagConstraints22.weighty = 1.0D;
			gridBagConstraints22.gridy = 2;
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.gridx = 1;
			gridBagConstraints20.weighty = 1.0D;
			gridBagConstraints20.gridy = 1;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 1;
			gridBagConstraints19.weighty = 1.0D;
			gridBagConstraints19.gridy = 0;
			pnManagerUser = new JPanel();
			pnManagerUser.setLayout(new GridBagLayout());
			pnManagerUser.add(getBtnEdit(), gridBagConstraints19);
			pnManagerUser.add(getBtnAdd(), gridBagConstraints20);
			pnManagerUser.add(getBtnLock(), gridBagConstraints22);
			pnManagerUser.add(getBtnUnlock(), gridBagConstraints23);
			pnManagerUser.add(getJTabbedPane3(), gridBagConstraints27);
		}
		return pnManagerUser;
	}

	/**
	 * This method initializes pnViewLeaveappvalid	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnViewLeaveappvalid() {
		if (pnViewLeaveappvalid == null) {
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.fill = GridBagConstraints.BOTH;
			gridBagConstraints24.gridy = 0;
			gridBagConstraints24.weightx = 1.0;
			gridBagConstraints24.weighty = 1.0;
			gridBagConstraints24.gridx = 0;
			pnViewLeaveappvalid = new JPanel();
			pnViewLeaveappvalid.setLayout(new GridBagLayout());
			pnViewLeaveappvalid.add(getJTabbedPane1(), gridBagConstraints24);
		}
		return pnViewLeaveappvalid;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit");
		}
		return btnEdit;
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
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnLock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLock() {
		if (btnLock == null) {
			btnLock = new JButton();
			btnLock.setText("Lock");
		}
		return btnLock;
	}

	/**
	 * This method initializes btnUnlock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUnlock() {
		if (btnUnlock == null) {
			btnUnlock = new JButton();
			btnUnlock.setText("Unlock");
		}
		return btnUnlock;
	}

	/**
	 * This method initializes jTabbedPane1	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane1() {
		if (jTabbedPane1 == null) {
			jTabbedPane1 = new JTabbedPane();
			jTabbedPane1.addTab("Valid", null, getPnValid(), null);
			jTabbedPane1.addTab("Approve", null, getPnApprove(), null);
			jTabbedPane1.addTab("Reject", null, getPnReject(), null);
			jTabbedPane1.addTab("Finish", null, getPnFinish(), null);
		}
		return jTabbedPane1;
	}

	/**
	 * This method initializes pnValid	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnValid() {
		if (pnValid == null) {
			pnValid = new JPanel();
			pnValid.setLayout(new GridBagLayout());
		}
		return pnValid;
	}

	/**
	 * This method initializes pnApprove	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnApprove() {
		if (pnApprove == null) {
			pnApprove = new JPanel();
			pnApprove.setLayout(new GridBagLayout());
		}
		return pnApprove;
	}

	/**
	 * This method initializes pnReject	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReject() {
		if (pnReject == null) {
			pnReject = new JPanel();
			pnReject.setLayout(new GridBagLayout());
		}
		return pnReject;
	}

	/**
	 * This method initializes pnFinish	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnFinish() {
		if (pnFinish == null) {
			pnFinish = new JPanel();
			pnFinish.setLayout(new GridBagLayout());
		}
		return pnFinish;
	}

	/**
	 * This method initializes pnReport	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReport() {
		if (pnReport == null) {
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.fill = GridBagConstraints.BOTH;
			gridBagConstraints26.gridy = 0;
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.weighty = 1.0;
			gridBagConstraints26.gridx = 0;
			pnReport = new JPanel();
			pnReport.setLayout(new GridBagLayout());
			pnReport.add(getJTabbedPane2(), gridBagConstraints26);
		}
		return pnReport;
	}

	/**
	 * This method initializes jTabbedPane2	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane2() {
		if (jTabbedPane2 == null) {
			jTabbedPane2 = new JTabbedPane();
			jTabbedPane2.addTab("Report Month", null, getPnReportMonth(), null);
			jTabbedPane2.addTab("Report Year", null, getPnReportYear(), null);
		}
		return jTabbedPane2;
	}

	/**
	 * This method initializes pnReportMonth	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReportMonth() {
		if (pnReportMonth == null) {
			pnReportMonth = new JPanel();
			pnReportMonth.setLayout(new GridBagLayout());
		}
		return pnReportMonth;
	}

	/**
	 * This method initializes pnReportYear	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReportYear() {
		if (pnReportYear == null) {
			pnReportYear = new JPanel();
			pnReportYear.setLayout(new GridBagLayout());
		}
		return pnReportYear;
	}

	/**
	 * This method initializes jTabbedPane3	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane3() {
		if (jTabbedPane3 == null) {
			jTabbedPane3 = new JTabbedPane();
			jTabbedPane3.addTab("Business Manager", null, getPnManagerBusiness(), null);
			jTabbedPane3.addTab("Manager", null, getPnManager(), null);
			jTabbedPane3.addTab("Engineer", null, getPnEngineer(), null);
		}
		return jTabbedPane3;
	}

	/**
	 * This method initializes pnManagerBusiness	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManagerBusiness() {
		if (pnManagerBusiness == null) {
			pnManagerBusiness = new JPanel();
			pnManagerBusiness.setLayout(new GridBagLayout());
		}
		return pnManagerBusiness;
	}

	/**
	 * This method initializes pnManager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManager() {
		if (pnManager == null) {
			pnManager = new JPanel();
			pnManager.setLayout(new GridBagLayout());
		}
		return pnManager;
	}

	/**
	 * This method initializes pnEngineer	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnEngineer() {
		if (pnEngineer == null) {
			pnEngineer = new JPanel();
			pnEngineer.setLayout(new GridBagLayout());
		}
		return pnEngineer;
	}

}  //  @jve:decl-index=0:visual-constraint="69,36"

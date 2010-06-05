import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Scrollbar;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTree;
import java.awt.Font;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BNCP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbUserinformation = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnUser = null;
	private JMenu mnManager = null;
	private JLabel lbUserName = null;
	private JLabel lbFullname = null;
	private JLabel lbPosition = null;
	private JLabel lbBirthday = null;
	private JLabel lbPhone = null;
	private JLabel lbGender = null;
	private JLabel lbAddress = null;
	private JLabel lbEmail = null;
	private JTextField txtUsername = null;
	private JTextField txtFullname = null;
	private JTextField txtPosition = null;
	private JTextField txtBirthday = null;
	private JTextField txtPhone = null;
	private JTextField txtGender = null;
	private JTextField txtAddress = null;
	private JTextField txtEmail = null;
	private JButton btnAdduser = null;
	private JButton btnEditUser = null;
	private JButton btnChangepass = null;
	private JButton btnEditProfile = null;
	private JButton btnCreatleaveapp = null;
	private JButton btnLock = null;
	private JButton btnUnlock = null;
	private JButton btnLogout = null;
	private JPanel jPanel = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jpnHistory = null;
	private JPanel jpnLeaveapp = null;
	private JPanel jpnReport = null;
	private JPanel jpmUsermanager = null;
	private JTabbedPane jtpnUsermanager = null;
	private JPanel jpnBusinessmanager = null;
	private JPanel jpnManager = null;
	private JPanel jpnEngineer = null;
	private JTabbedPane jtpnReport = null;
	private JPanel jpnReportmonth = null;
	private JPanel jpnReportYear = null;
	private JTabbedPane jtbnLeaveapp = null;
	private JPanel jpnValid = null;
	private JPanel jpnApprove = null;
	private JPanel jpnReject = null;
	private JPanel jpnFinish = null;
	private JMenuItem mniEditprofile = null;
	private JMenuItem mniChangepass = null;
	private JMenuItem mniCreatleaveapp = null;
	private JMenuItem mniViewleaveapp = null;
	private JMenuItem mniHistory = null;
	private JMenuItem mniSignout = null;
	private JMenuItem mniAdduser = null;
	private JMenuItem mniLockuser = null;
	private JMenuItem mniUnlockuser = null;
	private JMenuItem mniAddgroup = null;
	private JMenuItem mniEditUser = null;
	private JMenu mnManagerLeaveapp = null;
	private JMenuItem mnViewValid = null;
	private JMenuItem mniViewApprove = null;
	private JMenuItem mniViewReject = null;
	private JMenuItem mniViewFinish = null;
	private JMenuItem mniViewMyLeaveApp = null;
	private JToolBar jJToolBarBar = null;
	private JButton btnApprove = null;
	private JButton btnReject = null;
	private JButton btnFinish = null;
	private JPanel pnUser = null;
	private JScrollPane jScrollPane = null;
	private JTable tblLeaveappValid = null;
	private JToolBar jtbLeaveApprove = null;
	private JButton btnViewLeaveappApprove = null;
	private JButton btnViewApprovereject = null;
	private JButton btnViewApprovefinish = null;
	private JPanel pnTableViewLeaveApp = null;
	private JScrollPane jScrollPane1 = null;
	private JTable tblLeaveappApprove = null;
	private JToolBar jtbLeaveappReject = null;
	private JButton btnViewLeaveappRejectApprove = null;
	private JButton btnViewLeaveappRejectFinish = null;
	private JButton btnViewLeaveappRejectReject = null;
	private JPanel pnTableViewLeaveappReject = null;
	private JScrollPane jScrollPane2 = null;
	private JTable tblLeaveappReject = null;
	private JScrollPane jScrollPane3 = null;
	private JTable tblLeaveappFinish = null;
	private JLabel jLabel = null;
	/**
	 * This is the default constructor
	 */
	public BNCP() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1280, 720);
		this.setJMenuBar(getJJMenuBar());
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setVisible(false);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(1192, 40, 38, 16));
			jLabel.setText("");
			lbEmail = new JLabel();
			lbEmail.setText("Email");
			lbEmail.setSize(new Dimension(91, 23));
			lbEmail.setFont(new Font("Dialog", Font.BOLD, 14));
			lbEmail.setLocation(new Point(315, 158));
			lbAddress = new JLabel();
			lbAddress.setText("Address");
			lbAddress.setSize(new Dimension(91, 23));
			lbAddress.setFont(new Font("Dialog", Font.BOLD, 14));
			lbAddress.setLocation(new Point(315, 120));
			lbGender = new JLabel();
			lbGender.setText("Gender");
			lbGender.setSize(new Dimension(91, 23));
			lbGender.setFont(new Font("Dialog", Font.BOLD, 14));
			lbGender.setLocation(new Point(315, 83));
			lbPhone = new JLabel();
			lbPhone.setText("Phone");
			lbPhone.setSize(new Dimension(91, 23));
			lbPhone.setFont(new Font("Dialog", Font.BOLD, 14));
			lbPhone.setLocation(new Point(315, 44));
			lbBirthday = new JLabel();
			lbBirthday.setText("Birthday");
			lbBirthday.setSize(new Dimension(91, 23));
			lbBirthday.setFont(new Font("Dialog", Font.BOLD, 14));
			lbBirthday.setLocation(new Point(15, 158));
			lbPosition = new JLabel();
			lbPosition.setText("Positon");
			lbPosition.setSize(new Dimension(91, 23));
			lbPosition.setFont(new Font("Dialog", Font.BOLD, 14));
			lbPosition.setLocation(new Point(15, 120));
			lbFullname = new JLabel();
			lbFullname.setText("Full Name");
			lbFullname.setSize(new Dimension(91, 23));
			lbFullname.setFont(new Font("Dialog", Font.BOLD, 14));
			lbFullname.setLocation(new Point(15, 83));
			lbUserName = new JLabel();
			lbUserName.setText("User Name");
			lbUserName.setSize(new Dimension(91, 23));
			lbUserName.setFont(new Font("Dialog", Font.BOLD, 14));
			lbUserName.setLocation(new Point(15, 44));
			lbUserinformation = new JLabel();
			lbUserinformation.setBounds(new Rectangle(50, 3, 152, 29));
			lbUserinformation.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
			lbUserinformation.setForeground(Color.blue);
			lbUserinformation.setText("User Information");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 14));
			jContentPane.add(lbUserinformation, null);
			jContentPane.add(lbUserName, null);
			jContentPane.add(lbFullname, null);
			jContentPane.add(lbPosition, null);
			jContentPane.add(lbBirthday, null);
			jContentPane.add(lbPhone, null);
			jContentPane.add(lbGender, null);
			jContentPane.add(lbAddress, null);
			jContentPane.add(lbEmail, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtPosition(), null);
			jContentPane.add(getTxtBirthday(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(getTxtGender(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getBtnAdduser(), null);
			jContentPane.add(getBtnEditUser(), null);
			jContentPane.add(getBtnChangepass(), null);
			jContentPane.add(getBtnEditProfile(), null);
			jContentPane.add(getBtnCreatleaveapp(), null);
			jContentPane.add(getBtnLock(), null);
			jContentPane.add(getBtnUnlock(), null);
			jContentPane.add(getBtnLogout(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(jLabel, null);
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
			jJMenuBar.add(getMnManager());
			jJMenuBar.add(getMnManagerLeaveapp());
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
			mnUser.setIcon(new ImageIcon(getClass().getResource("/image/Preppy-icon.png")));
			mnUser.add(getMniEditprofile());
			mnUser.add(getMniChangepass());
			mnUser.add(getMniCreatleaveapp());
			mnUser.add(getMniViewleaveapp());
			mnUser.add(getMniHistory());
			mnUser.add(getMniSignout());
		}
		return mnUser;
	}

	/**
	 * This method initializes mnManager	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnManager() {
		if (mnManager == null) {
			mnManager = new JMenu();
			mnManager.setText("Manager User");
			mnManager.setIcon(new ImageIcon(getClass().getResource("/image/Clients-icon.png")));
			mnManager.add(getMniAdduser());
			mnManager.add(getMniEditUser());
			mnManager.add(getMniLockuser());
			mnManager.add(getMniUnlockuser());
			mnManager.add(getMniAddgroup());
		}
		return mnManager;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setLocation(new Point(105, 44));
			txtUsername.setSize(new Dimension(200, 23));
		}
		return txtUsername;
	}

	/**
	 * This method initializes txtFullname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFullname() {
		if (txtFullname == null) {
			txtFullname = new JTextField();
			txtFullname.setLocation(new Point(105, 83));
			txtFullname.setSize(new Dimension(200, 23));
		}
		return txtFullname;
	}

	/**
	 * This method initializes txtPosition	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPosition() {
		if (txtPosition == null) {
			txtPosition = new JTextField();
			txtPosition.setLocation(new Point(105, 120));
			txtPosition.setSize(new Dimension(200, 23));
		}
		return txtPosition;
	}

	/**
	 * This method initializes txtBirthday	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtBirthday() {
		if (txtBirthday == null) {
			txtBirthday = new JTextField();
			txtBirthday.setLocation(new Point(105, 158));
			txtBirthday.setSize(new Dimension(200, 23));
		}
		return txtBirthday;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(406, 44));
			txtPhone.setSize(new Dimension(200, 23));
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtGender	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtGender() {
		if (txtGender == null) {
			txtGender = new JTextField();
			txtGender.setLocation(new Point(406, 83));
			txtGender.setSize(new Dimension(200, 23));
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
			txtAddress.setLocation(new Point(406, 120));
			txtAddress.setSize(new Dimension(200, 23));
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
			txtEmail.setLocation(new Point(406, 158));
			txtEmail.setSize(new Dimension(200, 23));
		}
		return txtEmail;
	}

	/**
	 * This method initializes btnAdduser	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdduser() {
		if (btnAdduser == null) {
			btnAdduser = new JButton();
			btnAdduser.setIcon(new ImageIcon(getClass().getResource("/image/add-user-icon.png")));
			btnAdduser.setLocation(new Point(809, 30));
			btnAdduser.setSize(new Dimension(151, 40));
			btnAdduser.setText("Add USer");
		}
		return btnAdduser;
	}

	/**
	 * This method initializes btnEditUser	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEditUser() {
		if (btnEditUser == null) {
			btnEditUser = new JButton();
			btnEditUser.setText("Edit User");
			btnEditUser.setSize(new Dimension(151, 40));
			btnEditUser.setIcon(new ImageIcon(getClass().getResource("/image/edit-user-icon.png")));
			btnEditUser.setLocation(new Point(996, 90));
		}
		return btnEditUser;
	}

	/**
	 * This method initializes btnChangepass	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnChangepass() {
		if (btnChangepass == null) {
			btnChangepass = new JButton();
			btnChangepass.setText("Change pass");
			btnChangepass.setSize(new Dimension(138, 40));
			btnChangepass.setLocation(new Point(632, 30));
		}
		return btnChangepass;
	}

	/**
	 * This method initializes btnEditProfile	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEditProfile() {
		if (btnEditProfile == null) {
			btnEditProfile = new JButton();
			btnEditProfile.setText("Edit Profile");
			btnEditProfile.setSize(new Dimension(138, 40));
			btnEditProfile.setLocation(new Point(632, 90));
		}
		return btnEditProfile;
	}

	/**
	 * This method initializes btnCreatleaveapp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCreatleaveapp() {
		if (btnCreatleaveapp == null) {
			btnCreatleaveapp = new JButton();
			btnCreatleaveapp.setBounds(new Rectangle(632, 150, 138, 40));
			btnCreatleaveapp.setText("Create Leaveapp");
		}
		return btnCreatleaveapp;
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
			btnLock.setSize(new Dimension(151, 40));
			btnLock.setIcon(new ImageIcon(getClass().getResource("/image/remove-user-icon.png")));
			btnLock.setLocation(new Point(809, 90));
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
			btnUnlock.setSize(new Dimension(151, 40));
			btnUnlock.setIcon(new ImageIcon(getClass().getResource("/image/user-icon_2.png")));
			btnUnlock.setLocation(new Point(809, 150));
		}
		return btnUnlock;
	}

	/**
	 * This method initializes btnLogout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton();
			btnLogout.setLocation(new Point(996, 150));
			btnLogout.setText("Sign Out");
			btnLogout.setIcon(new ImageIcon(getClass().getResource("/image/Log-Out-icon.png")));
			btnLogout.setSize(new Dimension(151, 40));
		}
		return btnLogout;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.setBounds(new Rectangle(1, 195, 1272, 472));
			jPanel.add(getJTabbedPane(), gridBagConstraints);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.addTab("History", null, getJpnHistory(), null);
			jTabbedPane.addTab("Manager LeaveApp", new ImageIcon(getClass().getResource("/image/Attach-icon.png")), getJpnLeaveapp(), null);
			jTabbedPane.addTab("Report", new ImageIcon(getClass().getResource("/image/Document-icon.png")), getJpnReport(), null);
			jTabbedPane.addTab("User Manager", new ImageIcon(getClass().getResource("/image/user-group-icon.png")), getJpmUsermanager(), "");
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jpnHistory	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnHistory() {
		if (jpnHistory == null) {
			jpnHistory = new JPanel();
			jpnHistory.setLayout(null);
		}
		return jpnHistory;
	}

	/**
	 * This method initializes jpnLeaveapp	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnLeaveapp() {
		if (jpnLeaveapp == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			jpnLeaveapp = new JPanel();
			jpnLeaveapp.setLayout(new GridBagLayout());
			jpnLeaveapp.add(getJtbnLeaveapp(), gridBagConstraints3);
		}
		return jpnLeaveapp;
	}

	/**
	 * This method initializes jpnReport	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnReport() {
		if (jpnReport == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			jpnReport = new JPanel();
			jpnReport.setLayout(new GridBagLayout());
			jpnReport.add(getJtpnReport(), gridBagConstraints2);
		}
		return jpnReport;
	}

	/**
	 * This method initializes jpmUsermanager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpmUsermanager() {
		if (jpmUsermanager == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			jpmUsermanager = new JPanel();
			jpmUsermanager.setLayout(new GridBagLayout());
			jpmUsermanager.add(getJtpnUsermanager(), gridBagConstraints1);
		}
		return jpmUsermanager;
	}

	/**
	 * This method initializes jtpnUsermanager	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtpnUsermanager() {
		if (jtpnUsermanager == null) {
			jtpnUsermanager = new JTabbedPane();
			jtpnUsermanager.addTab("Business Manager", null, getJpnBusinessmanager(), null);
			jtpnUsermanager.addTab("Manager", null, getJpnManager(), null);
			jtpnUsermanager.addTab("Engineer", null, getJpnEngineer(), null);
		}
		return jtpnUsermanager;
	}

	/**
	 * This method initializes jpnBusinessmanager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnBusinessmanager() {
		if (jpnBusinessmanager == null) {
			jpnBusinessmanager = new JPanel();
			jpnBusinessmanager.setLayout(new GridBagLayout());
		}
		return jpnBusinessmanager;
	}

	/**
	 * This method initializes jpnManager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnManager() {
		if (jpnManager == null) {
			jpnManager = new JPanel();
			jpnManager.setLayout(new GridBagLayout());
		}
		return jpnManager;
	}

	/**
	 * This method initializes jpnEngineer	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnEngineer() {
		if (jpnEngineer == null) {
			jpnEngineer = new JPanel();
			jpnEngineer.setLayout(new GridBagLayout());
		}
		return jpnEngineer;
	}

	/**
	 * This method initializes jtpnReport	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtpnReport() {
		if (jtpnReport == null) {
			jtpnReport = new JTabbedPane();
			jtpnReport.addTab("Report Month", null, getJpnReportmonth(), null);
			jtpnReport.addTab("Report Year", null, getJpnReportYear(), null);
		}
		return jtpnReport;
	}

	/**
	 * This method initializes jpnReportmonth	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnReportmonth() {
		if (jpnReportmonth == null) {
			jpnReportmonth = new JPanel();
			jpnReportmonth.setLayout(new GridBagLayout());
		}
		return jpnReportmonth;
	}

	/**
	 * This method initializes jpnReportYear	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnReportYear() {
		if (jpnReportYear == null) {
			jpnReportYear = new JPanel();
			jpnReportYear.setLayout(null);
		}
		return jpnReportYear;
	}

	/**
	 * This method initializes jtbnLeaveapp	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtbnLeaveapp() {
		if (jtbnLeaveapp == null) {
			jtbnLeaveapp = new JTabbedPane();
			jtbnLeaveapp.addTab("Valid", null, getJpnValid(), null);
			jtbnLeaveapp.addTab("Approve", null, getJpnApprove(), null);
			jtbnLeaveapp.addTab("Reject", null, getJpnReject(), null);
			jtbnLeaveapp.addTab("Finish", null, getJpnFinish(), null);
		}
		return jtbnLeaveapp;
	}

	/**
	 * This method initializes jpnValid	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnValid() {
		if (jpnValid == null) {
			jpnValid = new JPanel();
			jpnValid.setLayout(null);
			jpnValid.add(getJJToolBarBar(), null);
			jpnValid.add(getPnUser(), null);
		}
		return jpnValid;
	}

	/**
	 * This method initializes jpnApprove	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnApprove() {
		if (jpnApprove == null) {
			jpnApprove = new JPanel();
			jpnApprove.setLayout(null);
			jpnApprove.add(getJtbLeaveApprove(), null);
			jpnApprove.add(getPnTableViewLeaveApp(), null);
		}
		return jpnApprove;
	}

	/**
	 * This method initializes jpnReject	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnReject() {
		if (jpnReject == null) {
			jpnReject = new JPanel();
			jpnReject.setLayout(null);
			jpnReject.add(getJtbLeaveappReject(), null);
			jpnReject.add(getPnTableViewLeaveappReject(), null);
		}
		return jpnReject;
	}

	/**
	 * This method initializes jpnFinish	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnFinish() {
		if (jpnFinish == null) {
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.BOTH;
			gridBagConstraints7.gridy = 0;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.weighty = 1.0;
			gridBagConstraints7.gridx = 0;
			jpnFinish = new JPanel();
			jpnFinish.setLayout(new GridBagLayout());
			jpnFinish.add(getJScrollPane3(), gridBagConstraints7);
		}
		return jpnFinish;
	}

	/**
	 * This method initializes mniEditprofile	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniEditprofile() {
		if (mniEditprofile == null) {
			mniEditprofile = new JMenuItem();
			mniEditprofile.setText("Edit Profile");
		}
		return mniEditprofile;
	}

	/**
	 * This method initializes mniChangepass	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniChangepass() {
		if (mniChangepass == null) {
			mniChangepass = new JMenuItem();
			mniChangepass.setText("Change Password");
		}
		return mniChangepass;
	}

	/**
	 * This method initializes mniCreatleaveapp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniCreatleaveapp() {
		if (mniCreatleaveapp == null) {
			mniCreatleaveapp = new JMenuItem();
			mniCreatleaveapp.setText("Creat Leaveapp");
		}
		return mniCreatleaveapp;
	}

	/**
	 * This method initializes mniViewleaveapp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewleaveapp() {
		if (mniViewleaveapp == null) {
			mniViewleaveapp = new JMenuItem();
			mniViewleaveapp.setText("View Leaveapp");
		}
		return mniViewleaveapp;
	}

	/**
	 * This method initializes mniHistory	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniHistory() {
		if (mniHistory == null) {
			mniHistory = new JMenuItem();
			mniHistory.setText("View History");
		}
		return mniHistory;
	}

	/**
	 * This method initializes mniSignout	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniSignout() {
		if (mniSignout == null) {
			mniSignout = new JMenuItem();
			mniSignout.setText("Sign Out");
		}
		return mniSignout;
	}

	/**
	 * This method initializes mniAdduser	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniAdduser() {
		if (mniAdduser == null) {
			mniAdduser = new JMenuItem();
			mniAdduser.setText("Add User");
			mniAdduser.setIcon(new ImageIcon(getClass().getResource("/image/button-ok-icon.png")));
		}
		return mniAdduser;
	}

	/**
	 * This method initializes mniLockuser	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniLockuser() {
		if (mniLockuser == null) {
			mniLockuser = new JMenuItem();
			mniLockuser.setText("Lock User");
			mniLockuser.setIcon(new ImageIcon(getClass().getResource("/image/lock-icon.png")));
		}
		return mniLockuser;
	}

	/**
	 * This method initializes mniUnlockuser	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniUnlockuser() {
		if (mniUnlockuser == null) {
			mniUnlockuser = new JMenuItem();
			mniUnlockuser.setText("Unlock User");
			mniUnlockuser.setIcon(new ImageIcon(getClass().getResource("/image/lock-off-icon.png")));
		}
		return mniUnlockuser;
	}

	/**
	 * This method initializes mniAddgroup	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniAddgroup() {
		if (mniAddgroup == null) {
			mniAddgroup = new JMenuItem();
			mniAddgroup.setToolTipText("Add Group");
			mniAddgroup.setIcon(new ImageIcon(getClass().getResource("/image/user-info-icon.png")));
			mniAddgroup.setText("Add Group");
		}
		return mniAddgroup;
	}

	/**
	 * This method initializes mniEditUser	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniEditUser() {
		if (mniEditUser == null) {
			mniEditUser = new JMenuItem();
			mniEditUser.setText("Edit User");
			mniEditUser.setIcon(new ImageIcon(getClass().getResource("/image/Edit-icon.png")));
		}
		return mniEditUser;
	}

	/**
	 * This method initializes mnManagerLeaveapp	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnManagerLeaveapp() {
		if (mnManagerLeaveapp == null) {
			mnManagerLeaveapp = new JMenu();
			mnManagerLeaveapp.setText("Manager LeaveApp");
			mnManagerLeaveapp.add(getMnViewValid());
			mnManagerLeaveapp.add(getMniViewApprove());
			mnManagerLeaveapp.add(getMniViewReject());
			mnManagerLeaveapp.add(getMniViewFinish());
			mnManagerLeaveapp.add(getMniViewMyLeaveApp());
		}
		return mnManagerLeaveapp;
	}

	/**
	 * This method initializes mnViewValid	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnViewValid() {
		if (mnViewValid == null) {
			mnViewValid = new JMenuItem();
			mnViewValid.setText("View LeaveApp valid");
		}
		return mnViewValid;
	}

	/**
	 * This method initializes mniViewApprove	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewApprove() {
		if (mniViewApprove == null) {
			mniViewApprove = new JMenuItem();
			mniViewApprove.setText("View LeaveApp Approve");
		}
		return mniViewApprove;
	}

	/**
	 * This method initializes mniViewReject	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewReject() {
		if (mniViewReject == null) {
			mniViewReject = new JMenuItem();
			mniViewReject.setText("View LeaveApp Reject");
		}
		return mniViewReject;
	}

	/**
	 * This method initializes mniViewFinish	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewFinish() {
		if (mniViewFinish == null) {
			mniViewFinish = new JMenuItem();
			mniViewFinish.setText("View Leaveapp Finish");
		}
		return mniViewFinish;
	}

	/**
	 * This method initializes mniViewMyLeaveApp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewMyLeaveApp() {
		if (mniViewMyLeaveApp == null) {
			mniViewMyLeaveApp = new JMenuItem();
			mniViewMyLeaveApp.setText("View My LeaveAPP");
		}
		return mniViewMyLeaveApp;
	}

	/**
	 * This method initializes jJToolBarBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJJToolBarBar() {
		if (jJToolBarBar == null) {
			jJToolBarBar = new JToolBar();
			jJToolBarBar.setBounds(new Rectangle(-2, 347, 1265, 31));
			jJToolBarBar.setBackground(new Color(153, 255, 153));
			jJToolBarBar.add(getBtnApprove());
			jJToolBarBar.add(getBtnReject());
			jJToolBarBar.add(getBtnFinish());
		}
		return jJToolBarBar;
	}

	/**
	 * This method initializes btnApprove	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnApprove() {
		if (btnApprove == null) {
			btnApprove = new JButton();
			btnApprove.setText("Approve");
			btnApprove.setLocation(new Point(16, 1));
			btnApprove.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
		}
		return btnApprove;
	}

	/**
	 * This method initializes btnReject	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnReject() {
		if (btnReject == null) {
			btnReject = new JButton();
			btnReject.setText("Reject");
			btnReject.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
		}
		return btnReject;
	}

	/**
	 * This method initializes btnFinish	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnFinish() {
		if (btnFinish == null) {
			btnFinish = new JButton();
			btnFinish.setText("Finish");
			btnFinish.setIcon(new ImageIcon(getClass().getResource("/image/info-icon.png")));
		}
		return btnFinish;
	}

	/**
	 * This method initializes pnUser	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnUser() {
		if (pnUser == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 0;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridx = 0;
			pnUser = new JPanel();
			pnUser.setLayout(new GridBagLayout());
			pnUser.setBounds(new Rectangle(0, -1, 1261, 347));
			pnUser.add(getJScrollPane(), gridBagConstraints4);
		}
		return pnUser;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTblLeaveappValid());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tblLeaveappValid	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblLeaveappValid() {
		if (tblLeaveappValid == null) {
			tblLeaveappValid = new JTable();
		}
		return tblLeaveappValid;
	}

	/**
	 * This method initializes jtbLeaveApprove	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJtbLeaveApprove() {
		if (jtbLeaveApprove == null) {
			jtbLeaveApprove = new JToolBar();
			jtbLeaveApprove.setLocation(new Point(-4, 345));
			jtbLeaveApprove.setBackground(new Color(153, 255, 153));
			jtbLeaveApprove.setSize(new Dimension(1273, 31));
			jtbLeaveApprove.add(getBtnViewLeaveappApprove());
			jtbLeaveApprove.add(getBtnViewApprovereject());
			jtbLeaveApprove.add(getBtnViewApprovefinish());
		}
		return jtbLeaveApprove;
	}

	/**
	 * This method initializes btnViewLeaveappApprove	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewLeaveappApprove() {
		if (btnViewLeaveappApprove == null) {
			btnViewLeaveappApprove = new JButton();
			btnViewLeaveappApprove.setText("Approve");
			btnViewLeaveappApprove.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
		}
		return btnViewLeaveappApprove;
	}

	/**
	 * This method initializes btnViewApprovereject	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewApprovereject() {
		if (btnViewApprovereject == null) {
			btnViewApprovereject = new JButton();
			btnViewApprovereject.setText("Reject");
			btnViewApprovereject.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
		}
		return btnViewApprovereject;
	}

	/**
	 * This method initializes btnViewApprovefinish	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewApprovefinish() {
		if (btnViewApprovefinish == null) {
			btnViewApprovefinish = new JButton();
			btnViewApprovefinish.setText("Finish");
			btnViewApprovefinish.setIcon(new ImageIcon(getClass().getResource("/image/info-icon.png")));
		}
		return btnViewApprovefinish;
	}

	/**
	 * This method initializes pnTableViewLeaveApp	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableViewLeaveApp() {
		if (pnTableViewLeaveApp == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.gridy = 0;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.weighty = 1.0;
			gridBagConstraints5.gridx = 0;
			pnTableViewLeaveApp = new JPanel();
			pnTableViewLeaveApp.setLayout(new GridBagLayout());
			pnTableViewLeaveApp.setBounds(new Rectangle(0, 1, 1263, 344));
			pnTableViewLeaveApp.add(getJScrollPane1(), gridBagConstraints5);
		}
		return pnTableViewLeaveApp;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getTblLeaveappApprove());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes tblLeaveappApprove	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblLeaveappApprove() {
		if (tblLeaveappApprove == null) {
			tblLeaveappApprove = new JTable();
		}
		return tblLeaveappApprove;
	}

	/**
	 * This method initializes jtbLeaveappReject	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJtbLeaveappReject() {
		if (jtbLeaveappReject == null) {
			jtbLeaveappReject = new JToolBar();
			jtbLeaveappReject.setLocation(new Point(-3, 345));
			jtbLeaveappReject.setBackground(new Color(153, 255, 153));
			jtbLeaveappReject.setSize(new Dimension(1273, 31));
			jtbLeaveappReject.add(getBtnViewLeaveappRejectApprove());
			jtbLeaveappReject.add(getBtnViewLeaveappRejectReject());
			jtbLeaveappReject.add(getBtnViewLeaveappRejectFinish());
		}
		return jtbLeaveappReject;
	}

	/**
	 * This method initializes btnViewLeaveappRejectApprove	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewLeaveappRejectApprove() {
		if (btnViewLeaveappRejectApprove == null) {
			btnViewLeaveappRejectApprove = new JButton();
			btnViewLeaveappRejectApprove.setText("Approve");
			btnViewLeaveappRejectApprove.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
		}
		return btnViewLeaveappRejectApprove;
	}

	/**
	 * This method initializes btnViewLeaveappRejectFinish	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewLeaveappRejectFinish() {
		if (btnViewLeaveappRejectFinish == null) {
			btnViewLeaveappRejectFinish = new JButton();
			btnViewLeaveappRejectFinish.setText("Finish");
			btnViewLeaveappRejectFinish.setIcon(new ImageIcon(getClass().getResource("/image/info-icon.png")));
		}
		return btnViewLeaveappRejectFinish;
	}

	/**
	 * This method initializes btnViewLeaveappRejectReject	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewLeaveappRejectReject() {
		if (btnViewLeaveappRejectReject == null) {
			btnViewLeaveappRejectReject = new JButton();
			btnViewLeaveappRejectReject.setText("Reject");
			btnViewLeaveappRejectReject.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
		}
		return btnViewLeaveappRejectReject;
	}

	/**
	 * This method initializes pnTableViewLeaveappReject	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableViewLeaveappReject() {
		if (pnTableViewLeaveappReject == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.fill = GridBagConstraints.BOTH;
			gridBagConstraints6.gridy = 0;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.weighty = 1.0;
			gridBagConstraints6.gridx = 0;
			pnTableViewLeaveappReject = new JPanel();
			pnTableViewLeaveappReject.setLayout(new GridBagLayout());
			pnTableViewLeaveappReject.setBounds(new Rectangle(-1, 0, 1263, 344));
			pnTableViewLeaveappReject.add(getJScrollPane2(), gridBagConstraints6);
		}
		return pnTableViewLeaveappReject;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getTblLeaveappReject());
		}
		return jScrollPane2;
	}

	/**
	 * This method initializes tblLeaveappReject	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblLeaveappReject() {
		if (tblLeaveappReject == null) {
			tblLeaveappReject = new JTable();
		}
		return tblLeaveappReject;
	}

	/**
	 * This method initializes jScrollPane3	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getTblLeaveappFinish());
		}
		return jScrollPane3;
	}

	/**
	 * This method initializes tblLeaveappFinish	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblLeaveappFinish() {
		if (tblLeaveappFinish == null) {
			tblLeaveappFinish = new JTable();
		}
		return tblLeaveappFinish;
	}

}

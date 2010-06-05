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
	private JPanel jPanel = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel pnManager = null;
	private JPanel pnLeaveApp = null;
	private JTabbedPane jTabbedPane1 = null;
	private JPanel pnValid = null;
	private JPanel pnApprove = null;
	private JPanel pnReject = null;
	private JPanel pnFinish = null;
	private JTabbedPane jTabbedPane2 = null;
	private JPanel pnBusinessmanager = null;
	private JPanel pnManagerr = null;
	private JPanel pnEngineer = null;
	private JPanel pnReport = null;
	private JTabbedPane jTabbedPane3 = null;
	private JPanel pnReportmonth = null;
	private JPanel pnReportYear = null;
	private JButton btnAdduser = null;
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
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getBtnAdduser(), null);
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
	 * This method initializes mnManager	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnManager() {
		if (mnManager == null) {
			mnManager = new JMenu();
			mnManager.setText("Manager");
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
			jPanel.setBounds(new Rectangle(2, 184, 1105, 487));
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
			jTabbedPane.addTab("User Manager", new ImageIcon("D:/icon/Clients-icon.png"), getPnManager(), null);
			jTabbedPane.addTab("LeaveApp", null, getPnLeaveApp(), null);
			jTabbedPane.addTab("Report", null, getPnReport(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes pnManager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManager() {
		if (pnManager == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			pnManager = new JPanel();
			pnManager.setLayout(new GridBagLayout());
			pnManager.setToolTipText("");
			pnManager.add(getJTabbedPane2(), gridBagConstraints2);
		}
		return pnManager;
	}

	/**
	 * This method initializes pnLeaveApp	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnLeaveApp() {
		if (pnLeaveApp == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			pnLeaveApp = new JPanel();
			pnLeaveApp.setLayout(new GridBagLayout());
			pnLeaveApp.add(getJTabbedPane1(), gridBagConstraints1);
		}
		return pnLeaveApp;
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
			jTabbedPane1.addTab("ReJect", null, getPnReject(), null);
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
	 * This method initializes jTabbedPane2	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane2() {
		if (jTabbedPane2 == null) {
			jTabbedPane2 = new JTabbedPane();
			jTabbedPane2.addTab("Business Manager", null, getPnBusinessmanager(), null);
			jTabbedPane2.addTab("Manager", null, getPnManagerr(), null);
			jTabbedPane2.addTab("Engineer", null, getPnEngineer(), null);
		}
		return jTabbedPane2;
	}

	/**
	 * This method initializes pnBusinessmanager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnBusinessmanager() {
		if (pnBusinessmanager == null) {
			pnBusinessmanager = new JPanel();
			pnBusinessmanager.setLayout(new GridBagLayout());
		}
		return pnBusinessmanager;
	}

	/**
	 * This method initializes pnManagerr	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManagerr() {
		if (pnManagerr == null) {
			pnManagerr = new JPanel();
			pnManagerr.setLayout(new GridBagLayout());
		}
		return pnManagerr;
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

	/**
	 * This method initializes pnReport	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReport() {
		if (pnReport == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			pnReport = new JPanel();
			pnReport.setLayout(new GridBagLayout());
			pnReport.add(getJTabbedPane3(), gridBagConstraints3);
		}
		return pnReport;
	}

	/**
	 * This method initializes jTabbedPane3	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane3() {
		if (jTabbedPane3 == null) {
			jTabbedPane3 = new JTabbedPane();
			jTabbedPane3.addTab("Report Month", null, getPnReportmonth(), null);
			jTabbedPane3.addTab("Report Year", null, getPnReportYear(), null);
		}
		return jTabbedPane3;
	}

	/**
	 * This method initializes pnReportmonth	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnReportmonth() {
		if (pnReportmonth == null) {
			pnReportmonth = new JPanel();
			pnReportmonth.setLayout(new GridBagLayout());
		}
		return pnReportmonth;
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
	 * This method initializes btnAdduser	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdduser() {
		if (btnAdduser == null) {
			btnAdduser = new JButton();
			btnAdduser.setBounds(new Rectangle(1152, 220, 100, 32));
			btnAdduser.setText("Add USer");
		}
		return btnAdduser;
	}

}

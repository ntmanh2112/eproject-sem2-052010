package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManagingDirectorCPAddgroup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnFile = null;
	private JMenu mnManager = null;
	private JMenu mnView = null;
	private JMenu mnEdit = null;
	private JMenu mnHelp = null;
	private JMenuItem mniCreateLA = null;
	private JMenuItem mniReportmonth = null;
	private JMenuItem mniReportYeah = null;
	private JMenuItem mniLeaveAP = null;
	private JMenuItem mniHelpcontent = null;
	private JMenuItem mniAbout = null;
	private JMenuItem mniEditpassword = null;
	private JMenuItem mniEditProfile = null;
	private JMenuItem mniAdduser = null;
	private JMenuItem mniViewuser = null;
	private JLabel jLabel = null;
	private JComboBox cbxGroupname = null;
	private JScrollPane jScrollPane = null;
	private JTable tblUser = null;
	private JButton btnAdd = null;
	private JButton btnBLock = null;
	private JButton btnRefresh = null;
	private JButton btnExit = null;
	/**
	 * This is the default constructor
	 */
	public ManagingDirectorCPAddgroup() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(619, 302);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle(" Managing Diretor  Control Panel");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 3;
			gridBagConstraints8.weightx = 10.0D;
			gridBagConstraints8.gridy = 2;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 2;
			gridBagConstraints7.weightx = 10.0D;
			gridBagConstraints7.gridy = 2;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 1;
			gridBagConstraints6.weightx = 10.0D;
			gridBagConstraints6.gridy = 2;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.weightx = 10.0D;
			gridBagConstraints5.gridy = 2;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridwidth = 4;
			gridBagConstraints4.gridx = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.gridx = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			jLabel = new JLabel();
			jLabel.setText("Group name");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridx = 0;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(jLabel, gridBagConstraints1);
			jContentPane.add(getCbxGroupname(), gridBagConstraints2);
			jContentPane.add(getJScrollPane(), gridBagConstraints4);
			jContentPane.add(getBtnAdd(), gridBagConstraints5);
			jContentPane.add(getBtnBLock(), gridBagConstraints6);
			jContentPane.add(getBtnRefresh(), gridBagConstraints7);
			jContentPane.add(getBtnExit(), gridBagConstraints8);
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
			jJMenuBar.add(getMnFile());
			jJMenuBar.add(getMnManager());
			jJMenuBar.add(getMnView());
			jJMenuBar.add(getMnEdit());
			jJMenuBar.add(getMnHelp());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes mnFile	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu();
			mnFile.setText("File");
			mnFile.add(getMniCreateLA());
		}
		return mnFile;
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
			mnManager.add(getMniAdduser());
			mnManager.add(getMniViewuser());
		}
		return mnManager;
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
			mnView.add(getMniReportmonth());
			mnView.add(getMniReportYeah());
			mnView.add(getMniLeaveAP());
		}
		return mnView;
	}

	/**
	 * This method initializes mnEdit	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu();
			mnEdit.setText("Edit");
			mnEdit.add(getMniEditpassword());
			mnEdit.add(getMniEditProfile());
		}
		return mnEdit;
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
			mnHelp.add(getMniHelpcontent());
			mnHelp.add(getMniAbout());
		}
		return mnHelp;
	}

	/**
	 * This method initializes mniCreateLA	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniCreateLA() {
		if (mniCreateLA == null) {
			mniCreateLA = new JMenuItem();
			mniCreateLA.setText("Create LA");
		}
		return mniCreateLA;
	}

	/**
	 * This method initializes mniReportmonth	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniReportmonth() {
		if (mniReportmonth == null) {
			mniReportmonth = new JMenuItem();
			mniReportmonth.setText("Report Month");
		}
		return mniReportmonth;
	}

	/**
	 * This method initializes mniReportYeah	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniReportYeah() {
		if (mniReportYeah == null) {
			mniReportYeah = new JMenuItem();
			mniReportYeah.setText("Report Year");
		}
		return mniReportYeah;
	}

	/**
	 * This method initializes mniLeaveAP	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniLeaveAP() {
		if (mniLeaveAP == null) {
			mniLeaveAP = new JMenuItem();
			mniLeaveAP.setText("View Leave AP");
		}
		return mniLeaveAP;
	}

	/**
	 * This method initializes mniHelpcontent	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniHelpcontent() {
		if (mniHelpcontent == null) {
			mniHelpcontent = new JMenuItem();
			mniHelpcontent.setText("Help Content");
		}
		return mniHelpcontent;
	}

	/**
	 * This method initializes mniAbout	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniAbout() {
		if (mniAbout == null) {
			mniAbout = new JMenuItem();
			mniAbout.setText("About");
		}
		return mniAbout;
	}

	/**
	 * This method initializes mniEditpassword	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniEditpassword() {
		if (mniEditpassword == null) {
			mniEditpassword = new JMenuItem();
			mniEditpassword.setText("Edit Password");
		}
		return mniEditpassword;
	}

	/**
	 * This method initializes mniEditProfile	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniEditProfile() {
		if (mniEditProfile == null) {
			mniEditProfile = new JMenuItem();
			mniEditProfile.setText("Edit Profile");
		}
		return mniEditProfile;
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
		}
		return mniAdduser;
	}

	/**
	 * This method initializes mniViewuser	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewuser() {
		if (mniViewuser == null) {
			mniViewuser = new JMenuItem();
			mniViewuser.setText("View User");
		}
		return mniViewuser;
	}

	/**
	 * This method initializes cbxGroupname	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxGroupname() {
		if (cbxGroupname == null) {
			cbxGroupname = new JComboBox();
		}
		return cbxGroupname;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTblUser());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tblUser	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblUser() {
		if (tblUser == null) {
			tblUser = new JTable();
		}
		return tblUser;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add ");
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnBLock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnBLock() {
		if (btnBLock == null) {
			btnBLock = new JButton();
			btnBLock.setText("Block");
		}
		return btnBLock;
	}

	/**
	 * This method initializes btnRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnRefresh() {
		if (btnRefresh == null) {
			btnRefresh = new JButton();
			btnRefresh.setText("Refresh");
		}
		return btnRefresh;
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
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

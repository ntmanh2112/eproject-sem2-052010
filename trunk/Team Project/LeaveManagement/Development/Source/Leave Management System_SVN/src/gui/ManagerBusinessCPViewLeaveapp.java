package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import business.LeaveappService;

public class ManagerBusinessCPViewLeaveapp extends JFrame {

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
	private JButton btnApprove = null;
	private JButton btnReject = null;
	private JButton btnRefresh = null;
	private JButton btnExit = null;
	private JLabel lbStatus = null;
	private JComboBox cbxLeaveapp = null;
	private JButton btnView = null;
	private JScrollPane jScrollPane = null;
	private JTable tblLeave = null;
	LeaveappService service = new LeaveappService();  //  @jve:decl-index=0:
	private String[][]data1 = null;
	private String[] column = {"ID","Full Name","Date From","Date to","Reason","Status ","Address","Phone"};
	/**
	 * This is the default constructor
	 */
	public ManagerBusinessCPViewLeaveapp() {
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
		this.setTitle("Business Manager Control Panel");
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getSize();
		Dimension dialogSize = this.getSize();
		this.setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/5);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridwidth = 4;
			gridBagConstraints4.gridx = 0;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 2;
			gridBagConstraints31.gridy = 0;
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints21.gridy = 0;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.gridy = 0;
			lbStatus = new JLabel();
			lbStatus.setText("Status Leaveapp");
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 3;
			gridBagConstraints3.weightx = 10.0D;
			gridBagConstraints3.gridy = 2;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.weightx = 10.0D;
			gridBagConstraints2.gridy = 2;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.weightx = 10.0D;
			gridBagConstraints1.gridy = 2;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.weightx = 10.0D;
			gridBagConstraints.gridy = 2;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getBtnApprove(), gridBagConstraints);
			jContentPane.add(getBtnReject(), gridBagConstraints1);
			jContentPane.add(getBtnRefresh(), gridBagConstraints2);
			jContentPane.add(getBtnExit(), gridBagConstraints3);
			jContentPane.add(lbStatus, gridBagConstraints11);
			jContentPane.add(getCbxLeaveapp(), gridBagConstraints21);
			jContentPane.add(getBtnView(), gridBagConstraints31);
			jContentPane.add(getJScrollPane(), gridBagConstraints4);
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
			mniCreateLA.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new CreateLeaveapp(new ManagerBusinessCPViewLeaveapp()).setVisible(true);
				}
			});
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
			mniReportmonth.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new ManagerBusinessCPViewReportMonth().setVisible(true);
					
				}
			});
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
			mniReportYeah.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new ManagerBusinessCPViewReportYear().setVisible(true);
					
				}
			});
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
			mniLeaveAP.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new ManagerBusinessCPViewLeaveapp().setVisible(true);
					
				}
			});
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
			mniAbout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new About(new ManagerBusinessCPViewLeaveapp()).setVisible(true);
				}
			});
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
			mniEditpassword.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Changepassword(new ManagerBusinessCPViewLeaveapp()).setVisible(true);
				}
			});
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
			mniEditProfile.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Editprofile(new ManagerBusinessCPViewLeaveapp()).setVisible(true);
				}
			});
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
			mniAdduser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Addmember(new ManagerBusinessCPViewReportMonth()).setVisible(true);
				}
			});
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
			mniViewuser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new ManagerBusinessCPViewUser().setVisible(true);
				
				}
			});
		}
		return mniViewuser;
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
		}
		return btnReject;
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
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ManagerBusinessCPViewLeaveapp.this.dispose();
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes cbxLeaveapp	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxLeaveapp() {
		if (cbxLeaveapp == null) {
			String[] data = {"valid","approve","reject","finish"};
			cbxLeaveapp = new JComboBox(data);
		}
		return cbxLeaveapp;
	}

	/**
	 * This method initializes btnView	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton();
			btnView.setText("View");
		}
		return btnView;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getTblLeave());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tblLeave	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblLeave() {
		
		if (tblLeave == null) {
				try{
					service.selectLeaveapp();
					tblLeave = new JTable(data1, column);
				}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Co loi");
				}
		}
		return tblLeave;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

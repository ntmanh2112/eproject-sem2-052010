package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.User;
import business.UserService;

public class ManagerCPViewUser extends JFrame {

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
	private JScrollPane jScrollPane = null;
	private JTable tblUser = null;
	private JButton btnAdd = null;
	private JButton btnLock = null;
	private JButton btnRefresh = null;
	UserService service = new UserService();  //  @jve:decl-index=0:
	private String[][]data = null;
	private String[] column = {"ID","UserName","Status","Position","FullName","Birthday","Address","Gender","Phone","Email"};
	private JButton btnExit = null;
	private JComboBox cbxGroup = null;
	/**
	 * This is the default constructor
	 */
	public ManagerCPViewUser() {
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
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints8.gridy = 3;
			gridBagConstraints8.weightx = 10.0D;
			gridBagConstraints8.gridx = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 4;
			gridBagConstraints1.weightx = 10.0D;
			gridBagConstraints1.gridy = 2;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 3;
			gridBagConstraints7.weightx = 10.0D;
			gridBagConstraints7.gridy = 2;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 2;
			gridBagConstraints6.weightx = 10.0D;
			gridBagConstraints6.gridy = 2;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 1;
			gridBagConstraints5.weightx = 10.0D;
			gridBagConstraints5.gridy = 2;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridwidth = 4;
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridx = 0;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getJScrollPane(), gridBagConstraints4);
			jContentPane.add(getBtnAdd(), gridBagConstraints5);
			jContentPane.add(getBtnLock(), gridBagConstraints6);
			jContentPane.add(getBtnRefresh(), gridBagConstraints7);
			jContentPane.add(getBtnExit(), gridBagConstraints1);
			jContentPane.add(getCbxGroup(), gridBagConstraints8);
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
					new CreateLeaveapp(new ManagerCPViewUser()).setVisible(true);
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
					new ManagingDirectorCPViewReportMonth().setVisible(true);
					
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
					new ManagingDirectorCPViewReportYear().setVisible(true);
					
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
					new ManagingDirectorCPViewLeaveappValid().setVisible(true);
					
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
					new About(new ManagerCPViewUser()).setVisible(true);
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
					new Changepassword(new ManagerCPViewUser()).setVisible(true);
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
					new Editprofile(new ManagerCPViewUser()).setVisible(true);
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
					new Addmember(new ManagerCPViewUser()).setVisible(true);
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
			try{
				data = service.selectAllUserMD();
				tblUser = new JTable(data, column);
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Co loi");
			}
			
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
			btnAdd.setText("Add  Group");
			btnAdd.addActionListener(new java.awt.event.ActionListener() {   
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					int i = tblUser.getSelectedRow();
					int count = tblUser.getSelectedRowCount();
					String position_name = null;
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						
							User user = new User();
							if(cbxGroup.getSelectedItem().toString().equalsIgnoreCase(user.getPosition_name().toString())){
								JOptionPane.showMessageDialog(null, "trung position");
							}
							else {
								
							
						
							}
					
					}
				}
			
			});
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
			btnLock.setText("Lock User");
			btnLock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblUser.getSelectedRow();
					int count = tblUser.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+btnLock.getText() +" this User??","Lock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblUser.getValueAt(i, 0).toString()));
							user.setStatus(tblUser.getValueAt(i, 2).toString());
							try{
								service.blockUser(user);
								if (btnLock.getText() == "Lock"){
									btnLock.setText("Unlock");
								}else{
									btnLock.setText("Lock");
								}
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "Co loi");
							}
						}
					}
				}
				
			});
		}
		return btnLock;
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
					ManagerCPViewUser.this.dispose();
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes cbxGroup	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxGroup() {
		if (cbxGroup == null) {
			String[] data = {"","Engineer","Manager","Business Manager"};
			cbxGroup = new JComboBox(data);
		}
		return cbxGroup;
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
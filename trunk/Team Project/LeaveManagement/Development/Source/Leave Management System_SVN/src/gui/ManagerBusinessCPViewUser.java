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

import model.User;
import business.UserService;

public class ManagerBusinessCPViewUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnFile = null;
	private JMenu mnManager = null;
	private JMenu mnEdit = null;
	private JMenu mnHelp = null;
	private JMenuItem mniCreateLA = null;
	private JMenuItem mniHelpcontent = null;
	private JMenuItem mniAbout = null;
	private JMenuItem mniEditpassword = null;
	private JMenuItem mniEditProfile = null;
	private JMenuItem mniAdduser = null;
	private JMenuItem mniViewuser = null;
	private JButton btnAdduser = null;
	private JButton btnEdit = null;
	private JButton btnBlock = null;
	private JButton btnRefresh = null;
	private JButton btnExit = null;
	private JScrollPane jScrollPane = null;
	private int id = 0;
	private User user = new User();
	private JTable tblUser = null;
	UserService service = new UserService();  //  @jve:decl-index=0:
	private String[][]data = null;
	private String[] column = {"ID","UserName","Status","Position","FullName","Birthday","Address","Gender","Phone","Email"};
	/**
	 * This is the default constructor
	 */
	public ManagerBusinessCPViewUser() {
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
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.BOTH;
			gridBagConstraints7.gridy = 0;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.weighty = 1.0;
			gridBagConstraints7.gridwidth = 5;
			gridBagConstraints7.gridx = 0;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 4;
			gridBagConstraints5.weightx = 10.0D;
			gridBagConstraints5.gridy = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.weightx = 10.0D;
			gridBagConstraints4.gridy = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.weightx = 10.0D;
			gridBagConstraints2.gridy = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.weightx = 10.0D;
			gridBagConstraints1.gridy = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.weightx = 10.0D;
			gridBagConstraints.gridy = 1;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getBtnAdduser(), gridBagConstraints);
			jContentPane.add(getBtnEdit(), gridBagConstraints1);
			jContentPane.add(getBtnBlock(), gridBagConstraints2);
			jContentPane.add(getBtnRefresh(), gridBagConstraints4);
			jContentPane.add(getBtnExit(), gridBagConstraints5);
			jContentPane.add(getJScrollPane(), gridBagConstraints7);
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
					new CreateLeaveapp(new ManagerBusinessCPViewUser()).setVisible(true);
				}
			});
		}
		return mniCreateLA;
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
					new About(new ManagerBusinessCPViewUser()).setVisible(true);
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
					new Changepassword(new ManagerBusinessCPViewUser()).setVisible(true);
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
					new Editprofile(new ManagerBusinessCPViewUser()).setVisible(true);
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
					new Addmember(new ManagerBusinessCPViewUser()).setVisible(true);
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
	 * This method initializes btnAdduser	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdduser() {
		if (btnAdduser == null) {
			btnAdduser = new JButton();
			btnAdduser.setText("Add");
			btnAdduser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Addmember(new ManagerBusinessCPViewUser()).setVisible(true);
				}
			});
			
		}
		return btnAdduser;
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
			btnEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblUser.getSelectedRowCount();
					int i = tblUser.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblUser.getValueAt(i, 0).toString());
						try{
							new Editprofile(new ManagerBusinessCPViewUser(),id).setVisible(true);
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnBlock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnBlock() {
		if (btnBlock == null) {
			btnBlock = new JButton();
			btnBlock.setText("Lock");
			btnBlock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblUser.getSelectedRow();
					int count = tblUser.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+btnBlock.getText() +" this User??","Lock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblUser.getValueAt(i, 0).toString()));
							user.setStatus(tblUser.getValueAt(i, 2).toString());
							try{
								service.lockUser(user);
								if (btnBlock.getText() == "Lock"){
									btnBlock.setText("Unlock");
								}else{
									btnBlock.setText("Lock");
								}
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		return btnBlock;
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
					ManagerBusinessCPViewUser.this.dispose();
				}
			});
		}
		return btnExit;
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
				data = service.selectAllUserBM();
				tblUser = new JTable(data, column);
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Co loi");
			}
			
		}
		return tblUser;
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"

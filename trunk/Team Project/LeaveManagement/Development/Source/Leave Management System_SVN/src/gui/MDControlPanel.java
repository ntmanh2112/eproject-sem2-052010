package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import common.ConnectionDB;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;




import model.Leaveapp;
import model.User;
import business.LeaveappService;
import business.UserService;



public class MDControlPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbUserinformation = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnUser = null;
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
	private JButton btnChangepass = null;
	private JButton btnEditProfile = null;
	private JButton btnCreatleaveapp = null;
	private JButton btnLogout = null;
	private JPanel jPanel = null;
	private JTabbedPane jtpnManager = null;
	private JPanel jpnHistory = null;
	private JPanel jpnLeaveapp = null;
	private JPanel jpmUsermanager = null;
	private JTabbedPane jtpnUsermanager = null;
	private JPanel jpnBusinessmanager = null;
	private JPanel jpnManager = null;
	private JPanel jpnEngineer = null;
	private JTabbedPane jtbnLeaveapp = null;
	private JPanel jpnValid = null;
	private JPanel jpnApprove = null;
	private JPanel jpnReject = null;
	private JPanel jpnFinish = null;
	private JMenuItem mniEditprofile = null;
	private JMenuItem mniChangepass = null;
	private JMenuItem mniCreatleaveapp = null;
	private JMenuItem mniViewManagerleaveapp = null;
	private JMenuItem mniSignout = null;
	private JMenuItem mniAdduser = null;
	private JButton btnApprove = null;
	private JButton btnReject = null;
	private JPanel pnUser = null;
	private JScrollPane jScrollPane = null;
	private JTable tblLeaveappValid = null;
	private JButton btnViewApprovereject = null;
	private JButton btnViewApprovefinish = null;
	private JPanel pnTableViewLeaveApp = null;
	private JScrollPane jScrollPane1 = null;
	private JTable tblLeaveappApprove = null;
	private JButton btnViewLeaveappRejectApprove = null;
	private JButton btnViewLeaveappRejectReFresh = null;
	private JPanel pnTableViewLeaveappReject = null;
	private JScrollPane jScrollPane2 = null;
	private JTable tblLeaveappReject = null;
	private JScrollPane jScrollPane3 = null;
	private JTable tblLeaveappFinish = null;
	private JButton btnViewBusinessEdit = null;
	private JButton btnViewBusinessLock = null;
	private JPanel pnTableBusinessManager = null;
	private JScrollPane jScrollPane4 = null;
	private JTable tblBusinessManager = null;
	private JPanel pnManager = null;
	private JButton btnViewManagerEdit = null;
	private JButton btnViewManagerLock = null;
	private JScrollPane jScrollPane5 = null;
	private JTable tblManager = null;
	private JPanel pnEngineer = null;
	private JButton btnViewEngineerEdit = null;
	private JButton btnViewEngineerLock = null;
	private JScrollPane jScrollPane6 = null;
	private JTable tblEngineer = null;
	private JButton btnCreatLeaveAppSystem = null;
	private JLabel lbTotalLeave = null;
	private JLabel lbDaycanLeave = null;
	private JLabel lbDaycannotLeave = null;
	User user = new User();
	UserService userservice = new UserService();  //  @jve:decl-index=0:
	Leaveapp leaveapp = new Leaveapp();  //  @jve:decl-index=0:
	private int id = 0;
	LeaveappService leaveappservice = new LeaveappService();  //  @jve:decl-index=0:
	private String[][]data = null;
	private String[] column = {"ID","UserName","Status","Position","FullName","Birthday","Address","Gender","Phone","Email"};
	private String[][]data1 = null;
	private String[] column1 = {"ID_LEAVE","FullName","DateFrom","Dateto","Reason","Status","Address","Phone"};
	private String[][]datah = null;
	private String[] columnh = {"FullName","DateFrom","Dateto","Reason","Status","Address","Phone"};
	private String[][]dataday = null;
	private String[] columnday = {"DateFrom","Dateto","Reason"};
	private JPanel pnUserlock = null;
	private JPanel pnTableUserlock = null;
	private JScrollPane jScrollPane7 = null;
	private JTable tblUserlock = null;
	private JButton btnUnlock = null;
	private JButton btnEdit = null;
	private JLabel lbTotalnotapproveleave = null;
	private JTextField txtTotalApprovalLeave = null;
	private JTextField txtTotalNotApproveleave = null;
	private JButton btnRefresh = null;
	private JMenu mnModeration = null;
	private JMenu mnView = null;
	private JMenu mnHelp = null;
	private JMenuItem mnHelpcontent = null;
	private JMenuItem mnAbout = null;
	private JMenuItem mnViewUserManager = null;
	private JMenuItem mnViewHistory = null;
	private JTextField txtTotaldaycanleave = null;
	private JTextField txtTotaldaycannotleave = null;
	private JLabel lbHistory = null;
	private JLabel lbDayoff = null;
	private JPanel pnTableDayoff = null;
	private JButton btnViewUserunlockRefresh = null;
	private JButton btnViewEnginerrRefresh = null;
	private JButton btnViewApproveFrefresh = null;
	private JButton btnViewValidRefresh = null;
	private JButton btnViewBusinessmanagerAddgroup = null;
	private JComboBox cbxViewBusinessmanager = null;
	private JButton btnViewManagerRefresh = null;
	private JButton btnViewManagerAddgroup = null;
	private JComboBox cbxViewManager = null;
	private JButton btnViewEngineerAddgroup = null;
	private JComboBox cbxViewEngineer = null;
	private JLabel lbMyLeaveApp = null;
	private JPanel pnTableMyLeaveApp = null;
	private common.TableModel tableModel = new common.TableModel(data, column);
	private common.TableModel tableModelLeaveapp = new common.TableModel(data1, column1);
	
	private common.TableModel tableModelHistory = new common.TableModel(datah, columnh);
	private common.TableModel tableModelDayoff = new common.TableModel(dataday, columnday);
	private JScrollPane jScrollPane9 = null;
	private JTable tblMyleaveapp = null;
	private JScrollPane tblDayofSystem = null;
	private JTable tblDayOfSystem = null;
	private JMenuItem mnExportReport = null;
	/**
	 * This is the default constructor
	 */
	public MDControlPanel() {
		
		super();
		initialize();
		
	}
	public MDControlPanel(int id){
		super();
		this.id = id;
		this.user = userservice.loadUser(id);
		initialize();
		
	}
	


	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setEnabled(true);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Administrator-icon.png")));
		this.setJMenuBar(getJJMenuBar());
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Welcome to Managing Director");
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
			jContentPane.add(getBtnAdduser(), null);
			jContentPane.add(getBtnChangepass(), null);
			jContentPane.add(getBtnEditProfile(), null);
			jContentPane.add(getBtnCreatleaveapp(), null);
			jContentPane.add(getBtnLogout(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getBtnCreatLeaveAppSystem(), null);
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
			jJMenuBar.setBackground(Color.lightGray);
			jJMenuBar.setBorder(null);
			jJMenuBar.setAutoscrolls(true);
			jJMenuBar.setBackground(new Color(204, 204, 204));
			jJMenuBar.add(getMnUser());
			jJMenuBar.add(getMnModeration());
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
			mnUser.setIcon(new ImageIcon(getClass().getResource("/image/Preppy-icon.png")));
			mnUser.add(getMniEditprofile());
			mnUser.add(getMniChangepass());
			mnUser.add(getMniCreatleaveapp());
			mnUser.add(getMniSignout());
		}
		return mnUser;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField(user.getUsername());
			txtUsername.setLocation(new Point(105, 44));
			txtUsername.setEnabled(false);
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
			txtFullname = new JTextField(user.getFullname());
			txtFullname.setLocation(new Point(105, 83));
			txtFullname.setEnabled(false);
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
			txtPosition = new JTextField(user.getPosition_name());
			txtPosition.setLocation(new Point(105, 120));
			txtPosition.setEnabled(false);
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
			txtBirthday = new JTextField(user.getBirthday().toString());
			txtBirthday.setLocation(new Point(105, 158));
			txtBirthday.setEnabled(false);
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
			txtPhone = new JTextField(user.getPhone());
			txtPhone.setLocation(new Point(406, 44));
			txtPhone.setEnabled(false);
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
			txtGender = new JTextField(user.getGender());
			txtGender.setLocation(new Point(406, 83));
			txtGender.setEnabled(false);
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
			txtAddress = new JTextField(user.getAddress());
			txtAddress.setLocation(new Point(406, 120));
			txtAddress.setEnabled(false);
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
			txtEmail = new JTextField(user.getEmail());
			txtEmail.setLocation(new Point(406, 158));
			txtEmail.setEnabled(false);
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
			btnAdduser.setText("Add User");
			btnAdduser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Addmember(null).setVisible(true);
				}
			});
		}
		return btnAdduser;
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
			btnChangepass.setIcon(new ImageIcon(getClass().getResource("/image/changepass.jpg")));
			btnChangepass.setLocation(new Point(632, 30));
			btnChangepass.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Changepassword(null,id).setVisible(true);
				}
			});
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
			btnEditProfile.setIcon(new ImageIcon(getClass().getResource("/image/Edit-icon.png")));
			btnEditProfile.setSize(new Dimension(138, 40));
			btnEditProfile.setLocation(new Point(632, 90));
			btnEditProfile.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {		
					new Editprofile(null,id).setVisible(true);
				}
				
			});
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
			btnCreatleaveapp.setIcon(new ImageIcon(getClass().getResource("/image/Emp.png")));
			btnCreatleaveapp.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new CreateLeaveapp(null,id).setVisible(true);
				}
			});
		}
		return btnCreatleaveapp;
	}

	/**
	 * This method initializes btnLogout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton();
			btnLogout.setLocation(new Point(990, 30));
			btnLogout.setText("Sign Out");
			btnLogout.setIcon(new ImageIcon(getClass().getResource("/image/Log-Out-icon.png")));
			btnLogout.setSize(new Dimension(151, 40));
			btnLogout.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
					System.exit(1);
					}
				}
			});
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
			jPanel.add(getJtpnManager(), gridBagConstraints);
		}
		return jPanel;
	}

	/**
	 * This method initializes jtpnManager	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtpnManager() {
		if (jtpnManager == null) {
			jtpnManager = new JTabbedPane();
			jtpnManager.addTab("History", new ImageIcon(getClass().getResource("/image/data-server-icon.png")), getJpnHistory(), null);
			jtpnManager.addTab("Manager LeaveApp", new ImageIcon(getClass().getResource("/image/Attach-icon.png")), getJpnLeaveapp(), null);
			jtpnManager.addTab("User Manager", new ImageIcon(getClass().getResource("/image/user-group-icon.png")), getJpmUsermanager(), "");
		}
		return jtpnManager;
	}

	/**
	 * This method initializes jpnHistory	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnHistory() {
		if (jpnHistory == null) {
			lbMyLeaveApp = new JLabel();
			lbMyLeaveApp.setText("My LeaveApp");
			lbMyLeaveApp.setSize(new Dimension(187, 43));
			lbMyLeaveApp.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbMyLeaveApp.setLocation(new Point(371, 5));
			lbDayoff = new JLabel();
			lbDayoff.setBounds(new Rectangle(371, 216, 230, 43));
			lbDayoff.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbDayoff.setText("Day Off System");
			lbHistory = new JLabel();
			lbHistory.setBounds(new Rectangle(14, 4, 91, 31));
			lbHistory.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbHistory.setText("History");
			lbTotalnotapproveleave = new JLabel();
			lbTotalnotapproveleave.setText("Total not approval leave ");
			lbTotalnotapproveleave.setSize(new Dimension(155, 32));
			lbTotalnotapproveleave.setLocation(new Point(15, 105));
			lbDaycannotLeave = new JLabel();
			lbDaycannotLeave.setText("Total day can not leave");
			lbDaycannotLeave.setSize(new Dimension(155, 32));
			lbDaycannotLeave.setLocation(new Point(15, 223));
			lbDaycanLeave = new JLabel();
			lbDaycanLeave.setText("Total day can leave");
			lbDaycanLeave.setSize(new Dimension(155, 32));
			lbDaycanLeave.setLocation(new Point(15, 164));
			lbTotalLeave = new JLabel();
			lbTotalLeave.setText("Total approval leave ");
			lbTotalLeave.setSize(new Dimension(155, 32));
			lbTotalLeave.setLocation(new Point(15, 45));
			jpnHistory = new JPanel();
			jpnHistory.setLayout(null);
			jpnHistory.add(lbTotalLeave, null);
			jpnHistory.add(lbDaycanLeave, null);
			jpnHistory.add(lbDaycannotLeave, null);
			jpnHistory.add(lbTotalnotapproveleave, null);
			jpnHistory.add(getTxtTotalApprovalLeave(), null);
			jpnHistory.add(getTxtTotalNotApproveleave(), null);
			jpnHistory.add(getTxtTotaldaycanleave(), null);
			jpnHistory.add(getTxtTotaldaycannotleave(), null);
			jpnHistory.add(lbHistory, null);
			jpnHistory.add(lbDayoff, null);
			jpnHistory.add(getPnTableDayoff(), null);
			jpnHistory.add(lbMyLeaveApp, null);
			jpnHistory.add(getPnTableMyLeaveApp(), null);
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
			gridBagConstraints1.gridwidth = 2;
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
			jtpnUsermanager.addTab("User Lock", null, getPnUserlock(), null);
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
			jpnBusinessmanager.setLayout(null);
			jpnBusinessmanager.add(getPnTableBusinessManager(), null);
			jpnBusinessmanager.add(getBtnViewBusinessEdit(), null);
			jpnBusinessmanager.add(getBtnViewBusinessLock(), null);
			jpnBusinessmanager.add(getBtnRefresh(), null);
			jpnBusinessmanager.add(getBtnViewBusinessmanagerAddgroup(), null);
			jpnBusinessmanager.add(getCbxViewBusinessmanager(), null);
			jpnBusinessmanager.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data = userservice.selectAllUserBM();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			jpnManager.setLayout(null);
			jpnManager.add(getPnManager(), null);
			jpnManager.add(getBtnViewManagerEdit(), null);
			jpnManager.add(getBtnViewManagerLock(), null);
			jpnManager.add(getBtnViewManagerRefresh(), null);
			jpnManager.add(getBtnViewManagerAddgroup(), null);
			jpnManager.add(getCbxViewManager(), null);
			jpnManager.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data = userservice.selectAllUserM();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			jpnEngineer.setLayout(null);
			jpnEngineer.add(getPnEngineer(), null);
			jpnEngineer.add(getBtnViewEngineerEdit(), null);
			jpnEngineer.add(getBtnViewEngineerLock(), null);
			jpnEngineer.add(getBtnViewEnginerrRefresh(), null);
			jpnEngineer.add(getBtnViewEngineerAddgroup(), null);
			jpnEngineer.add(getCbxViewEngineer(), null);
			jpnEngineer.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data = userservice.selectAllUserE();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		return jpnEngineer;
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
			jpnValid.add(getPnUser(), null);
			jpnValid.add(getBtnReject(), null);
			jpnValid.add(getBtnApprove(), null);
			jpnValid.add(getBtnViewValidRefresh(), null);
			jpnValid.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDvalid();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			jpnApprove.add(getPnTableViewLeaveApp(), null);
			jpnApprove.add(getBtnViewApprovefinish(), null);
			jpnApprove.add(getBtnViewApprovereject(), null);
			jpnApprove.add(getBtnViewApproveFrefresh(), null);
			jpnApprove.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDapprove();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			jpnReject.add(getPnTableViewLeaveappReject(), null);
			jpnReject.add(getBtnViewLeaveappRejectApprove(), null);
			jpnReject.add(getBtnViewLeaveappRejectReFresh(), null);
			jpnReject.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDreject();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			jpnFinish.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDfinish();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
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
			mniEditprofile.setIcon(new ImageIcon(getClass().getResource("/image/Edit-icon.png")));
			mniEditprofile.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Editprofile(null,id).setVisible(true);
				}
			});
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
			mniChangepass.setIcon(new ImageIcon(getClass().getResource("/image/changepass.jpg")));
			mniChangepass.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Changepassword(null).setVisible(true);
				}
			});
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
			mniCreatleaveapp.setIcon(new ImageIcon(getClass().getResource("/image/Emp.png")));
			mniCreatleaveapp.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new CreateLeaveapp(null).setVisible(true);
				}
			});
		}
		return mniCreatleaveapp;
	}

	/**
	 * This method initializes mniViewManagerleaveapp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewManagerleaveapp() {
		if (mniViewManagerleaveapp == null) {
			mniViewManagerleaveapp = new JMenuItem();
			mniViewManagerleaveapp.setText("View Manager Leave App");
			mniViewManagerleaveapp.setIcon(new ImageIcon(getClass().getResource("/image/report.png")));
			mniViewManagerleaveapp.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jtpnManager.setSelectedIndex(1);
				}
			});
		}
		return mniViewManagerleaveapp;
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
			mniSignout.setIcon(new ImageIcon(getClass().getResource("/image/Log-Out-icon.png")));
			mniSignout.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
					System.exit(1);
					}
				}
			});
		}return  mniSignout; 
			
			/*mniSignout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					MDControlPanel.this.dispose();
				}
			});*/
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
			mniAdduser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Addmember(null).setVisible(true);
				}
			});
		}
		return mniAdduser;
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
			btnApprove.setLocation(new Point(22, 328));
			btnApprove.setSize(new Dimension(159, 45));
			btnApprove.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnApprove.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblLeaveappValid.getSelectedRow();
					int count = tblLeaveappValid.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one leave app");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblLeaveappValid.getValueAt(i, 1) +" this LeaveApp??","Approve LeaveApp",JOptionPane.YES_NO_OPTION) == 0){
							Leaveapp leaveapp = new Leaveapp();
							leaveapp.setId_leaveapp(Integer.parseInt(tblLeaveappValid.getValueAt(i, 0).toString()));
							try{
								leaveappservice.approveLeaveApp(leaveapp);
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
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
			btnReject.setLocation(new Point(211, 328));
			btnReject.setSize(new Dimension(159, 45));
			btnReject.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
			btnReject.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblLeaveappValid.getSelectedRow();
					int count = tblLeaveappValid.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one leave app");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblLeaveappValid.getValueAt(i, 1) +" this LeaveApp??","Reject LeaveApp",JOptionPane.YES_NO_OPTION) == 0){
							Leaveapp leaveapp = new Leaveapp();
							leaveapp.setId_leaveapp(Integer.parseInt(tblLeaveappValid.getValueAt(i, 0).toString()));
							try{
								leaveappservice.rejectLeaveApp(leaveapp);
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		return btnReject;
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
			pnUser.setBounds(new Rectangle(0, -1, 1261, 327));
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
			try{
				
				data1 = leaveappservice.selectLeaveappMDvalid();
				tableModelLeaveapp.setData(data1);
				tblLeaveappValid = new JTable(tableModelLeaveapp){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		return tblLeaveappValid;
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
			btnViewApprovereject.setLocation(new Point(22, 328));
			btnViewApprovereject.setSize(new Dimension(159, 45));
			btnViewApprovereject.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
			btnViewApprovereject.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblLeaveappApprove.getSelectedRow();
					int count = tblLeaveappApprove.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one leave app");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblLeaveappValid.getValueAt(i, 1) +" this LeaveApp??","Reject LeaveApp",JOptionPane.YES_NO_OPTION) == 0){
							Leaveapp leaveapp = new Leaveapp();
							leaveapp.setId_leaveapp(Integer.parseInt(tblLeaveappApprove.getValueAt(i, 0).toString()));
							try{
								leaveappservice.rejectLeaveApp(leaveapp);
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
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
			btnViewApprovefinish.setLocation(new Point(211, 328));
			btnViewApprovefinish.setSize(new Dimension(159, 45));
			btnViewApprovefinish.setIcon(new ImageIcon(getClass().getResource("/image/info-icon.png")));
			btnViewApprovefinish.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblLeaveappApprove.getSelectedRow();
					int count = tblLeaveappApprove.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one leave app");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblLeaveappApprove.getValueAt(i, 1) +" this LeaveApp??","Approve LeaveApp",JOptionPane.YES_NO_OPTION) == 0){
							Leaveapp leaveapp = new Leaveapp();
							leaveapp.setId_leaveapp(Integer.parseInt(tblLeaveappApprove.getValueAt(i, 0).toString()));
							try{
								leaveappservice.finishLeaveApp(leaveapp);
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
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
			pnTableViewLeaveApp.setBounds(new Rectangle(0, 1, 1263, 322));
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
			try{
				data1 = leaveappservice.selectLeaveappMDapprove();
				tableModelLeaveapp.setData(data1);
				tblLeaveappApprove = new JTable(tableModelLeaveapp){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error");
			}
		}
		return tblLeaveappApprove;
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
			btnViewLeaveappRejectApprove.setLocation(new Point(22, 328));
			btnViewLeaveappRejectApprove.setSize(new Dimension(159, 45));
			btnViewLeaveappRejectApprove.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnViewLeaveappRejectApprove
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							int i = tblLeaveappReject.getSelectedRow();
							int count = tblLeaveappReject.getSelectedRowCount();
							if(count != 1){
								JOptionPane.showMessageDialog(null, "Please select only one leave app");
							}else{
								if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblLeaveappReject.getValueAt(i, 1) +" this LeaveApp??","Approve LeaveApp",JOptionPane.YES_NO_OPTION) == 0){
									Leaveapp leaveapp = new Leaveapp();
									leaveapp.setId_leaveapp(Integer.parseInt(tblLeaveappReject.getValueAt(i, 0).toString()));
									try{
										leaveappservice.approveLeaveApp(leaveapp);
									}catch (Exception ex) {
										ex.printStackTrace();
										JOptionPane.showMessageDialog(null, "error");
									}
								}
							}
						}
					});
				}
		return btnViewLeaveappRejectApprove;
	}

	/**
	 * This method initializes btnViewLeaveappRejectReFresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewLeaveappRejectReFresh() {
		if (btnViewLeaveappRejectReFresh == null) {
			btnViewLeaveappRejectReFresh = new JButton();
			btnViewLeaveappRejectReFresh.setText("Refresh");
			btnViewLeaveappRejectReFresh.setLocation(new Point(211, 328));
			btnViewLeaveappRejectReFresh.setSize(new Dimension(159, 45));
			btnViewLeaveappRejectReFresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewLeaveappRejectReFresh.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							try{
								data1 = leaveappservice.selectLeaveappMDreject();
								tableModelLeaveapp.setData(data1);
							}catch (Exception ex) {
								ex.printStackTrace();
							}
						}
					});
		}
		return btnViewLeaveappRejectReFresh;
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
			pnTableViewLeaveappReject.setBounds(new Rectangle(-1, 0, 1263, 325));
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
			try{
				data1 = leaveappservice.selectLeaveappMDreject();
				tableModelLeaveapp.setData(data1);
				tblLeaveappReject = new JTable(tableModelLeaveapp){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error");
			}
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
			try{
				data1 = leaveappservice.selectLeaveappMDfinish();
				tableModelLeaveapp.setData(data1);
				tblLeaveappFinish = new JTable(tableModelLeaveapp){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error");
			}
		}
		return tblLeaveappFinish;
	}

	/**
	 * This method initializes btnViewBusinessEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewBusinessEdit() {
		if (btnViewBusinessEdit == null) {
			btnViewBusinessEdit = new JButton();
			btnViewBusinessEdit.setText("Edit User");
			btnViewBusinessEdit.setBounds(new Rectangle(22, 328, 159, 45));
			btnViewBusinessEdit.setIcon(new ImageIcon(getClass().getResource("/image/edit-user-icon.png")));
			btnViewBusinessEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblBusinessManager.getSelectedRowCount();
					int i = tblBusinessManager.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblBusinessManager.getValueAt(i, 0).toString());
						try{
							new Editprofile(null,id).setVisible(true);
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return btnViewBusinessEdit;
	}

	/**
	 * This method initializes btnViewBusinessLock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewBusinessLock() {
		if (btnViewBusinessLock == null) {
			btnViewBusinessLock = new JButton();
			btnViewBusinessLock.setText("Lock User");
			btnViewBusinessLock.setLocation(new Point(399, 328));
			btnViewBusinessLock.setSize(new Dimension(159, 45));
			btnViewBusinessLock.setIcon(new ImageIcon(getClass().getResource("/image/remove-user-icon.png")));
			btnViewBusinessLock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblBusinessManager.getSelectedRow();
					int count = tblBusinessManager.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblBusinessManager.getValueAt(i, 1) +" this User??","Lock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblBusinessManager.getValueAt(i, 0).toString()));
							user.setStatus(tblBusinessManager.getValueAt(i, 2).toString());
							try{
								userservice.lockUser(user);
								
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		return btnViewBusinessLock;
	}

	/**
	 * This method initializes pnTableBusinessManager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableBusinessManager() {
		if (pnTableBusinessManager == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.fill = GridBagConstraints.BOTH;
			gridBagConstraints8.gridy = 0;
			gridBagConstraints8.weightx = 1.0;
			gridBagConstraints8.weighty = 1.0;
			gridBagConstraints8.gridx = 0;
			pnTableBusinessManager = new JPanel();
			pnTableBusinessManager.setLayout(new GridBagLayout());
			pnTableBusinessManager.setBounds(new Rectangle(1, 0, 1266, 324));
			pnTableBusinessManager.add(getJScrollPane4(), gridBagConstraints8);
		}
		return pnTableBusinessManager;
	}

	/**
	 * This method initializes jScrollPane4	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane4() {
		if (jScrollPane4 == null) {
			jScrollPane4 = new JScrollPane();
			jScrollPane4.setViewportView(getTblBusinessManager());
		}
		return jScrollPane4;
	}

	/**
	 * This method initializes tblBusinessManager	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblBusinessManager() {
		if (tblBusinessManager == null) {
			try{
				data = userservice.selectAllUserBM();
				tableModel.setData(data);
				tblBusinessManager = new JTable(tableModel){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
			return tblBusinessManager;
	}

	/**
	 * This method initializes pnManager	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnManager() {
		if (pnManager == null) {
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.BOTH;
			gridBagConstraints9.gridy = 0;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.weighty = 1.0;
			gridBagConstraints9.gridx = 0;
			pnManager = new JPanel();
			pnManager.setLayout(new GridBagLayout());
			pnManager.setLocation(new Point(-3, -1));
			pnManager.setSize(new Dimension(1267, 326));
			pnManager.add(getJScrollPane5(), gridBagConstraints9);
		}
		return pnManager;
	}

	/**
	 * This method initializes btnViewManagerEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewManagerEdit() {
		if (btnViewManagerEdit == null) {
			btnViewManagerEdit = new JButton();
			btnViewManagerEdit.setText("Edit User");
			btnViewManagerEdit.setLocation(new Point(22, 328));
			btnViewManagerEdit.setSize(new Dimension(159, 45));
			btnViewManagerEdit.setIcon(new ImageIcon(getClass().getResource("/image/edit-user-icon.png")));
			btnViewManagerEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblManager.getSelectedRowCount();
					int i = tblManager.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblManager.getValueAt(i, 0).toString());
						try{
							new Editprofile(null,id).setVisible(true);
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return btnViewManagerEdit;
	}

	/**
	 * This method initializes btnViewManagerLock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewManagerLock() {
		if (btnViewManagerLock == null) {
			btnViewManagerLock = new JButton();
			btnViewManagerLock.setText("Lock User");
			btnViewManagerLock.setSize(new Dimension(159, 45));
			btnViewManagerLock.setLocation(new Point(399, 328));
			btnViewManagerLock.setIcon(new ImageIcon(getClass().getResource("/image/remove-user-icon.png")));
			btnViewManagerLock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblManager.getSelectedRow();
					int count = tblManager.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblManager.getValueAt(i, 1) +" this User??","Lock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblManager.getValueAt(i, 0).toString()));
							user.setStatus(tblManager.getValueAt(i, 2).toString());
							try{
								userservice.lockUser(user);
								
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		return btnViewManagerLock;
	}

	/**
	 * This method initializes jScrollPane5	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane5() {
		if (jScrollPane5 == null) {
			jScrollPane5 = new JScrollPane();
			jScrollPane5.setViewportView(getTblManager());
		}
		return jScrollPane5;
	}

	/**
	 * This method initializes tblManager	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblManager() {
		if (tblManager == null) {
			try{
				data = userservice.selectAllUserM();
				tableModel.setData(data);
				tblManager = new JTable(tableModel){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
				
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "error");
			}
		}
		return tblManager;
	}

	/**
	 * This method initializes pnEngineer	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnEngineer() {
		if (pnEngineer == null) {
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.fill = GridBagConstraints.BOTH;
			gridBagConstraints10.gridy = 0;
			gridBagConstraints10.weightx = 1.0;
			gridBagConstraints10.weighty = 1.0;
			gridBagConstraints10.gridx = 0;
			pnEngineer = new JPanel();
			pnEngineer.setLayout(new GridBagLayout());
			pnEngineer.setLocation(new Point(0, 0));
			pnEngineer.setSize(new Dimension(1267, 324));
			pnEngineer.add(getJScrollPane6(), gridBagConstraints10);
		}
		return pnEngineer;
	}

	/**
	 * This method initializes btnViewEngineerEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewEngineerEdit() {
		if (btnViewEngineerEdit == null) {
			btnViewEngineerEdit = new JButton();
			btnViewEngineerEdit.setText("Edit User");
			btnViewEngineerEdit.setLocation(new Point(22, 328));
			btnViewEngineerEdit.setSize(new Dimension(159, 45));
			btnViewEngineerEdit.setIcon(new ImageIcon(getClass().getResource("/image/edit-user-icon.png")));
			btnViewEngineerEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblEngineer.getSelectedRowCount();
					int i = tblEngineer.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblEngineer.getValueAt(i, 0).toString());
						try{
							new Editprofile(null,id).setVisible(true);
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
				}
			});
		}
		return btnViewEngineerEdit;
	}

	/**
	 * This method initializes btnViewEngineerLock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewEngineerLock() {
		if (btnViewEngineerLock == null) {
			btnViewEngineerLock = new JButton();
			btnViewEngineerLock.setText("Lock User");
			btnViewEngineerLock.setLocation(new Point(399, 328));
			btnViewEngineerLock.setSize(new Dimension(159, 45));
			btnViewEngineerLock.setIcon(new ImageIcon(getClass().getResource("/image/remove-user-icon.png")));
			btnViewEngineerLock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblEngineer.getSelectedRow();
					int count = tblEngineer.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to "+tblEngineer.getValueAt(i, 1) +" this User??","Lock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblEngineer.getValueAt(i, 0).toString()));
							user.setStatus(tblEngineer.getValueAt(i, 2).toString());
							try{
								userservice.lockUser(user);
								
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		return btnViewEngineerLock;
	}

	/**
	 * This method initializes jScrollPane6	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane6() {
		if (jScrollPane6 == null) {
			jScrollPane6 = new JScrollPane();
			jScrollPane6.setViewportView(getTblEngineer());
		}
		return jScrollPane6;
	}

	/**
	 * This method initializes tblEngineer	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblEngineer() {
		if (tblEngineer == null) {
			try{
				data = userservice.selectAllUserE();
				tableModel.setData(data);
				tblEngineer = new JTable(tableModel){


					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
				
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "error");
			}
			
		}
		return tblEngineer;
	}

	/**
	 * This method initializes btnCreatLeaveAppSystem	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCreatLeaveAppSystem() {
		if (btnCreatLeaveAppSystem == null) {
			btnCreatLeaveAppSystem = new JButton();
			btnCreatLeaveAppSystem.setText("Create LeaveApp System");
			btnCreatLeaveAppSystem.setSize(new Dimension(334, 40));
			btnCreatLeaveAppSystem.setIcon(new ImageIcon(getClass().getResource("/image/Clients-icon.png")));
			btnCreatLeaveAppSystem.setLocation(new Point(810, 90));
			btnCreatLeaveAppSystem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new LeaveappDirector(null).setVisible(true);
				}
			});
		}
		return btnCreatLeaveAppSystem;
	}

	/**
	 * This method initializes pnUserlock	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnUserlock() {
		if (pnUserlock == null) {
			pnUserlock = new JPanel();
			pnUserlock.setLayout(null);
			pnUserlock.add(getPnTableUserlock(), null);
			pnUserlock.add(getBtnEdit(), null);
			pnUserlock.add(getBtnUnlock(), null);
			pnUserlock.add(getBtnViewUserunlockRefresh(), null);
			pnUserlock.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentShown(java.awt.event.ComponentEvent e) {
					 try{
						 data = userservice.selectAllUserlock();
						 tableModel.setData(data);
					 }catch(Exception ex){
						 ex.printStackTrace();
					 }
				}
			});
		}
		return pnUserlock;
	}

	/**
	 * This method initializes pnTableUserlock	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableUserlock() {
		if (pnTableUserlock == null) {
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.fill = GridBagConstraints.BOTH;
			gridBagConstraints11.gridy = 0;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.weighty = 1.0;
			gridBagConstraints11.gridx = 0;
			pnTableUserlock = new JPanel();
			pnTableUserlock.setLayout(new GridBagLayout());
			pnTableUserlock.setBounds(new Rectangle(-1, 0, 1262, 325));
			pnTableUserlock.add(getJScrollPane7(), gridBagConstraints11);
		}
		return pnTableUserlock;
	}

	/**
	 * This method initializes jScrollPane7	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane7() {
		if (jScrollPane7 == null) {
			jScrollPane7 = new JScrollPane();
			jScrollPane7.setViewportView(getTblUserlock());
		}
		return jScrollPane7;
	}

	/**
	 * This method initializes tblUserlock	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblUserlock() {
		if (tblUserlock == null) {
			try{
					data = userservice.selectAllUserlock();
					tableModel.setData(data);
					tblUserlock = new JTable(tableModel){


						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int rowIndex,int vColIndex) {
							return false;
						}
					};
				}catch(Exception ex){
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error");
				}
			
		}
		return tblUserlock;
	}

	/**
	 * This method initializes btnUnlock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUnlock() {
		if (btnUnlock == null) {
			btnUnlock = new JButton();
			btnUnlock.setText("Unlock User");
			btnUnlock.setLocation(new Point(399, 328));
			btnUnlock.setSize(new Dimension(159, 45));
			btnUnlock.setIcon(new ImageIcon(getClass().getResource("/image/upload-icon.png")));
			btnUnlock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int i = tblUserlock.getSelectedRow();
					int count = tblUserlock.getSelectedRowCount();
					if(count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one user");
					}else{
						if (JOptionPane.showConfirmDialog(null, "Are you sure want to  "+tblUserlock.getValueAt(i, 1) +" this User??","UnLock User",JOptionPane.YES_NO_OPTION) == 0){
							User user = new User();
							user.setId_user(Integer.parseInt(tblUserlock.getValueAt(i, 0).toString()));
							user.setStatus(tblUserlock.getValueAt(i, 2).toString());
							try{
								userservice.unlockUser(user);
								
							}catch (Exception ex) {
								ex.printStackTrace();
								JOptionPane.showMessageDialog(null, "error");
							}
						}
					}
				}
			});
		}
		
		return btnUnlock;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit User");
			btnEdit.setLocation(new Point(22, 328));
			btnEdit.setSize(new Dimension(159, 45));
			btnEdit.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/image/edit-user-icon.png")));
			btnEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblUserlock.getSelectedRowCount();
					int i = tblUserlock.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblUserlock.getValueAt(i, 0).toString());
						try{
							new Editprofile(null,id).setVisible(true);
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
	 * This method initializes txtTotalApprovalLeave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotalApprovalLeave() {	
		if (txtTotalApprovalLeave == null) {
			txtTotalApprovalLeave = new JTextField();
			txtTotalApprovalLeave.setLocation(new Point(170, 45));
			txtTotalApprovalLeave.setEnabled(false);
			txtTotalApprovalLeave.setSize(new Dimension(51, 32));
			
		}
		return txtTotalApprovalLeave;
	}
	
	/**
	 * This method initializes txtTotalNotApproveleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotalNotApproveleave() {
		if (txtTotalNotApproveleave == null) {
			txtTotalNotApproveleave = new JTextField();
			txtTotalNotApproveleave.setLocation(new Point(170, 104));
			txtTotalNotApproveleave.setEnabled(false);
			txtTotalNotApproveleave.setSize(new Dimension(51, 32));
		}
		return txtTotalNotApproveleave;
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
			btnRefresh.setLocation(new Point(211, 328));
			btnRefresh.setSize(new Dimension(159, 45));
			btnRefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data = userservice.selectAllUserBM();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				
				}
			});
		}
		return btnRefresh;
	}
	/**
	 * This method initializes mnModeration	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnModeration() {
		if (mnModeration == null) {
			mnModeration = new JMenu();
			mnModeration.setText("Moderation");
			mnModeration.setIcon(new ImageIcon(getClass().getResource("/image/config.png")));
			mnModeration.add(getMniAdduser());
			mnModeration.add(getMnExportReport());
		}
		return mnModeration;
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
			mnView.setIcon(new ImageIcon(getClass().getResource("/image/zoom.png")));
			mnView.add(getMniViewManagerleaveapp());
			mnView.add(getMnViewUserManager());
			mnView.add(getMnViewHistory());
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
			mnHelp.setIcon(new ImageIcon(getClass().getResource("/image/FAQ-icon.png")));
			mnHelp.add(getMnHelpcontent());
			mnHelp.add(getMnAbout());
		}
		return mnHelp;
	}
	/**
	 * This method initializes mnHelpcontent	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnHelpcontent() {
		if (mnHelpcontent == null) {
			mnHelpcontent = new JMenuItem();
			mnHelpcontent.setText("Help Content");
			mnHelpcontent.setIcon(new ImageIcon(getClass().getResource("/image/Help.png")));
		}
		return mnHelpcontent;
	}
	/**
	 * This method initializes mnAbout	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenuItem();
			mnAbout.setText("About");
			mnAbout.setIcon(new ImageIcon(getClass().getResource("/image/about.png")));
			mnAbout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new About(null).setVisible(true);
				}
			});
		}
		return mnAbout;
	}
	/**
	 * This method initializes mnViewUserManager	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnViewUserManager() {
		if (mnViewUserManager == null) {
			mnViewUserManager = new JMenuItem();
			mnViewUserManager.setText("View User Manager");
			mnViewUserManager.setIcon(new ImageIcon(getClass().getResource("/image/report.png")));
			mnViewUserManager.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jtpnManager.setSelectedIndex(2);
				}
			});
		}
		return mnViewUserManager;
	}
	/**
	 * This method initializes mnViewHistory	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnViewHistory() {
		if (mnViewHistory == null) {
			mnViewHistory = new JMenuItem();
			mnViewHistory.setText("View History");
			mnViewHistory.setIcon(new ImageIcon(getClass().getResource("/image/report.png")));
			mnViewHistory.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jtpnManager.setSelectedIndex(0);
				}
			});
		}
		return mnViewHistory;
	}
	/**
	 * This method initializes txtTotaldaycanleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotaldaycanleave() {
		if (txtTotaldaycanleave == null) {
			txtTotaldaycanleave = new JTextField();
			txtTotaldaycanleave.setLocation(new Point(169, 170));
			txtTotaldaycanleave.setEnabled(false);
			txtTotaldaycanleave.setSize(new Dimension(51, 32));
		}
		return txtTotaldaycanleave;
	}
	/**
	 * This method initializes txtTotaldaycannotleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotaldaycannotleave() {
		if (txtTotaldaycannotleave == null) {
			txtTotaldaycannotleave = new JTextField();
			txtTotaldaycannotleave.setLocation(new Point(170, 223));
			txtTotaldaycannotleave.setEnabled(false);
			txtTotaldaycannotleave.setSize(new Dimension(51, 32));
		}
		return txtTotaldaycannotleave;
	}
	/**
	 * This method initializes pnTableDayoff	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableDayoff() {
		if (pnTableDayoff == null) {
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.fill = GridBagConstraints.BOTH;
			gridBagConstraints15.gridy = 0;
			gridBagConstraints15.weightx = 1.0;
			gridBagConstraints15.weighty = 1.0;
			gridBagConstraints15.gridx = 0;
			pnTableDayoff = new JPanel();
			pnTableDayoff.setLayout(new GridBagLayout());
			pnTableDayoff.setBounds(new Rectangle(372, 258, 763, 144));
			pnTableDayoff.add(getTblDayofSystem(), gridBagConstraints15);
		}
		return pnTableDayoff;
	}
	/**
	 * This method initializes btnViewUserunlockRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewUserunlockRefresh() {
		if (btnViewUserunlockRefresh == null) {
			btnViewUserunlockRefresh = new JButton();
			btnViewUserunlockRefresh.setText("Refresh");
			btnViewUserunlockRefresh.setSize(new Dimension(159, 45));
			btnViewUserunlockRefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewUserunlockRefresh.setLocation(new Point(211, 328));
			btnViewUserunlockRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data = userservice.selectAllUserlock();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				
				}
			});
		}
		return btnViewUserunlockRefresh;
	}
	/**
	 * This method initializes btnViewEnginerrRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewEnginerrRefresh() {
		if (btnViewEnginerrRefresh == null) {
			btnViewEnginerrRefresh = new JButton();
			btnViewEnginerrRefresh.setText("Refresh");
			btnViewEnginerrRefresh.setSize(new Dimension(159, 45));
			btnViewEnginerrRefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewEnginerrRefresh.setLocation(new Point(211, 328));
			btnViewEnginerrRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data = userservice.selectAllUserE();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				
				}
			});
		}
		return btnViewEnginerrRefresh;
	}
	/**
	 * This method initializes btnViewApproveFrefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewApproveFrefresh() {
		if (btnViewApproveFrefresh == null) {
			btnViewApproveFrefresh = new JButton();
			btnViewApproveFrefresh.setText("Refresh");
			btnViewApproveFrefresh.setSize(new Dimension(159, 45));
			btnViewApproveFrefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewApproveFrefresh.setLocation(new Point(399, 328));
			btnViewApproveFrefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDapprove();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		
		return btnViewApproveFrefresh;
	}
	/**
	 * This method initializes btnViewValidRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewValidRefresh() {
		if (btnViewValidRefresh == null) {
			btnViewValidRefresh = new JButton();
			btnViewValidRefresh.setText("Refresh");
			btnViewValidRefresh.setLocation(new Point(399, 328));
			btnViewValidRefresh.setSize(new Dimension(159, 45));
			btnViewValidRefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewValidRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data1 = leaveappservice.selectLeaveappMDvalid();
						tableModelLeaveapp.setData(data1);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		return btnViewValidRefresh;
	}
	/**
	 * This method initializes btnViewBusinessmanagerAddgroup	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewBusinessmanagerAddgroup() {
		if (btnViewBusinessmanagerAddgroup == null) {
			btnViewBusinessmanagerAddgroup = new JButton();
			btnViewBusinessmanagerAddgroup.setName("");
			btnViewBusinessmanagerAddgroup.setSize(new Dimension(159, 45));
			btnViewBusinessmanagerAddgroup.setText("Add Group");
			btnViewBusinessmanagerAddgroup.setIcon(new ImageIcon(getClass().getResource("/image/Clients-icon.png")));
			btnViewBusinessmanagerAddgroup.setLocation(new Point(588, 328));
			btnViewBusinessmanagerAddgroup.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							int count = tblBusinessManager.getSelectedRowCount();
							int i = tblBusinessManager.getSelectedRow();
							if (count != 1){
								JOptionPane.showMessageDialog(null, "Please select only one User");
							}else{
								
								int id = Integer.parseInt(tblBusinessManager.getValueAt(i, 0).toString());
								if(cbxViewBusinessmanager.getSelectedItem().toString().equalsIgnoreCase("Engineer")){
									userservice.addgroup(1, id);
									JOptionPane.showMessageDialog(null, "Addgroup successfull");
								}else if(cbxViewBusinessmanager.getSelectedItem().toString().equalsIgnoreCase("Manager")){
									userservice.addgroup(2, id);
									JOptionPane.showMessageDialog(null, "Addgroup successfull");
								}
							}
						}
					});
		}
		return btnViewBusinessmanagerAddgroup;
	}
	/**
	 * This method initializes cbxViewBusinessmanager	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxViewBusinessmanager() {
		if (cbxViewBusinessmanager == null) {
			String[] data = {"Manager","Engineer"};
			cbxViewBusinessmanager = new JComboBox(data);
			cbxViewBusinessmanager.setLocation(new Point(755, 328));
			cbxViewBusinessmanager.setSize(new Dimension(159, 45));
		}
		return cbxViewBusinessmanager;
	}
	/**
	 * This method initializes btnViewManagerRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewManagerRefresh() {
		if (btnViewManagerRefresh == null) {
			btnViewManagerRefresh = new JButton();
			btnViewManagerRefresh.setText("Refresh");
			btnViewManagerRefresh.setSize(new Dimension(159, 45));
			btnViewManagerRefresh.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon_2.png")));
			btnViewManagerRefresh.setLocation(new Point(211, 328));
			btnViewManagerRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						data = userservice.selectAllUserM();
						tableModel.setData(data);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				
				}
			});
		}
		return btnViewManagerRefresh;
	}
	/**
	 * This method initializes btnViewManagerAddgroup	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewManagerAddgroup() {
		if (btnViewManagerAddgroup == null) {
			btnViewManagerAddgroup = new JButton();
			btnViewManagerAddgroup.setLocation(new Point(588, 328));
			btnViewManagerAddgroup.setText("Add Group");
			btnViewManagerAddgroup.setIcon(new ImageIcon(getClass().getResource("/image/Clients-icon.png")));
			btnViewManagerAddgroup.setSize(new Dimension(159, 45));
			btnViewManagerAddgroup.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblManager.getSelectedRowCount();
					int i = tblManager.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblManager.getValueAt(i, 0).toString());
						if(cbxViewManager.getSelectedItem().toString().equalsIgnoreCase("Engineer")){
							userservice.addgroup(1, id);
							JOptionPane.showMessageDialog(null, "Addgroup successfull");
						}else if(cbxViewManager.getSelectedItem().toString().equalsIgnoreCase("Business Manager")){
							userservice.addgroup(3, id);
							JOptionPane.showMessageDialog(null, "Addgroup successfull");
						}
					}
				}
			});
}
		return btnViewManagerAddgroup;
	}
	/**
	 * This method initializes cbxViewManager	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxViewManager() {
		if (cbxViewManager == null) {
			String [] data = {"Business Manager" ,"Engineer"};
			cbxViewManager = new JComboBox(data);
			cbxViewManager.setLocation(new Point(755, 328));
			cbxViewManager.setSize(new Dimension(159, 45));
		}
		return cbxViewManager;
	}
	/**
	 * This method initializes btnViewEngineerAddgroup	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnViewEngineerAddgroup() {
		if (btnViewEngineerAddgroup == null) {
			btnViewEngineerAddgroup = new JButton();
			btnViewEngineerAddgroup.setIcon(new ImageIcon(getClass().getResource("/image/Clients-icon.png")));
			btnViewEngineerAddgroup.setLocation(new Point(588, 328));
			btnViewEngineerAddgroup.setSize(new Dimension(159, 45));
			btnViewEngineerAddgroup.setText("Add Group");
			btnViewEngineerAddgroup.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int count = tblEngineer.getSelectedRowCount();
					int i = tblEngineer.getSelectedRow();
					if (count != 1){
						JOptionPane.showMessageDialog(null, "Please select only one User");
					}else{
						int id = Integer.parseInt(tblEngineer.getValueAt(i, 0).toString());
						if(cbxViewEngineer.getSelectedItem().toString().equalsIgnoreCase("Manager")){
							userservice.addgroup(2, id);
							JOptionPane.showMessageDialog(null, "Addgroup successfull");
						}else if(cbxViewEngineer.getSelectedItem().toString().equalsIgnoreCase("Business Manager")){
							userservice.addgroup(3, id);
							JOptionPane.showMessageDialog(null, "Addgroup successfull");
						}
					}
				}
			});
}
		return btnViewEngineerAddgroup;
	}
	/**
	 * This method initializes cbxViewEngineer	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxViewEngineer() {
		if (cbxViewEngineer == null) {
			String [] data = {"Business Manager","Manager"};
			cbxViewEngineer = new JComboBox(data);
			cbxViewEngineer.setLocation(new Point(755, 328));
			cbxViewEngineer.setSize(new Dimension(159, 45));
		}
		return cbxViewEngineer;
	}
	/**
	 * This method initializes pnTableMyLeaveApp	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnTableMyLeaveApp() {
		if (pnTableMyLeaveApp == null) {
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.fill = GridBagConstraints.BOTH;
			gridBagConstraints14.gridy = 0;
			gridBagConstraints14.weightx = 1.0;
			gridBagConstraints14.weighty = 1.0;
			gridBagConstraints14.gridx = 0;
			pnTableMyLeaveApp = new JPanel();
			pnTableMyLeaveApp.setLayout(new GridBagLayout());
			pnTableMyLeaveApp.setBounds(new Rectangle(371, 47, 773, 142));
			pnTableMyLeaveApp.add(getJScrollPane9(), gridBagConstraints14);
		}
		return pnTableMyLeaveApp;
	}
	/**
	 * This method initializes jScrollPane9	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane9() {
		if (jScrollPane9 == null) {
			jScrollPane9 = new JScrollPane();
			jScrollPane9.setViewportView(getTblMyleaveapp());
		}
		return jScrollPane9;
	}
	/**
	 * This method initializes tblMyleaveapp	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblMyleaveapp() {
		if (tblMyleaveapp == null) {
			
			try{
				datah = leaveappservice.History(Integer.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1),Integer.valueOf( Calendar.getInstance().get(Calendar.YEAR)), id);
				tableModelHistory.setData(datah);
				tblMyleaveapp = new JTable(tableModelHistory){
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex, int vColIndex) {
						return false;
					}
				};
				repaint();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			
		}
		return tblMyleaveapp;
	}
	/**
	 * This method initializes tblDayofSystem	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getTblDayofSystem() {
		if (tblDayofSystem == null) {
			tblDayofSystem = new JScrollPane();
			tblDayofSystem.setViewportView(getTblDayOfSystem());
		}
		return tblDayofSystem;
	}
	/**
	 * This method initializes tblDayOfSystem	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTblDayOfSystem() {
		if (tblDayOfSystem == null) {
			try{
				
				dataday= leaveappservice.loadDayOff(Integer.valueOf(Calendar.getInstance().get(Calendar.MONTH)+ 1),Integer.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
				tableModelDayoff.setData(dataday);
				tblDayOfSystem = new JTable(tableModelDayoff){

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex,int vColIndex) {
						return false;
					}
				};
			}catch(Exception ex){
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		return tblDayOfSystem;
	}
	/**
	 * This method initializes mnExportReport	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnExportReport() {
		if (mnExportReport == null) {
			mnExportReport = new JMenuItem();
			mnExportReport.setText("Export Report");
			mnExportReport.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JasperReport jasperReport;
					JasperPrint jasperPrint;
					try {
						ConnectionDB conn = new ConnectionDB();
						conn.getConn();
						HashMap jasperParameter = new HashMap();
						jasperReport = JasperCompileManager.compileReport("src/Report/reportLMSMD.jasper");
						jasperPrint = JasperFillManager.fillReport(jasperReport,jasperParameter, conn.getConn()); 
						//JasperExportManager.exportReportToHtmlFile(jasperPrint,"src/Report/reportLMSMD.html" ); 
						JOptionPane.showMessageDialog(null, "The report has been saved in Report folder!!!");
						}catch (JRException ex) {
							ex.printStackTrace();
					} 
				}
			});
		}
		return mnExportReport;
	}

}

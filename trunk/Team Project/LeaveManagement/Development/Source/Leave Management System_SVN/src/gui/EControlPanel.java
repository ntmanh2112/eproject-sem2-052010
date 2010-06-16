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
import java.sql.ResultSet;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import model.Leaveapp;
import model.User;
import business.LeaveappService;
import business.UserService;
import dao.LeaveDAO;

public class EControlPanel extends JFrame {

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
	private JButton btnChangepass = null;
	private JButton btnEditProfile = null;
	private JButton btnCreatleaveapp = null;
	private JButton btnLogout = null;
	private JPanel jPanel = null;
	private JTabbedPane jtpnManager = null;
	private JPanel jpnHistory = null;
	private JMenuItem mniEditprofile = null;
	private JMenuItem mniChangepass = null;
	private JMenuItem mniCreatleaveapp = null;
	private JMenuItem mniSignout = null;
	private JLabel lbTotalLeave = null;
	private JLabel lbDaycanLeave = null;
	User user = new User();
	UserService userservice = new UserService(); // @jve:decl-index=0:
	Leaveapp leaveapp = new Leaveapp(); // @jve:decl-index=0:
	private int id = 0;
	LeaveappService leaveappservice = new LeaveappService(); // @jve:decl-index=0:
	
	private String[][] datah = null;
	private String[] columnh = { "FullName", "DateFrom", "Dateto", "Reason",
			"Status", "Address", "Phone" };
	private String[][] dataday = null;
	private String[] columnday = { "DateFrom", "Dateto", "Reason" };
	private JTextField txtTotalApprovalLeave = null;
	private JMenu mnHelp = null;
	private JMenuItem mnHelpcontent = null;
	private JMenuItem mnAbout = null;
	private JTextField txtTotaldaycanleave = null;
	private JLabel lbHistory = null;
	private JLabel lbDayoff = null;
	private JPanel pnTableDayoff = null;
	private JLabel lbMyLeaveApp = null;
	private JPanel pnTableMyLeaveApp = null;
	

	private common.TableModel tableModelHistory = new common.TableModel(datah,
			columnh);
	private common.TableModel tableModelDayoff = new common.TableModel(dataday,
			columnday);
	private JScrollPane jScrollPane9 = null;
	private JTable tblMyleaveapp = null;
	private JScrollPane tblDayofSystem = null;
	private JTable tblDayOfSystem = null;
	private JButton btnRefreshHistory = null;
	private JButton jButton = null;
	/**
	 * This is the default constructor
	 */
	public EControlPanel() {
		super();
		initialize();

	}

	public EControlPanel(int id) {
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

		this.setSize(1280, 780);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setEnabled(true);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(
				getClass().getResource("/image/Administrator-icon.png")));
		this.setJMenuBar(getJJMenuBar());
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Welcome to Engineer");
		totalDayOff();
		totalCanDayOff();
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
			lbUserinformation.setFont(new Font("Dialog", Font.BOLD
					| Font.ITALIC, 18));
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
			jContentPane.add(getBtnChangepass(), null);
			jContentPane.add(getBtnEditProfile(), null);
			jContentPane.add(getBtnCreatleaveapp(), null);
			jContentPane.add(getBtnLogout(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJButton(), null);
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
			mnUser.setIcon(new ImageIcon(getClass().getResource(
					"/image/Preppy-icon.png")));
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
			txtBirthday = new JTextField();
			txtBirthday.setText(user.getBirthday().toString());
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
	 * This method initializes btnChangepass
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnChangepass() {
		if (btnChangepass == null) {
			btnChangepass = new JButton();
			btnChangepass.setText("Change pass");
			btnChangepass.setSize(new Dimension(138, 40));
			btnChangepass.setIcon(new ImageIcon(getClass().getResource(
					"/image/changepass.jpg")));
			btnChangepass.setLocation(new Point(632, 30));
			btnChangepass
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							new Changepassword(new EControlPanel(id),id).setVisible(true);						}
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
			btnEditProfile.setIcon(new ImageIcon(getClass().getResource(
					"/image/Edit-icon.png")));
			btnEditProfile.setSize(new Dimension(138, 40));
			btnEditProfile.setLocation(new Point(632, 90));
			btnEditProfile.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					new Editprofile(new EControlPanel(id),id).setVisible(true);
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
			btnCreatleaveapp.setIcon(new ImageIcon(getClass().getResource(
					"/image/Emp.png")));
			btnCreatleaveapp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							new CreateLeaveapp(new EControlPanel(id),id).setVisible(true);
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
			btnLogout.setLocation(new Point(809, 30));
			btnLogout.setText("Sign Out");
			btnLogout.setIcon(new ImageIcon(getClass().getResource(
					"/image/Log-Out-icon.png")));
			btnLogout.setSize(new Dimension(151, 40));
			btnLogout.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,
							"Are you sure to want to quit ?");
					if (sr == 0) {
						//System.exit(1);
						EControlPanel.this.dispose();
						new Wellcome().setVisible(true);
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
			jtpnManager.addTab("History", new ImageIcon(getClass().getResource(
					"/image/data-server-icon.png")), getJpnHistory(), null);
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
			lbMyLeaveApp
					.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbMyLeaveApp.setLocation(new Point(371, 5));
			lbDayoff = new JLabel();
			lbDayoff.setBounds(new Rectangle(371, 216, 230, 43));
			lbDayoff.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbDayoff.setText("Day Off System");
			lbHistory = new JLabel();
			lbHistory.setBounds(new Rectangle(14, 4, 91, 31));
			lbHistory.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
			lbHistory.setText("History");
			lbDaycanLeave = new JLabel();
			lbDaycanLeave.setText("Total day can leave");
			lbDaycanLeave.setSize(new Dimension(155, 32));
			lbDaycanLeave.setLocation(new Point(14, 105));
			lbTotalLeave = new JLabel();
			lbTotalLeave.setText("Total approval leave ");
			lbTotalLeave.setSize(new Dimension(155, 32));
			lbTotalLeave.setLocation(new Point(15, 45));
			jpnHistory = new JPanel();
			jpnHistory.setLayout(null);
			jpnHistory.add(lbTotalLeave, null);
			jpnHistory.add(lbDaycanLeave, null);
			jpnHistory.add(getTxtTotalApprovalLeave(), null);
			jpnHistory.add(getTxtTotaldaycanleave(), null);
			jpnHistory.add(lbHistory, null);
			jpnHistory.add(lbDayoff, null);
			jpnHistory.add(getPnTableDayoff(), null);
			jpnHistory.add(lbMyLeaveApp, null);
			jpnHistory.add(getPnTableMyLeaveApp(), null);
			jpnHistory.add(getBtnRefreshHistory(), null);
		}
		return jpnHistory;
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
			mniEditprofile.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("control E");
			mniEditprofile.setAccelerator(keyStroke);
			mniEditprofile.setIcon(new ImageIcon(getClass().getResource(
					"/image/Edit-icon.png")));
			mniEditprofile
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							new Editprofile(new EControlPanel(id),id).setVisible(true);
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
			mniChangepass.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("control P");
			mniChangepass.setAccelerator(keyStroke);
			mniChangepass.setIcon(new ImageIcon(getClass().getResource(
					"/image/changepass.jpg")));
			mniChangepass
					.addActionListener(new java.awt.event.ActionListener() {
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
			mniCreatleaveapp.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("control C");
			mniCreatleaveapp.setAccelerator(keyStroke);
			mniCreatleaveapp.setIcon(new ImageIcon(getClass().getResource(
					"/image/Emp.png")));
			mniCreatleaveapp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							new CreateLeaveapp(new EControlPanel(id),id).setVisible(true);
						}
					});
		}
		return mniCreatleaveapp;
	}

	/**
	 * This method initializes mniSignout
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMniSignout() {
		if (mniSignout == null) {
			mniSignout = new JMenuItem();
			mniSignout.setText("Exit");
			mniSignout.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("control Q");
			mniSignout.setAccelerator(keyStroke);
			mniSignout.setIcon(new ImageIcon(getClass().getResource(
					"/image/Log-Out-icon.png")));
			mniSignout.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,
							"Are you sure to want to quit ?");
					if (sr == 0) {
						System.exit(1);
					}
				}
			});
		}
		return mniSignout;

		/*
		 * mniSignout.addActionListener(new java.awt.event.ActionListener() {
		 * public void actionPerformed(java.awt.event.ActionEvent e) {
		 * MDControlPanel.this.dispose(); } });
		 */
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
	 * This method initializes mnHelp
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu();
			mnHelp.setText("Help");
			mnHelp.setIcon(new ImageIcon(getClass().getResource(
					"/image/FAQ-icon.png")));
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
			mnHelpcontent.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("F1");
			mnHelpcontent.setAccelerator(keyStroke);
			mnHelpcontent.setIcon(new ImageIcon(getClass().getResource(
					"/image/Help.png")));
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
			mnAbout.setMnemonic(KeyEvent.VK_E);
			KeyStroke keyStroke = KeyStroke.getKeyStroke("F12");
			mnAbout.setAccelerator(keyStroke);
			mnAbout.setIcon(new ImageIcon(getClass().getResource(
					"/image/about.png")));
			mnAbout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new About(new EControlPanel(id)).setVisible(true);
				}
			});
		}
		return mnAbout;
	}

	/**
	 * This method initializes txtTotaldaycanleave
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtTotaldaycanleave() {
		if (txtTotaldaycanleave == null) {
			txtTotaldaycanleave = new JTextField();
			txtTotaldaycanleave.setLocation(new Point(169, 105));
			txtTotaldaycanleave.setEnabled(false);
			txtTotaldaycanleave.setSize(new Dimension(51, 32));
		}
		return txtTotaldaycanleave;
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

			try {
				datah = leaveappservice
						.History(Integer.valueOf(Calendar.getInstance().get(
								Calendar.MONTH) + 1), Integer.valueOf(Calendar
								.getInstance().get(Calendar.YEAR)), id);
				tableModelHistory.setData(datah);
				tblMyleaveapp = new JTable(tableModelHistory) {
					
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex, int vColIndex) {
						return false;
					}
				};
				repaint();
				
			} catch (Exception ex) {
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
			try {

				dataday = leaveappservice.loadDayOff(Integer.valueOf(Calendar
						.getInstance().get(Calendar.MONTH) + 1), Integer
						.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
				tableModelDayoff.setData(dataday);
				tblDayOfSystem = new JTable(tableModelDayoff){
					
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int rowIndex, int vColIndex) {
						return false;
					}
				};
			
			} catch (Exception ex) {
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		return tblDayOfSystem;
	}

	/**
	 * This method initializes btnRefreshHistory	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnRefreshHistory() {
		if (btnRefreshHistory == null) {
			btnRefreshHistory = new JButton();
			btnRefreshHistory.setBounds(new Rectangle(14, 165, 154, 33));
			btnRefreshHistory.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnRefreshHistory.setText("Refresh");
			btnRefreshHistory.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						dataday = leaveappservice.loadDayOff(Integer.valueOf(Calendar
								.getInstance().get(Calendar.MONTH) + 1), Integer
								.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
						tableModelDayoff.setData(dataday);
						tblDayOfSystem = new JTable(tableModelDayoff);
						tableModelHistory.setData(datah);
						tblMyleaveapp = new JTable(tableModelHistory);
					}catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		return btnRefreshHistory;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("View History");
			jButton.setSize(new Dimension(151, 40));
			jButton.setIcon(new ImageIcon(getClass().getResource("/image/zoom.png")));
			jButton.setLocation(new Point(809, 91));
			jButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					new Viewhistory(new EControlPanel(id),id).setVisible(true);
				}

			});
		}
		return jButton;
	}
	
	public void totalDayOff(){
		try {
			ResultSet rs = LeaveDAO.selectAllDayApprove(this.user);
			if (rs.next()) {
				txtTotalApprovalLeave.setText(rs.getString("TOTALDAYOFF"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void totalCanDayOff(){
		try {
			ResultSet rs = LeaveDAO.selectAllCanDayApprove(this.user);
			if(rs.next()){
				txtTotaldaycanleave.setText(rs.getString("TOTALCANDAYOFF"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

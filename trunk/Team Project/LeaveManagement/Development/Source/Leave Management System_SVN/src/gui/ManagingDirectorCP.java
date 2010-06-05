package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ManagingDirectorCP extends JFrame {

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
	private JMenuItem mniViewuser = null;
	private ImagePanel ip;
	/**
	 * This is the default constructor
	 */
	public ManagingDirectorCP() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		/*this.setSize(619, 302);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("ManageingDirector Control Panel");
		*/
		Container c =this.getContentPane();
		GridBagConstraints contrains = new GridBagConstraints();
		this.setLayout(new BorderLayout());
		this.setJMenuBar(getJJMenuBar());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//this.setContentPane(getJContentPane());
		this.setTitle("Welcome to Managing Director Leave Manager System");
		//Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getSize();
		//Dimension dialogSize = this.getSize();
		//this.setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/5);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("image/Wellcome.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ip = new ImagePanel(image,Double.valueOf(dim.getWidth()).intValue(),
				Double.valueOf(dim.getHeight()).intValue());
        ip.setLayout(new GridBagLayout());
        c.add(ip, BorderLayout.CENTER);
		this.setPreferredSize(dim);
		this.pack();
		this.setVisible(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
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
					new CreateLeaveapp(new ManagingDirectorCP()).setVisible(false);
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
					new About(new ManagingDirectorCP()).setVisible(true);
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
					new Changepassword(new ManagingDirectorCP()).setVisible(true);
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
					new Editprofile(new ManagingDirectorCP()).setVisible(true);
				}
			});
		}
		return mniEditProfile;
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
					new ManagingDirectorCPAddgroup().setVisible(true);
					
				}
			});
		}
		return mniViewuser;
	}
	public static void main(String [] args){
		new ManagingDirectorCP().setVisible(true);
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
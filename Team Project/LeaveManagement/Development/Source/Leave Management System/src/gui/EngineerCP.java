package gui;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class EngineerCP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnFile = null;
	private JMenu mnView = null;
	private JMenu mnEdit = null;
	private JMenu mnHelp = null;
	private JMenuItem mniHelpcontent = null;
	private JMenuItem mniAbout = null;
	private JMenuItem mniEditpass = null;
	private JMenuItem mniEditprofile = null;
	private JMenuItem mniViewprofile = null;
	private JMenuItem mniHistory = null;
	private JMenuItem mniExit = null;
	private JMenuItem mniCreatleaveapp = null;
	/**
	 * This is the default constructor
	 */
	public EngineerCP() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("Engineer Control Panel");
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
			jJMenuBar.add(getMnEdit());
			jJMenuBar.add(getMnView());
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
			mnFile.add(getMniExit());
			mnFile.add(getMniCreatleaveapp());
		}
		return mnFile;
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
			mnView.add(getMniViewprofile());
			mnView.add(getMniHistory());
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
			mnEdit.add(getMniEditpass());
			mnEdit.add(getMniEditprofile());
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
			mnHelp.add(getMniHelpcontent());
			mnHelp.add(getMniAbout());
		}
		return mnHelp;
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
	 * This method initializes mniEditpass	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniEditpass() {
		if (mniEditpass == null) {
			mniEditpass = new JMenuItem();
			mniEditpass.setText("Edit Password");
			mniEditpass.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Changepassword(new ManagerCP()).setVisible(true);
				}
			});
		}
		return mniEditpass;
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
			mniEditprofile.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Editprofile(new EngineerCP()).setVisible(true);
				}
			});
		}
		return mniEditprofile;
	}

	/**
	 * This method initializes mniViewprofile	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniViewprofile() {
		if (mniViewprofile == null) {
			mniViewprofile = new JMenuItem();
			mniViewprofile.setText("View Profile");
			
		}
		return mniViewprofile;
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
			mniHistory.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Viewhistory(new EngineerCP()).setVisible(true);
				}
			});
		}
		return mniHistory;
	}

	/**
	 * This method initializes mniExit	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniExit() {
		if (mniExit == null) {
			mniExit = new JMenuItem();
			mniExit.setText("Exit");
		}
		return mniExit;
	}

	/**
	 * This method initializes mniCreatleaveapp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMniCreatleaveapp() {
		if (mniCreatleaveapp == null) {
			mniCreatleaveapp = new JMenuItem();
			mniCreatleaveapp.setToolTipText("");
			mniCreatleaveapp.setText("Create LA");
			mniCreatleaveapp.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new CreateLeaveapp(new EngineerCP()).setVisible(true);
				}
			});
		}
		return mniCreatleaveapp;
	}
	public static void main(String[] args){
		new EngineerCP().setVisible(true);
	}
}

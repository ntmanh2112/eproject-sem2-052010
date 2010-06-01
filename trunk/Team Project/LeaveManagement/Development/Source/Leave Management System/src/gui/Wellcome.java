package gui;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Wellcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar menubar = null;
	private JMenu menuFile = null;
	private JMenuItem mnLogin = null;
	private JMenuItem mnExit = null;
	private JMenu jMenu = null;
	private JMenuItem mnHelp = null;
	private JMenuItem mnAbout = null;

	/**
	 * This is the default constructor
	 */
	public Wellcome() {
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
		this.setJMenuBar(getMenubar());
		this.setContentPane(getJContentPane());
		this.setTitle("WELL COME");
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
	 * This method initializes menubar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenubar() {
		if (menubar == null) {
			menubar = new JMenuBar();
			menubar.add(getMenuFile());
			menubar.add(getJMenu());
		}
		return menubar;
	}

	/**
	 * This method initializes menuFile	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu();
			menuFile.setText("FIile");
			menuFile.add(getMnLogin());
			menuFile.add(getMnExit());
		}
		return menuFile;
	}

	/**
	 * This method initializes mnLogin	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnLogin() {
		if (mnLogin == null) {
			mnLogin = new JMenuItem();
			mnLogin.setText("Login");
			mnLogin.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Login(new Wellcome()).setVisible(true);
				}
			});
		}
		return mnLogin;
	}

	/**
	 * This method initializes mnExit	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnExit() {
		if (mnExit == null) {
			mnExit = new JMenuItem();
			mnExit.setText("Exit");
			mnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return mnExit;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Help");
			jMenu.add(getMnHelp());
			jMenu.add(getMnAbout());
		}
		return jMenu;
	}

	/**
	 * This method initializes mnHelp	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenuItem();
			mnHelp.setText("Help Content");
		}
		return mnHelp;
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
		}
		return mnAbout;
	}

}

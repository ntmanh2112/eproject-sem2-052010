package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import common.ImagePanel_icon;;





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
	public static String username = null;
	private ImagePanel ip;

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
		Container c =this.getContentPane();
		GridBagConstraints contrains = new GridBagConstraints();
		this.setJMenuBar(getMenubar());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Welcome to Leave Manager System");
				BufferedImage image = null;
		try {
			image = ImageIO.read(new File("image/main1.png"));
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
	 * This method initializes menubar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getMenubar() {
		if (menubar == null){
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
			menuFile.setText("File");
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
			mnLogin.setMnemonic(KeyEvent.VK_L);
			KeyStroke keystroke = KeyStroke.getKeyStroke("control L");
			mnLogin.setText("Login");
			mnLogin.setIcon(new ImageIcon(getClass().getResource("images/Edit-icon.png")));
			mnLogin.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Login(null).setVisible(true);
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
			mnAbout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new About(new Wellcome()).setVisible(true);
				}
			});
		}
		return mnAbout;
	}
	public static void main(String [] args){
		new Wellcome().setVisible(true);
	}
}

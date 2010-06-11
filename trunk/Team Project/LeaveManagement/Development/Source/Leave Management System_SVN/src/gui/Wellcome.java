package gui;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import common.Constant;
import java.awt.Toolkit;

public class Wellcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnFile = null;
	private JMenuItem mnLogin = null;
	private JMenuItem mnExit = null;
	private JMenu mnHelp = null;
	private JMenuItem mnHelpcontent = null;
	private JMenuItem mnAbout = null;
	private JLabel lbBackground = null;
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
		this.setSize(413, 346);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/Sign In.png")));
		this.setResizable(false);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("Welcome to Leave Management System");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbBackground = new JLabel();
			lbBackground.setText("");
			lbBackground.setSize(new Dimension(413, 288));
			lbBackground.setIcon(new ImageIcon(getClass().getResource("/image/wellcome.jpg")));
			lbBackground.setLocation(new Point(-9, -2));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lbBackground, null);
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
			mnFile.setIcon(new ImageIcon(getClass().getResource("/image/config.png")));
			mnFile.add(getMnLogin());
			mnFile.add(getMnExit());
		}
		return mnFile;
	}

	/**
	 * This method initializes mnLogin	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMnLogin() {
		if (mnLogin == null) {
			mnLogin = new JMenuItem();
			mnLogin.setText("LogIn");
			mnLogin.setIcon(new ImageIcon(getClass().getResource("/image/Preppy-icon.png")));
			mnLogin.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Login().setVisible(true);
					Constant.exit();
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
			mnExit.setIcon(new ImageIcon(getClass().getResource("/image/Log-Out-icon.png")));
			mnExit.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
					System.exit(1);
					}
				}
			});
		
		}
		return mnExit;
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
			mnHelpcontent.setIcon(new ImageIcon(getClass().getResource("/image/FAQ-icon.png")));
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
			mnAbout.setIcon(new ImageIcon(getClass().getResource("/image/user-info-icon.png")));
			mnAbout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new About(null).setVisible(true);
					//Constant.exit();
				}
			});
		}
		return mnAbout;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

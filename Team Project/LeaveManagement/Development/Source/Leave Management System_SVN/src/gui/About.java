package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class About extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel lbLogoAptech = null;
	private JLabel lblogoJava = null;
	private JLabel jLabel6 = null;
	/**
	 * @param owner
	 */
	public About(Frame owner) {
		super(owner,true);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(429, 276);
		this.setTitle("About L.M.S");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(303, 8, 103, 131));
			jLabel6.setIcon(new ImageIcon(getClass().getResource("/image/419_transforming_teams_logo.png")));
			jLabel6.setText("");
			lblogoJava = new JLabel();
			lblogoJava.setBounds(new Rectangle(-1, 2, 150, 147));
			lblogoJava.setIcon(new ImageIcon(getClass().getResource("/image/java-logo-thumb.png")));
			lblogoJava.setText("");
			lbLogoAptech = new JLabel();
			lbLogoAptech.setBounds(new Rectangle(0, 148, 169, 87));
			lbLogoAptech.setIcon(new ImageIcon(getClass().getResource("/image/logo_aptech.png")));
			lbLogoAptech.setText("");
			jLabel5 = new JLabel();
			jLabel5.setText("Support By: Aptech Center");
			jLabel5.setSize(new Dimension(200, 26));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setLocation(new Point(169, 208));
			jLabel4 = new JLabel();
			jLabel4.setText("Dinh Si Nguyen");
			jLabel4.setSize(new Dimension(138, 26));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(166, 112));
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setLocation(new Point(166, 86));
			jLabel3.setSize(new Dimension(138, 26));
			jLabel3.setText("Pham Trung Hieu");
			jLabel2 = new JLabel();
			jLabel2.setName("B");
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setLocation(new Point(166, 59));
			jLabel2.setSize(new Dimension(138, 26));
			jLabel2.setText("Nguyen Dong Ho");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(149, 34, 107, 26));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setText("Developed by: ");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(150, 4, 106, 28));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel.setText(" Version 1.0 ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(lbLogoAptech, null);
			jContentPane.add(lblogoJava, null);
			jContentPane.add(jLabel6, null);
		}
		return jContentPane;
	}


}  //  @jve:decl-index=0:visual-constraint="36,35"

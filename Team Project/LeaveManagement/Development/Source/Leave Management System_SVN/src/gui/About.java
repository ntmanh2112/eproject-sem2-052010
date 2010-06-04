package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
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
	private JButton btnOk = null;
	/**
	 * @param owner
	 */
	public About(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(539, 280);
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
			jLabel5 = new JLabel();
			jLabel5.setText("Support By: Hung Vuong Aptech Center");
			jLabel5.setSize(new Dimension(299, 26));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setLocation(new Point(225, 143));
			jLabel4 = new JLabel();
			jLabel4.setText("Dinh Si Nguyen");
			jLabel4.setSize(new Dimension(138, 26));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(360, 114));
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setLocation(new Point(360, 88));
			jLabel3.setSize(new Dimension(138, 26));
			jLabel3.setText("Pham Trung Hieu");
			jLabel2 = new JLabel();
			jLabel2.setName("B");
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setLocation(new Point(360, 61));
			jLabel2.setSize(new Dimension(138, 26));
			jLabel2.setText("Nguyen Dong Ho");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(250, 61, 107, 26));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setText("Developed by: ");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(249, 31, 106, 28));
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
			jContentPane.add(getBtnOk(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setBounds(new Rectangle(165, 196, 101, 27));
			btnOk.setText("Ok");
			btnOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					About.this.dispose();
				}
			});
		}
		return btnOk;
	}
	public static void main(String [] args){
		new About(null).setVisible(true);
	}

}  //  @jve:decl-index=0:visual-constraint="10,43"

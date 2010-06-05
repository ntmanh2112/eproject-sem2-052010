package gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane tbpUser = null;
	private JPanel pnUser = null;

	/**
	 * This is the default constructor
	 */
	public test() {
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
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getTbpUser(), gridBagConstraints);
		}
		return jContentPane;
	}

	/**
	 * This method initializes tbpUser	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTbpUser() {
		if (tbpUser == null) {
			tbpUser = new JTabbedPane();
			tbpUser.addTab("Manager User", null, getPnUser(), null);
		}
		return tbpUser;
	}

	/**
	 * This method initializes pnUser	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPnUser() {
		if (pnUser == null) {
			pnUser = new JPanel();
			pnUser.setLayout(new GridBagLayout());
		}
		return pnUser;
	}

}

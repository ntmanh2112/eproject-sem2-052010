package gui;

import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class CreateLeave extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbIcon = null;
	private JLabel lbCreatLeaveApp = null;
	private JLabel lbIdusername = null;
	private JTextField txtIduser = null;
	private JLabel lbDatefrom = null;
	private JLabel lbYear = null;
	private JTextField txtYearDateFrom = null;
	private JLabel lbMonthDateFrom = null;
	private JLabel lbDayDateFrom = null;
	private JComboBox cbxDayDateFrom = null;
	private JTextField txtDateFrom = null;
	private JTextField txtDateFromMonth = null;
	/**
	 * @param owner
	 */
	public CreateLeave(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(486, 408);
		this.setTitle("Create LeaveApp");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbDayDateFrom = new JLabel();
			lbDayDateFrom.setBounds(new Rectangle(328, 106, 38, 16));
			lbDayDateFrom.setText("Day");
			lbMonthDateFrom = new JLabel();
			lbMonthDateFrom.setBounds(new Rectangle(197, 106, 55, 22));
			lbMonthDateFrom.setText("Month");
			lbYear = new JLabel();
			lbYear.setBounds(new Rectangle(104, 106, 38, 16));
			lbYear.setText("Year");
			lbDatefrom = new JLabel();
			lbDatefrom.setBounds(new Rectangle(16, 104, 74, 27));
			lbDatefrom.setText("Date From(*)");
			lbIdusername = new JLabel();
			lbIdusername.setBounds(new Rectangle(15, 60, 29, 23));
			lbIdusername.setText("ID");
			lbCreatLeaveApp = new JLabel();
			lbCreatLeaveApp.setBounds(new Rectangle(123, 0, 311, 50));
			lbCreatLeaveApp.setFont(new Font("Dialog", Font.BOLD, 36));
			lbCreatLeaveApp.setText("Create LeaveApp");
			lbIcon = new JLabel();
			lbIcon.setBounds(new Rectangle(65, 2, 58, 49));
			lbIcon.setIcon(new ImageIcon(getClass().getResource("/image/Document-Write-icon.png")));
			lbIcon.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lbIcon, null);
			jContentPane.add(lbCreatLeaveApp, null);
			jContentPane.add(lbIdusername, null);
			jContentPane.add(getTxtIduser(), null);
			jContentPane.add(lbDatefrom, null);
			jContentPane.add(lbYear, null);
			jContentPane.add(getTxtYearDateFrom(), null);
			jContentPane.add(lbMonthDateFrom, null);
			jContentPane.add(lbDayDateFrom, null);
			jContentPane.add(getCbxDayDateFrom(), null);
			jContentPane.add(getTxtDateFrom(), null);
			jContentPane.add(getTxtDateFromMonth(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtIduser	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtIduser() {
		if (txtIduser == null) {
			txtIduser = new JTextField();
			txtIduser.setBounds(new Rectangle(44, 61, 41, 20));
		}
		return txtIduser;
	}

	/**
	 * This method initializes txtYearDateFrom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtYearDateFrom() {
		if (txtYearDateFrom == null) {
			txtYearDateFrom = new JTextField();
			txtYearDateFrom.setBounds(new Rectangle(142, 108, 57, 20));
		}
		return txtYearDateFrom;
	}

	/**
	 * This method initializes cbxDayDateFrom	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDayDateFrom() {
		if (cbxDayDateFrom == null) {
			cbxDayDateFrom = new JComboBox();
			cbxDayDateFrom.setBounds(new Rectangle(369, 105, 57, 25));
		}
		return cbxDayDateFrom;
	}

	/**
	 * This method initializes txtDateFrom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateFrom() {
		if (txtDateFrom == null) {
			txtDateFrom = new JTextField();
			txtDateFrom.setBounds(new Rectangle(140, 131, 287, 20));
		}
		return txtDateFrom;
	}

	/**
	 * This method initializes txtDateFromMonth	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateFromMonth() {
		if (txtDateFromMonth == null) {
			txtDateFromMonth = new JTextField();
			txtDateFromMonth.setBounds(new Rectangle(253, 106, 48, 20));
		}
		return txtDateFromMonth;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

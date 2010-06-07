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
import java.awt.Point;
import javax.swing.JButton;

public class CreateLeave extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbCreatLeaveApp = null;
	private JLabel lbDatefrom = null;
	private JLabel lbYear = null;
	private JTextField txtYearDateFrom = null;
	private JLabel lbMonthDateFrom = null;
	private JLabel lbDayDateFrom = null;
	private JComboBox cbxDayDateFrom = null;
	private JTextField txtDateFromMonth = null;
	private JLabel lbDateTo = null;
	private JLabel lbDatetoYear = null;
	private JTextField txtDateToYear = null;
	private JLabel lbDateToMonth = null;
	private JComboBox cbxDatetoMonth = null;
	private JLabel lbDateToDay = null;
	private JComboBox cbxDateToDay = null;
	private JLabel lbReason = null;
	private JLabel lbDateFromMess = null;
	private JLabel lbDateToMess = null;
	private JTextField txtReason = null;
	private JLabel lbReasonMess = null;
	private JLabel lbAddress = null;
	private JTextField txtAddress = null;
	private JLabel lbPhone = null;
	private JTextField txtPhone = null;
	private JLabel lbAddressMess = null;
	private JLabel lbPhoneMess = null;
	private JButton btnSubmit = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
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
		this.setSize(486, 512);
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
			lbPhoneMess = new JLabel();
			lbPhoneMess.setText("");
			lbPhoneMess.setSize(new Dimension(321, 25));
			lbPhoneMess.setLocation(new Point(120, 356));
			lbAddressMess = new JLabel();
			lbAddressMess.setText("");
			lbAddressMess.setSize(new Dimension(321, 25));
			lbAddressMess.setLocation(new Point(120, 307));
			lbPhone = new JLabel();
			lbPhone.setFont(new Font("Dialog", Font.BOLD, 14));
			lbPhone.setLocation(new Point(15, 332));
			lbPhone.setSize(new Dimension(106, 25));
			lbPhone.setText("Phone");
			lbAddress = new JLabel();
			lbAddress.setFont(new Font("Dialog", Font.BOLD, 14));
			lbAddress.setLocation(new Point(15, 284));
			lbAddress.setSize(new Dimension(106, 25));
			lbAddress.setText("Address");
			lbReasonMess = new JLabel();
			lbReasonMess.setText("");
			lbReasonMess.setSize(new Dimension(321, 25));
			lbReasonMess.setLocation(new Point(120, 260));
			lbDateToMess = new JLabel();
			lbDateToMess.setText("");
			lbDateToMess.setSize(new Dimension(321, 25));
			lbDateToMess.setLocation(new Point(120, 183));
			lbDateFromMess = new JLabel();
			lbDateFromMess.setText("");
			lbDateFromMess.setSize(new Dimension(321, 25));
			lbDateFromMess.setLocation(new Point(120, 135));
			lbReason = new JLabel();
			lbReason.setFont(new Font("Dialog", Font.BOLD, 14));
			lbReason.setLocation(new Point(15, 208));
			lbReason.setSize(new Dimension(106, 25));
			lbReason.setText("Reason");
			lbDateToDay = new JLabel();
			lbDateToDay.setText("Day");
			lbDateToDay.setSize(new Dimension(38, 25));
			lbDateToDay.setLocation(new Point(347, 159));
			lbDateToMonth = new JLabel();
			lbDateToMonth.setText("Month");
			lbDateToMonth.setSize(new Dimension(50, 25));
			lbDateToMonth.setLocation(new Point(227, 159));
			lbDatetoYear = new JLabel();
			lbDatetoYear.setText("Year");
			lbDatetoYear.setSize(new Dimension(38, 25));
			lbDatetoYear.setLocation(new Point(120, 159));
			lbDateTo = new JLabel();
			lbDateTo.setFont(new Font("Dialog", Font.BOLD, 14));
			lbDateTo.setLocation(new Point(15, 159));
			lbDateTo.setSize(new Dimension(106, 25));
			lbDateTo.setText("Date To");
			lbDayDateFrom = new JLabel();
			lbDayDateFrom.setText("Day");
			lbDayDateFrom.setSize(new Dimension(38, 25));
			lbDayDateFrom.setLocation(new Point(346, 110));
			lbMonthDateFrom = new JLabel();
			lbMonthDateFrom.setPreferredSize(new Dimension(35, 15));
			lbMonthDateFrom.setSize(new Dimension(50, 25));
			lbMonthDateFrom.setLocation(new Point(227, 110));
			lbMonthDateFrom.setText("Month");
			lbYear = new JLabel();
			lbYear.setText("Year");
			lbYear.setSize(new Dimension(38, 25));
			lbYear.setLocation(new Point(120, 110));
			lbDatefrom = new JLabel();
			lbDatefrom.setFont(new Font("Dialog", Font.BOLD, 14));
			lbDatefrom.setSize(new Dimension(106, 25));
			lbDatefrom.setLocation(new Point(15, 110));
			lbDatefrom.setText("Date From(*)");
			lbCreatLeaveApp = new JLabel();
			lbCreatLeaveApp.setBounds(new Rectangle(12, 20, 454, 50));
			lbCreatLeaveApp.setFont(new Font("Dialog", Font.BOLD, 36));
			lbCreatLeaveApp.setText("Create LeaveApp System");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lbCreatLeaveApp, null);
			jContentPane.add(lbDatefrom, null);
			jContentPane.add(lbYear, null);
			jContentPane.add(getTxtYearDateFrom(), null);
			jContentPane.add(lbMonthDateFrom, null);
			jContentPane.add(lbDayDateFrom, null);
			jContentPane.add(getCbxDayDateFrom(), null);
			jContentPane.add(getTxtDateFromMonth(), null);
			jContentPane.add(lbDateTo, null);
			jContentPane.add(lbDatetoYear, null);
			jContentPane.add(getTxtDateToYear(), null);
			jContentPane.add(lbDateToMonth, null);
			jContentPane.add(getCbxDatetoMonth(), null);
			jContentPane.add(lbDateToDay, null);
			jContentPane.add(getCbxDateToDay(), null);
			jContentPane.add(lbReason, null);
			jContentPane.add(lbDateFromMess, null);
			jContentPane.add(lbDateToMess, null);
			jContentPane.add(getTxtReason(), null);
			jContentPane.add(lbReasonMess, null);
			jContentPane.add(lbAddress, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(lbPhone, null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(lbAddressMess, null);
			jContentPane.add(lbPhoneMess, null);
			jContentPane.add(getBtnSubmit(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtYearDateFrom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtYearDateFrom() {
		if (txtYearDateFrom == null) {
			txtYearDateFrom = new JTextField();
			txtYearDateFrom.setEnabled(false);
			txtYearDateFrom.setSize(new Dimension(70, 25));
			txtYearDateFrom.setLocation(new Point(157, 110));
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
			cbxDayDateFrom.setBounds(new Rectangle(384, 110, 57, 25));
		}
		return cbxDayDateFrom;
	}

	/**
	 * This method initializes txtDateFromMonth	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateFromMonth() {
		if (txtDateFromMonth == null) {
			txtDateFromMonth = new JTextField();
			txtDateFromMonth.setEnabled(false);
			txtDateFromMonth.setSize(new Dimension(70, 25));
			txtDateFromMonth.setLocation(new Point(276, 110));
		}
		return txtDateFromMonth;
	}

	/**
	 * This method initializes txtDateToYear	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateToYear() {
		if (txtDateToYear == null) {
			txtDateToYear = new JTextField();
			txtDateToYear.setEnabled(false);
			txtDateToYear.setSize(new Dimension(70, 25));
			txtDateToYear.setLocation(new Point(158, 159));
		}
		return txtDateToYear;
	}

	/**
	 * This method initializes cbxDatetoMonth	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDatetoMonth() {
		if (cbxDatetoMonth == null) {
			cbxDatetoMonth = new JComboBox();
			cbxDatetoMonth.setLocation(new Point(275, 159));
			cbxDatetoMonth.setSize(new Dimension(70, 25));
		}
		return cbxDatetoMonth;
	}

	/**
	 * This method initializes cbxDateToDay	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDateToDay() {
		if (cbxDateToDay == null) {
			cbxDateToDay = new JComboBox();
			cbxDateToDay.setLocation(new Point(384, 159));
			cbxDateToDay.setSize(new Dimension(57, 25));
		}
		return cbxDateToDay;
	}

	/**
	 * This method initializes txtReason	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtReason() {
		if (txtReason == null) {
			txtReason = new JTextField();
			txtReason.setSize(new Dimension(321, 53));
			txtReason.setLocation(new Point(120, 208));
		}
		return txtReason;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(120, 284));
			txtAddress.setSize(new Dimension(321, 25));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(120, 332));
			txtPhone.setSize(new Dimension(161, 25));
		}
		return txtPhone;
	}

	/**
	 * This method initializes btnSubmit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton();
			btnSubmit.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnSubmit.setLocation(new Point(45, 405));
			btnSubmit.setSize(new Dimension(110, 35));
			btnSubmit.setText("Submit");
		}
		return btnSubmit;
	}

	/**
	 * This method initializes btnReset	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton();
			btnReset.setIcon(new ImageIcon(getClass().getResource("/image/Symbols-Delete-icon.png")));
			btnReset.setLocation(new Point(180, 405));
			btnReset.setSize(new Dimension(110, 35));
			btnReset.setText("Reset");
		}
		return btnReset;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnExit.setLocation(new Point(317, 405));
			btnExit.setSize(new Dimension(110, 35));
			btnExit.setText("Exit");
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.LeaveDirector;
import business.Method;
import business.UserService;

public class LeaveappDirector extends JDialog {

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
	private JButton btnSubmit = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	/**
	 * @param owner
	 */
	public LeaveappDirector(Frame owner) {
		super(owner,true);
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
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize().getSize();
		Dimension dialogSize = this.getSize();
		this.setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
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
			txtYearDateFrom.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
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
			for(int i=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);i<32;i++){
				cbxDayDateFrom.addItem(i);
			}
			
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
			txtDateFromMonth.setText(String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1 ));
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
			txtDateToYear.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
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
			int i = Calendar.getInstance().get(Calendar.MONTH)+1;
			cbxDatetoMonth.addItem(i);
			//cbxDatetoMonth.addItem(i+1);
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
			for (int i=Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+1;i <32;i++){
				cbxDateToDay.addItem(i);
			}
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
	 * This method initializes btnSubmit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton();
			btnSubmit.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnSubmit.setLocation(new Point(30, 314));
			btnSubmit.setSize(new Dimension(110, 35));
			btnSubmit.setText("Submit");
			btnSubmit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
			
					if(txtReason.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Please input full of column!!");
					}else if(Method.CheckSpecialCharacter(txtReason.getText())==false){
								LeaveDirector leavedirector = new LeaveDirector();
								SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
								try{
									java.util.Date date = format.parse(txtYearDateFrom.getText().toString()+"/"+txtDateFromMonth.getText().toString()+"/"+cbxDayDateFrom.getSelectedItem().toString());
									Date datefrom = new Date(date.getTime());
									java.util.Date date1 = format.parse(txtDateToYear.getText().toString()+"/"+cbxDatetoMonth.getSelectedItem().toString()+"/"+cbxDateToDay.getSelectedItem().toString());
									Date dateto = new Date(date1.getTime());
									leavedirector.setDatefrom(datefrom);
									leavedirector.setDateto(dateto);
									leavedirector.setReason(txtReason.getText());
								
								}catch (Exception ex) {
									ex.printStackTrace();
								}try {
									int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to Add leave system ?");
									if(sr==0){
							
							
									UserService service = new UserService();
									service.creatLeaveDirector(leavedirector);
									JOptionPane.showMessageDialog(null, "Create LeaveApp successfully!!");
									LeaveappDirector.this.dispose();
									repaint();
									}
								
								} catch (Exception e2) {
									
									e2.printStackTrace();
								}
							
						}else {
							JOptionPane.showMessageDialog(null,"Khong nhap ky tu dac biet");
						}
										
					}
				});
				
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
			btnReset.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnReset.setLocation(new Point(178, 313));
			btnReset.setSize(new Dimension(110, 35));
			btnReset.setText("Reset");
			btnReset.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					txtReason.setText("");
				}
			});
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
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Cancel-2-icon.png")));
			btnExit.setLocation(new Point(331, 315));
			btnExit.setSize(new Dimension(110, 35));
			btnExit.setText("Exit");
			btnExit.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
						LeaveappDirector.this.dispose();
					}
				}
			});
		}
		return btnExit;
	}
	
	
}  //  @jve:decl-index=0:visual-constraint="10,10"

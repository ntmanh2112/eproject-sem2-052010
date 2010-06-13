package gui;

import java.awt.Color;
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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Leaveapp;
import model.User;
import business.LeaveappService;
import business.Method;
import business.UserService;
import javax.swing.ImageIcon;






public class CreateLeaveapp extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField txtReason = null;
	private JTextField txtAddress = null;
	private JTextField txtPhone = null;
	private JButton btnSend = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	private JLabel lbDateto = null;
	private JLabel lbYear = null;
	private JLabel lbDay = null;
	private JLabel lbMonth = null;
	private JComboBox cbxDay = null;
	private JLabel lbYear1 = null;
	private JLabel lbMonth1 = null;
	private JComboBox cbxMonth1 = null;
	private JLabel lbDay1 = null;
	private JComboBox cbxDay1 = null;
	private int id = 0;
	private User user = new User();  //  @jve:decl-index=0:
	private UserService service = new  UserService();
	private JLabel lbId_user = null;
	private JLabel lbDatefromMess = null;
	private JLabel lbDatetoMess = null;
	private JLabel lbReasonMess = null;
	private JLabel lbAddressMess = null;
	private JLabel lbPhoneMess = null;
	private JLabel lbIcon = null;
	private JTextField txtDateFromYear = null;
	private JTextField txtDateFromMonth = null;
	private JTextField txtDateToYear = null;
	private JTextField txtId_user = null;
	/**
	 * @param owner
	 */
	public CreateLeaveapp(Frame owner) {
		super(owner,true);
		initialize();
	}
	public CreateLeaveapp(Frame owner,int id) {
		super(owner);
		this.id = id;
		this.user = service.loadUser(id);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(468, 509);
		this.setContentPane(getJContentPane());
		this.setTitle("Welcome to Create Leave Application");
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
			lbIcon = new JLabel();
			lbIcon.setBounds(new Rectangle(50, 0, 46, 52));
			lbIcon.setIcon(new ImageIcon(getClass().getResource("/image/Document-Write-icon.png")));
			lbIcon.setText("");
			lbPhoneMess = new JLabel();
			lbPhoneMess.setText("");
			lbPhoneMess.setSize(new Dimension(307, 20));
			lbPhoneMess.setLocation(new Point(134, 380));
			lbAddressMess = new JLabel();
			lbAddressMess.setText("");
			lbAddressMess.setSize(new Dimension(307, 20));
			lbAddressMess.setLocation(new Point(134, 321));
			lbReasonMess = new JLabel();
			lbReasonMess.setText("");
			lbReasonMess.setSize(new Dimension(307, 20));
			lbReasonMess.setLocation(new Point(134, 260));
			lbDatetoMess = new JLabel();
			lbDatetoMess.setText("");
			lbDatetoMess.setSize(new Dimension(307, 20));
			lbDatetoMess.setLocation(new Point(133, 209));
			lbDatefromMess = new JLabel();
			lbDatefromMess.setText("");
			lbDatefromMess.setSize(new Dimension(307, 20));
			lbDatefromMess.setLocation(new Point(133, 145));
			lbId_user = new JLabel(String.valueOf(id));
			lbId_user.setBounds(new Rectangle(163, 59, 92, 16));
			lbId_user.setText("");
			lbDay1 = new JLabel();
			lbDay1.setText("Day");
			lbDay1.setSize(new Dimension(37, 20));
			lbDay1.setFont(new Font("Dialog", Font.BOLD, 18));
			lbDay1.setLocation(new Point(356, 177));
			lbMonth1 = new JLabel();
			lbMonth1.setText("Month");
			lbMonth1.setSize(new Dimension(57, 20));
			lbMonth1.setFont(new Font("Dialog", Font.BOLD, 18));
			lbMonth1.setLocation(new Point(249, 177));
			lbYear1 = new JLabel();
			lbYear1.setText("Year");
			lbYear1.setSize(new Dimension(47, 20));
			lbYear1.setFont(new Font("Dialog", Font.BOLD, 18));
			lbYear1.setLocation(new Point(133, 176));
			lbMonth = new JLabel();
			lbMonth.setFont(new Font("Dialog", Font.BOLD, 18));
			lbMonth.setLocation(new Point(250, 116));
			lbMonth.setSize(new Dimension(57, 20));
			lbMonth.setText("Month");
			lbDay = new JLabel();
			lbDay.setText("Day");
			lbDay.setLocation(new Point(357, 117));
			lbDay.setFont(new Font("Dialog", Font.BOLD, 18));
			lbDay.setSize(new Dimension(37, 20));
			lbYear = new JLabel();
			lbYear.setText("Year");
			lbYear.setLocation(new Point(134, 116));
			lbYear.setFont(new Font("Dialog", Font.BOLD, 18));
			lbYear.setSize(new Dimension(47, 20));
			lbDateto = new JLabel();
			lbDateto.setText("Date to (*)");
			lbDateto.setLocation(new Point(13, 176));
			lbDateto.setFont(new Font("Dialog", Font.BOLD, 18));
			lbDateto.setSize(new Dimension(121, 20));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone(*)");
			jLabel6.setSize(new Dimension(121, 20));
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel6.setLocation(new Point(14, 360));
			jLabel5 = new JLabel();
			jLabel5.setText("Address(*)");
			jLabel5.setSize(new Dimension(121, 20));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5.setLocation(new Point(14, 301));
			jLabel4 = new JLabel();
			jLabel4.setText("Reason(*)");
			jLabel4.setSize(new Dimension(121, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(13, 240));
			jLabel2 = new JLabel();
			jLabel2.setText("Date from(*)");
			jLabel2.setSize(new Dimension(121, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(13, 116));
			jLabel1 = new JLabel();
			jLabel1.setText("ID_USER");
			jLabel1.setSize(new Dimension(118, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(14, 71));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(96, 3, 304, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Leave Application");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtReason(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(getBtnSend(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(lbDateto, null);
			jContentPane.add(lbYear, null);
			jContentPane.add(lbDay, null);
			jContentPane.add(lbMonth, null);
			jContentPane.add(getCbxDay(), null);
			jContentPane.add(lbYear1, null);
			jContentPane.add(lbMonth1, null);
			jContentPane.add(getCbxMonth1(), null);
			jContentPane.add(lbDay1, null);
			jContentPane.add(getCbxDay1(), null);
			jContentPane.add(lbId_user, null);
			jContentPane.add(lbDatefromMess, null);
			jContentPane.add(lbDatetoMess, null);
			jContentPane.add(lbReasonMess, null);
			jContentPane.add(lbAddressMess, null);
			jContentPane.add(lbPhoneMess, null);
			jContentPane.add(lbIcon, null);
			jContentPane.add(getTxtDateFromYear(), null);
			jContentPane.add(getTxtDateFromMonth(), null);
			jContentPane.add(getTxtDateToYear(), null);
			jContentPane.add(getTxtId_user(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtReason	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtReason() {
		if (txtReason == null) {
			txtReason = new JTextField();
			txtReason.setLocation(new Point(133, 240));
			txtReason.setSize(new Dimension(307, 20));
			txtReason.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtReason.getText();
					if (a.length()<20) {
						lbReasonMess.setText("Reason is not more than 30 chars!!");
						lbReasonMess.setForeground(Color.red);
						lbReasonMess.setText("");
					}
					else {
						if(Method.CheckSpecialCharacter(a)) {
							JOptionPane.showMessageDialog(null, "Don't input special character!!!");
							lbReasonMess.setText(null);
						}else {
							lbReasonMess.setText("OK");
							lbReasonMess.setForeground(Color.green);
						}
					}
				}
			});
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
			txtAddress.setLocation(new Point(134, 301));
			txtAddress.setSize(new Dimension(307, 20));
			txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					String a = txtPhone.getText();
					char[] array = a.toCharArray();
					int t = 0;
					if (a.length()>20){
						JOptionPane.showMessageDialog(null, "Phone is not more than 20 chars!!");
						lbPhoneMess.setForeground(Color.red);
						txtPhone.setText("");
						txtPhone.requestFocus();
					}
						
					for (int i = 0 ; i < array.length ; i++){
						if (array[i]!='0' && array[i]!='1' && array[i]!='2' &&
							array[i]!='3' && array[i]!='4' && array[i]!='5' &&
							array[i]!='6' && array[i]!='7' && array[i]!='8' &&
							array[i]!='9'){
							t = 1;
							break;
						}
					}
					if (t == 1){
						lbPhoneMess.setText("Phone is number only");
						lbPhoneMess.setForeground(Color.red);
						txtPhone.setText("");
					}else {
						lbPhoneMess.setText("OK");
						lbPhoneMess.setForeground(Color.green);
					}
				}
			});
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
			txtPhone.setLocation(new Point(135, 360));
			txtPhone.setSize(new Dimension(135, 20));
		}
		return txtPhone;
	}

	/**
	 * This method initializes btnSend	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton();
			btnSend.setFont(new Font("Dialog", Font.BOLD, 14));
			btnSend.setLocation(new Point(15, 436));
			btnSend.setSize(new Dimension(106, 30));
			btnSend.setIcon(new ImageIcon(getClass().getResource("/image/Ok-icon.png")));
			btnSend.setText("Submit");
			btnSend.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(
							txtReason.getText().isEmpty()||
							txtAddress.getText().isEmpty()||
							txtPhone.getText().isEmpty()
						){
						JOptionPane.showMessageDialog(null, "Please input full of column!!");
					}else if(Integer.valueOf(cbxDay1.getSelectedItem().toString())< Integer.valueOf(cbxDay.getSelectedItem().toString()) && String.valueOf(cbxMonth1.getSelectedItem().toString()).equalsIgnoreCase(txtDateFromMonth.getText())){
						JOptionPane.showMessageDialog(null, " dateto must be larger than datefrom");
					}else{
						int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to Add User");
						if(sr==0){
							Leaveapp leave_app = new Leaveapp();
							leave_app.setId_user(id);
							SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
							try{
								java.util.Date date = format.parse(txtDateFromYear.getText().toString()+"/"+txtDateFromMonth.getText().toString()+"/"+cbxDay.getSelectedItem().toString());
								Date datefrom = new Date(date.getTime());
								java.util.Date date1 = format.parse(txtDateToYear.getText().toString()+"/"+cbxMonth1.getSelectedItem().toString()+"/"+cbxDay1.getSelectedItem().toString());
								Date dateto = new Date(date1.getTime());
								leave_app.setDatefrom(datefrom);
								leave_app.setDateto(dateto);
								leave_app.setReason(txtReason.getText());
								leave_app.setAddress(txtAddress.getText());
								leave_app.setPhone(txtPhone.getText());
							}catch (Exception ex) {
								ex.printStackTrace();
							}try {
								LeaveappService service = new LeaveappService();
								service.addLeaveApp(leave_app);
								JOptionPane.showMessageDialog(null, "Create Leaveapp successfully!!");
								CreateLeaveapp.this.dispose();
								repaint();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}	
					}
									
				}
			});
			
		}
		return btnSend;
	}

	/**
	 * This method initializes btnReset	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton();
			btnReset.setText("Reset");
			btnReset.setSize(new Dimension(106, 30));
			btnReset.setIcon(new ImageIcon(getClass().getResource("/image/Refresh-icon.png")));
			btnReset.setLocation(new Point(173, 436));
			btnReset.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					txtAddress.setText("");
					txtPhone.setText("");
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
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(106, 30));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Cancel-2-icon.png")));
			btnExit.setLocation(new Point(330, 436));
			btnExit.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit ?");
					if(sr==0){
					CreateLeaveapp.this.dispose();
					}
				}
			});
		}
		return btnExit;
	}
	
	/**
	 * This method initializes cbxDay	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDay() {
		if (cbxDay == null) {
			cbxDay = new JComboBox();
			cbxDay.setLocation(new Point(396, 117));
			cbxDay.setSize(new Dimension(45, 20));
			for(int i=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);i<32;i++){
				cbxDay.addItem(i);
			}
			
		}
		return cbxDay;
	}
	/**
	 * This method initializes txtDateFromYear	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateFromYear() {
		if (txtDateFromYear == null) {
			txtDateFromYear = new JTextField();
			txtDateFromYear.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
			txtDateFromYear.setLocation(new Point(180, 116));
			txtDateFromYear.setEnabled(false);
			txtDateFromYear.setSize(new Dimension(69, 20));
		}
		return txtDateFromYear;
	}
	/**
	 * This method initializes txtDateFromMonth	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDateFromMonth() {
		if (txtDateFromMonth == null) {
			txtDateFromMonth = new JTextField();
			txtDateFromMonth.setText(String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1));
			txtDateFromMonth.setLocation(new Point(308, 116));
			txtDateFromMonth.setEnabled(false);
			txtDateFromMonth.setSize(new Dimension(45, 20));
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
			txtDateToYear.setLocation(new Point(179, 176));
			txtDateToYear.setEnabled(false);
			txtDateToYear.setSize(new Dimension(69, 20));
		}
		return txtDateToYear;
	}
	/**
	 * This method initializes txtId_user	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtId_user() {
		if (txtId_user == null) {
			txtId_user = new JTextField(String.valueOf(id));
			txtId_user.setBounds(new Rectangle(133, 71, 115, 20));
			txtId_user.setEnabled(false);
		}
		return txtId_user;
	}
	public static void main(String [] args){
		new CreateLeaveapp(null).setVisible(true);
	}

	/**
	 * This method initializes cbxMonth1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxMonth1() {
		if (cbxMonth1 == null) {
			cbxMonth1 = new JComboBox();
			cbxMonth1.setSize(new Dimension(45, 20));
			cbxMonth1.setLocation(new Point(308, 178));
			int i = Calendar.getInstance().get(Calendar.MONTH)+1;
			cbxMonth1.addItem(i);
			cbxMonth1.addItem(i+1);
		}
		return cbxMonth1;
	}

	/**
	 * This method initializes cbxDay1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDay1() {
		if (cbxDay1 == null) {
			cbxDay1 = new JComboBox();
			cbxDay1.setLocation(new Point(396, 177));
			cbxDay1.setSize(new Dimension(45, 20));
			for(int i = 0;i<32;i++){
				cbxDay1.addItem(i);
			}
		}
		return cbxDay1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

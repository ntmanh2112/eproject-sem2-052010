package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import common.AddLeaveApp.addLeaveApp;
import common.AddUser.addResult;

import model.Leave_app;
import model.User;
import business.Leave_appService;
import business.UserService;






public class CreateLeaveapp extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField txtId_user = null;
	private JTextField txtReason = null;
	private JTextField txtAddress = null;
	private JTextField txtPhone = null;
	private JButton btnSend = null;
	private JButton btnReset = null;
	private JButton btnExit = null;
	private JLabel lbDateto = null;
	private JLabel lbYear = null;
	private JComboBox cbxYear = null;
	private JLabel lbDay = null;
	private JLabel lbMonth = null;
	private JComboBox cbxMonth = null;
	private JComboBox cbxDay = null;
	private JLabel lbYear1 = null;
	private JComboBox cbxYear1 = null;
	private JLabel lbMonth1 = null;
	private JComboBox cbxMonth1 = null;
	private JLabel lbDay1 = null;
	private JComboBox cbxDay1 = null;
	private int id = 0;
	private User user = new User();
	private UserService service = new  UserService();
	/**
	 * @param owner
	 */
	public CreateLeaveapp(Frame owner) {
		super(owner);
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
		this.setSize(468, 496);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbDay1 = new JLabel();
			lbDay1.setBounds(new Rectangle(352, 164, 28, 16));
			lbDay1.setText("Day");
			lbMonth1 = new JLabel();
			lbMonth1.setBounds(new Rectangle(262, 163, 44, 16));
			lbMonth1.setText("Month");
			lbYear1 = new JLabel();
			lbYear1.setBounds(new Rectangle(163, 161, 38, 16));
			lbYear1.setText("Year");
			lbMonth = new JLabel();
			lbMonth.setBounds(new Rectangle(270, 105, 38, 16));
			lbMonth.setText("Month");
			lbDay = new JLabel();
			lbDay.setBounds(new Rectangle(354, 106, 28, 16));
			lbDay.setText("Day");
			lbYear = new JLabel();
			lbYear.setBounds(new Rectangle(165, 104, 35, 16));
			lbYear.setText("Year");
			lbDateto = new JLabel();
			lbDateto.setText("Date to (*)");
			lbDateto.setLocation(new Point(15, 151));
			lbDateto.setFont(new Font("Dialog", Font.BOLD, 18));
			lbDateto.setSize(new Dimension(107, 20));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone(*)");
			jLabel6.setSize(new Dimension(121, 20));
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel6.setLocation(new Point(17, 298));
			jLabel5 = new JLabel();
			jLabel5.setText("Address(*)");
			jLabel5.setSize(new Dimension(121, 20));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5.setLocation(new Point(15, 255));
			jLabel4 = new JLabel();
			jLabel4.setText("Reason(*)");
			jLabel4.setSize(new Dimension(121, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(15, 196));
			jLabel2 = new JLabel();
			jLabel2.setText("Date from(*)");
			jLabel2.setSize(new Dimension(121, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(15, 105));
			jLabel1 = new JLabel();
			jLabel1.setText("ID_USERNAME");
			jLabel1.setSize(new Dimension(121, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setLocation(new Point(15, 56));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(172, 3, 111, 37));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Leav app");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(getTxtReason(), null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(getBtnSend(), null);
			jContentPane.add(getBtnReset(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(lbDateto, null);
			jContentPane.add(lbYear, null);
			jContentPane.add(getCbxYear(), null);
			jContentPane.add(lbDay, null);
			jContentPane.add(lbMonth, null);
			jContentPane.add(getCbxMonth(), null);
			jContentPane.add(getCbxDay(), null);
			jContentPane.add(lbYear1, null);
			jContentPane.add(getCbxYear1(), null);
			jContentPane.add(lbMonth1, null);
			jContentPane.add(getCbxMonth1(), null);
			jContentPane.add(lbDay1, null);
			jContentPane.add(getCbxDay1(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtId_user == null) {
			txtId_user = new JTextField(user.getId_user());
			txtId_user.setLocation(new Point(165, 56));
			txtId_user.setSize(new Dimension(75, 20));
		}
		return txtId_user;
	}

	/**
	 * This method initializes txtReason	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtReason() {
		if (txtReason == null) {
			txtReason = new JTextField();
			txtReason.setLocation(new Point(164, 196));
			txtReason.setSize(new Dimension(271, 40));
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
			txtAddress.setLocation(new Point(165, 255));
			txtAddress.setSize(new Dimension(271, 20));
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
			txtPhone.setLocation(new Point(165, 298));
			txtPhone.setSize(new Dimension(271, 20));
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
			btnSend.setLocation(new Point(30, 345));
			btnSend.setSize(new Dimension(106, 30));
			btnSend.setText("Send");
			btnSend.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(
							txtReason.getText().isEmpty()||
							txtAddress.getText().isEmpty()||
							txtPhone.getText().isEmpty()||
							cbxDay.getSelectedItem().toString().isEmpty()||
							cbxDay1.getSelectedItem().toString().isEmpty()||
							cbxMonth.getSelectedItem().toString().isEmpty()||
							cbxMonth1.getSelectedItem().toString().isEmpty()||
							cbxYear.getSelectedItem().toString().isEmpty()||
							cbxYear1.getSelectedItem().toString().isEmpty()
						){
						JOptionPane.showMessageDialog(null, "Please input full of column!!");
					}else{
						Leave_app leave_app = new Leave_app();
						leave_app.setId_leaveapp(id);
						SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
						try{
							java.util.Date date = format.parse(cbxYear.getSelectedItem().toString()+"/"+cbxMonth.getSelectedItem().toString()+"/"+cbxDay.getSelectedItem().toString());
							Date datefrom = new Date(date.getTime());
							java.util.Date date1 = format.parse(cbxYear1.getSelectedItem().toString()+"/"+cbxMonth1.getSelectedItem().toString()+"/"+cbxDay1.getSelectedItem().toString());
							Date dateto = new Date(date1.getTime());
							leave_app.setDatefrom(datefrom);
							leave_app.setDateto(dateto);
							leave_app.setReason(txtReason.getText());
							leave_app.setAdress(txtAddress.getText());
							leave_app.setPhone(txtPhone.getText());
						}catch (Exception ex) {
							ex.printStackTrace();
						}
						try {
							Leave_appService leaveappserive = new Leave_appService();
							addLeaveApp addleave = leaveappserive.addLeaveApp(leave_app);
							if (addleave == addleave.incorrect) {
								JOptionPane.showMessageDialog(null, "This USERNAME is exist!!");
							}
							else if (addleave == addleave.sucessful) {
								JOptionPane.showMessageDialog(null, "Add member successfully!!");
								CreateLeaveapp.this.dispose();
							}
							
						} catch (Exception e2) {
							
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
			btnReset.setLocation(new Point(164, 345));
			btnReset.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					txtId_user.setText("");
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
			btnExit.setLocation(new Point(301, 345));
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					CreateLeaveapp.this.dispose();
					
				}
			});
		}
		return btnExit;
	}
	
	/**
	 * This method initializes cbxYear	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxYear() {
		if (cbxYear == null) {
			cbxYear = new JComboBox();
			cbxYear.setBounds(new Rectangle(199, 102, 69, 25));

			for(int i=2010;i<2021;i++){
				cbxYear.addItem(i);
			}

			for(int i = 2010 ;i< 2020;i++){
				cbxYear.addItem(i);
			}

		}
		return cbxYear;
	}

	/**
	 * This method initializes cbxMonth	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxMonth() {
		if (cbxMonth == null) {
			cbxMonth = new JComboBox();
			cbxMonth.setBounds(new Rectangle(308, 102, 45, 25));
			for(int i=1;i<13;i++){
				cbxMonth.addItem(i);
			}
			for(int i = 1 ;i< 13;i++){
				cbxMonth.addItem(i);
			}
		}
		return cbxMonth;
	}

	/**
	 * This method initializes cbxDay	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxDay() {
		if (cbxDay == null) {
			cbxDay = new JComboBox();
			cbxDay.setBounds(new Rectangle(381, 102, 45, 25));
			for(int i=1;i<32;i++){
				cbxDay.addItem(i);
			}
			for(int i = 1 ;i< 32;i++){
				cbxDay.addItem(i);
			}
		}
		return cbxDay;
	}
	public static void main(String [] args){
		new CreateLeaveapp(null).setVisible(true);
	}

	/**
	 * This method initializes cbxYear1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxYear1() {
		if (cbxYear1 == null) {
			cbxYear1 = new JComboBox();
			cbxYear1.setBounds(new Rectangle(202, 162, 60, 25));
			for(int i = 2010 ;i< 2020;i++){
				cbxYear1.addItem(i);
			}
		}
		return cbxYear1;
	}

	/**
	 * This method initializes cbxMonth1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbxMonth1() {
		if (cbxMonth1 == null) {
			cbxMonth1 = new JComboBox();
			cbxMonth1.setBounds(new Rectangle(306, 163, 46, 25));
			for(int i = 1 ;i< 13;i++){
				cbxMonth1.addItem(i);
			}
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
			cbxDay1.setBounds(new Rectangle(378, 163, 50, 25));
			for(int i = 1 ;i< 32;i++){
				cbxDay1.addItem(i);
			}
		}
		return cbxDay1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

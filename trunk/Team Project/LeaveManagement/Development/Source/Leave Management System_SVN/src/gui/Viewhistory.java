package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.sql.ResultSet;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import dao.LeaveDAO;

import model.User;
import business.UserService;

public class Viewhistory extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	public int id = 0;
	public User user = new User();  //  @jve:decl-index=0:
	public UserService service = new  UserService();  //  @jve:decl-index=0:
	private JLabel jLabel = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel5 = null;
	private JTextField txtFullname = null;
	private JTextField txtTotalappleave = null;
	private JTextField txtTotaldaycanleave = null;
	private JButton btnExit = null;
	private JTextField txtPisitionname = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel6 = null;
	private JTextField txtAddress = null;
	private JTextField jTextField = null;
	private JLabel jLabel7 = null;
	

	/**
	 * @param owner
	 */
	public Viewhistory() {
		super();
		initialize();

	}

	public Viewhistory(int id) {
		super();
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
		this.setSize(410, 406);
		this.setTitle("View history of leave day since joining the  company");
		this.setContentPane(getJContentPane());
		totalapproveLeave();
		totalCanDayOff();
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
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(39, 12, 66, 56));
			jLabel7.setText("");
			jLabel6 = new JLabel();
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel6.setLocation(new Point(15, 222));
			jLabel6.setSize(new Dimension(134, 20));
			jLabel6.setText("Phone");
			jLabel4 = new JLabel();
			jLabel4.setText("Address");
			jLabel4.setSize(new Dimension(134, 20));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setLocation(new Point(15, 174));
			jLabel1 = new JLabel();
			jLabel1.setName("");
			jLabel1.setLocation(new Point(15, 130));
			jLabel1.setSize(new Dimension(134, 20));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1.setText("Position Name");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(128, 23, 145, 37));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel5.setText("View History");
			jLabel3 = new JLabel();
			jLabel3.setText("Total approval leave ");
			jLabel3.setSize(new Dimension(209, 20));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3.setLocation(new Point(15, 265));
			jLabel2 = new JLabel();
			jLabel2.setText("Total day can leave");
			jLabel2.setSize(new Dimension(239, 20));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2.setLocation(new Point(13, 310));
			jLabel = new JLabel();
			jLabel.setText("Full Name");
			jLabel.setSize(new Dimension(121, 20));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel.setLocation(new Point(15, 85));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtFullname(), null);
			jContentPane.add(getTxtTotalappleave(), null);
			jContentPane.add(getTxtTotaldaycanleave(), null);
			jContentPane.add(getBtnExit(), null);
			jContentPane.add(getTxtPisitionname(), null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(jLabel7, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtFullname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFullname() {
		if (txtFullname == null) {
			txtFullname = new JTextField(this.user.getFullname());
			txtFullname.setLocation(new Point(149, 85));
			txtFullname.setSize(new Dimension(229, 20));
		}
		return txtFullname;
	}

	/**
	 * This method initializes txtTotalappleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotalappleave() {
		if (txtTotalappleave == null) {
			txtTotalappleave = new JTextField();
			txtTotalappleave.setBounds(new Rectangle(253, 266, 122, 20));
		}
		return txtTotalappleave;
	}

	/**
	 * This method initializes txtTotaldaycanleave	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTotaldaycanleave() {
		if (txtTotaldaycanleave == null) {
			txtTotaldaycanleave = new JTextField();
			txtTotaldaycanleave.setLocation(new Point(253, 310));
			txtTotaldaycanleave.setSize(new Dimension(122, 20));
		}
		return txtTotaldaycanleave;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setBounds(new Rectangle(148, 337, 86, 24));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/image/Cancel-2-icon.png")));
			btnExit.setText("Exit");
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Viewhistory.this.dispose();
				}
			});
		}
		return btnExit;
	}

	/**
	 * This method initializes txtPisitionname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPisitionname() {
		if (txtPisitionname == null) {
			txtPisitionname = new JTextField(user.getPosition_name());
	
			txtPisitionname.setLocation(new Point(148, 130));
			txtPisitionname.setSize(new Dimension(228, 20));
		}
		return txtPisitionname;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField(user.getAddress());
			txtAddress.setSize(new Dimension(228, 20));
			txtAddress.setLocation(new Point(148, 174));
		}
		return txtAddress;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField(user.getPhone());
			jTextField.setBounds(new Rectangle(148, 223, 123, 20));
		}
		return jTextField;
	}

	public void totalapproveLeave(){
		try {
			ResultSet rs = LeaveDAO.selectAllDayApprove(this.user);
			if(rs.next()){
				txtTotalappleave.setText(rs.getString("TOTALDAYOFF"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void totalCanDayOff(){
		try {
			ResultSet rs = LeaveDAO.selectAllCanDayApprove(this.user);
			if(rs.next()){
				txtTotaldaycanleave.setText(rs.getString("TOTALCANDAYOFF"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}  //  @jve:decl-index=0:visual-constraint="10,10"

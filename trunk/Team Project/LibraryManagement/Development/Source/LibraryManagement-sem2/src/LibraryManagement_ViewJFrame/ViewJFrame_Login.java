package LibraryManagement_ViewJFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import LibraryManagement_Common.Common_Constant;

import LibraryManagement_Util.Util_StringUtil;
import LibraryManagement_ViewJPanel.ViewJPanel_Image;

import LibraryManagement_Common.Common_Constant;

public class ViewJFrame_Login extends JFrame{
	/**
	 * Các biến toàn cục của trang này
	 */
	private static final long serialVersionUID = 1L;	
	private JTextField txtTenDangNhap;
	//private JPasswordField txtMatKhau;
	private JTextField txtMatKhau;
	private JLabel lbTieuDe;
	private JLabel lbTenDangNhap;
	private JLabel lbMatKhau;
	private JButton btnDangNhap;
	private JButton btnThoat;
	private JMenuBar jm_bar; 
	private GridBagConstraints contraints;	
	private ViewJPanel_Image ip;
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	public ViewJFrame_Login() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	private void init() {
		Container c = this.getContentPane();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("images/1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        		
        ip = new ViewJPanel_Image(image, 
        					Double.valueOf(dim.getWidth()).intValue(),  
        						Double.valueOf(dim.getHeight()).intValue());
        ip.setLayout(new GridBagLayout());
        contraints = new GridBagConstraints();
        
		this.setLayout(new BorderLayout());
		this.setTitle(Common_Constant.MESSAGE.getString("lbTitle"));						
		
		initLabel();
		initTextfield();
		//initCheckbox();
		initButton();
		initMenu();
		
		c.add(ip, BorderLayout.CENTER);

		this.setJMenuBar(jm_bar);		
		this.setPreferredSize(dim);
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	private void initLabel() {
		lbTieuDe = new JLabel(Common_Constant.MESSAGE.getString("lbTieuDe"));		
		lbTieuDe.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lbTieuDe.setForeground(new Color(0,0,255));
		contraints.gridx = 0;
		contraints.gridy = 0;
		contraints.gridwidth = 2;
		contraints.insets = new Insets(10, 100, 0, 100);
		ip.add(lbTieuDe, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		
		lbTenDangNhap = new JLabel(Common_Constant.MESSAGE.getString("lbTenDangNhap"));
		contraints.gridx = 0;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(0, 40, 10, 0);
		ip.add(lbTenDangNhap, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		
		lbMatKhau = new JLabel(Common_Constant.MESSAGE.getString("lbMatKhau"));
		contraints.gridx = 0;
		contraints.gridy = 2;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(0, 40, 10, 0);
		ip.add(lbMatKhau, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
	}
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	private void initTextfield() {
		txtTenDangNhap =  new JTextField();
		txtTenDangNhap.setPreferredSize(new Dimension(150, 25));
		txtTenDangNhap.setBackground(getForeground());
		contraints.gridx = 1;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(10, 50, 10, 50);
		ip.add(txtTenDangNhap, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		
		//txtMatKhau =  new JPasswordField();
		txtMatKhau =  new JTextField();
		txtMatKhau.setPreferredSize(new Dimension(150, 25));
		txtMatKhau.setBackground(getForeground());
		contraints.gridx = 1;
		contraints.gridy = 2;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(0, 50, 10, 50);
		ip.add(txtMatKhau, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
	}
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	private void initButton() {
		btnDangNhap = new JButton(Common_Constant.MESSAGE.getString("btnDangNhap"));
		btnDangNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String username = txtTenDangNhap.getText();			
				String password = txtMatKhau.getText();
				
				new ViewJFrame_Employee();
				setVisible(false);
			}
			
		});
		contraints.gridx = 0;
		contraints.gridy = 4;
		contraints.gridwidth = 2;
		contraints.insets = new Insets(0, 0, 10, 0);
		//contraints.anchor = GridBagConstraints.CENTER;
		ip.add(btnDangNhap, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		
		btnThoat = new JButton(Common_Constant.MESSAGE.getString("btnThoat"));
		btnThoat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
			
		});
		contraints.gridx = 1;
		contraints.gridy = 4;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(0, 50, 10, 0);
		//contraints.anchor = GridBagConstraints.CENTER;
		ip.add(btnThoat, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
	}
	private void initMenu(){
		jm_bar = new JMenuBar();
		JMenu jm_maychu = new JMenu(Common_Constant.MESSAGE.getString("jmmaychu"));
		JMenuItem jm_tienganh = new JMenuItem(Common_Constant.MESSAGE.getString("jmtiengviet"));
		jm_tienganh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(Common_Constant.LANGUAGE == 0){
				Common_Constant.LANGUAGE = 1;
			new ViewJFrame_Login();
			Exit();
			}else{
				Common_Constant.LANGUAGE=0;
			new ViewJFrame_Login();
			Exit();
			}
			}
			});
		JMenuItem jm_thoat = new JMenuItem(Common_Constant.MESSAGE.getString("jmthoat"));
		jm_bar.add(jm_maychu);
		jm_maychu.add(jm_tienganh);
		jm_maychu.add(jm_thoat);
		jm_thoat.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
			int sr = JOptionPane.showConfirmDialog(null,"Are you sure to want to quit");
			if(sr==0){
			System.exit(1);
			}
			}
			});
	}
	public void Exit(){
		int count = JFrame.getFrames().length;
		for(int i=0;i<count-1;i++){
			JFrame.getFrames()[i].setVisible(false);
			JFrame.getFrames()[i].dispose();
		}
	}	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common_Constant.initResourceBundle();
		new ViewJFrame_Login();
	}
}

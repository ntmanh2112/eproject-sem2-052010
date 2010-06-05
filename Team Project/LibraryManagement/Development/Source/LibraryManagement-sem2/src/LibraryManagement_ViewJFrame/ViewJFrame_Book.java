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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import LibraryManagement_Common.Common_Constant;
import LibraryManagement_Dao.Dao_Book;
import LibraryManagement_Model.Model_Book;
import LibraryManagement_ViewJPanel.ViewJPanel_BookTable;
import LibraryManagement_ViewJPanel.ViewJPanel_Image;

public class ViewJFrame_Book extends JFrame{
	private static final long serialVersionUID = 1L;	
	private JComboBox cbx_Phong;
	private JTextField txt_Ten;	
	private JLabel lb_TieuDe;
	private JLabel lb_HoTen;
	private JLabel lb_PhongBan;	
	private JButton btn_TimKiem;
	private JButton btn_ThemMoi;
	private JButton btn_CapNhat;
	private JButton btn_Xoa;
	private GridBagConstraints contraints;	
	private ViewJPanel_Image ip;		
	
	public ViewJFrame_Book(){
		try {			
			setDefaultCloseOperation(EXIT_ON_CLOSE);			
			loadTableData("initTable","");
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void init() {
		Container c = this.getContentPane();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("images/1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}        				
		
        ip = new ViewJPanel_Image(image, 
        					Double.valueOf(dim.getWidth()).intValue(),  
        						Double.valueOf(dim.getHeight()).intValue());
        ip.setLayout(new GridBagLayout());
        contraints = new GridBagConstraints();       
                
		this.setLayout(new BorderLayout());
		this.setTitle(Common_Constant.MESSAGE.getString("lbTitleBook"));						
		
		initLabel();
		initCombobox();
		initTextfield();
		initButton();
		initTable();
		
		ip.setBorder(new BevelBorder( BevelBorder.LOWERED ));		
		c.add(ip, BorderLayout.CENTER);		
		
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
		lb_TieuDe = new JLabel(Common_Constant.MESSAGE.getString("lbEditBook"));		
		lb_TieuDe.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lb_TieuDe.setForeground(new Color(0,0,255));
		contraints.gridx = 0;
		contraints.gridy = 0;
		contraints.gridwidth = 5;
		contraints.anchor = GridBagConstraints.EAST;
		contraints.insets = new Insets(10, 50, 30, 300);
		ip.add(lb_TieuDe, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		
		lb_PhongBan = new JLabel(Common_Constant.MESSAGE.getString("lbTypeBook"));
		contraints.gridx = 0;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		//contraints.insets = new Insets(10, 50, 10, 0);
		ip.add(lb_PhongBan, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);		
		
		lb_HoTen = new JLabel(Common_Constant.MESSAGE.getString("lbNameBook"));
		contraints.gridx = 2;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		//contraints.insets = new Insets(10, 50, 10, 0);
		contraints.anchor = GridBagConstraints.WEST;
		ip.add(lb_HoTen, contraints);
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
		txt_Ten =  new JTextField();		
		txt_Ten.setPreferredSize(new Dimension(200, 25));
		contraints.gridx = 3;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		contraints.anchor = GridBagConstraints.WEST;
		contraints.insets = new Insets(10, 0, 10, 0);
		ip.add(txt_Ten, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		contraints.anchor = GridBagConstraints.EAST;
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
	private void initCombobox() {
		cbx_Phong =  new JComboBox();		
		cbx_Phong.setPreferredSize(new Dimension(150, 25));
		contraints.gridx = 1;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		contraints.anchor = GridBagConstraints.WEST;
		contraints.insets = new Insets(10, 10, 10, 0);
		ip.add(cbx_Phong, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
		contraints.anchor = GridBagConstraints.EAST;
	}		
	private void initButton() {
		btn_TimKiem = new JButton(Common_Constant.MESSAGE.getString("btnSearch"));
		contraints.gridx = 4;
		contraints.gridy = 1;
		contraints.gridwidth = 1;
		//contraints.insets = new Insets(0, 0, 10, 0);		
		ip.add(btn_TimKiem, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);		
		
		btn_ThemMoi = new JButton(Common_Constant.MESSAGE.getString("btnAdd"));
		contraints.gridx = 1;
		contraints.gridy = 3;
		contraints.gridwidth = 1;
		contraints.insets = new Insets(0, 200, 0, 0);
		contraints.anchor = GridBagConstraints.WEST;
		ip.add(btn_ThemMoi, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);	
		
		btn_CapNhat = new JButton(Common_Constant.MESSAGE.getString("btnUpdate"));
		contraints.gridx = 2;
		contraints.gridy = 3;
		contraints.gridwidth = 1;
		//contraints.insets = new Insets(0, 0, 10, 0);
		contraints.anchor = GridBagConstraints.WEST;
		ip.add(btn_CapNhat, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);	
		
		btn_Xoa = new JButton(Common_Constant.MESSAGE.getString("btnDelete"));
		contraints.gridx = 3;
		contraints.gridy = 3;
		contraints.gridwidth = 1;
		//contraints.insets = new Insets(0, 0, 10, 0);
		//contraints.anchor = GridBagConstraints.CENTER;
		ip.add(btn_Xoa, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
	}



private void initTable() {
contraints.gridx = 0;
contraints.gridy = 2;
contraints.gridwidth = 5;		
//contraints.insets = new Insets(0, 50, 10, 50);
ip.add(new ViewJPanel_BookTable(), contraints);
contraints.insets = new Insets(0, 0, 0, 0);
}

private void loadTableData(String maPhong, String hoTen) {
if (maPhong.equals("initTable")) {
	ArrayList<Model_Book> listNhanVien = Dao_Book.searchAllBook();			
	int row = 0;
	ViewJPanel_BookTable.data = new Object[listNhanVien.size()][12];
	for (Model_Book obj : listNhanVien) {					
		ViewJPanel_BookTable.data[row][0] = new Boolean(false);
		ViewJPanel_BookTable.data[row][1] = row+1;
		ViewJPanel_BookTable.data[row][2] = obj.getId();
		ViewJPanel_BookTable.data[row][3] = obj.getCallnumber();
		ViewJPanel_BookTable.data[row][4] = obj.getISBN();
		ViewJPanel_BookTable.data[row][5] = obj.getTitle();				
		ViewJPanel_BookTable.data[row][6] = obj.getAuthorID();
		ViewJPanel_BookTable.data[row][7] = obj.getStatus();
		ViewJPanel_BookTable.data[row][8] = obj.getLast_updated_date();
		ViewJPanel_BookTable.data[row][9] = obj.getTypeID();
		ViewJPanel_BookTable.data[row][10] = obj.getProducersID();
		ViewJPanel_BookTable.data[row][11] = obj.getAddress();
		row++;
	}
}else {
	ArrayList<Model_Book> listNhanVien = Dao_Book.searchBookByDieuKien(maPhong, hoTen);							

int row = 0;			

ViewJPanel_BookTable.model.setRowCount(listNhanVien.size());
for (Model_Book obj : listNhanVien) {
	Object[] rowData = new Object[12];
	rowData[0] = new Boolean(false);
	rowData[1] = row + 1;
	rowData[2] = obj.getId();
	rowData[3] = obj.getCallnumber();
	rowData[4] = obj.getISBN();
	rowData[5] = obj.getTitle();
	rowData[6] = obj.getAuthorID();
	rowData[7] = obj.getStatus();
	rowData[8] = obj.getLast_updated_date();
	rowData[9] = obj.getTypeID();
	rowData[10] = obj.getProducersID();
	rowData[11] = obj.getAddress();
	
	ViewJPanel_BookTable.model.addRow(rowData,row);
	row++;
}
repaint();
}
}	

public static void main(String[]agrs){
	Common_Constant.initResourceBundle();
	new ViewJFrame_Book();
}
}

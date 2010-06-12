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

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

import LibraryManagement_Common.Common_Constant;
import LibraryManagement_ViewJPanel.ViewJPanel_Image;

public class ViewJFrame_ChiTietBook extends JFrame{
	private JLabel lb_TieuDeEdit;
	private GridBagConstraints contraints;	
	private ViewJPanel_Image ip;		
	public ViewJFrame_ChiTietBook(){
		try {			
			setDefaultCloseOperation(EXIT_ON_CLOSE);			
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void init(){
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
		initTextfield();
		initButton();
		
		ip.setBorder(new BevelBorder( BevelBorder.LOWERED ));		
		c.add(ip, BorderLayout.CENTER);		
		
		this.setPreferredSize(dim);
		
		this.pack();
		this.setVisible(true);
	}
	private void initLabel(){
		lb_TieuDeEdit = new JLabel();
		lb_TieuDeEdit.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lb_TieuDeEdit.setForeground(new Color(0,0,255));
		contraints.gridx = 0;
		contraints.gridy = 0;
		contraints.gridwidth = 5;
		contraints.anchor = GridBagConstraints.EAST;
		contraints.insets = new Insets(10, 50, 30, 300);
		ip.add(lb_TieuDeEdit, contraints);
		contraints.insets = new Insets(0, 0, 0, 0);
	}
	private void initTextfield(){
		
	}
	private void initButton(){
		
	}
	public static void main(String []agrs){
		Common_Constant.initResourceBundle();
		new ViewJFrame_ChiTietBook();
	}
}

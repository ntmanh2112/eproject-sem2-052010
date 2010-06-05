package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	public Image img;
	public Integer width;
	public Integer hight;
	
	public ImagePanel(Image value,Integer width,Integer hight){
		try {
			this.img = value;
			this.width = width;
			this.hight = hight;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 600,300, null);
		
	}
	

}

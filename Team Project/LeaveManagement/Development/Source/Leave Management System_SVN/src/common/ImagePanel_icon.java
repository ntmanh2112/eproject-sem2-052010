package common;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel_icon extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public ImagePanel_icon(String value) {
		this.img = new ImageIcon(value).getImage();
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

package LibraryManagement_ViewJPanel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import LibraryManagement_Model.Model_BookCustom;
import LibraryManagement_Model.Model_EmployeeCustom;

public class ViewJPanel_BookTable extends JPanel{
	private static final long serialVersionUID = 1L;
	public static Model_BookCustom model;
	public static JScrollPane scrollpane;
	public static JTable table;
	public static String phongKeySearch = "";
	
	public static Object[][] data=null;
public ViewJPanel_BookTable() {		
	
	scrollpane = new JScrollPane();
	
/*   	listSelected = new ArrayList<String>();*/
	model = new Model_BookCustom(data);    	    

	table = new JTable(model);
	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);		
	scrollpane.setViewportView(table);
	scrollpane.setPreferredSize(new Dimension(825,500));        		
	
    //Add the scroll pane to this panel.
    add(scrollpane);
}
}

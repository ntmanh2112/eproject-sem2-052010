package LibraryManagement_ViewJPanel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import LibraryManagement_Model.Model_EmployeeCustom;

public class ViewJPanel_EmployeeTable extends JPanel{
	private static final long serialVersionUID = 1L;
	public static Model_EmployeeCustom model;
	public static JScrollPane scrollpane;
	public static JTable table;
	public static String phongKeySearch = "";
	
	public static Object[][] data=null;
public ViewJPanel_EmployeeTable() {		
	
	scrollpane = new JScrollPane();
	
/*   	listSelected = new ArrayList<String>();*/
	model = new Model_EmployeeCustom(data);    	    

	table = new JTable(model);
	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);		
	scrollpane.setViewportView(table);
	scrollpane.setPreferredSize(new Dimension(600,500));        		
	
    //Add the scroll pane to this panel.
    add(scrollpane);
}
}

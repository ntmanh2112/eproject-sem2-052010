package LibraryManagement_ViewJPanel;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import LibraryManagement_Model.Model_BookCustom;

public class ViewJPanel_BookTable extends JPanel{
	private static final long serialVersionUID = 1L;
	public static Model_BookCustom model;
	public static JScrollPane scrollpane;
	public static JTable table;
	public static ArrayList<String> listSelected;
	public static String phongKeySearch = "";
	
	public static Object[][] data=null;
public ViewJPanel_BookTable() {		
	
	scrollpane = new JScrollPane();
	
	listSelected = new ArrayList<String>();
	model = new Model_BookCustom(data);    	
	model.addTableModelListener(new TableModelListener() {
		@Override
		public void tableChanged(TableModelEvent e) {
			int row = e.getFirstRow();
            int column = e.getColumn();
            TableModel tableModel = (TableModel)e.getSource();
            Object cellValue = tableModel.getValueAt(row, column).toString();
            if (cellValue.equals("true")) {                	
            	listSelected.add(tableModel.getValueAt(row, 2).toString());
            } else {
            	listSelected.remove(tableModel.getValueAt(row, 2).toString());
            }
			
		}
		
	});  	    

	table = new JTable(model);
	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);		
	scrollpane.setViewportView(table);
	scrollpane.setPreferredSize(new Dimension(825,500));        		
	
    //Add the scroll pane to this panel.
    add(scrollpane);
}
}

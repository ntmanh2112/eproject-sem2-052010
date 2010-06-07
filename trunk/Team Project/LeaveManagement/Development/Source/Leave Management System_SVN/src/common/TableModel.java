package common;

import javax.swing.table.DefaultTableModel;

public class TableModel extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TableModel (String[][] data,String[] column){
		super.setDataVector(data, column);
	}
	
	public void setData(String[][] data) {
        dataVector = super.convertToVector(data);
        fireTableDataChanged();
    }
}
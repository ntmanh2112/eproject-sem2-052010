package LibraryManagement_Model;

import javax.swing.table.AbstractTableModel;

public class Model_EmployeeCustom extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
	Object[] columnNames = { "CheckBok", "Thứ Tự", "UserName", "FullName",
			"Address", "PhoneNumber", "Department", "Status" };
	private Object[][] data = null;
	public Model_EmployeeCustom() {

	}
	public Model_EmployeeCustom(Object[][] data) {
		this.data = data;
	}
	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return data.length;
	}
	public String getColumnName(int col) {
		return columnNames[col].toString();
	}
	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
	@SuppressWarnings("unchecked")
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	public boolean isCellEditable(int row, int col) {
		return (col == 1 || col == 2) ? false : true;
	}
	public void setValueAt(Object value, int row, int col) {
		data[row][col] = value;
		fireTableCellUpdated(row, col);
	}
	public void setRowCount(int value) {
		data = new Object[value][12];
	}
	public void addRow(Object[] value, int row) {
		data[row] = value;
	}

}

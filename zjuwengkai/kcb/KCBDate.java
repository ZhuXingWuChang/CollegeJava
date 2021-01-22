package zjuwengkai.kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBDate implements TableModel
{
    private String[] title = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };
    private String[][] data = new String[8][7];
    
    public KCBDate()
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                data[i][j] = "";
            }
        }
    }
    
    @Override
    public int getRowCount()
    {
        // 我们的表格有8行
        return 8;
    }
    
    @Override
    public int getColumnCount()
    {
        // 我们的表格有7列
        return 7;
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        // 把title作为行的名称
        return title[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        // 每一行的类型都是String
        return String.class;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        // 每个格子都是可以被编辑的
        return true;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        data[rowIndex][columnIndex] = (String) aValue;
    }
    
    @Override
    public void addTableModelListener(TableModelListener l)
    {
    
    }
    
    @Override
    public void removeTableModelListener(TableModelListener l)
    {
    
    }
}

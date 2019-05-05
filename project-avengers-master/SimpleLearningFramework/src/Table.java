import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table<T> {

	private static final int DEFAULT_COLUMNS = 3;
	private Column[] columns;
	private List<List<Row>> rows;
	
	
	public Table()
	{
		this(DEFAULT_COLUMNS);
	}
	
	public Table(int columnNumbers)
	{
		this.columns = new Column[columnNumbers];
		this.rows = new ArrayList<>();
	}
	public Table(int columnNumbers, List<Column>columns)
	{
		this.columns = new Column[columnNumbers];
		for(int i=0; i < columns.size(); i++)
		{
			this.columns[i] = columns.get(i);
		}
		this.rows = new ArrayList<>();
	}
	
	public Table(List<Column>columns)
	{
		this(columns.size(),columns);
		
	}
	
	
	
	public Row getRow()
	{
		return null;
	}
	
	
	
}

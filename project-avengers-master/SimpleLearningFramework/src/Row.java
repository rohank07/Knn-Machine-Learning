
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Abu Abdul
 *
 * @param <T>
 */
public class Row<T> {
	
	private List<DataValue<T>> values;
	
	
	public Row()
	{
		this.values = new ArrayList<>();
	}
	
	public Row(List<DataValue<T>> values)
	{
		this.values = new ArrayList<>();
		for(DataValue<T> somevalue : values)
		{
			this.values.add(somevalue);
		}
	}
	
	
	public void addValue(DataValue<T> value)
	{
		this.values.add(value);
	}
	
	public DataValue<T> getValue(int index)
	{
		return this.values.get(index);
	}
	
	public DataValue<T>removeValue(int index)
	{
		return this.values.remove(index);
	}
	
	public List<DataValue<T>> getValues()
	{
		return this.values;
	}
	

}

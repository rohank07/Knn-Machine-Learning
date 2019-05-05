/**
 * 
 * @author Abu Abdul
 *
 * @param <T>
 */
public class DataValue<T> implements Comparable<DataValue<T>>{
	
	//some value representing a known fact 
	private T value;
	
	public DataValue()
	{
		
	}
	
	public DataValue(T value)
	{
		this.value = value;
	}
	
	public int subtraction(T value)
	{
		return 1;
	}
	/**
	 * 
	 * @param value the new value this Data instance should contain
	 */
	public void setValue(T value)
	{
		this.value = value;
	}
	/**
	 * returns the 
	 * 
	 * @return
	 */
	public T getValue()
	{
		return this.value;
	}

	@Override
	public int compareTo(DataValue<T> dataValue) {
		if(this == dataValue)
		{
			return 0;
		}
		
		else if(this.value instanceof String || dataValue.getValue() instanceof String)
		{
			if(this.value.equals(dataValue.getValue()))
			{
				return 0;
			}
			return 1;
		}
		else if(this.value == dataValue.value)
		{
			return 0;
		}
		else
		{
			return 1;
		}	
	}
	
	public int difference(DataValue<T> dataValue)
	{
		if(this.value instanceof Integer && dataValue.getValue() instanceof Integer)
		{
			return (Integer)this.value - (Integer)dataValue.getValue();
		}
		else
		{
			return this.compareTo(dataValue);
		}
	}
	

}

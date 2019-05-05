
public class DataValue<T> implements Comparable<T>{
	
	private T value;
	
	public DataValue()
	{
		
	}
	
	public DataValue(T value)
	{
		this.value = value;
	}

	public void setValue(T value)
	{
		this.value = value;
	}
	
	public T getValue(T value)
	{
		return this.value;
	}
	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

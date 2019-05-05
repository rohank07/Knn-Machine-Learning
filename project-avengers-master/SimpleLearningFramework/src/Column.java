/**
 * 
 * @author Abu Abdul
 *
 */
public class Column {

	
	enum valueType{
		Continuous,
		Binary,
	};
	private String name;
	private valueType typeofvalue;
	public Column(String name)
	{
		this.name = name;
	}
	

	
	
}

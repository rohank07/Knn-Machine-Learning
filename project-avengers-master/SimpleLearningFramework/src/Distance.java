import java.math.*;
public  class  Distance<T> {
	
	enum DMetric{
		Euclidean,
		Absolute,
		Binary
	};
	public int euclideanDistance(DataValue<T> value1, DataValue<T> value2)
	{
		//euclidean distance between an attribute value of a training row and a test row 
		int difference = value1.difference(value2);
		difference = difference * difference;	
		return (int) Math.sqrt(difference);
	}
	
	
	public int binaryDistance(DataValue<T>value1, DataValue<T>value2)
	{
		//binary distance between an attribute value of a training row and a test row 
		return value1.compareTo(value2);		
	}
	
	public int absoluteDistance(DataValue<T>value1, DataValue<T>value2)
	{
		//absolute distance between an attribute value of a training row and a test row
		return value1.difference(value2);
	}
	
	public int getDistance(DataValue<T>value1, DataValue<T>value2, int Dmetric)
	{
		int distance =0;
		if(Dmetric == 0)
		{
			distance =euclideanDistance(value1,value2);
		}
		else if(Dmetric ==1)
		{
			distance = absoluteDistance(value1,value2);
		}
		else if(Dmetric ==2)
		{
			distance = binaryDistance(value1,value2);
		}
		return distance;
	}
	
	
	
	

}

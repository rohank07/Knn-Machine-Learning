
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Abu Abdul
 *
 * @param <T>
 */
public class KNN<T> implements LearningAlgorithm<T>{

	private int K;
	private static final int DEFAULT_K =1;
	
	public KNN(int K)
	{
		this.K = K;
	}
	public KNN()
	{
		this(DEFAULT_K);
	}
	
	
	private Map<Row<T>,Integer>allNeigbors(List<Row>train, Row<T> test,List<Integer>Dmetric)
	{
		
		Map<Row<T>,Integer>neigborDistance = new HashMap<>();
		for(Row<T> somerow : train)
		{
			int distance =0;
			for(int i=0; i < test.getValues().size(); i++)
			{
				if(test.getValue(i)!= null)
				{
					Distance<T> somedistance = new Distance<T>();
					distance = distance + somedistance.getDistance(test.getValue(i),somerow.getValue(i),Dmetric.get(i));
				}
			}
			neigborDistance.put(somerow, distance);
		}
		return neigborDistance;
	}
	private Map<Row,Integer> Kdistane()
	{
		
		return null;
		
	}
	@Override
	public T predict(List train, Object test) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}

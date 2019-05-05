import java.util.List;

public interface LearningAlgorithm<T> {
	
	

	public T predict(List<?> train, T test);

}

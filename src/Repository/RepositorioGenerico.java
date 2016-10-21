package Repository;

import java.util.List;

public interface RepositorioGenerico<T> {
	List<T> select(T t);

	Boolean insert(T t);

	void delete(T t);
	
	List<T> findAll();
	
}

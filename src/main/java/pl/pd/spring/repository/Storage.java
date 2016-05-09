package pl.pd.spring.repository;

import org.springframework.stereotype.Repository;

import java.util.Collection;


public interface Storage<T> {

	public T saveUpdate(T entity);

	public T get(Long id);

	public Collection<T> getAll();

	public void remove(Integer id);

}

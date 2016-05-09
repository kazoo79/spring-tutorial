package pl.pd.spring.repository;

import org.springframework.stereotype.Repository;
import pl.pd.spring.mvc.from.BookForm;

import javax.annotation.PreDestroy;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class BookStorageImpl implements BookStorage {

	private static final Map<Long, BookForm> books = new ConcurrentHashMap<>();

	@Override
	public BookForm saveUpdate(BookForm entity) {
		if (entity.getId() == null) {
			entity.setId(Calendar.getInstance().getTimeInMillis());
		}
		return books.put(entity.getId(), entity);
	}

	@Override
	public BookForm get(Long id) {
		return books.get(id);
	}

	@Override
	public Collection<BookForm> getAll() {
		return books.values();
	}

	@Override
	public void remove(Integer id) {
		books.remove(id);
	}

	@PreDestroy
	public void destroy() throws Exception {
		books.clear();
	}
}

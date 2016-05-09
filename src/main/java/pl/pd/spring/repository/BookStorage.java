package pl.pd.spring.repository;

import org.springframework.stereotype.Repository;
import pl.pd.spring.mvc.from.BookForm;


public interface BookStorage extends SessionStorage<BookForm> {

}

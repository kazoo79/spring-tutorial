package pl.pd.spring.mvc.controller;

import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.pd.spring.mvc.from.BookForm;
import pl.pd.spring.repository.BookStorage;

@Controller
@RequestMapping(value = "/book")
public class BookController {

	private static final String VIEW_PATH_PREFIX = "book/";

	@Autowired
	BookStorage bookStorage;

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("book-form", new BookForm());
		return getViewPath("book-form");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getDetails(@ModelAttribute("id") Long id, Model model) {

		model.addAttribute("book-form", bookStorage.get(id));

		return getViewPath("book-form");
	}

	@Valid
	@RequestMapping(value = "/saveUpdate", method = RequestMethod.POST)
	public String saveOrUpdate(@ModelAttribute("bookForm") BookForm book, Errors errors) {

		if (errors.hasErrors()) {
			return getViewPath("new");
		}

		bookStorage.saveUpdate(book);

		return "redirect:/book/showAll";
	}

	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public String getAll(Model model) {

		model.addAttribute("bookList", bookStorage.getAll());

		return getViewPath("book-list");
	}

	public void setBookStorage(BookStorage bookStorage) {
		this.bookStorage = bookStorage;
	}

	private String getViewPath(final String viewName) {
		return VIEW_PATH_PREFIX + viewName;
	}
}

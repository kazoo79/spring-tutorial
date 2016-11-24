package pl.pd.spring.mvc.from;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Email;
import org.hibernate.validator.Size;

public class BookForm {

	private Long id;

	@NotNull
	@Size(min=5, max=10, message = "{title.size}")
	private String title;

	@NotNull
	@Size(min=5, max=10, message = "{author.size}")
	private String author;

	@NotNull
	@Size(min=5, max=150, message = "{description.size}")
	private String description;

	@NotNull
	@Email(message="{email.valid}")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof BookForm)) {
			return false;
		}

		BookForm bookForm = (BookForm) o;

		if (author != null ? !author.equals(bookForm.author) : bookForm.author != null) {
			return false;
		}
		if (description != null ? !description.equals(bookForm.description) : bookForm.description != null) {
			return false;
		}
		if (email != null ? !email.equals(bookForm.email) : bookForm.email != null) {
			return false;
		}
		if (id != null ? !id.equals(bookForm.id) : bookForm.id != null) {
			return false;
		}
		if (title != null ? !title.equals(bookForm.title) : bookForm.title != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		return result;
	}
}

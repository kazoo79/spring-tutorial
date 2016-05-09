package pl.pd.spring.mvc.from;

public class BookForm {

	private Long id;
	private String title;
	private String author;
	private String description;

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
		return result;
	}
}

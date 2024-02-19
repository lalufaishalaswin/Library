
public class BooksDetail {

	private String id;
	private String name;
	private String genre;
	private int borrowTime;

	public BooksDetail(String id, String name, String genre, int borrowTime) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.borrowTime = borrowTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public int getborrowTime() {
		return borrowTime;
	}

	public void setborrowTime(int borrowTime) {
		this.borrowTime = borrowTime;
	}
}

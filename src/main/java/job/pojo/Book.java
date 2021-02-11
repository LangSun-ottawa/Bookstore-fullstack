package job.pojo;
import javax.persistence.*;

@Entity(name = "bookInfo")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyId;
    private String title;
    private Double price;
    private String author;
    private String category;
    private String description;

    @Override
    public String toString() {
        return "Book{" +
                "keyId=" + keyId +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return keyId;
    }

    public void setKey(String keyId) {
        this.keyId = keyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package csulb.cecs323.model;

import javax.persistence.*;

@Entity
public class Books {
    @Id
    @Column(nullable = false, length = 17)
    private String ISBN;

    @Column(nullable = false, unique = true, length = 80)
    private String title;

    @Column(nullable = false)
    private Integer year_published;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_name", referencedColumnName ="name", nullable = false)
    private Publishers publishers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHORING_ENTITY_NAME", referencedColumnName ="email", nullable = false)
    private authoring_entities authoring_entities;

    /** Getter and Setter methods for the attributes **/
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear_published(Integer year_published) {
        this.year_published = year_published;
    }

    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    public void setAuthoring_entities(authoring_entities authoring_entities) {
        this.authoring_entities = authoring_entities;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear_published() {
        return year_published;
    }

    public Publishers getPublishers() {
        return publishers;
    }

    public authoring_entities getAuthoring_entities() {
        return authoring_entities;
    }

    /** Default Constructor **/
    public Books(){}

    /** Constructor that accepts all the attributes **/
    public Books(String ISBN, String title, Integer year_published, Publishers publishers, authoring_entities authoring_entities) {
        this.ISBN = ISBN;
        this.title = title;
        this.year_published = year_published;
        this.publishers = publishers;
        this.authoring_entities = authoring_entities;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", year_published=" + year_published +
                ", publishers=" + publishers +
                ", authoring_entities=" + authoring_entities +
                '}';
    }
}

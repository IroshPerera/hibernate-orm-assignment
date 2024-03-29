package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Book {

    @Id
    private String book_id;
    private String book_title;
    private String book_isbn;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

}

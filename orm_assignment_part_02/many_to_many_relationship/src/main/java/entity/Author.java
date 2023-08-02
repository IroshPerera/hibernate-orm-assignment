package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Author {

    @Id
    private String author_id;
    private String name;
    private String email;

    @ManyToMany
    private List<Book> books;

}

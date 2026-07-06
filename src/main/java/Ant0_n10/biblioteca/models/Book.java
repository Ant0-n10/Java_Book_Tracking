package Ant0_n10.biblioteca.models;

import Ant0_n10.biblioteca.enumerations.StatusRead;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_Book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    private Long id;

    private String ISBN;

    private String title;
    private String author;
    private Integer yearOfPublication;
    private StatusRead statusRead;
}

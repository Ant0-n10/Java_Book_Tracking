package Ant0_n10.biblioteca.models;

import Ant0_n10.biblioteca.enumerations.StatusRead;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
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

    @Max(13)
    private String ISBN;

    private String title;
    private String author;
    private Integer yearOfPublication;
    private StatusRead statusRead = StatusRead.WANT_TO_READ;
}

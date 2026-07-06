package Ant0_n10.biblioteca.dto;

import Ant0_n10.biblioteca.enumerations.StatusRead;

public final class BookDTO {

    public record Request(
            String ISBN,
            String title,
            String author,
            Integer yearOfPublication,
            StatusRead statusRead
    ){}

    public record Response(
            Long id,
            String ISBN,
            String title,
            String author,
            Integer yearOfPublication,
            StatusRead statusRead
    ){}

    public record Update(
            String ISBN,
            String title,
            String author,
            Integer yearOfPublication,
            StatusRead statusRead
    ){}
}

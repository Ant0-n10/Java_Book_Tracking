package Ant0_n10.biblioteca.dto;

import Ant0_n10.biblioteca.enumerations.StatusRead;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public final class BookDTO {

    public record Request(
            @NotBlank @Size(max = 13) String ISBN,
            @NotBlank String title,
            @NotBlank String author,
            @NotNull Integer yearOfPublication,
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

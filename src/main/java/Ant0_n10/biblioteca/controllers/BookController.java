package Ant0_n10.biblioteca.controllers;

import Ant0_n10.biblioteca.services.BookService;
import Ant0_n10.biblioteca.dto.BookDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping()
    public ResponseEntity<BookDTO.Response> createBook(@Valid @RequestBody BookDTO.Request request){
        BookDTO.Response response = bookService.createBook(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

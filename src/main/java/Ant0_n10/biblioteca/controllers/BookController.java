package Ant0_n10.biblioteca.controllers;

import Ant0_n10.biblioteca.services.BookService;
import Ant0_n10.biblioteca.dto.BookDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping()
    public ResponseEntity<BookDTO.Response> createBook(@Valid @RequestBody BookDTO.Request request){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(request));
    }

    @GetMapping()
    public ResponseEntity<List<BookDTO.Response>> getAllBooks(){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO.Response> getByIdBook(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getByIdBook(id));
    }
}

package Ant0_n10.biblioteca.services;

import Ant0_n10.biblioteca.models.Book;
import Ant0_n10.biblioteca.repositorys.BookRepository;
import Ant0_n10.biblioteca.dto.BookDTO;
import Ant0_n10.biblioteca.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    public BookDTO.Response createBook(BookDTO.Request request) {
        return bookMapper.toDTO(bookRepository.save(bookMapper.toModel(request)));
    }

    public List<BookDTO.Response> getAllBooks() {
        return bookRepository.findAll().stream().map(bookMapper::toDTO).toList();
    }

    public BookDTO.Response getByIdBook(Long id){
        return bookMapper.toDTO(bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado com o id: " + id))
        );
    }

    public BookDTO.Response updateBook(Long id, BookDTO.Update update){
        bookMapper.updateModelFromDto(update,);
    }

}

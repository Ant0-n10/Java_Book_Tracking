package Ant0_n10.biblioteca.services;

import Ant0_n10.biblioteca.enumerations.StatusRead;
import Ant0_n10.biblioteca.exception.ResourceNotFoundException;
import Ant0_n10.biblioteca.models.Book;
import Ant0_n10.biblioteca.repositorys.BookRepository;
import Ant0_n10.biblioteca.dto.BookDTO;
import Ant0_n10.biblioteca.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

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
                .orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado com o id: " + id))
        );
    }

    public BookDTO.Response updateBook(Long id, BookDTO.Update update){
        Book bookFound = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado com o id: " + id));
        bookMapper.updateModelFromDto(update,bookFound);

        return bookMapper.toDTO(bookRepository.save(bookFound));
    }

    public void deleteBook(Long id) {
        if (!bookRepository.existsById(id)){
           throw new ResourceNotFoundException("Livro não encontrado com o id: " + id);
        }

        bookRepository.deleteById(id);
    }
}

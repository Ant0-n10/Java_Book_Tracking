package Ant0_n10.biblioteca.services;

import Ant0_n10.biblioteca.repositorys.BookRepository;
import Ant0_n10.biblioteca.dto.BookDTO;
import Ant0_n10.biblioteca.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    public BookDTO.Response createBook(BookDTO.Request request) {
        return bookMapper.toDTO(
                bookRepository.save(bookMapper.toModel(request))
        );
    }
}

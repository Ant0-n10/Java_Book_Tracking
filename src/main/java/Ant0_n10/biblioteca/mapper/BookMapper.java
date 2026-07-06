package Ant0_n10.biblioteca.mapper;

import Ant0_n10.biblioteca.models.Book;
import Ant0_n10.biblioteca.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper {

    Book toModel(BookDTO.Request dto);

    BookDTO.Response toDTO(Book book);

    void updateModelFromDto(BookDTO.Update update, @MappingTarget Book book);
}

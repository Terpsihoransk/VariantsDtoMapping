package lessons.variantsdtomapping.dto;

import lessons.variantsdtomapping.dao.Book;
import lessons.variantsdtomapping.dao.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookDtoService {

    private final BookRepository bookRepository;

    List<BookDto> getAllDtoBook() {
        List<Book> book = bookRepository.findAll();
        return book.stream().map(this::convertToDto).collect(Collectors.toList());
    }
    private BookDto convertToDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .build();
    }
}

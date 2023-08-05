package lessons.variantsdtomapping.mapper;

import lessons.variantsdtomapping.Response.BookResponse;
import lessons.variantsdtomapping.dao.Book;
import lessons.variantsdtomapping.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class MapperController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @GetMapping
    public List<BookResponse> getAllBooks() {
        List<Book> books = bookService.getAllBook();
        return books.stream()
                .map(bookMapper::mapToResponse)
                .collect(Collectors.toList());
    }

}

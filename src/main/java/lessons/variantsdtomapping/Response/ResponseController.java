package lessons.variantsdtomapping.Response;

import lessons.variantsdtomapping.dao.Book;
import lessons.variantsdtomapping.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ResponseController {


    private final BookService bookService;

    @GetMapping("/responsebook")
    List<BookResponse> allResponseBook() {
        List<Book> books = bookService.getAllBook();
        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {
            BookResponse bookResponse = new BookResponse();
            bookResponse.setId(book.getId());
            bookResponse.setName(book.getName());
            bookResponses.add(bookResponse);
        }

        return bookResponses;

    }

}

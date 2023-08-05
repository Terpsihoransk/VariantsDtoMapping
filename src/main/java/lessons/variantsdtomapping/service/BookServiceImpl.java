package lessons.variantsdtomapping.service;

import lessons.variantsdtomapping.Response.BookResponse;
import lessons.variantsdtomapping.dao.Book;
import lessons.variantsdtomapping.dao.BookRepository;
import lessons.variantsdtomapping.mapper.BookMapper;
import lessons.variantsdtomapping.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public void createNewBook(BookResponse bookResponse) {
        Book book = bookMapper.mapToModel(bookCreateDto);
        bookRepository.save(book);
    }
}

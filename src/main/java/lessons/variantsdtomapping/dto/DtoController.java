package lessons.variantsdtomapping.dto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DtoController {

    private final BookDtoService bookDtoService;

    @GetMapping("/dtobook")
    List<BookDto> getAllDtoBook() {
        return bookDtoService.getAllDtoBook();
    }
}

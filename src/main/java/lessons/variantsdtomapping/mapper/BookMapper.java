package lessons.variantsdtomapping.mapper;


import lessons.variantsdtomapping.Response.BookResponse;
import lessons.variantsdtomapping.dao.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BookMapper {

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "name", target = "name_field")
//    BookResponse mapToResponse(BookDtoSale book);

    BookResponse mapToResponse(Book book);

//    @Mapping(source = "name", target = "name_create")
//    Book mapToModel(BookCreateDto bookCreateDto);

}

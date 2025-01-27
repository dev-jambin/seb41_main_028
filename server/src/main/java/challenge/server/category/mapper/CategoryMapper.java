package challenge.server.category.mapper;

import challenge.server.category.dto.CategoryDto;
import challenge.server.category.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    /*
     TODO 관리자페이지 구현 시 활성화
     Category categoryPostDtoToCategory(CategoryDto.Post post);
     Category categoryPatchDtoToCategory(CategoryDto.Patch patch);
     */
    CategoryDto.Response CategoryToCategoryResponseDto(Category category);
}

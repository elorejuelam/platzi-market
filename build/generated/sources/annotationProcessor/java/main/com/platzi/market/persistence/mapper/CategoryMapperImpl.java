package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-29T21:36:36-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        Category category = new Category();

        if ( categoria.getIdCategoria() != null ) {
            category.setCategoryId( categoria.getIdCategoria() );
        }
        category.setCategory( categoria.getDescripcion() );
        if ( categoria.getEstado() != null ) {
            category.setActive( Boolean.parseBoolean( categoria.getEstado() ) );
        }

        return category;
    }

    @Override
    public Categoria toCategoria(Category category) {
        if ( category == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setIdCategoria( category.getCategoryId() );
        categoria.setDescripcion( category.getCategory() );
        categoria.setEstado( String.valueOf( category.isActive() ) );

        return categoria;
    }
}

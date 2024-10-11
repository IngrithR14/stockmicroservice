package com.pragma.emazonstock.domain.spi;

import com.pragma.emazonstock.domain.model.Category;

public interface ICategoryPersistencePort {

    void saveCategory(Category category);
}

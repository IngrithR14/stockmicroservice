package com.pragma.emazonstock.domain.api.usecase;
import com.pragma.emazonstock.domain.api.ICategoryServicePort;
import com.pragma.emazonstock.domain.model.Category;
import com.pragma.emazonstock.domain.spi.ICategoryPersistencePort;

public class CategoryUseCase implements ICategoryServicePort {
    private ICategoryPersistencePort categoryPersistencePort;
    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }
    @Override
    public void saveCategory(Category category) {
        categoryPersistencePort.saveCategory(category);
    }
}


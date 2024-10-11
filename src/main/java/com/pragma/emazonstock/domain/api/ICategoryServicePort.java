package com.pragma.emazonstock.domain.api;

import com.pragma.emazonstock.domain.model.Category;

public interface ICategoryServicePort {

    void saveCategory(Category category);
}
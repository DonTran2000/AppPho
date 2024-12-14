package com.don.apppho.service;

import com.don.apppho.controller.request.CategoryRequest;
import com.don.apppho.controller.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAll();

    String add(CategoryRequest newCategory);

    String delete(Integer id);
}

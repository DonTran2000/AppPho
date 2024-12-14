package com.don.apppho.service.impl;

import com.don.apppho.controller.request.CategoryRequest;
import com.don.apppho.controller.response.CategoryResponse;
import com.don.apppho.model.Category;
import com.don.apppho.repository.CategoryRepository;
import com.don.apppho.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAll() {

        // Get Category from db
        List<Category> exists = categoryRepository.findAll();

        // convert CategoryResponse
        List<CategoryResponse> categoryResponses = new ArrayList<>();
        for (Category c : exists) {
            CategoryResponse response = new CategoryResponse();
            response.setCategoryName(c.getName());
            response.setId(c.getId());

            categoryResponses.add(response);
        }

        return categoryResponses;
    }

    @Override
    public String add(CategoryRequest newCategory) {

        // Convert from CategoryRequest to Category
        Category category = new Category();
        category.setName(newCategory.getName());

        categoryRepository.save(category);

        return newCategory.getName() + " saved";
    }

    @Override
    public String delete(Integer id) {
        // TRUNCATE
        categoryRepository.deleteById(id);
        return id + "deleted";
    }
}

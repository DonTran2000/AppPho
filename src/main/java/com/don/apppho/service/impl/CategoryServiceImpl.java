package com.don.apppho.service.impl;//package com.don.service.impl;
//
//import com.don.controller.response.CategoryResponse;
//import com.don.model.Category;
//import com.don.repository.CategoryRepository;
//import com.don.service.CategoryService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class CategoryServiceImpl implements CategoryService {
//
//    private final CategoryRepository categoryRepository;
//
//    @Override
//    public List<CategoryResponse> getAll() {
//
//        // Get Category from db
//        List<Category> exists = categoryRepository.findAll();
//
//        // convert CategoryResponse
//        List<CategoryResponse> categoryResponses = new ArrayList<>();
//        for (Category c : exists) {
//            CategoryResponse response = new CategoryResponse();
//            response.setCategoryName(c.getName());
//            categoryResponses.add(response);
//        }
//
//        return categoryResponses;
//    }
//
//    @Override
//    public String add(String newCategory) {
//        return "";
//    }
//
//    @Override
//    public String delete(String category) {
//        return "";
//    }
//}

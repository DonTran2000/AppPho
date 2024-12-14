package com.don.apppho.controller;

import com.don.apppho.controller.request.CategoryRequest;
import com.don.apppho.controller.response.CategoryResponse;
import com.don.apppho.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Slf4j(topic = "CATEGORY-CONTROLLER")
public class CategoryController {

    private final CategoryService categoryService;

    @Operation(summary = "Get category list")
    @GetMapping("/list")
    public Map<String, Object> getList() {

        log.info("Get List Category");

        List<CategoryResponse> list = categoryService.getAll();

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", HttpStatus.OK.value());
        result.put("message", "Category List");
        result.put("data", list);

        return result;
    }

    @Operation(summary = "Add new category")
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody CategoryRequest request) {
        log.info("Add Category");

        String response = categoryService.add(request);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", HttpStatus.OK.value());
        result.put("message", "Add Category");
        result.put("data", response);

        return result;
    }

    @Operation(summary = "Delete category")
    @PostMapping("/delete/{id}")
    public Map<String, Object> delete(@PathVariable Integer id) {
        log.info("Delete Category");

        String response = categoryService.delete(id);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", HttpStatus.OK.value());
        result.put("message", "Delete Category");
        result.put("data", response);

        return result;
    }
}

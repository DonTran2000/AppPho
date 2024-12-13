package com.don.apppho.controller;//package com.don.controller;
//
//import com.don.controller.response.CategoryResponse;
//import com.don.service.CategoryService;
//import io.swagger.v3.oas.annotations.Operation;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/category")
//@RequiredArgsConstructor
//@Slf4j(topic = "CATEGORY-CONTROLLER")
//public class CategoryController {
//
//    private final CategoryService categoryService;
//
//    @Operation(summary = "Get category list")
//    @GetMapping("/list")
//    public Map<String, Object> getList() {
//
//        log.info("Get List Category");
//
//        List<CategoryResponse> list = categoryService.getAll();
//
//        Map<String, Object> result = new LinkedHashMap<>();
//        result.put("status", HttpStatus.OK.value());
//        result.put("message", "category list");
//        result.put("data", list);
//
//        return result;
//    }
//}

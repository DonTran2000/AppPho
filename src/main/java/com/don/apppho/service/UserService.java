package com.don.apppho.service;

import com.don.apppho.controller.request.UserCreationRequest;
import com.don.apppho.controller.request.UserPasswordRequest;
import com.don.apppho.controller.request.UserUpdateRequest;
import com.don.apppho.controller.response.UserPageResponse;
import com.don.apppho.controller.response.UserResponse;

public interface UserService {
    UserPageResponse findAll(String keyword, String sort, int page, int size);

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}

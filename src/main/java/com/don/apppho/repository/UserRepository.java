package com.don.apppho.repository;

import com.don.apppho.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select u from UserEntity u where u.status='ACTIVE' and (lower(u.username) like :keyword or lower(u.type) like :keyword or lower(u.email) like :keyword)")
    Page<UserEntity> searchByKeyword(String keyword, Pageable pageable);
}

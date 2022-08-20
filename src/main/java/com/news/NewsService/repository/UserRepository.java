package com.news.NewsService.repository;

import com.news.NewsService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Query("SELECT u from Users u WHERE u.emailId =:emailId")
    Users getUserByEmailId(String emailId);
}

package com.news.NewsService.repository;

import com.news.NewsService.entity.News;
import com.news.NewsService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("SELECT n from News n where n.author=:author")
    List<News> findNewsByAuthor(Users author);
}

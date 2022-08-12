package com.news.NewsService.service;

import com.news.NewsService.entity.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    Optional<News> findNewsById(Long newsId);

    List<News> findAllNews();

    List<News> findNewsByAuthor(Long authorId);

    News createNews(News news);

    News publishNews(Long newsId);

    String deleteNews(long newsId);

    News editNews(News news);
}

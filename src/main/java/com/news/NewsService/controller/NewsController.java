package com.news.NewsService.controller;

import com.news.NewsService.entity.News;
import com.news.NewsService.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/news")
@Slf4j
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/")
    public List<News> findAllNews() {
        return newsService.findAllNews();
    }

    @GetMapping("/{id}")
    public Optional<News> findNewsById(@PathVariable("id") Long newsId) {
        return newsService.findNewsById(newsId);
    }
    @GetMapping("/author/{authorId}")
    public List<News> findNewsByAuthor(@PathVariable("authorId") Long authorId) {
        return newsService.findNewsByAuthor(authorId);
    }

    public News createNews(News news) {
        return newsService.createNews(news);
    }

    public News publishNews(Long newsId) {
        return newsService.publishNews(newsId);
    }

    public String deleteNews(long newsId) {
       return newsService.deleteNews(newsId);
    }

    public News editNews(News news) {
        return null;
    }

}

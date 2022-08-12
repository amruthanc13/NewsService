package com.news.NewsService.service;

import com.news.NewsService.entity.News;
import com.news.NewsService.entity.Users;
import com.news.NewsService.repository.NewsRepository;
import com.news.NewsService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private UserRepository userRepository;

    public Optional<News> findNewsById(Long newsId) {
        return newsRepository.findById(newsId);
    }

    public List<News> findNewsByAuthor(Long authorId) {
        Users author = userRepository.findById(authorId).get();
        return newsRepository.findNewsByAuthor(author);
    }

    public News createNews(News news) {
        return newsRepository.save(news);
    }

    public News publishNews(Long newsId) {
        News news = newsRepository.findById(newsId).get();
        news.setIsPublished(true);
        return newsRepository.save(news);
    }

    public String deleteNews(long newsId) {
        newsRepository.deleteById(newsId);
        return "Deleted";
    }

    public News editNews(News news) {
        return null;
    }

    public List<News> findAllNews() {
        return newsRepository.findAll();
    }
}

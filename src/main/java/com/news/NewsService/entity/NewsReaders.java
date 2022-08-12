package com.news.NewsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class NewsReaders {
    @EmbeddedId
    NewsReadersKey id;

    @ManyToOne
    @MapsId("newsId")
    @JoinColumn(name = "news_id")
    private News news;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private News user;
}

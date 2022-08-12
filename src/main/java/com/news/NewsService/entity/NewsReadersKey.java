package com.news.NewsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Embeddable
public class NewsReadersKey implements Serializable {
    @Column(name = "user_id")
    Long userId;

    @Column(name = "news_id")
    Long newsId;

}

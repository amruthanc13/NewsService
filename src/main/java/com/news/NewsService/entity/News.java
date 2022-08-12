package com.news.NewsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "idSequence", initialValue = 6)
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSequence")
    private Long newsId;
    private String title;
    private Boolean isPublished = false;
    private Timestamp publishedDate;
    private Timestamp creationDate;
    private Timestamp validFrom;
    private Timestamp validTo;
    @Lob
    @Column(length = 100000)
    private String content;
    @Lob
    private Byte[] image;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Users author;

}

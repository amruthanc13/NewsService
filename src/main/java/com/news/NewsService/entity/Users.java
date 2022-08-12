package com.news.NewsService.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@SequenceGenerator(name = "idSequence", initialValue = 6)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSequence")
    private Long userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;
    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private Set<News> newsSet;

}

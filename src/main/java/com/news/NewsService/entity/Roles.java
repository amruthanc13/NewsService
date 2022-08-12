package com.news.NewsService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "idSequence", initialValue = 6)
public class Roles {
    @Id
    @GeneratedValue(strategy  =  GenerationType.SEQUENCE, generator  =  "idSequence")
    private Long roleId;
    @Column(unique  =  true)
    private String name;
    private boolean writeAccess = false;
    private boolean readAccess = true;
    private boolean editAccess = false;
    private boolean editAllAccess = false;
    private boolean deleteAccess = false;
    @OneToMany(mappedBy  =  "roles")
    @JsonIgnore
    private Set<Users> users;
}

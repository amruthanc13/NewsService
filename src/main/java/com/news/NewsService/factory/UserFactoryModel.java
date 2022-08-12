package com.news.NewsService.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserFactoryModel {

    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private Long roleId;
}

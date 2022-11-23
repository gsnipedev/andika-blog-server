package com.gsnipedev.andikablogserver.controller;

import com.gsnipedev.andikablogserver.entity.ArticleEntity;
import com.gsnipedev.andikablogserver.model.WebResponse;
import com.gsnipedev.andikablogserver.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    protected ArticleService articleService;

    @GetMapping
    protected WebResponse<List<ArticleEntity>> GetAll()
    {
        return articleService.GetAllArticle();
    }
}

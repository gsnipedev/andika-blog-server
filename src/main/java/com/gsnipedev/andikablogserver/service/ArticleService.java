package com.gsnipedev.andikablogserver.service;

import com.gsnipedev.andikablogserver.entity.ArticleEntity;
import com.gsnipedev.andikablogserver.model.WebResponse;
import com.gsnipedev.andikablogserver.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {


    @Autowired
    ArticleRepository articleRepository;

    public WebResponse<List<ArticleEntity>> GetAllArticle()
    {
        WebResponse<List<ArticleEntity>> response = new WebResponse<>();

        response.setCode(200);
        response.setStatus("OK");
        response.setData(articleRepository.findAll());

        return response;
    }


}

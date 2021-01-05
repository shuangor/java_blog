package com.winterchen.controller;

import com.winterchen.model.ContentDomain;
import com.winterchen.service.user.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/content")
public class ContentController {

    @Autowired
    ContentService contentService;

    @GetMapping("/all")
    public Object getAllContent() {
        System.out.println(contentService.selectContent(10, 1));
        return contentService.selectContent(10, 1);
    }

    @GetMapping("/insert")
    public int insert(ContentDomain contentDomain) {
        return contentService.insert(contentDomain);
    }

    @GetMapping("/id")
    public Map<object>

}

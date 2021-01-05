package com.winterchen.dao;

import com.winterchen.model.ContentDomain;

import java.util.List;

public interface ContentDao {

    int insert(ContentDomain content);

    List<ContentDomain> allContent();

    Object byIdContent();
}

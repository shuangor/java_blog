package com.winterchen.service.user;

import com.github.pagehelper.PageInfo;
import com.winterchen.model.ContentDomain;
import com.winterchen.model.UserDomain;

import java.util.List;

public interface ContentService {

    int insert(ContentDomain domain);

    List<ContentDomain> selectContent(int pageNum, int pageSize);

    Object byIdContent();
}

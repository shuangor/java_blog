package com.winterchen.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.winterchen.dao.ContentDao;
import com.winterchen.model.ContentDomain;
import com.winterchen.model.UserDomain;
import com.winterchen.service.user.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentSerivceImpl implements ContentService {

    @Autowired
    ContentDao contentDao;

    @Override
    public int insert(ContentDomain domain) {

        return contentDao.insert(domain);
    }

    @Override
    public List selectContent(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        System.out.println(pageNum + "-------" + pageSize);
          List<ContentDomain> contentDomains = contentDao.allContent();
//        PageInfo result = new PageInfo(contentDomains);
        return contentDomains;
    }

    public Object byIdContent() {
        return contentDao.byIdContent();
    }

}

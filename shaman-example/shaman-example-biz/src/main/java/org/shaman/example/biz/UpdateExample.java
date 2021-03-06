package org.shaman.example.biz;

import org.shaman.dao.ShamanDao;
import org.shaman.example.biz.vo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fenglei on 2016/6/9.
 */
@Service
public class UpdateExample {

    private static final Logger logger = LoggerFactory.getLogger(UpdateExample.class);

    @Autowired
    private ShamanDao shamanDao;

    public void updateUserInfo(UserInfo userInfo) {
        shamanDao.updateObjectForTable(userInfo);
    }
}

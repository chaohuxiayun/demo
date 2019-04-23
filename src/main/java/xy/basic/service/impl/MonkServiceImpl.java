package xy.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xy.basic.base.BaseServiceImpl;
import xy.basic.dao.MonkDao;
import xy.basic.entity.MonkEntity;

/**
 * @Description
 * @Date 2019/4/24
 * @Created by xiayun
 */
@Service
public class MonkServiceImpl extends BaseServiceImpl<MonkEntity> {

    @Autowired
    public MonkServiceImpl(MonkDao monkDao){
        super.baseDao = monkDao;
    }

}

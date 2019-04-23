package xy.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xy.basic.base.BaseServiceImpl;
import xy.basic.dao.TempleDao;
import xy.basic.entity.TempleEntity;

/**
 * @Description
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Service
public class TempleServiceImpl extends BaseServiceImpl<TempleEntity> {

    @Autowired
    public TempleServiceImpl(TempleDao templeDao){
        super.baseDao = templeDao;
    }

}

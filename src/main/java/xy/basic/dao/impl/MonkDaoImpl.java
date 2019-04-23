package xy.basic.dao.impl;

import org.springframework.stereotype.Repository;
import xy.basic.base.BaseDaoImpl;
import xy.basic.dao.MonkDao;
import xy.basic.entity.MonkEntity;


/**
 * @Description
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Repository
public class MonkDaoImpl extends BaseDaoImpl<MonkEntity> implements MonkDao {
    public MonkDaoImpl(){
        super.targetClass = MonkEntity.class;
    }
}

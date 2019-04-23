package xy.basic.dao.impl;

import org.springframework.stereotype.Repository;
import xy.basic.base.BaseDaoImpl;
import xy.basic.dao.TempleDao;
import xy.basic.entity.TempleEntity;


/**
 * @Description
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Repository
public class TempleDaoImpl extends BaseDaoImpl<TempleEntity> implements TempleDao {

    public TempleDaoImpl(){
        super.targetClass = TempleEntity.class;
    }
}

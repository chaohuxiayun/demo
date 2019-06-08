package xy.basic.base;

import xy.basic.base.hb.BaseEntity;
import xy.basic.base.hb.Page;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2019/6/7
 * @Created by xiayun
 */
public class BaseServiceImpl<T extends BaseEntity> implements BaseService{


    @Override
    public BaseEntity insert(BaseEntity BaseEntity) {
        return null;
    }

    @Override
    public void delete(BaseEntity BaseEntity) {

    }

    @Override
    public void update(BaseEntity BaseEntity) {

    }

    @Override
    public BaseEntity select(Long id) {
        return null;
    }

    @Override
    public Page selectWithPage(Map map, Page page) {
        return null;
    }

    @Override
    public BaseEntity selectOneObject(Map map) {
        return null;
    }

    @Override
    public List selectList(Map map) {
        return null;
    }
}

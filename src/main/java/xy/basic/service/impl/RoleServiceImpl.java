package xy.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xy.basic.dao.RoleMapper;
import xy.basic.entity.Role;
import xy.basic.entity.RoleExample;
import xy.basic.service.RoleService;
import xy.basic.util.ListUtils;

/**
 * @Description
 * @Date 2019/6/8
 * @Created by xiayun
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role selectById(Long id) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return (Role) ListUtils.getList0(roleMapper.selectByExample(example));
    }

    @Override
    public Role selectByCode(String code) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);
        return (Role) ListUtils.getList0(roleMapper.selectByExample(example));
    }

    @Override
    public int insert(Role role) {
        return 0;
    }

    @Override
    public int update(Role role) {
        return 0;
    }
}

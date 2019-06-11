package xy.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xy.basic.dao.RoleMapper;
import xy.basic.dao.UserMapper;
import xy.basic.dao.UserRoleMapper;
import xy.basic.dto.UserRoleDto;
import xy.basic.entity.UserRole;
import xy.basic.entity.UserRoleExample;
import xy.basic.service.RoleService;
import xy.basic.service.UserRoleService;
import xy.basic.service.UserService;
import xy.basic.util.ListUtils;

import java.util.List;

/**
 * @Description
 * @Date 2019/6/8
 * @Created by xiayun
 */
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public UserRole selectById(Long id) {
        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andIdEqualTo(id);
        return (UserRole) ListUtils.getList0(userRoleMapper.selectByExample(userRoleExample));
    }

    @Override
    public List<UserRoleDto> findListByUserId(Long userId) {
        return userRoleMapper.selectByUserId(userId);
    }
}

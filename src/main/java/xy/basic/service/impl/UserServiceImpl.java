package xy.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xy.basic.dao.UserMapper;
import xy.basic.entity.User;
import xy.basic.entity.UserExample;
import xy.basic.hb.entity.UserEntity;
import xy.basic.service.UserService;
import xy.basic.util.ListUtils;

import java.util.List;

/**
 * @Description
 * @Date 2019/6/8
 * @Created by xiayun
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByLoginName(String loginName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        return (User) ListUtils.getList0(userMapper.selectByExample(example));
    }

    @Override
    public User findById(Long id) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return (User) ListUtils.getList0(userMapper.selectByExample(example));
    }

    @Override
    public int insert(User user){
        return userMapper.insert(user);
    }

    @Override
    public int update(User user){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(user.getId());
        return userMapper.updateByExampleSelective(user,example);
    }

}

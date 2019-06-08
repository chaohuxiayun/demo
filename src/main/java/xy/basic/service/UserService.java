package xy.basic.service;

import xy.basic.entity.User;

/**
 * @Description
 * @Date 2019/5/8
 * @Created by xiayun
 */
public interface UserService  {

    // extends BaseService<UserEntity>

    User findByLoginName(String loginName);

    User findById(Long id);

    int update(User user);

    int insert(User user);

}

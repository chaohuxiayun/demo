package xy.basic.service;

import xy.basic.base.hb.BaseService;
import xy.basic.entity.Role;
import xy.basic.hb.entity.RoleEntity;

/**
 * @Description
 * @Date 2019/5/8
 * @Created by xiayun
 */
public interface RoleService {


    Role selectById(Long id);

    Role selectByCode(String code);

    int insert(Role role);

    int update(Role role);


}

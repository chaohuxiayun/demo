package xy.basic.service;


import xy.basic.base.BaseService;
import xy.basic.dto.UserRoleDto;
import xy.basic.entity.UserRole;

import java.util.List;

/**
 * @Description
 * @Date 2019/6/7
 * @Created by xiayun
 */
public interface UserRoleService {

    UserRole selectById(Long id);

    List<UserRoleDto> findListByUserId(Long userId);

}

package xy.basic.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xy.basic.entity.RolePermission;
import xy.basic.entity.RolePermissionExample;
import xy.basic.entity.RolePermissionWithBLOBs;

public interface RolePermissionMapper {
    long countByExample(RolePermissionExample example);

    int deleteByExample(RolePermissionExample example);

    int insert(RolePermissionWithBLOBs record);

    int insertSelective(RolePermissionWithBLOBs record);

    List<RolePermissionWithBLOBs> selectByExampleWithBLOBs(RolePermissionExample example);

    List<RolePermission> selectByExample(RolePermissionExample example);

    int updateByExampleSelective(@Param("record") RolePermissionWithBLOBs record, @Param("example") RolePermissionExample example);

    int updateByExampleWithBLOBs(@Param("record") RolePermissionWithBLOBs record, @Param("example") RolePermissionExample example);

    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);
}
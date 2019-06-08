package xy.basic.hb.entity;

import xy.basic.base.hb.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Date 2019/6/8
 * @Created by xiayun
 */
@Entity
@Table(name = "T_RolePermission")
public class RolePermissionEntity extends BaseEntity {

    private RoleEntity role;
    private PermissionEntity permission;

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public PermissionEntity getPermission() {
        return permission;
    }

    public void setPermission(PermissionEntity permission) {
        this.permission = permission;
    }
}

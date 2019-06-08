package xy.basic.hb.entity;

import xy.basic.base.hb.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @Description
 * @Date 2019/6/7
 * @Created by xiayun
 */
@Entity
@Table(name="T_UserRole")
public class UserRoleEntity extends BaseEntity {

    private UserEntity user;
    private RoleEntity role;

    @ManyToOne
    @JoinColumn(name = "user")
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "role")
    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}

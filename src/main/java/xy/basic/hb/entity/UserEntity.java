package xy.basic.hb.entity;

import xy.basic.base.hb.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description
 * @Date 2019/5/8
 * @Created by xiayun
 */
@Entity
@Table(name = "T_User")
public class UserEntity extends BaseEntity {

    private String userName;
    private String loginName;
    private String password;

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

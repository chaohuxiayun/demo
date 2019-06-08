package xy.basic.hb.entity;

import xy.basic.base.hb.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description
 * @Date 2019/5/8
 * @Created by xiayun
 */
@Entity
@Table(name="T_Role")
public class RoleEntity extends BaseEntity {

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

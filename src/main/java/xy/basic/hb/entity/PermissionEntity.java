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
@Table(name = "T_Permission")
public class PermissionEntity extends BaseEntity {

    private String code;
    private String name;

    private String cont;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}

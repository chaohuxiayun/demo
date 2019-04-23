package xy.basic.entity;

import xy.basic.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 寺庙
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Entity
@Table(name="Temple")
public class TempleEntity extends BaseEntity {

    private String name;
    private String address;
    private String icon;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

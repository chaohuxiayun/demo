package xy.basic.entity;

import xy.basic.base.BaseEntity;

import javax.persistence.Column;
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
    private String cont;

    @Column(name = "name",nullable = false)
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

    @Column(name = "cont" ,length = 1000)
    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}

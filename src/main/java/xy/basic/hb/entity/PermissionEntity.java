package xy.basic.hb.entity;

import xy.basic.base.hb.BaseEntity;
import xy.basic.entity.User;

import javax.persistence.*;
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
    private String url;
    /**
     * 类型（0-主菜单，1-普通菜单）
     */
    private String type;
    /**
     * 级别 是几级菜单
     */
    private Integer level;
    /**
     * 图标
     */
    private String icon;
    private UserEntity createUser;

    private String parentCode;
    private Long parentId;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "create_user")
    public UserEntity getCreateUser() {
        return createUser;
    }

    public void setCreateUser(UserEntity createUser) {
        this.createUser = createUser;
    }

    @Column(name = "parent_id")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Column(name = "parent_code")
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}

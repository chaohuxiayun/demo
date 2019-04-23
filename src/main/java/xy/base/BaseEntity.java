package xy.base;

import java.io.Serializable;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity implements Serializable {


    private static final long serialVersionUID = 6335056279344205457L;
    private Long id;
    private Long deleteTime = 0L;
    private Long addTime = 0L;
    private Long updateTime = 0L;

    /**
     * 这条数据是否已经被删除
     */
    private String isDelete = "0";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @PreUpdate
    public void preUpdate(BaseEntity entity){
        entity.setUpdateTime(System.currentTimeMillis());
    }

    @PrePersist
    public void preAdd(BaseEntity entity){
        entity.setAddTime(System.currentTimeMillis());
    }

}

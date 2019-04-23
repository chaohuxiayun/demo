package xy.basic.entity;


import xy.basic.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 僧侣
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Entity
@Table(name="Monk")
public class MonkEntity extends BaseEntity {

    private String name;

    @Column(name="gender",length = 2)
    private String gender;

    @Column(name="birth_day")
    private Date birthDay;

    @Column(name="home_address")
    private String homeAddress;

    private String education;

    private TempleEntity templeEntity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @ManyToOne
    @JoinColumn(name = "templeEntity")
    public TempleEntity getTempleEntity() {
        return templeEntity;
    }

    public void setTempleEntity(TempleEntity templeEntity) {
        this.templeEntity = templeEntity;
    }
}

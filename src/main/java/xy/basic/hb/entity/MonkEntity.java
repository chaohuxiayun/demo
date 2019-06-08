package xy.basic.hb.entity;


import xy.basic.base.hb.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description 僧侣
 * @Date 2019/4/23
 * @Created by xiayun
 */
@Entity
@Table(name = "T_Monk")
public class MonkEntity extends BaseEntity {

    private String name;

    private String gender;

    private Date birthDay;

    private String homeAddress;

    private String education;

    private TempleEntity temple;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "gender", length = 2)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "birth_day")
    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Column(name = "home_address")
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
    @JoinColumn(name = "temple")
    public TempleEntity getTemple() {
        return temple;
    }

    public void setTemple(TempleEntity temple) {
        this.temple = temple;
    }
}

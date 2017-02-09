package com.nimble.receiving.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tonny on 2017-2-7.
 */

@Table(name = "TS_EMPLOYEE")
@Entity
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Date birth;
    private Date createTime;
    private Department department;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JoinColumn(name = "Department_ID")
    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

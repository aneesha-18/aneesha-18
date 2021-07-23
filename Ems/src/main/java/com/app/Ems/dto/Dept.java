package com.app.Ems.dto;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "dept")
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String deptName;
    private Date created_at;
    private String created_by;
    private Date last_updated_date;
    private String last_updated_by;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Emp employee;

    public int getDeptID() {
        return id;
    }

    public void setDeptID(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(Date last_updated_date) {
        this.last_updated_date = last_updated_date;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }
}

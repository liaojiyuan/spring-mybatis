package com.wusong.hanukkah.entity.mysql;

import java.util.List;

/**
 * Created by weilei on 15/8/22.
 */
public class Dept {
    private int deptno;//部门编号
    private String dname;//部门名称
    private String location;//部门所在地
    private List<Emp> emps;

    public Dept() {
    }

    public Dept(int deptno, String dname, String location) {
        this.deptno = deptno;
        this.dname = dname;
        this.location = location;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}


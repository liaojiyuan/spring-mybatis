package com.wusong.hanukkah.entity.mysql;

import java.util.Date;

/**
 * Created by weilei on 15/8/22.
 */
public class Emp {
    private int empno;//员工编码
    private String ename;//员工名称
    private String job;//职位
    private int mgr;//上级编号
    private Date hiredate;//入职时间
    private double sale;//工资
    private double comm;//奖金
    private Dept dept;

    public Emp() {
    }

    public Emp(int empno) {
        this.empno = empno;
    }

    public Emp(String ename, String job, int mgr, Date hiredate, double sale, double comm) {
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sale = sale;
        this.comm = comm;
    }

    public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sale, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sale = sale;
        this.comm = comm;
    }

    public Emp(String ename, String job, int mgr, Date hiredate, double sale, double comm, Dept dept) {
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sale = sale;
        this.comm = comm;
        this.dept = dept;
    }

    public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sale, double comm, Dept dept) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sale = sale;
        this.comm = comm;
        this.dept = dept;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}

package com.wusong.hanukkah.test;

import com.wusong.hanukkah.dao.mysql.DeptMapper;
import com.wusong.hanukkah.dao.mysql.EmpMapper;
import com.wusong.hanukkah.entity.mysql.Dept;
import com.wusong.hanukkah.entity.mysql.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * Created by weilei on 15/8/22.
 */
public class SpringMybatisTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        EmpMapper empMapper = context.getBean("empMapper", EmpMapper.class);
        DeptMapper deptMapper = context.getBean("deptMapper", DeptMapper.class);

        // test 01
        Emp emp = empMapper.getEmp(7782);
        System.out.println(emp.getEname());

        // test 02
        List<Emp> emps = empMapper.getEmpListJoinDept();
        emps.forEach(emp1 -> System.out.println(emp1.getDept().getDeptno()));

        // test 03
        Dept dept = new Dept(50, "SDS", "中国武汉光谷软件园");
        Emp emp1 = new Emp("JOHN", "DEVERLOPER", 7936, new Date(), 7000, 1000, dept);
        empMapper.addEmpWithDept(emp1);

        // test 04
        empMapper.delete(7938);

        // test 05
        Emp emp2 = new Emp(7937, "HARRY", "DEVERLOPER", 7936, new Date(), 6000, 500);
        empMapper.update(emp2);

        // test 06
        Dept dept1 = deptMapper.getDeptJoinEmp(30);
        dept1.getEmps().forEach(emp3 -> System.out.println(dept1.getDeptno() + ", " + emp3.getEname()));
    }
}

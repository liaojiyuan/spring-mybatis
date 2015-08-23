package com.wusong.hanukkah.dao.mysql;

import com.wusong.hanukkah.entity.mysql.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by weilei on 15/8/22.
 */
public interface EmpMapper {
    public int addEmp(@Param("emp") Emp emp);

    public int update(@Param("emp") Emp emp);

    public int delete(@Param("empno") int empno);

    public Emp getEmp(@Param("empno") int empno);

    public List<Emp> getEmpListJoinDept();

    public int addEmpWithDept(Emp emp);
}

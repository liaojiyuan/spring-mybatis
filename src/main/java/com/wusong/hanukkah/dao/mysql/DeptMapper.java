package com.wusong.hanukkah.dao.mysql;

import com.wusong.hanukkah.entity.mysql.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * Created by weilei on 15/8/22.
 */
public interface DeptMapper {
    public Dept getDeptJoinEmp(@Param("deptno") int deptno);
}

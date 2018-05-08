package com.example.testproject;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Department> deptList = new ArrayList<>();
        Department department = new Department();
        department.setId(1l);
        deptList.add(department);
        deptList.add(department);
        Department department2 = new Department();
        department2.setId(2l);
        deptList.add(department2);

        List<DepartmentNodeVO> deptVOList = deptList.parallelStream().map(item -> {
            DepartmentNodeVO vo = new DepartmentNodeVO();
            BeanUtils.copyProperties(item, vo);
            vo.setChild(new LinkedList<>());
            return vo;
        }).collect(Collectors.toList());

        System.out.println(deptList);
    }
}

package com.example.testproject;

import java.util.List;

/**
 * @author annpeter.it@gmail.com
 * @date 23/01/2018
 */
public class DepartmentNodeVO extends Department {
    private List<Department> child;

    public List<Department> getChild() {
        return child;
    }

    public void setChild(List<Department> child) {
        this.child = child;
    }
}

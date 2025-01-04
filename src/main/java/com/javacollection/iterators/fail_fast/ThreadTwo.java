package com.javacollection.iterators.fail_fast;

import java.util.Iterator;
import java.util.List;

public class ThreadTwo implements Runnable{
    private final List<Employee> employeeList;

    ThreadTwo(List<Employee> employeeList){
        this.employeeList=employeeList;
    }

    @Override
    public void run() {
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){
            Employee employee= employeeIterator.next();
            if(employee.getAge()<18){
                employeeIterator.remove();
            }
        }
    }
}

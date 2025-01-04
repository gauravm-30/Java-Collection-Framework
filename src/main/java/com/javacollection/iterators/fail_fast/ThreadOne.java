package com.javacollection.iterators.fail_fast;

import java.util.Iterator;
import java.util.List;

public class ThreadOne implements Runnable{

    private final List<Employee> employeeList;

    ThreadOne(List<Employee> employeeList){
        this.employeeList=employeeList;
    }

    @Override
    public void run() {
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){
            Employee employee= employeeIterator.next();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(employee);
        }
    }
}

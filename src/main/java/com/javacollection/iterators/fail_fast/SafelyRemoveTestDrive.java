package com.javacollection.iterators.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafelyRemoveTestDrive {
    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Gaurav",21,"Development"));
        employeeList.add(new Employee("Saurabh",22,"Development"));
        employeeList.add(new Employee("Harsh",17,"Development"));
        employeeList.add(new Employee("Puskar",12,"Development"));

        //Concurrent Modification using threads with explicit Iterators by
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){                     //Since here iterator.next() will give exception to remove the element
            Employee employee = employeeIterator.next();
            if(employee.getAge()<18){
                employeeIterator.remove();
            }
        }



    }
}

package com.javacollection.iterators.fail_fast;

import java.util.ArrayList;
import java.util.List;

public class FailFastTestDrive1 {
    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();

    employeeList.add(new Employee("Gaurav",21,"Development"));
    employeeList.add(new Employee("Saurabh",22,"Development"));
    employeeList.add(new Employee("Harsh",17,"Development"));
    employeeList.add(new Employee("Puskar",12,"Development"));

    //Concurrent Modification using threads with explicit Iterators
    Thread t1 = new Thread(new ThreadOne(employeeList));
    Thread t2 = new Thread(new ThreadTwo(employeeList));
    t1.start();
    t2.start();

    }
}

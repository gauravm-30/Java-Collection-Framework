package com.javacollection.iterators.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTestDrive2 {
    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Gaurav",21,"Development"));
        employeeList.add(new Employee("Saurabh",22,"Development"));
        employeeList.add(new Employee("Harsh",17,"Development"));
        employeeList.add(new Employee("Puskar",12,"Development"));


    //Concurrent Modification using threads with implicit Iterators by for each
        for (Employee employee: employeeList){     // when implicit iterator calls the .next() method , it gives the concurrent modification exception
            if(employee.getAge()<18){
                employeeList.remove(employee);
            }
        }
        System.out.println(employeeList);


        //Concurrent Modification using threads with explicit Iterators by
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){                     //Since here iterator.next() will give exception to remove the element
            Employee employee = employeeIterator.next();
            if(employee.getAge()<18){
                employeeList.remove(employee);
            }
        }



    }
}

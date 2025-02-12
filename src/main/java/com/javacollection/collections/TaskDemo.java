package com.javacollection.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class TaskDemo {
    public static void main(String[] args) {

        PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
        PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");
        CodingTask databaseCode = new CodingTask("db");
        CodingTask interfaceCode = new CodingTask("gui");
        CodingTask logicCode = new CodingTask("logic");

        Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
        Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();

        Collection<Task> mondayTasks = new ArrayList<Task>();
        Collection<Task> tuesdayTasks = new ArrayList<Task>();

        //adding all phoneTasks
        Collections.addAll(phoneTasks, mikePhone, paulPhone);

        //adding all codingTasks
        Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);

        Collections.addAll(mondayTasks, logicCode, mikePhone);
        Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);

        assert phoneTasks.toString().equals("[phone Mike, phone Paul]");
        assert codingTasks.toString().equals("[code db, code gui, code logic]");
        assert mondayTasks.toString().equals("[code logic, phone Mike]");
        assert tuesdayTasks.toString().equals("[code db, code gui, phone Paul]");
    }
}

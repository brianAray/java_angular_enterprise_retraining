package com.revature.monday.mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolRoster {

    public static void main(String[] args) {
        /*
        Hashmaps are like hash tables
        We will associate each class with a list of students
         */

        // I choose array list because I don't care about order too much. I will most likely manipulate and need
        // random access within the DS
        List<Entity> mathStudents = new ArrayList<>();
        List<Entity> engStudents = new ArrayList<>();
        List<Entity> artStudents = new ArrayList<>();

        Entity genericStudent = new Student("Mike", 11);

        mathStudents.add(genericStudent);
        engStudents.add(genericStudent);
        artStudents.add(genericStudent);

        Map<String, List<Entity>> classRosterMap = new HashMap<>();

        classRosterMap.put("Math 101", mathStudents);
        classRosterMap.put("Art 101", artStudents);
        classRosterMap.put("English 101", engStudents);

        System.out.println(classRosterMap);

    }
}

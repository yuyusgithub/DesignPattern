package com.yuyu.filterPattern.impl;

import com.yuyu.filterPattern.Criteria;
import com.yuyu.filterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 彦祖 .
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}

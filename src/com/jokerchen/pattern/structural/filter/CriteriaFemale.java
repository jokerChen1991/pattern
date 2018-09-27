package com.jokerchen.pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joker
 * @date 2018-09-27 21:33
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
package com.jokerchen.pattern.structure.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author joker
 * @date 2018-09-27 21:36
 */
public class FilterTest {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        //jdk1.8 lambdas
        Map<String, List<Person >> groupMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
        groupMap.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        //上面的过滤模式在1.8中只要用简单的lambdas即可实现
        List<Person> subPerson = persons.stream()
                .filter(person -> person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                .collect(Collectors.toList());
        printPersons(subPerson);

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}

package org.example;

import org.example.entity.Employee;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));
        employees.add(null);

        WordCounter.calculatedWord();
    }

    public static List<Employee> findDuplicates(List list) {
        List<Employee> unique = new ArrayList<>();
        List<Employee> duplicates = new ArrayList<>();

        for (Object employee: list){
            if(unique.contains(employee)){
                duplicates.add((Employee) employee);
            }else{
                unique.add((Employee) employee);
            }
        }

        return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List list) {
        Map<Integer, Employee> uniques = new HashMap<>();
        List<Employee> uniquesList = new ArrayList<>();

        for (Object employee: list){
            if(!uniquesList.contains(employee) && employee != null){
                uniquesList.add((Employee) employee);
                uniques.put(((Employee) employee).getId(), (Employee) employee);
            }
        }

        return uniques;
    }

    public static List<Employee> removeDuplicates(List list) {
        List<Employee> removedList = new ArrayList<>();
        List<Employee> uniquesList = new ArrayList<>();
        List<Employee> duplicates = new ArrayList<>();

        for (Object employee: list){
            if(uniquesList.contains(employee)){
                duplicates.add((Employee) employee);
            }else{
                uniquesList.add((Employee) employee);
            }
        }

        removedList = uniquesList;
        removedList.removeAll(duplicates);
        return removedList;
    }
}
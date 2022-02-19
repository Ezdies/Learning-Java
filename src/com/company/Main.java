package com.company;

import java.util.Arrays;


class Employee implements Comparable<Employee> {
    private final String name;
    private final String surname;
    private final int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public static void print(Employee[] tab) {
        for (Employee em : tab) {
            System.out.println(em.name + " " + em.surname + " " + em.salary);
        }
    }

    @Override
    public int compareTo(Employee employee) {
        return CharSequence.compare(name, employee.name);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Jeden", 12000);
        Employee employee2 = new Employee("Marek", "Dwa", 12500);
        Employee employee3 = new Employee("Dawid", "Trzy", 13000);

        Employee[] employees = {employee1, employee2, employee3};
        Arrays.sort(employees);

        Employee.print(employees);
    }
}
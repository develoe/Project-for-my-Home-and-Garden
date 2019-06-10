package com.personModel;

public class Senzor {
    private int id;
    private String name;

    private int age ;
    private String jobs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Me "+ name  +" and i have " + age +" years old and my jobs is programarea in java " + jobs;
    }
}


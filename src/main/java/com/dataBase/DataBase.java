package com.dataBase;

import com.PersonModel.Senzor;

public class DataBase {
    public Senzor getId(){
        Senzor person = new Senzor();
        person.setAge(13);
        person.setId(1);
        person.setJobs("Java");
        person.setName("Nechiforel David-Samuel");

        return person;
    }

}

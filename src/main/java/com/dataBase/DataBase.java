package com.dataBase;

import com.arduino.Controller;
import com.personModel.Senzor;

import java.io.IOException;

public class DataBase {


    public Senzor getId() throws IOException {
        Controller controller = new Controller();
        Senzor person = new Senzor();
        person.setAge(13);
        person.setId(2);
        person.setJobs("Java");
        person.setName("Miron Vancu");

        return person;
    }

}

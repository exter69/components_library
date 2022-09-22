package service;

import model.ActionDataDTO;
import model.LogDTO;
import model.UserDTO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Log extends LogDTO {
    static long refId;
    private long id;
    private UserDTO user;
    private ActionDataDTO actionData;




    public Log (long id, UserDTO user, ActionDataDTO actionData) {
        this.id = id;
        this.user = user;
        this.actionData = actionData;
    }

    public Log (UserDTO user, ActionDataDTO actionData) {
        refId++;
        this.id = refId;
        this.user = user;
        this.actionData = actionData;
    }




    public void log (Log log) throws IOException {
        //todo: send log in jpa "fake db"

        //todo: write log in file.txt
//        FileWriter file = new FileWriter("C:\\Users\\lucat\\Desktop\\Project-2023\\components_library\\Log\\src\\main\\resources\\logs");
//        file.write("zeub");
    }


}

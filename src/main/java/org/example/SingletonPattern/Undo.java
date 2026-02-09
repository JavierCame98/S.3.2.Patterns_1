package org.example.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> history = new ArrayList<>();


    private Undo(){};

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        history.add(command);
    }

    public String undoCommand (){
        if(history.isEmpty()){
            throw new IllegalArgumentException("The list is empty");
        }
        return history.remove(history.size() - 1);
    }

    public void showHistory(){
        history.forEach(System.out::println);
    }


}

package net.soap.example.todolist.Model;

import java.io.Serializable;

public class Task implements Serializable {

    int id;
    String description;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
    @Override
    public String toString(){
        return id +"::" +description;
    }
}

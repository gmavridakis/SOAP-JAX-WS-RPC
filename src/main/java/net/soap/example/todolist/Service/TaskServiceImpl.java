package net.soap.example.todolist.Service;

import net.soap.example.todolist.Model.Task;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Providing endpointInterface as the interface we have for our web service.
* This way JAX-WS knows the implementation of web service methods.
* */
@WebService(endpointInterface = "net.soap.example.todolist.Service.TaskService")
public class TaskServiceImpl implements  TaskService{

    private static Map<Integer,Task> tasks = new HashMap<Integer,Task>();

    @Override
    public boolean addTask(Task t) {
        if(tasks.get(t.getId())!=null) return false;
        tasks.put(t.getId(),t);
        return true;
    }

    @Override
    public boolean deleteTask(int id) {
        if(tasks.get(id) == null) return false;
        tasks.remove(id);
        return true;
    }

    @Override
    public Task getTask(int id) {
        return tasks.get(id);
    }

    @Override
    public Task[] getAllTasks() {
        Set<Integer> ids = tasks.keySet();
        Task[] t = new Task[ids.size()];
        int i=0;
        for(Integer id : ids){
            t[i] = tasks.get(id);
            i++;
        }
        return t;
    }
}
package net.soap.example.todolist.Service;

import net.soap.example.todolist.Model.Task;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/*
*  We can create SOAP web services in RPC style or Document style.
*  We can use any of these styles to create web services.
*  The difference is seen in the way WSDL file is generated.
* */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface TaskService {

    @WebMethod
    public boolean addTask(Task t);

    @WebMethod
    public boolean deleteTask(int id);

    @WebMethod
    public Task getTask(int id);

    @WebMethod
    public Task[] getAllTasks();
}
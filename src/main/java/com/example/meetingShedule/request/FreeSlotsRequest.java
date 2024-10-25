package com.example.meetingShedule.request;

import java.util.List;


public class FreeSlotsRequest {
    
    private List<String> employees;  

    private int duration;

    
    public List<String> getEmployees() {  
        return employees;
    }

    
    public void setEmployees(List<String> employees) {  
        this.employees = employees;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}


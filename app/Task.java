package com.todolist_manager.app;

public class Task {
    String title;
    String description;
    boolean completed;
    public Task(String title, String description){
        this.title=title;
        this.description=description;
        this.completed=false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void markCompleted(){
        completed=true;
    }
}


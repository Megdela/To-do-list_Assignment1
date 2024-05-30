package com.todolist_manager.app;

public class ToDoList {
     Node head;
     public ToDoList(){
         this.head=null;
     }

     public void addToDo(Task task) {
         Node newNode = new Node(task);
         if (head == null) {
             head = newNode;
         } else {
             Node current = head;
             while (current.node != null) {
                 current = current.node;
             }
             current.node = newNode;
         }

     }
     public void markToDoAsCompleted(String title) {
            if (this.head == null) {
                System.out.println("To-Do list is empty.");
                return;
            }

            Node current =head;
            while (current != null) {
                if (current.task.getTitle().equals(title)) {
                    current.task.markCompleted();
                    System.out.println("Task \"" + title + "\" marked as completed.");
                    return;
                }
                current = current.node;
            }
            System.out.println("Task \"" + title + "\" not found in the To-Do list.");
        }

        public void viewToDoList() {
            if (head == null) {

                System.out.println("To-Do list is empty.");
                return;
            }

            Node current =head;
            System.out.println("To-Do List:");
            while (current != null) {
                String status = current.task.isCompleted() ? "Completed" : "uncompleted";
                System.out.println("Task: "  + current.task.getTitle() + " - " + current.task.getDescription() +" - " +status);
                current = current.node;
            }
        }
    }


class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        Task task1 = new Task("Finish project report", "Complete the project report by the end of the week.");
        Task task2 = new Task("Study DSA", "Cover the basic concepts of linkedlist.");
        Task task3 = new Task("Do database assignment", "Populate data into tables using MySQL.");

        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.addToDo(task3);

        toDoList.viewToDoList();

        toDoList.markToDoAsCompleted("Finish project report");

        System.out.println();
        toDoList.viewToDoList();
    }

}
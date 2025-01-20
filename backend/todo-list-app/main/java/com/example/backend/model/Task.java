package com.example.backend.model; // Local testing/project, leave as id

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Task - Task data/object that will be used for each user entered task

@Entity // Mapping Task to be a database entity
public class Task {
    // set the variables that will be needed for that to-do list
    @Id // Mark the id field as the primary key of the data
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Database will auto assign unique id
    private Long id;

    private String title;
    private String description;
    
}

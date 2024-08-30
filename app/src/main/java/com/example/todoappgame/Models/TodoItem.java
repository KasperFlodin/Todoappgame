package com.example.todoappgame.Models;

import android.location.Location;

import java.util.Date;
import java.util.List;
import java.util.UUID;

enum typeTask {
        Cleaning,
        MealPrep,
        YardWork,
        VacationPlanning,
        Television
    }

enum priority {
    High,
    Normal,
    Low,
}

public class TodoItem {
    UUID id;
    String name;
    String imageFileBefore;
    String imageFileAfter;
    String description;
    Date PlannedStartTime;
    Date PlannedEndTime;
    Date StartTime;
    Date EndTime;
    int timeSpent;
    Location location;
    List<TodoItem> BlockersList;
    Boolean isCompleted = false;
    Boolean isRepeatable = false;
    int xp;






}

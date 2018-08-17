package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// COMPLETE (1) make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {
    private LiveData<List<TaskEntry>> mTaskEntries;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mTaskEntries = AppDatabase.getInstance(application).taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return mTaskEntries;
    }

    // COMPLETE (2) Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData

    // COMPLETE (4) In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable

    // COMPLETE (3) Create a getter for the tasks variable
}

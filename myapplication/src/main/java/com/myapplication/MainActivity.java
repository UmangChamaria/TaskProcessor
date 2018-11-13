package com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.umang.asyncprocessor.TaskProcessor;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TaskProcessor.getInstance().addTask(new TestTask());
  }
}

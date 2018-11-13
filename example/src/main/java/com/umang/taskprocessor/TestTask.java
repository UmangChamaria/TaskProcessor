package com.umang.taskprocessor;

import com.umang.asyncprocessor.ITask;
import com.umang.asyncprocessor.TaskResult;

/**
 * @author Umang Chamaria
 */
public class TestTask implements ITask {
  @Override public TaskResult execute() {
    return null;
  }

  @Override public String getTaskTag() {
    return null;
  }

  @Override public boolean isSynchronous() {
    return false;
  }
}

package com.umang.asyncprocessor;

/**
 * Callback on task completion
 * @author Umang Chamaria
 */

public interface OnTaskCompleteListener {
  void onTaskComplete(String tag, TaskResult taskResult);
}

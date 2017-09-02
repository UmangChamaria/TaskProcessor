package com.umang.asyncprocessor;

/**
 * @author Umang Chamaria
 */

public interface OnTaskCompleteListener {
  void onTaskComplete(String tag, TaskResult taskResult);
}

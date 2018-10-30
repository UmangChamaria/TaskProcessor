package com.umang.asyncprocessor;

/**
 * Interface to be implemented for background thread processing
 * @author Umang Chamaria
 */

public interface ITask {
  /**
   * The business logic which needs to be run on the worker thread.
   * @return Result of the task {@link TaskResult}
   */
  TaskResult execute();

  /**
   * Tag name of the task
   * @return Tag associated with the task.
   */
  String getTaskTag();

  /**
   * Tells whether the task can asynchronous or not.
   * @return true if task should be run synchronously, else false
   */
  boolean isSynchronous();
}

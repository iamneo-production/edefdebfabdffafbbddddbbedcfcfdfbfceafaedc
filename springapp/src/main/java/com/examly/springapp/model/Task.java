package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_details")
public class Task {
  @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long taskId;
  
  @Column(name = "taskHolderName")
  private String taskHolderName;
  
  @Column(name = "taskDate")
  private String taskDate;
  
  @Column(name = "taskName")
  private String taskName;
  
  @Column(name = "taskStatus")
  private String taskStatus;


  public Task(){

  }


  public Task(long taskId, String taskHolderName, String taskDate, String taskName, String taskStatus) {
    this.taskId = taskId;
    this.taskHolderName = taskHolderName;
    this.taskDate = taskDate;
    this.taskName = taskName;
    this.taskStatus = taskStatus;
  }


  public long getTaskId() {
    return this.taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }

  public String getTaskHolderName() {
    return this.taskHolderName;
  }

  public void setTaskHolderName(String taskHolderName) {
    this.taskHolderName = taskHolderName;
  }

  public String getTaskDate() {
    return this.taskDate;
  }

  public void setTaskDate(String taskDate) {
    this.taskDate = taskDate;
  }

  public String getTaskName() {
    return this.taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public String getTaskStatus() {
    return this.taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }
}
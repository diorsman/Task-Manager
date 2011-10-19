package com.ulysses.taskmanager.view;

import com.ulysses.taskmanager.model.LocalTask;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class TaskListItem extends LinearLayout {

	private LocalTask task;
	private CheckedTextView checkbox;

	public TaskListItem(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		checkbox = (CheckedTextView)findViewById(android.R.id.text1);
	}

	public void setTask(LocalTask task) {
		this.task = task;
		checkbox.setText(task.getGoogleTask().getTitle());
		checkbox.setChecked(task.isComplete());
	}

	public LocalTask getTask() {
		return task;
	}
	
}

// Select the required elements
const addTaskButton = document.getElementById('add-task');
const newTaskInput = document.getElementById('new-task');
const taskList = document.getElementById('task-list');

// Add event listener for adding tasks
addTaskButton.addEventListener('click', function() {
  const taskText = newTaskInput.value.trim();
  
  // Only add task if the input field is not empty
  if (taskText !== '') {
    const li = document.createElement('li');
    li.textContent = taskText;

    // Create the delete button for each task
    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'Delete';
    deleteButton.className = 'delete-task';

    // Append the delete button to the task
    li.appendChild(deleteButton);

    // Append the task to the task list
    taskList.appendChild(li);

    // Clear the input field after adding the task
    newTaskInput.value = '';

    // Add delete functionality to the delete button
    deleteButton.addEventListener('click', function() {
      li.remove();  // Remove the task when the delete button is clicked
    });
  }
});

# To-Do List Application

This is a simple To-Do List application built with Spring Boot, Thymeleaf, and Java. The application allows users to add, update, and delete tasks with a description, deadline, and status.

## Features

- Add new tasks with a description, deadline, and status.
- View all tasks in a table.
- Update the status of a task.
- Delete a task.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- Maven
- H2 Database (or any other database of your choice)

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/to-do-list.git
    cd to-do-list
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

4. Open your web browser and navigate to:
    ```
    http://localhost:8080/tasks
    ```

## Project Structure

- `src/main/java/com/to_do_list/to_do_list` - Contains the main application and source code.
- `src/main/resources/templates` - Contains Thymeleaf templates.
- `src/main/resources/static` - Contains static resources like CSS.
- `src/main/resources/application.properties` - Configuration file for the application.

## Endpoints

- `GET /tasks` - View all tasks.
- `POST /tasks` - Add a new task.
- `POST /tasks/delete/{id}` - Delete a task.
- `POST /tasks/update-status/{id}` - Update the status of a task.

## Detailed Description

### Adding a New Task

To add a new task, fill out the form on the main page with the task description, deadline, and status, then click the "Add" button. The task will be added to the list and displayed in the table.

### Viewing Tasks

All tasks are displayed in a table on the main page. Each row shows the task description, deadline, status, and options to update or delete the task.

### Updating Task Status

To update the status of a task, use the dropdown menu in the "Update" column of the table. Select the new status and click the "Update" button. The task status will be updated and the table will refresh.

### Deleting a Task

To delete a task, click the "Delete" button in the "Delete" column of the table. The task will be removed from the list and the table will refresh.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

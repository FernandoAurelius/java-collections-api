package list.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public TodoList() {
    }

    public void addTodo(String description) {
        todos.add(new Todo(description));
    }

    public void removeTodo(String description) {
        for (Todo todo : todos) {
            if (todo.getDescription().equalsIgnoreCase(description)) {
                todos.remove(todo);
                System.out.println("Todo removed successfully!");
                return;
            }
            System.out.println("No todo found for this description.");
        }
    }

    public void getTotalTodos() {
        System.out.println("Total todos in the todo list so far: " + todos.size());
    }

    public List<String> getTodosDescriptions() {
        return todos.stream().map(Todo::getDescription).collect(Collectors.toList());
    }

}

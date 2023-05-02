import java.util.ArrayList;

/**
 * ClassName: Todos
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-04-25 10:19 a.m.
 * @Version 1.0
 */
public class Todo {


    private String task;
    private Date dueDate;
    private int hoursOfWork;
//    private TaskStatus status;
//    enum TaskStatus {Pending, Done};


    public Todo() {
    }


    public Todo(String task, Date dueDate, int hoursOfWork) {
        setTask(task);
        setDueDate(dueDate);
        setHoursOfWork(hoursOfWork);
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        if (task == null || task.length() < 2 || task.length() > 50 ||
                task.contains(";") || task.contains("|") || task.contains("`")) {
            throw new IllegalArgumentException("Task should be 2-50 characters long and should not contain ';', '|', or '`'");
        }
        this.task = task;

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        if (dueDate == null || dueDate.getYear() < 100 || dueDate.getYear() > 200) {
            throw new IllegalArgumentException("Due date should be between year 1900 and 2100");
        }
        this.dueDate = dueDate;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "task='" + task + '\'' +
                ", dueDate=" + dueDate +
                ", hoursOfWork=" + hoursOfWork +
                '}';
    }
}

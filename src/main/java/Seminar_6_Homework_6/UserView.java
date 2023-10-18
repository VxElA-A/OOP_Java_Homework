package Seminar_6_Homework_6;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}

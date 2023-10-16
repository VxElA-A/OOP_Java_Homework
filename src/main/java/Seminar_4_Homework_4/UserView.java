package Seminar_4_Homework_4;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}

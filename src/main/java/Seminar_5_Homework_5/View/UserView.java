package Seminar_5_Homework_5.View;

import Seminar_5_Homework_5.Model.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}

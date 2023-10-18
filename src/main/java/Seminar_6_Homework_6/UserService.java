package Seminar_6_Homework_6;

import java.util.List;

public interface UserService<T extends User> {
    public List<T> getAll();
    public void initData(List<T> list);
    public void create(String surname, String firstname, String patronymic);
}
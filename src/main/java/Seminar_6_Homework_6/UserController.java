package Seminar_6_Homework_6;

public interface UserController<T extends User> {
    void create(String surname, String firstname, String patronymic);
}

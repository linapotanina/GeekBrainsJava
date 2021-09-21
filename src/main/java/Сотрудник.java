public class Сотрудник {
    String ФИО;
    String должность;
    String email;
    String телефон;
    int зарплата;
    int возраст;

    public Сотрудник (String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void вывестиИнформацию () {
        System.out.println("ФИО: " + ФИО);
        System.out.println("Должность: " + должность);
        System.out.println("email " + email);
        System.out.println("телефон " + телефон);
        System.out.println("зарплата " + зарплата);
        System.out.println("возраст " + возраст);
    }

}

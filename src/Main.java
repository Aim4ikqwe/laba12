interface User{
    void DisplayLogin();
    void DisplayPassword();
}
abstract class People implements User {
    String FIO;
    int Age;
    String Position;
    People(String FIO, int Age, String Position){
        this.FIO = FIO;
        this.Age = Age;
        this.Position = Position;
    }
}
class Teacher extends People{
    String Login;
    String Password;
    Teacher(String FIO, int Age, String Position, String Login, String Password) {
        super(FIO, Age, Position);
        this.Login = Login;
        this.Password = Password;
    }

    @Override
    public void DisplayLogin() {
        System.out.println(Login);
    }

    @Override
    public void DisplayPassword() {
        System.out.println(Password);
    }
}
class Student extends People{

    String Login;
    String Password;
    Student(String FIO, int Age, String Position, String Login, String Password) {
        super(FIO, Age, Position);
        this.Login = Login;
        this.Password = Password;
    }

    @Override
    public void DisplayLogin() {
        System.out.println(Login);
    }

    @Override
    public void DisplayPassword() {
        System.out.println(Password);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Уханов А.А", 17, "Студент", "Aim4ik", "123");
        Student student1 = new Student("Ермохин Д.Е", 18, "Студент", "Ermoha", "Joker");
        Teacher teacher = new Teacher("Лапицкий Д.В", 17, "Учитель", "Dann", "Venom");
        Teacher teacher1 = new Teacher("Воронова Е.А", 18, "Учиетль", "Small", "Noob");
        student.DisplayLogin();
        teacher.DisplayPassword();
    }
}
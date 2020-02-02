public class Empl {
    String name;
    String post;
    String mail;
    String phone;
    int salary;
    int age;

    public Empl(String myName, String myPost, String myMail, String myPhone, int mySalary, int myAge){
        name = myName;
        post = myPost;
        mail = myMail;
        phone = myPhone;
        salary = mySalary;
        age = myAge;
        System.out.println("ФИО: " + myName + "\nДолжность: " + myPost + "\nemail: " + myMail + "\nТелефон: " + myPhone + "\nЗарплата: " + mySalary + "\nВозраст: " + myAge);
    }

}
    class MainClass{
    public static void main(String[] args) {
        Empl empl1 = new Empl ("Иванов И. И.", "Тестировщик", "абвгд", "8756483", 45000, 25 );
        Empl empl2 = new Empl ("Петров И. И.", "Тестировщик", "абвгд", "8756483", 45000, 45 );
        Empl empl3 = new Empl ("Сидоров И. И.", "Тестировщик", "абвгд", "8756483", 45000, 35 );
        Empl empl4 = new Empl ("Топоров И. И.", "Тестировщик", "абвгд", "8756483", 45000, 41 );
        Empl empl5 = new Empl ("Глазнев И. И.", "Тестировщик", "абвгд", "8756483", 45000, 23 );

        Empl [] emplsArray = new Empl[5];

        emplsArray[0] = empl1;
        emplsArray[1] = empl2;
        emplsArray[2] = empl3;
        emplsArray[3] = empl4;
        emplsArray[4] = empl5;

        System.out.println("Сотрудники старше 40 лет: ");

        for (int i = 0; i < emplsArray.length; i++) {
            if (emplsArray[i].age > 40) {
                System.out.println(emplsArray[i].name);
            }
        }
    }
}

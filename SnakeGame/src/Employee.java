import interfaces.Progging;

import java.util.ArrayList;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void voice() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Zieman");
        Driver driver = new Driver("David Russel");
        Chief chief = new Chief("Gordon Ramzy");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(driver);
        employees.add(chief);
        for(Employee all : employees){
            all.voice();
        }

        ArrayList<Progging> programmers = new ArrayList<>();
        programmers.add(programmer);
        for(Progging progers  : programmers){
            programmer.voice(); progers.proger();
        }

    }
}



//        Создать класс Работник, у которого есть одно поле name, конструктор, в котором мы инициализируем это поле,
//        геттер на поле name и метод voice, в котором на экран выводится имя сотрудника. После этого создать 3 класса,
//        которые наследуются от Работника - программист, водитель, повар. Конструкторы этих классов также должны принимать всего один параметр - имя.

//        Создать три интерфейса - Способный программировать, способный готовить и способный водить машину. В каждом из них по одному методу,
//        которые не возвращают никаких данных и не принимают параметров, названия методов соответственно: писать код, готовить и водить.

//        После этого каждый работник должен реализовать соответствующий ему интерфейс.
//        В классе мейн нужно создать по три работника каждой специальности, в цикле произвести перекличку, т.к. у всех работников вызвать метод voice,
//        а затем заставить всех работать, вам понадобится еще 3 цикла.
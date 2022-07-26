package pingwit.lec_10.hm.task_1;

//Task    Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте в классе метод,
//        который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())

public class Generic<T, E> {
    private T id;
    private E name;

    public Generic(T id, E name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public void printClassName() {
        System.out.println(id.getClass().getName());
    }
}


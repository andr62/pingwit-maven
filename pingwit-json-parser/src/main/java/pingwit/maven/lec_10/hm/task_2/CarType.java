package pingwit.lec_10.hm.task_2;
//Task 2
//        Есть папка с файлами, которые нужно переименовать.
//        Реализуйте паттерн "стратегия" при помощи Enum для переименования файлов:
//        - имя файла маленькими буквами
//        - первая буква в имени файла с большой буквы, а остальные маленькие
//        - имя файла написано кэпс локом (все буквы большие)
//        Напишите класс, у которого будет метод принимающий текущее имя файла и стратегию для переименования.

public interface CarType {
    String getCarType();
}

class Truck implements CarType {
    public String getCarType() {
        return "Truck";
    }
}

class Roadster implements CarType {
    public String getCarType() {
        return "Roadster";
    }
}

class Sportscar implements CarType {
    public String getCarType() {
        return "Sportscar";
    }
}

class Batmobile implements CarType {
    public String getCarType() {
        return "Batmobile";
    }
}

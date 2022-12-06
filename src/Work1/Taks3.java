package Work1;

public class Taks3 {
    public static void main(String[] args) {
        //Задача6
        System.out.println("Задача6");
        var boxser1Weight=78.2;
        var boxser2Weight=82.7;
        System.out.println("Общий вес двух бойцов:" + (boxser1Weight+boxser2Weight));
        System.out.println("Разница между двух бойцов:"+(boxser2Weight-boxser1Weight));
        //Задача7
        System.out.println("Задача7");
        System.out.println("Общий вес двух бойцов: (1 способ)" + (boxser2Weight-boxser1Weight));
        System.out.println("Разница между двух бойцов:(2 способ)"+(boxser2Weight%boxser1Weight));
        //Задача8
        var TotalWorkingHours=640;
        var HoursPerDay=8;
        var TotalEmployees=TotalWorkingHours/HoursPerDay;
        System.out.println("Всего работников в компании- "+TotalEmployees+" человек");
        TotalEmployees=TotalEmployees+94;
        TotalWorkingHours=TotalEmployees*HoursPerDay;
        System.out.println("Если в компании работает "+TotalEmployees+" человек-то всего "+TotalWorkingHours+" часов работы может быть поделено между сотрудниками");


    }
}

public class Lecture {
    String name; // null
    int a;
    Lecture(){
        this.name = "default";
        this.a = 132;
    }
    Lecture(String nameS, int aS){
        name = nameS;
        a = aS;
    }
    public static void teach(){
        System.out.println("Teach");
    }

    public static void main(String[]args){
        Lecture lecture = new Lecture();
        //Тип  название перем = создание конструктор(метод)
        System.out.println(lecture.name);
        System.out.println("Hello");
    }
    //1. 8 примитивных типов
    //2. Объекты классов, массив
}

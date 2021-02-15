
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
        System.out.println("Hello");
    }
    //1. 8 примитивных типов
    //2. Объекты классов, массив
}

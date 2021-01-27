package addTask;

public class Main {

    public static void main(String[] args) {

        Animal cat1 =  new Animal("Vaska", 5, true);
        Animal cat2 = new Animal("murka", 4, true);
        Animal cat3 = new Animal("murka", 4, true);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat1.toString());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.equals(cat3));
    }
}

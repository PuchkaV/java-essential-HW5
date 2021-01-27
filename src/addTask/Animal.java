package addTask;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
    if(o == null || this.getClass() != o.getClass()) return false;
    if (this == o) return true;
    Animal animal = (Animal)o;
    boolean resage = this.age == animal.age;
    boolean restail = this.tail == animal.tail;
    boolean resname = this.name.equals(animal.name);

        return resage && resname && restail;
    }

    @Override
    public int hashCode() {
        int result = 37;

        result = 37 * result + (name != null ? name.hashCode() : 0);
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0 );

        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + ", tail=" + tail;
    }
}

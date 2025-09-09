package FirstHibernateProgram;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity    //so now hibernate is understand this is an Entity AND now hibernate make that entity object,fetch obj and all..
public class Student {

    @Id //Table ni under primary key hoy so kai filed primary key che e batava we use @Id annotation
    private int id;

    private String name;
    private String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

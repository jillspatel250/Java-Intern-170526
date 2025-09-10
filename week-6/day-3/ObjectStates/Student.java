package ObjectStates;

public class Student {
    private int id;
    private String name;
    private String city;
    private Certificate certi;

    public Student(){
        super();
    }

    public Student(int id, String name, String city, Certificate certi) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certi = certi;
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

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }
}

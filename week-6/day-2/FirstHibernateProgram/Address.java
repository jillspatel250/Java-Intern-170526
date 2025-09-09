package FirstHibernateProgram;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="student_address") //table habe student_address name thi banse
public class Address{

    @Id //addressId is now primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatic 1 thi vadhse
    @Column(name="address_id") //so now aa column nu name address_id this banse table ma

    private int addressId;

    @Column(length = 50, name="Street_name")
    private String street;

    @Column(length = 100 , name = "CITY")
    private String city;

    @Column(name = "is_open")
    private boolean isOpen;

    @Transient //so x na corresponding koi pan column create nai thayy aa filed ignore thai jase
    private double x;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;

    public Address(){
        super();
    }

    public Address( String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}

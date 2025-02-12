package csulb.cecs323.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(
        name="ReturnPublisher",
        query = "SELECT * " +
                "FROM   PUBLISHERS " +
                "WHERE  NAME = ? ",
        resultClass = Publishers.class
)
public class Publishers {
    /** The full name of the publisher**/
    @Id
    @Column(length=80, nullable = false, updatable = false)
    String name;

    /** Their email address that we use to contact the book publisher. */
    @Column (length=80, nullable = false, unique = true)
    String email;

    /** Their cell phone number that we use to contact the book publisher. */
    @Column (length=24, nullable = false, unique = true)
    String phone;

    /** Default Constructor **/
    public Publishers(){}

    public Publishers(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    /** Getter and Setter methods for the attributes **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Publishers{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

package goJava.modul9;

/**
 * Created by Vova on 02.02.2017.
 */
public class User implements Comparable<User> {

    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;


    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        if (balance != user.balance) {
            return false;
        }
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) {
            return false;
        }
        return city != null ? city.equals(user.city) : user.city == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + balance;
        return result;
    }

    @Override
    public int compareTo(User o) {
        if (getId() != o.getId()) {
            return (int) (Math.abs(getId() - o.getId()) / (getId() - o.getId()));
        } else if (this.getBalance() != o.getBalance()) {
            return Math.abs(getBalance() - o.getBalance()) / (getBalance() - o.getBalance());
        } else if (getFirstName().compareTo(o.getFirstName()) != 0) {
            return getFirstName().compareTo(o.getFirstName());
        } else if (getLastName().compareTo(o.getLastName()) != 0) {
            return getLastName().compareTo(o.getLastName());
        } else if (getCity().compareTo(o.getCity()) != 0) {
            return getCity().compareTo(o.getCity());
        }
        return 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}



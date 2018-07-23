package domainModel;

public class Customer {

    private Integer id;
    private String name;
    private Integer contact;
    private String userName;
    private String password;

    public Customer(Integer id, String name, Integer contact, String userName, String password) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.userName = userName;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getContact() {
        return contact;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

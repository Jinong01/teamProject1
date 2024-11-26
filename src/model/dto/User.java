package model.dto;

public class User {
    private Integer id;
    private String userName;
    private String phoneNumber;
    private Integer point;

    public User(Integer id, String userName, String phoneNumber, Integer point) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.point = point;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", point=" + point +
                '}';
    }
}

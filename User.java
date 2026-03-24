package model;

public class User {
    private int userId;
    private String fullName;
    private String email;
    private String password;
    private String role;
    private String shippingAddress;
    private String paymentMethod;

    public User() {
    }

    public User(int userId, String fullName, String email, String password, String role, String shippingAddress, String paymentMethod) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    public User(String fullName, String email, String password, String role) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(String fullName, String email, String password, String role, String shippingAddress, String paymentMethod) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

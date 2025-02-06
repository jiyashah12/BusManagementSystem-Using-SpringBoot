package com.example.BusManagementSystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "customer_info")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @NotEmpty
    @Size(min = 3, message = "Name should have at least 3 characters.")
    @Column
    private String name;

    @Email(message = "Email address is not valid.")
    @Column
    private String email;

    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$")
    @NotEmpty(message = "Must not be Empty and NULL")
    @Column
    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}



package com.accenture.bankledger.model.entity;

import jakarta.persistence.*;


@Entity
@Table (name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
        private Long id;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column (name ="first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name ="last_name", nullable = false, length = 100)
    private String lastName;

    public Customer(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}

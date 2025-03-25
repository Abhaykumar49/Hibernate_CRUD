package com.hibernate.test2;

import jakarta.persistence.*;

@Entity
@Table(name = "employee") // Maps to the employee table
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses MySQL AUTO_INCREMENT
    @Column(name = "id") // Maps correctly to the database column
    private int id;
    
    @Column(name = "name", nullable = false) // Ensure name column mapping
    private String name;

    // Getters and Setters
    public int getId() { // Changed method name to reflect the correct field
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
}

package com.hibernate.test2;

import org.hibernate.Session;

public class ReadEmployee {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Employee employee = session.get(Employee.class, 1); // Fetch Employee with ID 1
        if (employee != null) {
            System.out.println("Employee Found: " + employee.getName());
        } else {
            System.out.println("Employee Not Found!");
        }
        
        session.close();
    }
}

package com.hibernate.test2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateEmployee {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class, 1); // Fetch Employee with ID 1
        if (employee != null) {
            employee.setName("Abhay");
            session.update(employee);
            transaction.commit();
            System.out.println("Employee Updated Successfully!");
        } else {
            System.out.println("Employee Not Found!");
        }
        
        session.close();
    }
}

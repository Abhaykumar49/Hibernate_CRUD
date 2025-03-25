package com.hibernate.test2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEmployee {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class, 3); // Fetch Employee with ID 1
        if (employee != null) {
            session.delete(employee);
            transaction.commit();
            System.out.println("Employee Deleted Successfully!");
        } else {
            System.out.println("Employee Not Found!");
        }
        
        session.close();
    }
}

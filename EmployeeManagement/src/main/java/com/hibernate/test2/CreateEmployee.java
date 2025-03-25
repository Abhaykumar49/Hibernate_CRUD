package com.hibernate.test2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CreateEmployee {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("Galgotias");

        session.save(employee);
        transaction.commit();
        session.close();

        System.out.println("Employee Created Successfully!");
    }
}

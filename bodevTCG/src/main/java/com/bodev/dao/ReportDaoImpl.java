package com.bodev.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bodev.entity.Report;

@Repository
public class ReportDaoImpl implements ReportDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Report report) {
        sessionFactory.getCurrentSession().save(report);
    }

    @Override
    public List<Report> listReports() {
        @SuppressWarnings("unchecked")
        TypedQuery<Report> query = sessionFactory.getCurrentSession().createQuery("from Report");
        return query.getResultList();
    }
}

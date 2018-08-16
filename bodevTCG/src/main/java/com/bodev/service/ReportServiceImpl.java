package com.bodev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.bodev.dao.ReportDao;
import com.bodev.entity.Report;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;

    @Transactional
    @Override
    public void add(Report report) {
        reportDao.add(report);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Report> listReports() {
        return reportDao.listReports();
    }
}

package com.bodev.dao;

import java.util.List;

import com.bodev.entity.Report;

public interface ReportDao {
    void add(Report report);
    List<Report> listReports();
}

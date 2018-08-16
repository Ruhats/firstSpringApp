package com.bodev.service;

import java.util.List;

import com.bodev.entity.Report;

public interface ReportService {
    void add (Report report);
    List<Report> listReports();
}


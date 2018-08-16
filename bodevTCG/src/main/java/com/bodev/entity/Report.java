package com.bodev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "service_id")
    private long serviceId;

    @Column(name = "package_id")
    private long packageId;

    @Column(name = "total_subscriber")
    private long totalSubscriber;

    @Column(name = "daily_new_subscriber")
    private long dailyNewSubscriber;

    @Column(name = "total_promo_subscriber")
    private long totalPromoSubscriber;

    @Column(name = "daily_cancellation_subscriber")
    private long dailyCancellationSubscriber;

    @Column(name = "daily_suspended_subscriber")
    private long dailySuspendedSubscriber;

    @Column(name = "daily_active_subscriber_change")
    private long dailyActiveSubscriberChange;

    @Column(name = "daily_charge_total")
    private float dailyChargeTotal;

    public Report(long serviceId, long packageId, long totalSubscriber, long dailyNewSubscriber, long totalPromoSubscriber, long dailyCancellationSubscriber, long dailySuspendedSubscriber, long dailyActiveSubscriberChange, float dailyChargeTotal) {
        this.serviceId = serviceId;
        this.packageId = packageId;
        this.totalSubscriber = totalSubscriber;
        this.dailyNewSubscriber = dailyNewSubscriber;
        this.totalPromoSubscriber = totalPromoSubscriber;
        this.dailyCancellationSubscriber = dailyCancellationSubscriber;
        this.dailySuspendedSubscriber = dailySuspendedSubscriber;
        this.dailyActiveSubscriberChange = dailyActiveSubscriberChange;
        this.dailyChargeTotal = dailyChargeTotal;
    }

    public Report(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public long getPackageId() {
        return packageId;
    }

    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }

    public long getTotalSubscriber() {
        return totalSubscriber;
    }

    public void setTotalSubscriber(long totalSubscriber) {
        this.totalSubscriber = totalSubscriber;
    }

    public long getDailyNewSubscriber() {
        return dailyNewSubscriber;
    }

    public void setDailyNewSubscriber(long dailyNewSubscriber) {
        this.dailyNewSubscriber = dailyNewSubscriber;
    }

    public long getTotalPromoSubscriber() {
        return totalPromoSubscriber;
    }

    public void setTotalPromoSubscriber(long totalPromoSubscriber) {
        this.totalPromoSubscriber = totalPromoSubscriber;
    }

    public long getDailyCancellationSubscriber() {
        return dailyCancellationSubscriber;
    }

    public void setDailyCancellationSubscriber(long dailyCancellationSubscriber) {
        this.dailyCancellationSubscriber = dailyCancellationSubscriber;
    }

    public long getDailySuspendedSubscriber() {
        return dailySuspendedSubscriber;
    }

    public void setDailySuspendedSubscriber(long dailySuspendedSubscriber) {
        this.dailySuspendedSubscriber = dailySuspendedSubscriber;
    }

    public long getDailyActiveSubscriberChange() {
        return dailyActiveSubscriberChange;
    }

    public void setDailyActiveSubscriberChange(long dailyActiveSubscriberChange) {
        this.dailyActiveSubscriberChange = dailyActiveSubscriberChange;
    }

    public float getDailyChargeTotal() {
        return dailyChargeTotal;
    }

    public void setDailyChargeTotal(float dailyChargeTotal) {
        this.dailyChargeTotal = dailyChargeTotal;
    }

    /*public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }*/

}

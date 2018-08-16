package com.bodev;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.bodev.config.AppConfig;
import com.bodev.entity.User;
import com.bodev.entity.Report;
import com.bodev.service.UserService;
import com.bodev.service.ReportService;

@PropertySource("file://Users/ruhatsengul/IdeaProjects/bodevTCG/src/main/resources/database.properties")
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        ReportService reportService = context.getBean(ReportService.class);

        userService.add(new User("Ruhat", "123456"));
        userService.add(new User("Uveys", "qweasdzxc"));
        reportService.add(new Report(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Username = " + user.getId());
        }
        
        List<Report> reports = reportService.listReports();
        for (Report report : reports) {
            System.out.println("Report Id = " + report.getId());
            System.out.println("Service Id = " + report.getServiceId());
            System.out.println("Package Id = " + report.getPackageId());
            System.out.println("Total subscriber = " + report.getTotalSubscriber());
            System.out.println("Daily new subscriber = " + report.getDailyNewSubscriber());
            System.out.println("Total promo subscriber= " + report.getTotalPromoSubscriber());
            System.out.println("Daily cancellation = " + report.getDailyCancellationSubscriber());
            System.out.println("Daily suspend = " + report.getDailySuspendedSubscriber());
            System.out.println("Daily charged amount = " + report.getDailyChargeTotal());
        }

        context.close();









        /*Scanner sc = new Scanner (System.in);
        System.out.println("enter the password");
        String pw = sc.nextLine();
        String password = BCrypt.hashpw(pw,BCrypt.gensalt(11));
        System.out.println("password is hashed succesfully");
        System.out.println(password);
        System.out.println("Enter your password");
        String passwordTry = sc.nextLine();
        if (BCrypt.checkpw(passwordTry, password)) System.out.println("Given hash matches with the password");
        else System.out.println("Wrong password");*/
    }
}

package ru.sbt.bit.ood.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sbt.bit.ood.hw1.job.TradesJob;

/**
 * Created by zabor on 13.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        TradesJob job = (TradesJob)context.getBean("job");
    }
}

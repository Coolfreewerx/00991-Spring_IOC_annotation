package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        DataSourceFile dataSource = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSource);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();

        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");


        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}

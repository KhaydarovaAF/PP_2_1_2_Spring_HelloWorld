import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(bean2.getMessage());

        System.out.println(bean==bean2);
        System.out.println(bean);
        System.out.println(bean2);


        Cat bean3  = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getCat());
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getCat());

        System.out.println(bean3==bean4);
        System.out.println(bean3);
        System.out.println(bean4);
    }


}
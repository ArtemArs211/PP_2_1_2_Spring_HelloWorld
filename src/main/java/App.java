import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);

        System.out.println("Сравнение первой пары бинов: " + (bean == helloWorld1));
        System.out.println("Сравнение второй пары бинов: " + (one == two));

    }
}
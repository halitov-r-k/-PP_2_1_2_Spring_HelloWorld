import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Comparison of HelloWorld bins: " + (beanHelloWorld1 == beanHelloWorld2));
        System.out.println("Comparison of Cat bins: " + (beanCat1 == beanCat2));
    }
}
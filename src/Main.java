import com.ram.bean.BeanTest;
import com.ram.entries.Entiry;
import com.ram.message.MessageTest;
import com.ram.test.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(BeanTest.helloDemo());
        System.out.println(Test.testDemo());
        System.out.println(Entiry.entityMethod());
        System.out.println(MessageTest.messageTestMethod());
    }
}
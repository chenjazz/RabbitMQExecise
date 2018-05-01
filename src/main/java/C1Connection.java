import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Jiazhi
 * @since 2018/5/1
 */
public class C1Connection {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setUsername("root");
        factory.setPassword("root123");
        factory.setHost("192.168.0.102");

        Connection connection = factory.newConnection();

    }
}

package hu.sell;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SellApplicationTests {

    private final Logger logger = LoggerFactory.getLogger((SellApplicationTests.class));
    @Test
    void contextLoads() {
        logger.info("这是消息日志");
        System.out.printf("asdgjklaedgjkljklaedgr");
    }

}

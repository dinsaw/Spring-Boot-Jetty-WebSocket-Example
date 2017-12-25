package com.dineshsawant.websocketdemo;

import com.dineshsawant.websocketdemo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class, WebsocketdemoApplication.class})
public class WebsocketdemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

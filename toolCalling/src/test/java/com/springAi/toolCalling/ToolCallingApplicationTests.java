package com.springAi.toolCalling;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.springAi.toolCalling.tools.WeatherTool;

@SpringBootTest
class ToolCallingApplicationTests {

//	@Test
//	void contextLoads() {
//	}

    private @Autowired WeatherTool weatherTool;

    @Test
    void getWeatherTest() {

        var response = weatherTool.getWeather("Delhi India");
        System.out.println(response);

    }

}

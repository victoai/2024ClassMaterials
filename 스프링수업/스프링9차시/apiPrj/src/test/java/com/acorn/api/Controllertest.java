package com.acorn.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/servlet-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"} )
public class Controllertest {
/*
 * 오류발생: javax.servlet.SessionCookieConfig 클래스를 찾을 수 없기 때문에 발생합니다.
 *  이 클래스는 Java EE에서 제공되는 클래스로, 일반적으로 Servlet API의 일부입니다.
 *  이 클래스를 찾을 수 없는 것으로 보아 프로젝트에 필요한 Servlet API 라이브러리가 제대로 추가되지 않은 것으로 보입니다.
  
 	<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>javax.servlet-api</artifactId>
	<version>3.1.0</version>
	<scope>provided</scope>
	</dependency>
		
 */
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    private MockMvc mockMvc;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testPostJson() throws Exception {
        User user = new User();
        user.setId("test01");
        user.setName("홍길동"); 
        
        String jsonStr = new Gson().toJson(user);
        
        mockMvc.perform(post("/member")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonStr))
                .andExpect(status().isOk());   
    }
}

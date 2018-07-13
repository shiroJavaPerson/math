package com.helian.health.test;

import com.alibaba.fastjson.JSONObject;
import com.helian.health.Application;
import com.helian.health.cache.RedisService;
import com.helian.health.controller.HealthHonorConrtoller;
import com.helian.health.domain.level.LevelRightDTO;
import com.helian.health.util.JsonResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:0")
public class JunitTest {
    @Autowired
    private HealthHonorConrtoller healthHonorConrtoller;

    @Autowired
    private RedisService redisService;

    @Autowired
    private WebApplicationContext context;

    @Value("${local.server.port}")
    private int port;

    private RestTemplate restTemplate = new RestTemplate();

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

//    @Test
    public void honorTest() {
        JSONObject json2 = new JSONObject();
        json2.put("uid", "251");
        json2.put("token", "251");
        HttpHeaders headers = new HttpHeaders();
        headers.set("uid", "251");
        headers.set("token", "251");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(json2.toString(),headers);
        ResponseEntity<JsonResult> json = restTemplate.exchange("http://localhost:" +
        port + "/V2.0/honor/getHonor.json", HttpMethod.GET,entity,JsonResult.class);
        Assert.assertNotNull(json);
        System.out.println(json.getStatusCode());
//        ResponseEntity<JsonResult<List<JSONObject>>> result = ResponseEntity.ok(new JsonResult<List<JSONObject>>);
//        Assert.assertEquals(((JsonResult<List<JSONObject>>)json.getBody()).getResult().get(),ResponseEntity.ok());
    }

//    @Test
    public void honorByIdTest() {
        JSONObject json2 = new JSONObject();
        json2.put("id", "2");
        HttpHeaders headers = new HttpHeaders();
        headers.set("uid", "251");
        headers.set("token", "251");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(json2.toString(),headers);
        ResponseEntity<JsonResult> json = restTemplate.exchange("http://localhost:" +
        port + "/V2.0/honor//honorInfoById.json?id={id}", HttpMethod.GET,entity,JsonResult.class,"3");
        Assert.assertNotNull(json);
//        Assert.assertEquals((JsonResult<JSONObject>)json.getBody());
    }

}

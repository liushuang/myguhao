package ren.liushuang.mytool.serverapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ServerApiApplicationTests {

    @Autowired
    private WebTestClient webClient;


    @Test
    public void testCalcAccount() {
        webClient.get().uri("/calcAccount?url=%s", "https://xyq.cbg.163.com/equip?s=229&eid=201901052200113-229-PULBF5C1YJN8&view_loc=equip_list")
                 .exchange().expectStatus().isOk();
    }

}


package com.ingram.backend;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BackendApplication.class)
@Epic("Quarkus")
@TmsLink("OA-28888")
class BackendApplicationIT {

    @Test
    @Issue("Do-19896")
    @DisplayName("Load context")
    @Severity(SeverityLevel.CRITICAL)
    void contextLoads() {
    }

}

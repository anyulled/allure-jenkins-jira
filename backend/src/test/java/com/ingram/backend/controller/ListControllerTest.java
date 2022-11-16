package com.ingram.backend.controller;

import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Rest Controller")
class ListControllerTest {

    ListController listController = new ListController();

    @Test
    @Issue("DO-19896")
    @DisplayName("Rest Controller")
    @Severity(SeverityLevel.NORMAL)
    void getList() {
        Assertions.assertThat(listController.getList()).isNotNull();


    }
}
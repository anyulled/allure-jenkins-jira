# Allure report POC

Run backend project

````shell
mvn clean verify allure:report
````

Run the Docker compose example

```shell
docker compose up
```

## Jenkins

Copy the password from the console to initialize Jenkins and install the suggested plugins, as well as the allure
plugin.

* Dashboard should be accessible at http://localhost:8088

## Jira

How to send report values to Jira test executions

[Docs](https://github.com/allure-framework/allure2/tree/master/plugins/xray-plugin)

* Add tms link in your test cases (for example in java: @TmsLink("XD-48"))
* Setup Jira env variables:
    * ALLURE_JIRA_ENDPOINT=https://jira.int.zone/rest/
    * ALLURE_JIRA_USERNAME=<username>
    * ALLURE_JIRA_PASSWORD=<password>
* Enable plugin - add env property 
    * ALLURE_XRAY_ENABLED=true
* Provide execution issue keys - add env property 
    * ALLURE_XRAY_EXECUTION_ISSUES=XD-6
* Generate report
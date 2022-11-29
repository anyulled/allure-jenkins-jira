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

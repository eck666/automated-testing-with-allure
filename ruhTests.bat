@echo off
REM Maven testleri çalıştır ve Allure raporlarını sunucu olarak başlat
mvn clean test site && start cmd /k "allure serve target/site/allure-maven-plugin/"

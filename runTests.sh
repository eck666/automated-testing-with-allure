#!/bin/bash

# Maven testleri çalıştır
mvn clean test site

# Allure raporlarını sunucu olarak başlat
allure serve target/site/allure-maven-plugin/ &
allureServePid=$!

# Testler ve Allure sunucu bitene kadar bekle
wait $allureServePid
#!/bin/bash
echo "Starting Build"
cd apigateway
mvn clean install -DskipTests=true jib:build
echo "Completing Build apigateway"
cd ..
cd cloudconfig
mvn clean install -DskipTests=true jib:build
echo "Completing Build cloudconfig"
cd ..
cd orderservice
mvn clean install -DskipTests=true jib:build
echo "Completing Build orderservice"
cd ..
cd productservice
mvn clean install -DskipTests=true jib:build
echo "Completing Build productservice"
cd ..
cd serviceregistry
mvn clean install -DskipTests=true jib:build
echo "Completing Build serviceregistry"
cd ..
echo "Ending Build"

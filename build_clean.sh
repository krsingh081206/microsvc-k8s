#!/bin/bash
echo "Starting Build"
cd apigateway
mvn clean
echo "Completing Build apigateway"
cd ..
cd cloudconfig
mvn clean
echo "Completing Build cloudconfig"
cd ..
cd orderservice
mvn clean
echo "Completing Build orderservice"
cd ..
cd productservice
mvn clean
echo "Completing Build productservice"
cd ..
cd serviceregistry
mvn clean
echo "Completing Build serviceregistry"
cd ..
echo "Ending Build"

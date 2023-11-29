#!/bin/bash



clear; 
javac -cp .:../jars/* \
      -d ../bin/ \
      ../lib/*.java \
      ../src/*.java \
      ../apps/SalesApp/*.java \
      ../apps/SalesApp/Accounts/*.java \
      ../apps/SalesApp/Contacts/*.java  \
      ../apps/SalesApp/Leads/*.java \
      ../apps/SalesApp/Opportunities/*.java \
      ../apps/SalesApp/Products/*.java \
      ../apps/SalesApp/Users/*.java 

cd ../bin/

java -cp .:../jars/* Runner

sleep 2
cd -






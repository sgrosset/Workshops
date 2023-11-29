#!/bin/bash

javac -d ../bin/ \
         *.java \
         ../lib/*.java \
         ../apps/*.java \
            ../apps/CRMApp/*.java \
               ../apps/CRMApp/Accounts/*.java \
               ../apps/CRMApp/Admin/*.java \
               ../apps/CRMApp/Leads/*.java \
               ../apps/CRMApp/Opportunities/*.java \
               ../apps/CRMApp/Products/*.java 

cd ../bin

java Runner
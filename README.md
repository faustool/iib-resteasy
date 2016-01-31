# iib-resteasy
Rest easy POC

IMPORTANT: This project depends on https://github.com/faustool/iib-junit4, so clone that and call mvn install on it before you try anything else.

To try this POC, just do mvn exec:java, then enter these URLs in your browser to see the results:

http://localhost:8085/test/com.faustool.iib.junit4.POCTest
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/testSuccess
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/testAssertionBooleanFailure
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/testAssertionStringFailure
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/testException
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/ignoredTest
http://localhost:8085/test/com.faustool.iib.junit4.POCTest/longTimeTest
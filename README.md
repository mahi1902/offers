Please make sure you run this on Java 17 or above.
Pull the code from repo and run as Spring boot application.
Please make sure you are running on Tomcat with 8080 port enabled.

This Spring boot application has 3 api's which gives jason result of different exercises of 3 offers :

http://localhost:8080/offer1
[{"priceList":[60,50,40,30,20,10],"payableItems":[60,40,20],"discountedItems":[50,30,10]},{"priceList":[60,50,50,40,30,20,10],"payableItems":[60,50,30,10],"discountedItems":[50,40,20]}]

http://localhost:8080/offer2
[{"priceList":[60,60,50,40,40,30,20,10],"payableItems":[60,60,40,20],"discountedItems":[50,40,30,10]},{"priceList":[60,50,50,50,40,30,20,10],"payableItems":[60,50,50,20],"discountedItems":[50,40,30,10]}]

http://localhost:8080/offer3
[{"priceList":[60,60,50,40,40,30,20,10],"payableItems":[60,60,40,20],"discountedItems":[50,40,30,10]},{"priceList":[60,50,50,50,40,30,20,10,5,5],"payableItems":[60,50,50,20,5,5],"discountedItems":[50,40,30,10]}]

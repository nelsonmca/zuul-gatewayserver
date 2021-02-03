# zuul-gatewayserver

gateway server acts as the proxy for other service also load balance the service if there are more than one instances

access URL:

http://localhost:9080/hello
http://localhost:9080/goodbye
http://localhost:9080/service

finds the service through discovery server(hello) proxy the request and response
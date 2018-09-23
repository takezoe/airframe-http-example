# airframe-http-example

Tiny example of Airframe's Finagle support

- https://wvlet.org/airframe/docs/airframe-http.html

Run the server by `sbt run` and verify service as follows: 

```
$ curl -XGET http://localhost:8080/user/naoki
{"name":"naoki"}
```

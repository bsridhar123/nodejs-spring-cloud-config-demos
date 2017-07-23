var express = require('express');
var app = express();
var http=require('http');

// This responds with "Hello World" on the homepage
app.get('/health', function (req, res) {
   console.log("Got a GET request for the homepage");
   res.setHeader('Content-Type', 'application/json');
    res.send(JSON.stringify({ status: 'UP' }));
})

app.get('/getsumnos', function (req, res) {
   console.log("Got a GET request for the getsumnos");
   
   
   //
   
   var options = {
  host: 'localhost',
  port: 54321,
  path: '/billing-service/api/billing/name',
  method: 'GET'
};
console.log("created options variable");
   
   
http.request(options, function(res) {
  console.log('STATUS: ' + res.statusCode);
  console.log('HEADERS: ' + JSON.stringify(res.headers));
 // res.setHeader('Content-Type', 'application/json');
  res.setEncoding('utf8');
  res.on('data', function (chunk) {
    console.log('BODY: ' + chunk);
	//res.send(JSON.stringify({ response: chunk }));
  });
}).end();
   
   //
   
    res.send(JSON.stringify({ status: 'hello' }));
})


// This responds with "Hello World" on the homepage
app.get('/', function (req, res) {
   console.log("Got a GET request for the homepage");
   res.send('Hello GET');
})

// This responds a POST request for the homepage
app.post('/', function (req, res) {
   console.log("Got a POST request for the homepage");
   res.send('Hello POST');
})

// This responds a DELETE request for the /del_user page.
app.delete('/del_user', function (req, res) {
   console.log("Got a DELETE request for /del_user");
   res.send('Hello DELETE');
})

// This responds a GET request for the /list_user page.
app.get('/list_user', function (req, res) {
   console.log("Got a GET request for /list_user");
   res.send('Page Listing');
})

// This responds a GET request for abcd, abxcd, ab123cd, and so on
app.get('/ab*cd', function(req, res) {   
   console.log("Got a GET request for /ab*cd");
   res.send('Page Pattern Match');
})

var server = app.listen(8081, function () {

   var host = server.address().address
   var port = server.address().port

   console.log("Example app listening at http://%s:%s", host, port)
})

const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;
const eurekaHelper = require('./eureka-helper');

app.listen(PORT, () => {
  console.log("node-service on 3000");
})

app.get('/', (req, res) => {

  // You can also send a response to the client
  res.json({ message: 'BONJORNO  AMIGOS' });
});


eurekaHelper.registerWithEureka('nodeservice', PORT);
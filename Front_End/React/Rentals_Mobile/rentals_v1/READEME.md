# Instructions for starting the back-end of the rental website

The back-end used by the rental network is nodejs, the minimum version is 10.0, so you must use node of version 10.0 or above to run
MySQL is used in the back-end

## Back-end start method

First, you need to enter the root directory file of the back-end and use npm install to download all the plugins required by node

```shell
npm install
// yarn
yarn
```

The mysql configuration file is in /config/mysql.js, if you have your own needs for mysq, you can modify it
The port number configuration file is in /bin/www and can be modified if you need
Cors is configured in the back-end, so there is no cross-domain problem
After the file setting is completed, enter the below in the root directory

```shell
npm start
//yarn
yarn start
```

## Database file configuration

sql file is in rentals_v1/db
Create a new library inside the database hkzf
encoding format select utf-8
Then import the corresponding sql file in it

## Project Instruction

direct input

```js
http://localhost:8080/
```

You can open the corresponding API document

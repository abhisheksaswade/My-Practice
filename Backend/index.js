const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const mysql=require("mysql2");
const cors= require("cors");


const db =mysql.createPool({
    host: "localhost",
    user:"root",
    password:"root123",
    database: "fullstack"
});


app.use(cors());
app.use(express.json());
app.use(bodyParser.urlencoded({extended: true}));

app.get("/entries",(req,res) =>{
    const sqlGet = "SELECT* FROM contact_db";
    db.query(sqlGet,(error,result) =>{
        res.send(result);
    });
})

app.post("/insert",(req,res) => {
    console.log("in backend post")
    const{name,email,contact}=req.body;
    const sqlInsert= "INSERT INTO contact_db(name, email, contact) VALUES(?,?,?)";
    db.query(sqlInsert, [name, email, contact], (error,result) => {
        if(error)
        {console.log(error);}

    });

});

app.get("/",(req, res) => {
    // const sqlInsert = "INSERT INTO contact_db(name, email, contact) VALUES('Ram','ram@gmail.com',9874563219)";
    // db.query(sqlInsert,(error,result) => {
    //     console.log("error",error);
    //     console.log("result",result);
    // });
        res.send("Hello Express");
})


app.listen(5000, () => {
    console.log("Server is running on port 5000");
});
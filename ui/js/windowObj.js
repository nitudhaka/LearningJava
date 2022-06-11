// var a ="Hello World";
// // console.log(a);
// function b(){
// }

// var person = new Object();
// console.log(person) ;
// person["firstname"] = "Nitu";
// person["lastname"]   = "Dhaka";
// console.log(person) ;

// //functions
// greet();
// function greet(){
//     console.log("hii");
// }
// // anonymouseGreet();
// console.log(anonymouseGreet);
// var anonymouseGreet = function(){
//     console.log("hi");
// }


// //by  values 
// var a =3;
// var b;
// b=a;
// console.log

// //by reference 

//  var c= {greeting:"hi"}
//  var d ;
//  d=c;
//  c.greeting = "this is c changed";
 //Mutate means to change something
 //immutable that cant be changed
 //equals operator sets up new memory space (new address)
//  console.log(c);
//  console.log(d);

//  function buildingFunction(){
//     var arr=[];
//     for(var i =0;i<3;i++){
//         // let j = i;
//         arr.push((function(j){
//             return function(){
//             console.log(j);
//             }
//         })(i));
//     }
//     return arr;
//  }
//  var f2 = buildingFunction();
//  f2[0]();
//  f2[1]();
//  f2[2]();[[]]

// var  obj = new Object();

// var person = {
//     firstname:"Default",
//     lastname:"Default",
//     getFullName:function(){
//         return this.firstname+" "+ this.lastname;
//     }
// }
// var john ={
//     firstname:"John",
//     lastname:"Doe",
// }
// john.__proto__ = person;
// console.log(john.getFullName());

// for(var prop in john){
//     if(john.hasOwnProperty(prop)){
//     console.log(prop + ":" + john[prop])
//     }
// }

// var a ={};
// var b={};
// var c= function(){};
// var d= [];

// function person(firstname,lastname){
//     this.firstname = firstname;
//     this.lastname = lastname;
//     // console.log(this.firstname+" "+this.lastname);
// }
// person.prototype.getFullName = function(){
//     return this.firstname+ " "+this.lastname;
// }
// var nitu = new person("Nitu","Dhaka");
// console.log(nitu.getFullName());

//function has prototype property. it only get called when function get called as function constructor. for calling function constructor we use new keyword


// String.prototype.isLengthGreaterThan = function(limit){
//     return this.length>limit;
// }
// console.log("John".isLengthGreaterThan(3));

var a =3;
console.log(typeof a );

var d = [];
console.log(typeof d);]
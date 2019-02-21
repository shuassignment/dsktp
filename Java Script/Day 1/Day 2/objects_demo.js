var person1 = { };

var person2 = {name : "Shubham"};

var person3 = {name:"Shubham",id:166079};

console.log(person3);
console.log(person3.name+"\n"+person3.id);
console.log(person3["name"]);


/**
 * Using new Object();
 * 
 * 
 */

var person =new Object();

person.name="Amitabh";
person.profession="Acting";


/**
 * Using Object.create();
 * 
 */

 var amitabh = {name : "Amitabh", surname:"Bacchan"};

 var abhishek= Object.create(amitabh);
 console.log(amitabh.name);
 console.log(amitabh.surname);
 console.log(abhishek.name);
 abhishek.name="Abhishek";
 console.log(abhishek.name);
 
 
 
/**
 * 
 * Using Function
 */

 function Person(fname,lname){
     this.fname=fname;
     this.lname=lname;
     this.print=function(){
         console.log(this.fname);
         console.log(this.lname);
     }
 }

 var per1=new Person("Amitabh","Bacchan");
 var per2=new Person("Abhishk",100);
 console.log(per1);
 console.log(per2);
 per1.print();
 per2.print();


 /**
  * 
  * Using Class
  */

  class Persons{
      constructor(fname,lname){
          this.fname=fname;
          this.lname=lname;
      }

      print(){
          console.log(this.fname,this.lname);
      }
  }

  var person =new Persons("Shubham","Raut");

  person.print();
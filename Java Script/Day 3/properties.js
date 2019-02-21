var person = { name: "Shubham", surname: "Raut" };

console.log(person);
Object.defineProperty(person, "name", { value: "Shubham", configurable: true, writable: false, enumerable: false });
console.log(person);
Object.defineProperty(person, "name", { value: "Pratik", configurable: true, writable: false, enumerable: true });
console.log(person);
Object.defineProperties(person, {
    name: {
        value: 'Shubham',
        writable: true,
        enumerable: true
    },
    surname: {
        value: 'Raut',
        enumerable: false

    }
});
console.log(person);


function Person(id,name){
    this.id=id;
    this.name=name;

    Person.prototype.print1=function(){
        console.log(this.id);
        console.log(this.name);
        console.log(this.surname);
    }
}

var person1=new Person(101,"Amitabh");
var person2=new Person(102,"Abhishek");

console.log(person1);
Person.prototype.surname="Bachchan";
Person.prototype.print=function(){
    console.log(this.id);
    console.log(this.name);
    console.log(this.surname);
}

console.log(person1.print());
console.log(person2.print1());



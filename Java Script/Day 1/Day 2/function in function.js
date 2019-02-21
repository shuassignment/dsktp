function f1(a){
    console.log(a);
    console.log(arguments);
    a();
    arguments[1]();
}

i=100;

//f1(i);

function f2(){
    console.log("Hello");
}


function f3(){
    console.log(" shu ");
}

f1(f2,f3);

f1(function(){
    console.log("Hello World!!!");
},f2);
//object without new keyword
console.log("object without new");
var car;
car = {
    name:'palak',
    age:21,
    // getCar : function()
    // {
    //     return this.name;
    //     return this.age;
    // }
};
// var name = car.getCar();
// console.log("name--"+car.name);
// var age = car.getCar();
// console.log("name--"+car.age);
console.log(car);


//object with new keyword
console.log("object with new");
var book = new Object();
book.name='poi';
book.age=25;
function getBook(){
    console.log("name"+book.name);
    console.log("age--"+book.age);
}
getBook();

//array without new keyword
console.log("array without new");
var g =['r','e','e'];
console.log(g);

//array with new keyword
console.log("array with new");
var gg= new Array('d','e','w');
console.log(gg);

//for in
console.log("for in")     //for arrays and object
var hobbies = ['q','w','e','r','t','y'];
for(var index in hobbies)
{
    console.log("hobbies--"+hobbies[index]);
}

//for of

for(var value of hobbies)     //only for objects
{
    console.log(value);
}





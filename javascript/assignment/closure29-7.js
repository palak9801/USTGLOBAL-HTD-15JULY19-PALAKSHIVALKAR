function Sum(a,b)
{
    function addSum()
    {
        return a+b;
    }
    return addSum;                   //closure
}


var addFunc=Sum(10,20);
var total=addFunc();
console.log('total--'+total);
console.log(window);
console.log(this);
console.log(this===window);

var name='Palak';
console.log(window.name);
console.log(this.name);

var person={
           name:'Dulquer salman',
           age:28,
           getName:function(){
               console.log('get name method----'+this.name);
               console.log(window);
               getData();
               function getData(){
                   console.log('gat dada method---'+this.name);
               }
               return this.name;
           }
}
var p=person.getName();
console.log(p);


console.log('==========================');

for(var i=0;i<5;i++)
{
    console.log(i);
}console.log('value of i--'+i);


for(let j=0;j<5;j++)
{
    console.log(j);
}//console.log('value of j--'+j);




var color=['red','blue','purple','yellow'];
console.log('color--'+color);
var color=['shades'];      //redeclaration is possible 
console.log('color--'+color)  
color=['black'];  
console.log('color--'+color)   //reinitialization is possible  



let fruitss=['orange','banana'];
console.log('friuts--'+fruitss);
//let fruitss=['apple']     //redeclaration is not possible
fruitss=['apple'];               //reinitialization is possible
console.log('fruits--'+fruitss);



const vehicle=['car','bus','auto'];
console.log('vehicles--'+vehicle);
//const vehicle=['bicycle'];     //redeclaration is not possible
vehicle[0]=['bicycle','bike'];       //nested array
console.log(vehicle);      





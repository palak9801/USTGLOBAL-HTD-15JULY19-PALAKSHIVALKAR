

    var num1=10;
    var name='palak';
    var num2='10';
    if(num1==num2)   ///== operator just compare the value   
                     
    {
        console.log('equal');

    }
    else{
        console.log('not equal');
    }


    var num1=20;
    var name='palak';
    var num2='20';
    if(num1===num2)     
                     //=== is strict equal to  it will check the datatype also
    {
        console.log('equal');

    }
    else{
        console.log('not equal');
    }
 
//ternary operator

  var num1=20;
  var num2=52;
   var t= (num1===num2)?'true':'false';
   console.log(t);
                                                                 //type of undefined is undefine
    var num1=20;
   var num2=52;                                                         //typeof null is object
    var y=(num1>20)?'greater':(num1===20)?'equal':'smaller';
    console.log(y);


    var myAge=50;
    console.log('type og my age--'+typeof myAge);
    var myName='palak';
    console.log('type of my name--'+typeof myName);

    var hobbies=['coding','singing','cricket','bike ridding'];
    console.log('type of my hobbies--'+typeof hobbies);
   
    var isArry=Array.isArray(hobbies);
    console.log(isArry);
    console.log("===================================");


    //complex array

    var lib=[

        {author:'Bill Gates',title:'The Road Ahead',bookId:1254},
        {author:'Steve Jobs',title:'Walter Isaacsan',bookId:4264},
        {author:'Suzanne Colllins',title:'The Book of Hunger Games',bookId:3254},
        
    ];


    for(var i=0;i<lib.length;i++)
    {
        //console.log(lib[i]);
        console.log(lib[i].author);
    }
    console.log("===================================");

//for in for array
console.log("for in");
for(var index in hobbies)
{
    console.log("hobbies--"+hobbies[index]);
}
console.log("===================================");
//for in for objects
for(var index in lib)
{
    console.log(lib[index]);
}
console.log("===================================");

//for of for array
for(var value of hobbies)
{
    console.log(value);
}

var hob=['skip','jump','sleep'];
hob[3]='eat';
hob['name']='write';
for(var index in hob)      //for in will consider write       it will take name as index
{
    console.log(hob[index]);
}

console.log("===================================");
for(var v of hob)
{                                 //for of will not consider write   as it does not have index
    console.log(v);
}
   
 //FUNCTIONS
//how to define function
//1
function getAdd(a,b){
var c=a+b;
//return c;
console.log('addition=='+c);
}
getAdd(10,12);
//console.log('Addition--'+result);


//2 function expression
var getAddd=function(num1, num2)
{
    var res=num1+num2;
    console.log('addition--'+res);
}
getAddd(12,58);


//3 ananymous function
(function (a,b)
{
    var cc=a+b;
    console.log('addition--'+cc);
}(20,15) )

//4 fat arrow function

var getSum=(a,b)=>
{
    var ccc=a+b;
    console.log('sum--'+ccc);
}

getSum(10,60);


//hoistingg
//global

console.log(namee);//error
var namee='palak';            //undefined
console.log(name);     //palak



//function
function fname(){
    console.log(nameeee); //error
    var nameeee='pal';     //undefined
    console.log(nameeee);  //pal
}
fname();


//   function first(callback){

//     setTimeout(function(){
//         console.log("first");
//         callback();
//     },1000);
    
//   }
//   function second(){
//       console.log("second");
//   }
//   first(second);
  //second();



  //for each
      
  var hobb=['singing','dancing','reading','sleeping'];
  hobb.forEach(function(val,index){
      console.log('hobbies--'+val);
  });
console.log("==================");

  hobb.forEach ( (val,index)=>{
    console.log('hobbies--'+val);     //using fat arrow func
});

//to add element
 
 console.log("==================");

 hobb.push('bike riding','eating');     //push   will push value at the end
 console.log(hobb);
 console.log("==================");
 hobb.pop();                              //pop wil remove one value from end
 console.log('after pop--'+hobb);
 console.log("==================");
 hobb.unshift('sbc','ert');
 console.log('after unshift---'+hobb);   //unshift will add value at the start

 console.log("==================");
 hobb.shift();
 console.log('after shift--'+hobb);   //shift will remove one value from the last

 console.log("=====================================");

 
 console.log('includes singing?--'+hobb.includes('singing',0));   //check if singing is included or not, gives boolean value

 console.log("========================================");
 hobb.splice(2,0,'qwe');
 console.log(hobb)                //splice

 console.log("=========================================");
   var hobbbb=hobb.slice(0,2);
 console.log('after slice--'+hobbbb);      //slice    do not modify the original array instead create a new array

 console.log('==========================================');

 
 console.log('after joining--'+hobb.join('-'));    //join add a seperator between the array element
                            
 console.log('============================================');

 var inn=hobb.indexOf('dancing');
 console.log(hobb);                            //indexof  tell the index of particular element
 console.log('index of sbc--'+inn);

 console.log('=========================================');

 var number=[10,20,30,40,50];
 var newnumber=number.map( (val,index)=>{     //map is use to perform a particular operation on each element of an array
      val=val+10;
     return val;
 });
 console.log('old array--'+number);
 console.log('new array--'+newnumber);


 console.log("=====================================");


 var newnum=number.filter( (val,index)=>{

return val>30;                   //filter will give a new array , it will filter element acc to condition
 });

 console.log('old array--'+number);
 console.log('new array--'+newnum);

 console.log('============================');





 var item=[{
               item:'pen',
               price:50
 },
 {
     item:'bag',
     price:500
 } ,
 {
    item:'laptop',
    price:50000
} ,
{
    item:'mouse',
    price:500
} ];

var newitem=item.map( (val)=>{
    return val.price+10;
    
});

console.log('new item--'+newitem);
 console.log('========================');

var newitem1=item.filter( (val)=>{
    
    return val.price>500 && val.item.length>5;


});
console.log(newitem1);



////STRING METHODS


var str='palak';
console.log('lower case--'+str.toLowerCase());

console.log('upper case--'+str.toUpperCase());

console.log('char at position--'+str.charAt(0));

console.log('index of--'+str.indexOf('a',0));

console.log('concatination--'+str.concat(' shivalkar'));

console.log('includes--'+str.includes('l',1));

console.log('replace--'+str.replace('l','a'));

console.log('split--'+str.split('l',3));

console.log('substr--'+str.substr(2,3));

console.log('search--'+str.search('k'));

console.log('trim--'+str.trim());



 




 



















    
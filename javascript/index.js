var fruits=['apple', 'mango', 'grapes', 'watermelon'];
console.log(fruits);

for(var i=0;i<fruits.length;i++){
    console.log(fruits[i]);
}


var todaydat=new Date();
console.log('todays date='+todaydat);


var todaydat=new Date(2019,07,24,17,23,26,24);
console.log('todays date='+todaydat);

var todaydat=new Date(0);
console.log('todays date='+todaydat);


var todaydat=new Date("july 24,2019 17:24:23");
console.log('todays date='+todaydat);


  var too=new Date();
   var tuu=too.getFullYear();
 console.log('today year--'+tuu);

 var to=new Date();
  var tt=to.getMonth();
  console.log('TODAY MONTH--'+tt);


 var td=new Date();
 var ttt=td.getDay();
 console.log('today day--'+ttt);

var tdd=new Date();
 var months=['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
 var days=['Sun','Mon','Tue','Wed','Thu','Fri','Sat'];
 console.log(months[tdd.getMonth()]);
 console.log(days[tdd.getDay()]);



console.log(Math.ceil(4.6));
console.log(Math.random());
console.log(Math.floor(4.5));
console.log(Math.round(7.9));
console.log(Math.pow(2,3));

console.log(Math.random()*10+Math.random());      ///to get value greater than 1


for(var i=10;i<100;i++)
{
    console.log(Math.random()+i);
}




console.log(Math.round(100*Math.random()));




    //primitive immutable
 var name='palak';
 console.log(name);  //palak
 var name1=name;
 console.log(name1);  //palak
 name1='shivalkar';
 console.log(name);    //palak
 console.log(name1);    //shivalkar


 //reference mutable

 var person={
        name:'palak'
 }
 console.log(person.name);  //palak

 var person1=person;
 console.log(person1.name);    //palak

 person1.name='jenny';
 console.log(person.name);   //jenny
 console.log(person1.name);   //jenny



 



 


























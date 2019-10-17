console.log('=========METHODS OF ARRAY============');
console.log('          ');
console.log('---forEach---')
var car=['BMW', 'Maruti','TATA','Mercedes','Toyota','Nano'];
var color=['Red','Blue','Cyan','Orange','Black','White'];

car.forEach(function(value,index) {
    console.log(value);                                 /////forEach
});
console.log('        ');
color.forEach((value,index) => {
    console.log(value);
    
});

console.log('---isArray---')

var isArry=Array.isArray(car);
    console.log(isArry);
    console.log('        ');
var isArry=Array.isArray(color);
    console.log(isArry);    

    console.log('---includes---')

 var inc=car.includes('bike',0);
 console.log('bike is included?--'+inc);
 console.log('        ');
 var incc=color.includes('Red',0);
 console.log('Red is included?--'+incc);

 console.log('---push---');

 console.log('push element in 1st array--'+car.push('Ferrari','TVS'));
 console.log('        ');
 console.log('push element in 2nd array--'+color.push('Purple'));

 console.log('---pop---');
 console.log('pop element from 1st array--'+car.pop());
 console.log('        ');
 console.log('pop element from 2nd array--'+color.pop());


 console.log('---shift---');
 console.log('shift element from 1st array--'+car.shift());
 console.log('        ');
 console.log('shift element from 2nd array--'+color.shift());

 console.log('---unshift---');
 console.log('unshift element in 1st array--'+car.unshift('BMW'));
 console.log('        ');
 console.log('unshift element in 2nd array--'+color.unshift('Red'));


 console.log('---splice---');
 var spl=car.splice(2,0,'Hyundai');
 console.log('splice in 1st array--'+car);
 console.log('        ');
 var spll=color.splice(2,0,'Grey');
 console.log('splice in 2nd array--'+color);

 console.log('---slice---');
 var sl=car.splice(2,3);
 console.log('slice in 1st array--'+car);
 console.log('        ');
 var sll=color.splice(2,4);
 console.log('splice in 2nd array--'+color);

 console.log('---join---');
 console.log('after joining--'+car.join('-'));
 console.log('        ');
 console.log('after joining--'+color.join('-'));

 console.log('---indexof---');
 var ind=car.indexOf('Maruti');
 console.log(car);                            
 console.log('index of Maruti--'+ind);
 console.log('        ');
 var indd=color.indexOf('Blue');
 console.log(color);                            
 console.log('index of Blue--'+indd);

 console.log('---map---');
 var newcar=car.map( (val,index)=>{     
    val=val+'+S';
   return val;
});
console.log('old array--'+car);
console.log('new array--'+newcar);
console.log('        ');
var newcolor=color.map( (val,index)=>{    
    val=val+'+R';
   return val;
});
console.log('old array--'+color);
console.log('new array--'+newcolor);


console.log('---filter---');
var newcar=car.filter( (val,index)=>{

    return val==='BMW';                   
     });
    
     console.log('old array--'+car);
     console.log('new array--'+newcar);

     console.log('        ');

     var newcolor=color.filter( (val,index)=>{

        return val==='White';                   
         });
        
         console.log('old array--'+color);
         console.log('new array--'+newcolor);
         
         
         console.log('        ');
         console.log('        ');
         console.log('        ');
         console.log('        ');
         console.log('        ');
         console.log('        ');
         console.log('=========METHODS OF STRING============');

         var str1='mississippi';
         var str2="hello"
         console.log('---tolowercase---');
         console.log('lower case--'+str1.toLowerCase());
         console.log('lower case--'+str2.toLowerCase());

         console.log('---toUppcase---');
         console.log('upper case--'+str1.toUpperCase());
         console.log('upper case--'+str2.toUpperCase());

         console.log('---charAt---');
         console.log('char at position--'+str1.charAt(0));
         console.log('char at position--'+str2.charAt(0));

         console.log('---indexof---');
         console.log('index of--'+str1.indexOf('i',1));
         console.log('index of--'+str2.indexOf('e',0));

         console.log('---concat---');
         console.log('concatination--'+str1.concat(' Day'));
         console.log('concatination--'+str2.concat(' World'));

         console.log('---includes---');
         console.log('includes--'+str1.includes('M',0));
         console.log('includes--'+str2.includes('H',1));

         console.log('---replace---');
         console.log('replace--'+str1.replace('i','j'));
         console.log('replace--'+str2.replace('l','n'));

         console.log('---split---');
         console.log('split--'+str1.split('i',6));
         console.log('split--'+str2.split('l',3));

         console.log('---substr---');
         console.log('substr--'+str1.substr(2,3));
         console.log('substr--'+str2.substr(2,3));

         console.log('---search---');
         console.log('search--'+str1.search('p'));
         console.log('search--'+str2.search('e'));

         console.log('---trim---');
         console.log('trim--'+str1.trim());
         console.log('trim--'+str2.trim());




















    
    






















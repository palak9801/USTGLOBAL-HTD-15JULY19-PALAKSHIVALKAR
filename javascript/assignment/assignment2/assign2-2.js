var getFab=num=>{  
    var a=0;
var b=1;
var c=a+b;
console.log(a);
console.log(b);       //Fat arrow function
while(c<=num)
{
    console.log(c+" ");
    a=b;
    b=c;
    c=a+b;
}
}
getFab(5);
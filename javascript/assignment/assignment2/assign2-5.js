var getPrime=function(num){        //function expression
    for(var i=2;i<=num;i++)
    {
        if(num%i===0)
        {
            break;
        }
    }
    if(i==num)
    {
        console.log('prime number');
    }
    else{console.log('not a prime number');}
    }
    getPrime(102);
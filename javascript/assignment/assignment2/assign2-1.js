function getFact(num){
    var fact=1;
    for(var i=1;i<=num;i++)    //name function
{
    fact=fact*i;
}
console.log('Factorial--'+fact);
}getFact(5);
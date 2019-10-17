function sayHello(){
    alert('Hellloooooooo');
}



let buttonElement=document.getElementById('clickbutton');
buttonElement.onclick=function(){
    alert('helloo world');
}

function createpElement(){


let aElement=document.createElement('p');
aElement.textContent='this is p element';
document.body.appendChild(aElement);



}



let alertElement=document.getElementById('alerthi');
alertElement.addEventListener('click',function()
{
    alert('good evening');
});

let h1Element=document.createElement('h1');
function showText(){

    let inputElement=document.getElementById('showData');
    console.log(inputElement.value);
    
    h1Element.textContent=inputElement.value;
    document.body.appendChild(h1Element);
}



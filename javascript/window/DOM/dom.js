//getElementById()
let pElement=document.getElementById('demo');
console.log(pElement);
pElement.textContent='this is new  p tag';
//getElementByClassName
let divElement=document.getElementsByClassName('blue');
console.log(divElement);
let pElements=document.getElementsByTagName('p');
console.log(pElements);
let nameEle=document.getElementsByName('hele');
console.log(nameEle);
let demoEle=document.querySelector('#demo');
console.log(demoEle);
let demoElem=document.querySelectorAll('.blue');
console.log(demoElem);
let buttonElem=document.createElement('button');
buttonElem.textContent='click me';
console.log(buttonElem);
document.body.appendChild(buttonElem);

let spanEle=document.getElementById('spanid');
spanEle.style.color='pink';
let buttonEleee=document.getElementById('buttonElee');
buttonEleee.className='add';
////to create table
console.log('                       ');




document.getElementById('dd').innerHTML=          //create table
`<table border=1px solid black>
<tr>
    <td>Name</td>
    <td>Age</td>
</tr>
<tr>
        <td>Palak</td>
        <td>21</td>
    </tr>
    <tr>
            <td>Jenny</td>
            <td>21</td>
        </tr>
</table>`


let pElementData=document.getElementById('demo1')
//pElementData.style.color='purple';
pElementData.className='blue';
pElement.classList='blue fonts';

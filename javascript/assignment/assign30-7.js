function validateForm(){
    let formData=document.forms[0];
    // console.log(formData);
    //console.log(formData.usernamee.value);
    let userName=formData.emailid.value;
    // let passwrd=formData.passwordd.value;
    if(userName.length>4 ){
        console.log('Success');
        formData.emailid.style.border="5px solid green";
        // formData.passwordd.style.border="5px solid green";
        formData.buttonn.disabled=false;
        let u1=document.getElementById('id1');
        u1.textContent='';
    

    
    }else{
        formData.emailid.style.border='4px solid red';
        // formData.passwordd.style.border='4px solid red';
        // formData.buttonn.disabled=true;
        let u=document.getElementById('id1');
        u.textContent='Invalid Username Format';
    

           

    }

}
function validateForm1(){
    let formData=document.forms[0];
let passwrd=formData.passwordd.value;
if(passwrd.length>4 ){
    console.log('Success');
   
     formData.passwordd.style.border="5px solid green";
    formData.buttonn.disabled=false;
    let p1=document.getElementById('id2');
    p1.textContent='';



}else{
    formData.emailid.style.border='4px solid red';
    // formData.passwordd.style.border='4px solid red';
    // formData.buttonn.disabled=true;
    let p=document.getElementById('id2');
    p.textContent='Invalid password Format';


       

}

}

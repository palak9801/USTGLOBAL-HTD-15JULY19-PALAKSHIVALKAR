function validateForm(){
    let formData=document.forms[0];
    // console.log(formData);
    //console.log(formData.usernamee.value);
    let userName=formData.usernamee.value;
    let passwrd=formData.passwordd.value;
    if(userName.length>4 && passwrd.length>7){
        console.log('Success');
        formData.usernamee.style.border="5px solid green";
        formData.passwordd.style.border="5px solid green";
        formData.buttonn.disabled=false;

    
    }else{
        formData.usernamee.style.border='4px solid red';
        formData.passwordd.style.border='4px solid red';
        formData.buttonn.disabled=true;

    }

}

// function validatePass(){
//     let formData1=document.forms[0];
//     let passwrd=formData1.passwordd.value;
//     if(passwrd.length>3){
//         console.log('success');
//         formData1.passwordd.style.border="5px solid green";
//     }else{
//         formData1.passwordd.style.border='4px solid blue';
//     }

// }
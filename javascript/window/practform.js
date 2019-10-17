// function validateForm()
// {
//     let formData= document.forms[0];
//     let uname = formData.username.value;
//     let pass = formData.password.value;

//     if(uname.length>4 && pass.length>2)
//     {
//         formData.username.style.border = "5px solid green";
//         formData.password.style.border = "5px solid green";
//         formData.btn.disabled = false;
//     }
//     else{
//         formData.username.style.border = "5px solid red";
//         formData.password.style.border = "5px solid red";
//         formData.btn.disabled = true;
//     }
// }


function validate()
{
    let formData = document.forms['emp'];
    let password = formData.pass.value;
    let cpassword = formData.cpass.value;

    if(password === '' && cpassword === '')
    {
        return false;
    }
    if(password === cpassword)
    {
        alert('success');
        return true;
    }
    else{
        alert('not matching');
        return false;
    }
}
function validate(){
    let employeeData=document.forms['empForm'];
    let empPassword=employeeData.pass.value;
    let empcPassword=employeeData.cpass.value;
    if(empPassword===''&& empcPassword===''){
        
        return false;
    }
    if(empPassword===empcPassword){
        alert('Success');
        return true;
    }
    else{
        alert('Password not matching');
        return false; 
    }
}
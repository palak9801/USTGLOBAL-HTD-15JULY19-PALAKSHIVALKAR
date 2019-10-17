// let resultData=new Promise(function(resolve,reject){
//     if(11>10){
//        reject('failed');
//     }
//     else{
//         resolve('Success');
//     }
// });

// resultData.then((data)=>{
//     console.log('then block--'+data);
// }).catch((error)=>{
//     console.log('catch block--'+error);
// });



let empData=new Promise(function(resolve,reject){
    const emp=[
        {
            name:'palak',
            age:21


        },
        {
            name:'jenny',
            age:21
        },
        {
            name:'akshay',
            age: 50
        }

    ];
    if(10>10){
       reject('failed');
       
    }
    else{
        resolve(emp);
        
    }
});

empData.then((data)=>{
   // console.log('Emp block--',data);
   return data;
}).catch((error)=>{
    console.log('catch block--'+error);
}).then(function(data1){
    console.log('this is then block 2',data1);
});
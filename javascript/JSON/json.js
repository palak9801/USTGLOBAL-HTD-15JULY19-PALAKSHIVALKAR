let emp={
    name:'palak',
    age:21,
    hobbies:['singing','dancing']

}
console.log(`Employee name is ${emp.name}`);
console.log(emp);
let jsonobject=JSON.stringify(emp);
console.log(jsonobject);

let jsob=JSON.parse(jsonobject);
console.log(jsob);
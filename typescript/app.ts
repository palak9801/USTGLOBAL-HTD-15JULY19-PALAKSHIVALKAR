// let myNmae='palak';
// let company;            //implicitly it is taking it as any type
// company='ustglobal';
// company=23;
// alert(myNmae);
// console.log(myNmae);
// console.log(company);

// let sample:number | boolean;
// sample=10;
// sample=true;
// console.log(sample);


// let myArray:string[]=['palak','palak'];
// console.log(myArray);

// let myTuple:[string, number, boolean]=['palak',25, false];  //similar to array but we have to mention each and every datatype present in it in the same order
// console.log(myTuple);


// enum colors{
//     red='danger',            //can be assigned with number and string
//     green='success',
//     black='info',
//     blue='primary'
// }
// console.log(colors.blue);    //it will initialize every variable with number starting with 0 and will return number

// class Person{      //let, const , var keyword cannot be used inside the class

// name:string;
// age:number;

// constructor( public pname:string, public page:number){
//     //  this.name=pname;
//     //  this.age=page;


// }
// }

// let person=new Person('palak',21);       //class object
// console.log(person.pname);


// let myNamee ='palakak';     //nullable type
// myNamee=null;


// class Car{
//     //  brand : string='BMW';
//     //  static model: string='X5';
//      constructor(public brand:string, public model:string){

//      }
// }
// let c=new Car();
// console.log('brand--'+c.brand);   //non static member

// console.log('model--'+Car.model)     // static member

// let b=new Car('merc','x5');
// console.log(b.brand);    //constructor object
// console.log(b.model);


// let c:Car={                                 //another way to create an object
//     brand:'benz',
//     model:'0002'
// }



//inheritance


// class Person{
//     salary:number=52147;
//     constructor(public name:string, public age:number){   //super class

//     }

// }
// class Student extends Person{    //sub class
    
//     constructor(public myName:string,public myAge:number, public usn:number){
//         super(myName,myAge);
//     }
// }
// let peron1=new Person('palak',21);
// let student1= new Student('jenny',21,1254789658);
// console.log(student1.salary);        //using child object parent members can be accessed
// console.log(student1.myAge);

 // class in angular
//  class Person{
//      constructor(public name:string, public age:number, public degree?: string)
//      {}
//  }

//  let person1:Person={
//      name:'palak',
//      age:21
//  }

//  let person2:Person={
//      name:'xyz',
//      age:22,
//      degree:'BE'
//  }




//interface

// interface Student{
//     name:string;
//     age:number;
//     printDetails():void;    //abstract function i.e a function that do not have body
// }

// class Person implements Student{
//     name='palak';
//     age=21;
//     printDetails(){
//         console.log('name is--'+this.name);
//     }
// }

// let person1= new Person();    //object created to run the method printDetails
// person1.printDetails();

// let student1:Student={
//     name:'qwe',
//     age:22,
//     printDetails:()=>{
//         console.log('age is--'+student1.age);
//     }
// }

// student1.printDetails();



//generic

// function getArray<p>(items:p[]):p[]{
//     return new Array<p>().concat(items);
// }
// let strArray=getArray<string>(['fdfs','sdsd','sffff','sdffs']);
// let numArray=getArray<number>([126,25,4,58]);
// strArray.push('sdffdf');
// numArray.push(52);

// /// <reference path="./rectangle.ts" />

// RectOperation.rectangle.area(20,51);





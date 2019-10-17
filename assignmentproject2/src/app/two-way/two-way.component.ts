import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent implements OnInit {

  backgroundColor='cyan';
  

  constructor() {
    console.log('constructor is running');
   }
  
buttonEvent(data){
  console.log(data);
}

changeColor(data){
  // this.backgroundColor='yellow';

  // if(this.backgroundColor==='cyan')
  // {
  //   this.backgroundColor='yellow'
  // }
  // else{
  //   this.backgroundColor='cyan'
  // }

  
    this.backgroundColor=data;
  
}

  ngOnInit():void {
    console.log('ng OnInit implemented');
  }

}

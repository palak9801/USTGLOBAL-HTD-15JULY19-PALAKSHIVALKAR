import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() uname:string;     //from parent to child

  @Output() notify:EventEmitter<string>= new EventEmitter<string>();


  passData(){
    this.notify.emit("this is from child");
  }
  

 


  
 

  constructor() { }

  ngOnInit() {
  }

}

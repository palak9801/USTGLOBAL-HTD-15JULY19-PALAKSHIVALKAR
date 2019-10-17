import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

 username:string="palak";    //from parent to child

 childData:string;
 parentMethod(data){
   this.childData=data;
 }

 
  constructor() { }

  ngOnInit() {
  }

}

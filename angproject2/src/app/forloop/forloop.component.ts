import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forloop',
  templateUrl: './forloop.component.html',
  styleUrls: ['./forloop.component.css']
})
export class ForloopComponent implements OnInit {

  users:string[]=['palak','palak1','palak2'];

  userss:any[]=
  [{
    name:'palak',
    age:21
  },
{
  name:'palak1',
  age:22
},
{
  name:'palak3',
  age:23
}];

  constructor() { }

  ngOnInit() {
  }

}

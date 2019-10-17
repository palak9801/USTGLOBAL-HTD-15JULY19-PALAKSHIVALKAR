import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
condition= false;
  users=[
    {
         id:1987,
         name:'palak',
         city:'mumbai'
  },
  {
    id:2587,
    name:'jenny',
    city:'mumbai'
},
{
  id:3654,
  name:'simran',
  city:'pune'
},
{
  id:4777,
  name:'gaurav',
  city:'mumbai'
},
{
  id:4587,
  name:'ameya',
  city:'mumbai'
}

]

  constructor() { }

  removeUser(uu){
    let index= this.users.indexOf(uu);
    this.users.splice(index, 2);
    this.condition = true;

  }

  ngOnInit() {
  }

}

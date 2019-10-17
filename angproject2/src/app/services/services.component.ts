import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css']
})
export class ServicesComponent implements OnInit  {
  
  users:any[];
  

  constructor(private userService:UsersService) { }

  ngOnInit() {
    // this.users=this.userService.getAllUsers();
   
  }

}

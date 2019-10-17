import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  users = [];

  constructor() { }

  // printForm(loginForm,emaill )
  // {
  //   console.log(loginForm);
  //   // console.log(emaill);
  // }

  printForm(loginForm:NgForm)
  {
    
    this.users.push(loginForm.value);
    console.log(loginForm.value);
    console.log(this.users);
    loginForm.reset();
  }

  ngOnInit() {
  }

}

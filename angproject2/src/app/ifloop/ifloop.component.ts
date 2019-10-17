import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ifloop',
  templateUrl: './ifloop.component.html',
  styleUrls: ['./ifloop.component.css']
})
export class IfloopComponent implements OnInit {


  isUserLoggedIn: boolean=false;

  constructor() { }

  ngOnInit() {
  }

}

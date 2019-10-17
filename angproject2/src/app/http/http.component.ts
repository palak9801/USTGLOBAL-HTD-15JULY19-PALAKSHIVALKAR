import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-http',
  templateUrl: './http.component.html',
  styleUrls: ['./http.component.css']
})
export class HttpComponent implements OnInit {
  users:any[]=[];
  constructor(private userService:UsersService) { 
    // this.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=8949465a56a545c6863dce8352e1a535').subscribe((data) =>
    // {
    //           this.users=data.articles;
    //           console.log(this.users);
    // }
    // )
  }

  ngOnInit() {
    
  }

}

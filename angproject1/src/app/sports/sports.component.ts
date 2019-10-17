import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  sportsNews: any[]=[];

  constructor(private http: HttpClient) { 

    http.get<any>('https://newsapi.org/v2/top-headlines?category=sports&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.sportsNews = resData.articles;
      console.log(this.sportsNews);
    })
  }

  ngOnInit() {
  }

}

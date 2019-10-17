import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  generalNews: any[]=[];
  indianNews: any[]=[];
  technologyNews: any[]=[];

  constructor(private http: HttpClient) {

    http.get<any>('http://newsapi.org/v2/top-headlines?category=general&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.generalNews = resData.articles;
      console.log(this.generalNews);
    })

    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.indianNews = resData.articles;
      console.log(this.indianNews);
    })

    http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.technologyNews = resData.articles;
      console.log(this.technologyNews);
    })
    
   }

  ngOnInit() {
  }

}

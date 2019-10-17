import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-business',
  templateUrl: './business.component.html',
  styleUrls: ['./business.component.css']
})
export class BusinessComponent implements OnInit {

  businessNews: any[]=[];

  constructor(private http: HttpClient) {

    http.get<any>('https://newsapi.org/v2/top-headlines?category=business&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.businessNews = resData.articles;
      console.log(this.businessNews);
    })
   }

  ngOnInit() {
  }

}

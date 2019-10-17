import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {

  healthNews: any[]=[];

  constructor(private http: HttpClient) { 

    http.get<any>('https://newsapi.org/v2/top-headlines?category=health&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.healthNews = resData.articles;
      console.log(this.healthNews);
    })
  }

  ngOnInit() {
  }

}

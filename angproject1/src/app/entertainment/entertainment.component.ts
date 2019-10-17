import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {

  entertainmentNews: any[]=[];

  constructor(private http: HttpClient) { 

    http.get<any>('http://newsapi.org/v2/top-headlines?category=entertainment&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.entertainmentNews = resData.articles;
      console.log(this.entertainmentNews);
    })
  }

  ngOnInit() {
  }

}

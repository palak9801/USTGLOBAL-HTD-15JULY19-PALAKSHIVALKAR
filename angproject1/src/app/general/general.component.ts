import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-general',
  templateUrl: './general.component.html',
  styleUrls: ['./general.component.css']
})
export class GeneralComponent implements OnInit {

  generalNews: any[]=[];

  constructor(private http: HttpClient) { 

    http.get<any>('http://newsapi.org/v2/top-headlines?category=general&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.generalNews = resData.articles;
      console.log(this.generalNews);
    })
  }

  ngOnInit() {
  }

}

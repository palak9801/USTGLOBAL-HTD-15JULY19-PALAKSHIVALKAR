import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technologyNews: any[]=[];

  constructor(private http: HttpClient) { 

    http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.technologyNews = resData.articles;
      console.log(this.technologyNews);
    })
  }

  ngOnInit() {
  }

}

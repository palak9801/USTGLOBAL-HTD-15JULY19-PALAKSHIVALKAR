import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-science',
  templateUrl: './science.component.html',
  styleUrls: ['./science.component.css']
})
export class ScienceComponent implements OnInit {

  scienceNews: any[]=[];

  constructor(private http: HttpClient) {

    http.get<any>('https://newsapi.org/v2/top-headlines?category=science&apiKey=8949465a56a545c6863dce8352e1a535').subscribe(resData => {
      this.scienceNews = resData.articles;
      console.log(this.scienceNews);
    })
   }

  ngOnInit() {
  }

}

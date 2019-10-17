import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {
     isSuccess=true;
     classesArray=["text-danger","bg-dark","mt-5"];
  constructor() { }

  ngOnInit() {
    // setTimeout(() => {
    //   this.isSuccess=false;
    // }, 5000);

    setInterval(() => {
      this.isSuccess=!this.isSuccess;
    },1000)
  }

}

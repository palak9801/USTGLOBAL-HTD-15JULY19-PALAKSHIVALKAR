import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {


  paageTitle: string ="dATA binding in angular";
  img: string = "./assets/images/big1.jpg";
  buttonStatus: boolean = true;

  changeTitle(){
    this.paageTitle="DATA BINDING";
  }

  constructor() { }

  ngOnInit() {
  }

}

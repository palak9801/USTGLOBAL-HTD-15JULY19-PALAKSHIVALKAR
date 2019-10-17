import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {


  carData: any = '';
  car = [
    {
      img: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      model: 'Cuba',
      color: 'red'
    },
    {
      img: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name: 'Sports Car',
      color: 'Red-Black'
    },
    {
      img: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      name: 'Auto Car',
      color: 'White'
    }
  ]

  send(car) {
    this.carData = car;
    console.log(car);
  }

  ngOnInit() {

  }

}

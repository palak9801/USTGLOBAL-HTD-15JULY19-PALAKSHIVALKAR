import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikeData: any ='';
  bikes = [
    {
      brand: 'ktm',
      desc: 'fghjskdfgbtyuildfhjkdfvok',
      img: 'https://cdn.pixabay.com/photo/2019/08/06/08/21/golden-4387704__340.jpg'
    },
    {
      brand: 'ktm',
      desc: 'fghjskdfgbtyuildfhjkdfvokdfghjklkjhgfddfghjk',
      img: 'https://cdn.pixabay.com/photo/2019/08/06/08/21/golden-4387704__340.jpg'
    },
    {
      brand: 'ktm',
      desc: 'fghjskdfgbtyuildfhjkdfvokd',
      img: 'https://cdn.pixabay.com/photo/2019/08/06/08/21/golden-4387704__340.jpg'
    },
    {
      brand: 'ktm',
      desc: 'fghjskdfgbtyuildfhjkdfvokdfghjklkk',
      img: 'https://cdn.pixabay.com/photo/2019/08/06/08/21/golden-4387704__340.jpg'
    },
    {
      brand: 'ktm',
      desc: 'fghjskdfg',
      img: 'https://cdn.pixabay.com/photo/2019/08/06/08/21/golden-4387704__340.jpg'
    }
    
  ]

 
  

  constructor() { }


  sendBike(bike)
  {
    this.bikeData = bike;
    console.log(bike);
  } 
  ngOnInit() {
  }

}

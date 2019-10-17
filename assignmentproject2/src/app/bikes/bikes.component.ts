import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikeData: any='';
     bikes=[
       {
         brand:'KTM',
         img: 'https://cdn.pixabay.com/photo/2017/08/13/13/14/motorcycle-2637088__340.jpg',
         description:'KTM AG (the former KTM Sportmotorcycle AG) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. ... KTM is known for its off-road motorcycles (enduro, motocross and supermoto).'
       },
       {
        brand:'Royal Enfield',
        img: 'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972008__340.jpg',
        description:'The 346cc, single cylinder, 4-stroke, twin-spark motor generates a maximum output of 20.08PS at 5250rpm and 28Nm of torque at 4000rpm. The power is transferred to the rear wheel via a five-speed gearbox. The Classic has a fuel capacity of 13.5 litres and weighs in at 192kg'
      },
      {
        brand:'TVS Apache 180',
        img: 'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819_1280.jpg',
        description:'DGFHGJJKJHGFDSDFGHJHGFDS'
      },
      {
        brand:'RX100',
        img: 'https://image.shutterstock.com/image-photo/red-road-bike-cruiser-motorcycle-260nw-555368767.jpg',
        description:'Yamaha RX 100 Review The seat was kept straight in order to provide the most comfortable ride possible at the time of its launch. ... The biggest plus point for the RX100 was its performance. It had a 98 cc, 2 stroke engine. Being air cooled, it produced 11 BHP @ 7500 rpm and 10.39 NM @ 6500 rpm.'
      },
      {
        brand:'Chopper',
        img: 'https://cdn.pixabay.com/photo/2016/01/20/17/31/motorcycle-1152008__340.jpg',
        description:'While the term "chopper" is generally used to describe a motorcycle or bicycle that has had some of its original parts replaced with custom parts, todays definition has grown to include custom motorcycles and bicycles that are low to the ground, usually with extended forks creating a long front end.'
      }
     
      
     ]
  constructor() { }
    
  ngOnInit() {
  }
  sendBike(bike){
    this.bikeData=bike;
    console.log(bike);
  }

}

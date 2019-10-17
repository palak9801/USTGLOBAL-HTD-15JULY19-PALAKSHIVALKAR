import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  carData: any='';
  cars=[
    {
      brand:'Aston Martin',
      img: 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg',
      description:'Aston Martin Lagonda Global Holdings plc is a British independent manufacturer of luxury sports cars and grand tourers. It was founded in 1913 by Lionel Martin and Robert Bamford. Steered from 1947 by David Brown, it became associated with expensive grand touring cars in the 1950s and 1960s, and with the fictional character James Bond following his use of a DB5 model in the 1964 film Goldfinger. Their sports cars are regarded as a British cultural icon.[2] Aston Martin has held a Royal Warrant as purveyor of motorcars to the Prince of Wales since 1982.[3] It has over 150 car dealerships in over 50 countries on six continents, making them a global automobile brand.[4] The company is traded at the London Stock Exchange and is a constituent of the FTSE 250 Index.[5] In 2003 it received the Queens Award for Enterprise for outstanding contribution to international trade.'
    },
    {
     brand:'Amg Mercedes.',
     img: 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
     description:'The Mercedes-AMG GT combines the fascination of an authentic sports car with segment-specific technology leadership and high practicality. With a top speed of 304 km/h and an acceleration from 0 to 100 km/h in 4.0 seconds, the Mercedes-AMG GT fits optimally into a sporty lifestyle.'
   },
   {
     brand:'Maserati',
     img: 'https://cdn.pixabay.com/photo/2016/09/06/11/15/maserati-1648831__340.jpg',
     description:'Maserati (Italian: [mazeˈraːti]) is an Italian luxury vehicle manufacturer established on 1 December 1914, in Bologna.[4] The Maserati tagline is "Luxury, sports and style cast in exclusive cars",[5] and the brands mission statement is to "Build ultra-luxury performance automobiles with timeless Italian style, accommodating bespoke interiors, and effortless, signature sounding power'
   },
   {
     brand:'Lamborghini',
     img: 'https://cdn.pixabay.com/photo/2017/03/20/04/57/truck-2158284__340.png',
     description:'Automobili Lamborghini S.p.A. is an Italian brand and manufacturer of luxury sports cars and SUVs based in Sant Agata Bolognese and tractors Lamborghini Trattori in Pieve di Cento, Italy. The company is owned by the Volkswagen Group through its subsidiary Audi'
   },
   {
     brand:'Wiesmann',
     img: 'https://cdn.pixabay.com/photo/2017/11/09/09/43/wiesmann-gt-mf4-2932846__340.png',
     description:'New Wiesmann sports car coming in 2019. ... On Tuesday, Wiesmann confirmed that its new sports car will be unveiled in 2019. And like previous Wiesmann offerings, the new car will be powered by a V-8 sourced from BMW. We hope its the 4.4-liter twin-turbocharged V-8 delivering over 600 horsepower in the latest BMW M5.'
   },
   {
    brand:'Ford Mustang',
    img: 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
    description:'The Ford Mustang is an American car manufactured by Ford. It was originally based on the platform of the second generation North American Ford Falcon, a compact car.[2] The original 1962 Ford Mustang I two-seater concept car had evolved into the 1963 Mustang II four-seater concept car which Ford used to pretest how the public would take interest in the first production Mustang. The 1963 Mustang II concept car was designed with a variation of the production models front and rear ends with a roof that was 2.7 inches shorter.[3] Introduced early on April 17, 1964[4] (16 days after the Plymouth Barracuda), and thus dubbed as a 1964½ by Mustang fans, the 1965 Mustang was the automakers most successful launch since the Model A.[5] The Mustang has undergone several transformations to its current sixth generation..'
  },
  {
    brand:'Ferrari',
    img: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
    description:'Ferrari (/fəˈrɑːri/; Italian: [ferˈraːri]) is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeos race division as Auto Avio Costruzioni, the company built its first car in 1940. However, the companys inception as an auto manufacturer is usually recognized in 1947, when the first Ferrari-badged car was completed. In 2014 Ferrari was rated the worlds most powerful brand by Brand Finance.[3] In June 2018, the 1964 250 GTO became the most expensive car in history, setting an all-time record selling price of $70 million'
  },
  {
    brand:'BMW',
    img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
    description:'BMW (German pronunciation: [ˈbeːˈʔɛmˈveː] (About this soundlisten)) is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945.Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad. In 2015, BMW was the worlds twelfth largest producer of motor vehicles, with 2,279,503 vehicles produced'
  },
  {
    brand:'Audi',
    img: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    description:'Audi AG (German: [ˈaʊ̯di ʔaːˈɡeː] (About this soundlisten)) is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide.The origins of the company are complex, going back to the early 20th century and the initial enterprises (Horch and the Audiwerke) founded by engineer August Horch; and two other manufacturers (DKW and Wanderer), leading to the foundation of Auto Union in 1932. The modern era of Audi essentially began in the 1960s when Auto Union was acquired by Volkswagen from Daimler-Benz.[10] After relaunching the Audi brand with the 1965 introduction of the Audi F103 series, Volkswagen merged Auto Union with NSU Motorenwerke in 1969, thus creating the present day form of the company.'
  },
  {
    brand:'Corvette',
    img: 'https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg',
    description:'The Chevrolet Corvette C7.R is a grand tourer racing car built by Pratt & Miller and Chevrolet for competition in endurance racing. It is a replacement for the Corvette C6.R racing car, using the C7 generation Chevrolet Corvette as a base. The C7 road car was noted to incorporate development from the Corvette C6.R, thus those properties also carry over to the race car. The Corvette Racing C7.R races in the WeatherTech SportsCar Championship in the GT Le Mans (GTLM) class.[1]'
  }
  
   
  ]
  constructor() { }

  ngOnInit() {
  }

  sendCar(car){
    this.carData=car;
    console.log(car);
  }

}

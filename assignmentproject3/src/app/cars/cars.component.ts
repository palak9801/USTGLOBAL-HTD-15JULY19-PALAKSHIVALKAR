import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  constructor(private firebaseService : FirebaseService, private router: Router) { }

  updateCar(car){
    this.firebaseService.selectedCar = car;
    this.router.navigateByUrl('/firebase');
  }



  deleteCar(car){
    this.firebaseService.deleteData(car).subscribe(resData => {
      console.log(resData);
      this.firebaseService.getData();
    })

  }

  ngOnInit() {
    this.firebaseService.getData();
    // console.log(this.firebaseService.cars);
  }

}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Car } from './cars/car';




@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  

  url: string='https://car-firebase-51033.firebaseio.com/';

  selectedCar: Car = {
       brand: null,
       model: null,
       release: null,
       cost: null,
       unit: null
  }

  constructor( private http: HttpClient ) { }

  cars=[];

  getData(){
    this.http.get(`${this.url}cars.json`).pipe(map(resData =>{
         let carsArray = [];
      for( let key in resData)
      {
        carsArray.push({...resData[key], id: key});
      }
      return carsArray;
    })).subscribe(data =>{
       this.cars=data;
       console.log(data);
    }, err =>{
      console.log(err);
    });
  }

  postData(data){
    return this.http.post(`${this.url}/cars.json`,data);
  }

  updateData(data){
    return this.http.put(`${this.url}cars/${data.id}.json`, data);
  }

  deleteData(data){
    return this.http.delete(`${this.url}cars/${data.id}.json`, data);
  }



  ngDoCheck(){
    this.getData();
  }
}

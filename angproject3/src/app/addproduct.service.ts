import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { User } from './productdetail/user';



@Injectable({
  providedIn: 'root'
})
export class AddproductService {

  url: string='https://ang-assign.firebaseio.com/';

  selectedUser:User = {
    name: null,
    image:null,
    desc: null
    
}

  constructor(private http:HttpClient) { }

  users=[];

  getData(){
    this.http.get(`${this.url}users.json`).pipe(map(resData => {
      let usersArray =[];
      for(let key in resData){
        usersArray.push({...resData[key], id:key});
      }
      return usersArray;

    })).subscribe(data => {
      this.users = data;
      console.log(data);
    }, err=> {
      console.log(err);
    });
  }

  postData(data){
     
     return this.http.post(`${this.url}/users.json`,data);
  }

  updateData(data){
    return this.http.put(`${this.url}users/${data.id}.json`,data);
 }

 deleteData(data){
   return this.http.delete(`${this.url}users/${data.id}.json`,data);
 }

 ngDoCheck(){
   this.getData();
 }
}

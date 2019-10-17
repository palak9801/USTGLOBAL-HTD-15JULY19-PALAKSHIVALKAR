import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

    
  // getAllUsers(){
  //   return [
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},        this is for service 
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},
  //     {id:101, name:'palak'},

  //   ]


 
  constructor(private http: HttpClient) { }

  // getAllUsers(){
  //   return this.http.get("https://newsapi.org/v2/top-headlines?country=us&apiKey=8949465a56a545c6863dce8352e1a535");
  // }
  // }
}

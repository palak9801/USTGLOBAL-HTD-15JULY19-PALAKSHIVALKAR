import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  firebaseUrl = "https://add-product-5a0a1.firebaseio.com/";

  constructor(private http: HttpClient) { }

  sendData(data) {
    return this.http.post(`${this.firebaseUrl}/student.json`, data);
  }

  getData() {
    return this.http.get(`${this.firebaseUrl}/student.json`).pipe(map(data => {

      let newArray: any[] = [];
      for (let key in data) {
        newArray.push({ ...data[key], id: key });
      }
      return newArray;

    }))
  }

  updateData(key, data) {
    return this.http.patch(`${this.firebaseUrl}/student/${key}.json`, data);
  }

  deleteData(key) {
    return this.http.delete(`${this.firebaseUrl}/student/${key}.json`)
  }

}

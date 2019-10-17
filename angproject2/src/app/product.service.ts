import { Injectable } from '@angular/core';

import { map } from 'rxjs/Operators';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   
   fireBaseUrl = 'https://add-product-5a0a1.firebaseio.com/'

  constructor( private http : HttpClient) { }

  sendData(data)
  {
    return this.http.post(`${this.fireBaseUrl}/product.json`, data);
  }

  getData()
  {
    return this.http.get(`${this.fireBaseUrl}/product.json`).pipe(map(data =>
      {
        let newArray : any[]=[];
        for( let key in data)
        {
          newArray.push({...data[key], id: key});
        }
        return newArray;
      }))
  }

  UpdateData(key, data)
  {
    return this.http.patch(`${this.fireBaseUrl}/product/${key}.json`, data);
  }

  deleteData(key)
  {
    return this.http.delete(`${this.fireBaseUrl}/product/${key}.json`);
  }
}

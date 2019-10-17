import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
   product: {
                id: '',
                name: '',
                url: '',
                desc: ''
   }
   Products: any[] = [];
  constructor(private service: ProductService) {
       this.getData();
   }

   getData()
   {
     this.service.getData().subscribe(data =>
      {
        this.Products= data;
      }, err =>
      {
        console.log(err);
      }, () =>
      {
        console.log("got data");
      })
   }

   sendProduct(product)
   {
     this.product.id = product.id;
     this.product.name = product.name;
     this.product.url = product.url;
     this.product.desc = product.desc;
   }

   UpdateData(key, data)
   {
     this.service.UpdateData(key, data).subscribe(data =>
      {
        console.log(data);
        this.getData();
      }, err =>
      {
        console.log(err);
      }, () =>
      {
        console.log("update data");
      })
   }

   deleteData(key)
      {
        this.service.deleteData(key).subscribe(data =>
          {
            console.log(data);
            this.getData();
          }, err =>
          {
            console.log(err);
          }, () =>
          {
            console.log("data deleted")
          })
      }

  ngOnInit() {
  }

}

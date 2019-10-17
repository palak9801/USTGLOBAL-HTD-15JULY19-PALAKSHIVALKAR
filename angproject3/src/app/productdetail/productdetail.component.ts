import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { AddproductService } from '../addproduct.service';


@Component({
  selector: 'app-productdetail',
  templateUrl: './productdetail.component.html',
  styleUrls: ['./productdetail.component.css']
})
export class ProductdetailComponent implements OnInit {
 

  constructor(private addproductService: AddproductService, private router: Router) { }
 

  updateUser(user){
     
    this.addproductService.selectedUser = user;   
    this.router.navigateByUrl('/addproduct');

     
    //  this.firebaseService.updateData(user).subscribe(resData=>{
    //    console.log(resData);
    //  }, err=>{
    //    console.log(err);
    //  });

  }

  deleteUser(user){
    this.addproductService.deleteData(user).subscribe(resData => {
      console.log(resData);
       this.addproductService.getData();
    })
  }



  ngOnInit() {

    this.addproductService.getData();
  };

}

import { Component, OnInit } from '@angular/core';

import { NgForm }  from '@angular/forms';
import { Router } from '@angular/router';
import { AddproductService } from '../addproduct.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private addproductService: AddproductService, private router: Router) { }

  postUser(form: NgForm)
  {
     if(form.value.id){
       this.addproductService.updateData(form.value).subscribe(resData =>{
         console.log(resData);
         this.addproductService.getData();
         form.reset();
         this.router.navigateByUrl('/users');
       }, err => {
         console.log(err);
       })
     } else{
        // console.log(UserForm.value);
        this.addproductService.postData(form.value).subscribe((data) =>{
          console.log(data);
          this.addproductService.getData();
        form.reset();
        this.router.navigateByUrl('/users');
        }, err=> {
          console.log(err);
        })
      }
  }


  ngOnInit() {
  }

}

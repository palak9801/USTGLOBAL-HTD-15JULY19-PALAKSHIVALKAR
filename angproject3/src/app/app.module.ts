import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { BindingComponent } from './binding/binding.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductdetailComponent } from './productdetail/productdetail.component';

@NgModule({
  declarations: [
    AppComponent,

    HeaderComponent,
    HomeComponent,
    RegisterComponent,
    BindingComponent,
    AddproductComponent,
    ProductdetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      
      { path: '', component: HomeComponent},
      { path: 'register', component: RegisterComponent},
      { path: 'addproduct', component: AddproductComponent},        //3
      { path: 'productdetail', component: ProductdetailComponent}
    ]),
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {RouterModule} from '@angular/router';


import { AppComponent } from './app.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { FormsModule } from '@angular/Forms';
import { CarsComponent } from './cars/cars.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    FirebaseComponent,
    CarsComponent,
    HeaderComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      { path:'',component:HeaderComponent},
      {path:'firebase', component:FirebaseComponent},
      { path:'cars', component:CarsComponent}

    ]),
    HttpClientModule
  

   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    CarDetailsComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {
        path: 'car', component: CarComponent
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

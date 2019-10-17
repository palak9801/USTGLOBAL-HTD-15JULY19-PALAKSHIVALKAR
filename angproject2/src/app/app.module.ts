import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GithubComponent } from './github/github.component';
import { TypicodeComponent } from './typicode/typicode.component';
import { HeaderComponent } from './header/header.component';
import { ForloopComponent } from './forloop/forloop.component';
import { IfloopComponent } from './ifloop/ifloop.component';

import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ServicesComponent } from './services/services.component';
import { HttpComponent } from './http/http.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { NewsComponent } from './news/news.component';
import { MoviesComponent } from './movies/movies.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { CarComponent } from './car/car.component';


@NgModule({
  declarations: [
    AppComponent,
    GithubComponent,
    TypicodeComponent,
    HeaderComponent,
    ForloopComponent,
    IfloopComponent,
   
    ParentComponent,
    ChildComponent,
    ServicesComponent,
    HttpComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    NewsComponent,
    MoviesComponent,
    AddProductComponent,
    ProductDetailsComponent,
    BikesComponent,
    BikeDetailsComponent,
    CarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,

    RouterModule.forRoot([
      { path:'github', component:GithubComponent},
      { path:'typicode', component: TypicodeComponent},
      {path: 'news', component: NewsComponent },
      {path: 'movies', component: MoviesComponent},
      { path: 'add-product', component: AddProductComponent},
      {path: 'product-details', component: ProductDetailsComponent},
      {path: 'bikes', component: BikesComponent},
      {path: 'bike-details', component: BikeDetailsComponent}
    ]),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

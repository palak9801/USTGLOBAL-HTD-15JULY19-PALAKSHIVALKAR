import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { NewsComponent } from './news/news.component';
import { MoviesComponent } from './movies/movies.component';
// import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/Forms';
import { FirebaseComponent } from './firebase/firebase.component';
import { BusinessComponent } from './business/business.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { GeneralComponent } from './general/general.component';
import { HealthComponent } from './health/health.component';
import { ScienceComponent } from './science/science.component';
import { SportsComponent } from './sports/sports.component';
import { TechnologyComponent } from './technology/technology.component';
import { UsersComponent } from './users/users.component';
import { Pipe1Pipe } from './pipe1.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    NewsComponent,
    MoviesComponent,
    FirebaseComponent,
    BusinessComponent,
    EntertainmentComponent,
    GeneralComponent,
    HealthComponent,
    ScienceComponent,
    SportsComponent,
    TechnologyComponent,
    UsersComponent,
    Pipe1Pipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    // AppRoutingModule,
    RouterModule.forRoot([
      {path:'', component:HeaderComponent},
      {path:'home', component:HomeComponent},

      {path:'news', component:NewsComponent},
      {path:'movies', component:MoviesComponent},
      {path:'business', component:BusinessComponent},
      {path:'entertainment', component:EntertainmentComponent},
      {path:'general', component:GeneralComponent},
      {path:'health', component: HealthComponent},
      {path:'science', component:ScienceComponent},
      {path:'sports', component:SportsComponent},
      {path:'technology', component:TechnologyComponent},
      {path:'users', component:UsersComponent},
      {path:'firebase', component:FirebaseComponent}
    ]),
    HttpClientModule 
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

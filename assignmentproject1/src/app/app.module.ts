import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';


import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { RecipesComponent } from './recipes/recipes.component';
import { RecipesDetailsComponent } from './recipes-details/recipes-details.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MobileComponent } from './mobile/mobile.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    CarDetailsComponent,
    RecipesComponent,
    RecipesDetailsComponent,
    NewsComponent,
    NewsDetailsComponent,
    MobileComponent,
    MobileDetailsComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      
      {
        path: 'car', component: CarComponent},
        {
          path: 'recipes', component: RecipesComponent},
          {
            path: 'news', component: NewsComponent},
            {
              path: 'mobile', component: MobileComponent}
  ])
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

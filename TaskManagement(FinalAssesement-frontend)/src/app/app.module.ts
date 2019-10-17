import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { AddTaskComponent } from './add-task/add-task.component';
import { EditTaskComponent } from './edit-task/edit-task.component';
import { ShowAllComponent } from './show-all/show-all.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
   
    AddTaskComponent,
    EditTaskComponent,
    ShowAllComponent
  ],
  imports: [
    FormsModule,
    HttpClientModule,
    BrowserModule,
     RouterModule.forRoot([
     {path:'add-task', component:AddTaskComponent},
     {path:'edit-task', component:EditTaskComponent},
     {path:'show-all', component:ShowAllComponent} 
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

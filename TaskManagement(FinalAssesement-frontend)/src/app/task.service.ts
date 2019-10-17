import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http : HttpClient) { }

  taskInfo:any[] = [];

  sendData(data){
    return this.http.post('http://localhost:8080/task/add', data);
  }

  getData(){
    return this.http.get('http://localhost:8080/task/get-all').subscribe(resData =>{
      console.log(resData);
      this.taskInfo = resData.tasks;
      console.log(this.taskInfo);
    },err=>{
      console.log(err);
    })
  }
 

  updateData(data){
    return this.http.put('http://localhost:8080/task/modify',data);
  }

  deleteData(data){
    return this.http.delete(`http://localhost:8080/task/remove/${data}`);
  }
}

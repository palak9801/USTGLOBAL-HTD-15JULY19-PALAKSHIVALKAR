import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {

  task = {
    taskname: '',

  }

  Tasks: any[];

  constructor(private service: ServiceService) { }

  getData() {
    this.service.getData().subscribe(data => {
      this.Tasks = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log("data got")
    })
  }

  sendStudent(student) {
    this.task.taskname = student.uname;

  }

  updateData(key, data) {
    this.service.updateData(key, data).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log("updated data")
    })
  }

  deleteData(key) {
    this.service.deleteData(key).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log("deleted data")
    })
  }

  ngOnInit() {
  }

}

import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  constructor(private service: TaskService, private router: Router) { }

  deleteTask(taskk) {
    this.service.deleteData(taskk).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl("/show-all");
    })
  }
  updateTask(taskk) {
    this.service.updateData(taskk).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl("/show-all");
    })
  }

  ngOnInit() {
    this.service.getData();
  }

}

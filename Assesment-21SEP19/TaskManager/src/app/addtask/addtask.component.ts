import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';


@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  task: any[] = [];

  constructor(private service: ServiceService) { }

  sendData(data) {

    this.service.sendData(data).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log("data send");
    })
  }


  printForm(form) {
    console.log(form.value);


  }

  ngOnInit() {
  }

}

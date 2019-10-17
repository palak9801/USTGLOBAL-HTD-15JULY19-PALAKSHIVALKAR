import { Component} from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
    redColor=true;
     name='palak';
     textClasses = 'bg-success text-white';
     paragraphStyle=true;
     padding='50px';
     columnSpan= 2;
     imgURL='https://cdn.pixabay.com/photo/2019/07/07/15/01/tulip-4322635__340.jpg';
  constructor() {
    setTimeout(() => {
       this.redColor=false;
       this.paragraphStyle=false;
    },5000);
   }

  

}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angproject3';

  // users: string[] = ['palak','palak1','palak2'];

    users: any[] = [
      {
        id:101,
        name:'palak',
        year:1998
      },
      {
        id:102,
        name:'palak1',
        year:1998
      },
      {
        id:103,
        name:'palak2',
        year:1998
      },
      {
        id:104,
        name:'palak3',
        year:1998
      }
      
      
      

    ]

}


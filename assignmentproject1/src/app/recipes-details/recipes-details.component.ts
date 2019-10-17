import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-recipes-details',
  templateUrl: './recipes-details.component.html',
  styleUrls: ['./recipes-details.component.css']
})
export class RecipesDetailsComponent implements OnInit {

  @Input() recipesDetails: any='';
  constructor() { }

  ngOnInit() {
  }

}

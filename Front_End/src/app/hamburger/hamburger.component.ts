import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-hamburger',
  templateUrl: './hamburger.component.html',
  styleUrls: ['./hamburger.component.css']
})
export class HamburgerComponent implements OnInit {

  constructor( private router: Router ) {  }

  home() {
    console.log("Inside home");
    this.router.navigate(['Home']);
  }

  ngOnInit() {
  }

}

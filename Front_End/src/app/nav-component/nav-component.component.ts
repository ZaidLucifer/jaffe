import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-nav-component',
  templateUrl: './nav-component.component.html',
  styleUrls: ['./nav-component.component.css']
})
export class NavComponentComponent implements OnInit {

  role:string;

  constructor(private router : Router) {
    this.role = localStorage.getItem("role");
    console.log("Constructor");
    console.log(this.role);
   }

  home() {
    this.router.navigate(['Home']);
  }

  login() {
    this.router.navigate(['Login']);
  }

  signUp() {
    this.router.navigate(['SignUp']);
  }

  viewComplaint(){
    this.router.navigate(['ViewComplaint']);
  }

  fillComplaint(){
    this.router.navigate(['ComplaintFrom']);
  }

  registerDepartment(){
    this.router.navigate(['Register']);
  }

  logout(){
    localStorage.removeItem("role");
    localStorage.removeItem("mailId");
    localStorage.removeItem("userId");
    this.ngOnInit();
    this.router.navigate(["Home"]);
  }

  ngOnInit() {
    this.role = localStorage.getItem("role");
    console.log("Hiiii");
  }

}

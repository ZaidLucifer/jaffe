import { Component, OnInit } from '@angular/core';
import { DateFormatter } from 'ngx-bootstrap/datepicker/date-formatter';
import{ Router } from '@angular/router';
import{ RegisterUserService } from '../register-user.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  name:string="";
  mailId:string="";
  password:string="";
  aadharNo:string;
  contactNo:string;
  address:string;
  emailResult:Boolean=false;
  passwordResult:Boolean=false;
  result;

  constructor(
    private router : Router,
    private service : RegisterUserService
  ) { }

  ngOnInit() {
  }
  checkEmailData() {
    
    console.log("Regex : "+!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.mailId));
    if(!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.mailId))
      this.emailResult=true;
    else
      this.emailResult=false;
      console.log(this.mailId); 
    console.log("Email:"+this.emailResult);
   }

   checkPasswordData() {
    if(this.password.length>7)
    this.passwordResult=false;
  else
    this.passwordResult=true;

    console.log(this.password);
    console.log("Password:"+this.passwordResult);
   }

  registerUser() {
    this.service.registerUser(this.name, this.mailId, this.password, this.aadharNo, this.contactNo, this.address)
    .subscribe((response)=>{
      console.log("Response : "+response);
      this.result = response.json();
      console.log("Result :"+this.result);
    });
    if(this.result == 'true'){
      this.router.navigate(["Login"]);
    }
  }

  signIn(){
    this.router.navigate(["Login"]);
  }

}

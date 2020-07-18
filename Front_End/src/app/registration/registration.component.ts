import { Component, OnInit } from '@angular/core';
import{ Router } from '@angular/router';
import{ RegisterUserService } from '../register-user.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  name:string="";
  mailId:string="";
  password:string="";
  certificateId:string="";
  contactNo:string="";
  pincode:string="";
  emailResult:Boolean=false;
  passwordResult:Boolean=false;
  result;
  role:string;

  constructor(
    private router : Router,
    private service : RegisterUserService
  ) {
    this.role = localStorage.getItem('role');
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

  registerNGO() {
    this.service.registerNGO(this.name, this.mailId, this.password, this.contactNo, this.certificateId,  this.pincode)
    .subscribe((response)=>{
      console.log("Response : "+response);
      this.result = response.json();
      console.log("Result :"+this.result);
    });
    if(this.result == 'true'){
      this.name="";
      this.mailId="";
      this.password="";
      this.certificateId="";
      this.contactNo="";
      this.pincode="";

    }
    else{
      this.name="";
      this.mailId="";
      this.password="";
      this.certificateId="";
      this.contactNo="";
      this.pincode="";
    }
  }

  registerPolice() {
    this.service.registerPolice(this.name, this.mailId, this.password, this.contactNo, this.pincode)
    .subscribe((response)=>{
      console.log("Response : "+response);
      this.result = response.json();
      console.log("Result :"+this.result);
    });
    if(this.result == 'true'){
      this.name="";
      this.mailId="";
      this.password="";
      this.certificateId="";
      this.contactNo="";
      this.pincode="";
    }
    else{
      this.name="";
      this.mailId="";
      this.password="";
      this.certificateId="";
      this.contactNo="";
      this.pincode="";
    }
  }

  ngOnInit() {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
  alert = "something went wrong"
  emailResult: Boolean = false;
  passwordResult: Boolean = false;
  buttonShow: Boolean = true;
  mailId: string = null;
  password: string = null;
  constructor(
    private loginService: LoginService,
    private router: Router) {  }

  checkEmailData() {
    //console.log("Regex : " + !/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.mailId));
    if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(this.mailId)) {
      this.emailResult = true;
    }
    else
      this.emailResult = false;
      console.log(this.mailId);
      console.log("Email:" + this.emailResult);
  }

  checkPasswordData() {
    if (this.password.length > 7)
      this.passwordResult = false;
    else
      this.passwordResult = true;

    console.log(this.password);
    console.log("Password:" + this.passwordResult);
  }

  onLogin() {
    if (!this.emailResult && !this.passwordResult) {
      console.log("Length : " + this.mailId);
      if (this.mailId != null && this.password != null) {
        console.log(this.mailId + "->" + this.password);
        this.loginService.loginUser(this.mailId, this.password).subscribe((response) => {
          console.log("Response : " + response);
          const result = response.json();
          console.log("Result is :" + result.role);
          console.log("Result is :" + result.mailId);
          localStorage.setItem("role",result.role);
          localStorage.setItem("mailId",result.mailId);
          localStorage.setItem("userId",result.id);
          this.router.navigate(["Home"]);
        })
      }
      else {
        console.log("In login");
        alert(" Oops!!! Something went wrong");
      }
    }
    else {
      console.log("In login");
      alert("Oops!!! Something went wrong");
    }
  }

  signUp(){
    this.router.navigate(["SignUp"]);
  }

  ngOnInit() {
  }

}

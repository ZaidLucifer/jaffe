import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { BsDatepickerModule } from 'ngx-bootstrap';
import { TabsModule } from 'ngx-bootstrap';

import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TestComponent } from './test/test.component';
import { PrivacyPolicyComponent } from './privacy-policy/privacy-policy.component';
import { NavComponentComponent } from './nav-component/nav-component.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { HamburgerComponent } from './hamburger/hamburger.component';
import { ComplaintViewComponent } from './complaint-view/complaint-view.component';
import { LoginService } from './login.service';
import { RegisterUserService } from './register-user.service';
import { AuthService } from './auth.service';
import { ComplaintService } from './complaint.service';
import { RegistrationComponent } from './registration/registration.component';
import { ComplaintFormComponent } from './complaint-form/complaint-form.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    TestComponent,
    PrivacyPolicyComponent,
    NavComponentComponent,
    LoginComponentComponent,
    SignUpComponent,
    HamburgerComponent,
    ComplaintViewComponent,
    RegistrationComponent,
    ComplaintFormComponent
  ],
  imports: [
    BsDropdownModule.forRoot(),
    BrowserModule,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    BsDatepickerModule.forRoot(),
    TabsModule.forRoot(),
    RouterModule.forRoot([
      {path: 'Home', component:HomePageComponent},
      {path: 'Login', component:LoginComponentComponent},
      {path: 'SignUp', component:SignUpComponent},
      {path: 'ViewComplaint', component:ComplaintViewComponent, canActivate: [AuthService]},
      {path: 'ComplaintFrom', component:ComplaintFormComponent, canActivate: [AuthService]},
      {path: 'Register', component:RegistrationComponent, canActivate: [AuthService]},
      {path: '**', redirectTo:'Home'}
    ])
  ],
  providers: [
    LoginService,
    AuthService,
    ComplaintService,
    RegisterUserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

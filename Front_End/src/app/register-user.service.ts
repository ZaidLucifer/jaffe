import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';

@Injectable()
export class RegisterUserService {
  url = 'http://localhost:8080/JaffeServer/user';
  
    constructor(private http: Http) {
    }

    registerUser(name:String, mailId:String, password:String, aadharNo:String, contactNo:String, address:String) {
      const body = {
        name: name,
        mailId: mailId,
        password:password,
        aadharNo: aadharNo,
        contactNo: contactNo,
        address: address
      };
  
      const header = new Headers({ 'Content-Type': 'application/json' });
      const requestOptions = new RequestOptions({ headers: header });
  
      return this.http
        .post(this.url + '/registerUser', body, requestOptions);
    }

    registerNGO(name:String, mailId:String, password:String, contactNo:String, certificateNo:String, pincode:String) {
      const body = {
        name:name,
        mailId:mailId,
        password:password,
        contactNo:contactNo,
        certificateNo:certificateNo,
        pincode:pincode
      };
      
      console.log(body);
      const header = new Headers({ 'Content-Type': 'application/json' });
      const requestOptions = new RequestOptions({ headers: header });
  
      return this.http
        .post(this.url+'/registerNGO', body, requestOptions);
    }

    registerPolice(name:String, mailId:String, password:String, contactNo:String, pincode:String) {
      const body = {
        name:name,
        mailId:mailId,
        password:password,
        contactNo:contactNo,
        pincode:pincode
      };
  
      const header = new Headers({ 'Content-Type': 'application/json' });
      const requestOptions = new RequestOptions({ headers: header });
  
      return this.http
        .post(this.url+'/registerPolice', body, requestOptions);
    }
}

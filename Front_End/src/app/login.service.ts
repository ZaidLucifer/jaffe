import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';

@Injectable()
export class LoginService {
  url = 'http://localhost:8080/JaffeServer/user';
  
    constructor(private http: Http) {
    }

    loginUser(mailId: string, password: string) {

      const body = {
        mailId: mailId,
        password: password,
      };

      console.log(mailId + " "+ password);
      const headers = new Headers({ 'Content-Type': 'application/json'});
      const requestOptions = new RequestOptions({ headers: headers,  withCredentials: true});
      
      return this.http
        .post(this.url+'/login', body, requestOptions);
        
    }
  
}

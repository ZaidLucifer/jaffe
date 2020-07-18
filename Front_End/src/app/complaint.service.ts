import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';

@Injectable()
export class ComplaintService {
  url = 'http://localhost:8080/JaffeServer/complaint';
  
    constructor(private http: Http) {
    }

    registerComplaint(address: string, pincode: string, complaintText: string) {
      const body = {
        address: address,
        pincode: pincode, 
        complaintText: complaintText,
        id: localStorage.getItem("userId")
      };
      console.log(address + " "+ pincode+" "+complaintText);
      const headers = new Headers({ 'Content-Type': 'application/json'});
      const requestOptions = new RequestOptions({ headers: headers,  withCredentials: true});
      
      return this.http
        .post(this.url+'/registerComplaint', body, requestOptions);
    }

    getComplaints(){
      const body = {
        userId: localStorage.getItem("userId")
      }

      console.log(localStorage.getItem("userId"));
      const headers = new Headers({ 'Content-Type': 'application/json'});
      const requestOptions = new RequestOptions({ headers: headers,  withCredentials: true});
      
      return this.http
        .post(this.url+'/getComplaints', body, requestOptions);

    }

    updateStatus(complaintId){
      const body = {
        complaintId: complaintId.toString()
      }

      console.log(complaintId);
      const headers = new Headers({ 'Content-Type': 'application/json'});
      const requestOptions = new RequestOptions({ headers: headers,  withCredentials: true});
      
      return this.http
        .post(this.url+'/updateStatus', body, requestOptions);
    }

    updateDepartment(complaintId){
      const body = {
        complaintId: complaintId.toString()
      }

      console.log(complaintId);
      const headers = new Headers({ 'Content-Type': 'application/json'});
      const requestOptions = new RequestOptions({ headers: headers,  withCredentials: true});
      
      return this.http
        .post(this.url+'/updateDepartment', body, requestOptions);
    }
}

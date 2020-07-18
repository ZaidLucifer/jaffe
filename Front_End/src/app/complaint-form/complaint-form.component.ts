import { Component, OnInit } from '@angular/core';
import { ComplaintService } from '../complaint.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-complaint-form',
  templateUrl: './complaint-form.component.html',
  styleUrls: ['./complaint-form.component.css']
})
export class ComplaintFormComponent implements OnInit {
  complaintText:string;
  pincode:string;
  address:string;
  role:string;

  constructor(
    private router: Router,
    private service: ComplaintService
  ) {
    this.role = localStorage.getItem('role');
   }

  onSubmit(){
    this.service.registerComplaint(this.address, this.pincode, this.complaintText).subscribe((response)=>{
      const result = response.json();
      console.log("Result "+result);
    })
  }

  ngOnInit() {
  }

}

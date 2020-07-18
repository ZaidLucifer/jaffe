import { Component, OnInit } from '@angular/core';
import { forEach } from '@angular/router/src/utils/collection';
import { ComplaintService } from '../complaint.service';

@Component({
  selector: 'app-complaint-view',
  templateUrl: './complaint-view.component.html',
  styleUrls: ['./complaint-view.component.css']
})
export class ComplaintViewComponent implements OnInit {

  role:string;
  status:string;
  helpedPeople:string;
  contents;
  
  constructor( private service : ComplaintService) {
    console.log("Inside here");
    this.role=localStorage.getItem("role");
  }

  ngOnInit() {
    this.service.getComplaints().subscribe((response)=>{
        console.log("Response"+response);
        this.contents = response.json();
        console.log("Result length is "+this.contents.length);
        this.contents.forEach(element => {
          console.log(element);
        });
    })
    console.log("Complaint view");
  }

  changeStatus(id){
    console.log("Id : "+id);
    this.service.updateStatus(id).subscribe((response)=>{
      console.log("Response is "+response);
    });
    this.ngOnInit();
  }

  searchDepartment(id){
    console.log("Id : "+id);
    this.service.updateDepartment(id).subscribe((response)=>{
      console.log("Response is : "+response);
    });
    this.ngOnInit();
  }

  statusFlip(id){
    console.log("Status : "+this.contents[id].status);
    if(this.contents[id].status == "PD")
      this.contents[id].status = "D";
    else {
      this.contents[id].status = "PD";
    }
    console.log();
  }

}

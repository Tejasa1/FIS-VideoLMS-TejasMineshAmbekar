import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.css']
})
export class RatingComponent implements OnInit {

  constructor(private service: AdminService) { }

  ngOnInit(): void {
  }

  srating: number=0;
  admin:any;

  searchDataByRating(){
    this.service.searchByRating(this.srating)
    .subscribe(
      response => {
        this.admin=response;
        console.log(response);
      }
    );
  }

}

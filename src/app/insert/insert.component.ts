import { Component, OnInit } from '@angular/core';
import { Admin } from 'src/Admin';
import { AdminService } from '../admin.service';


@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private service : AdminService) { }

  ngOnInit(): void {
  }

  iaid:any;   
  iname:any; 
  ilang:any;
  irating:any;
  itype:any;
  iactor1:any;
  iactor2:any;

  insertData(){
    let admin : Admin={
      "aid":this.iaid,  
      "name":this.iname,
      "lang":this.ilang,
      "rating":this.irating,
      "type":this.itype,
      "actor1":this.iactor1,
      "actor2":this.iactor2
    }

    this.service.insertAdminMovie(admin);
  }

}

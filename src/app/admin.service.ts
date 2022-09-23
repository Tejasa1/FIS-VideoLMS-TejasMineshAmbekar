import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private httpClient : HttpClient) { }


  
  getAll():any{
    return this.httpClient.get("http://localhost:8081/admins/all");
  }

  insertAdminMovie(post:any){
    this.httpClient.post("http://localhost:8081/admins/add",post)
    .subscribe(
      response =>{
        console.log(response);
      }
    );

  }

  searchByRating(rating:number){
    return this.httpClient.get("http://localhost:8081/admins/search/rating/"+rating)
  }


  deleteByAid(aid:number){
    this.httpClient.delete("http://localhost:8081/admins/delete/"+aid)
    .subscribe(
      response => {
        console.log(response);
      }
    );
  }



}

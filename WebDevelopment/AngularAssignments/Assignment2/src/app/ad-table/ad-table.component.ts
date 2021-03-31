import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AdModel } from '../ad-model';
import { ItemService } from '../services/item.service';

@Component({
  selector: 'app-ad-table',
  templateUrl: './ad-table.component.html',
  styleUrls: ['./ad-table.component.css']
})
export class AdTableComponent implements OnInit {

  constructor(private adService:ItemService, private router:Router) { }
  arrAds:AdModel[];
  serviceItems:Observable<AdModel[]> = null;
  public adArray:AdModel[] = [];
  ngOnInit(): void {
    this.serviceItems = this.adService.getAllAds();
    this.serviceItems.subscribe(data=>this.arrAds=data);
    //console.log("from ngOnInit where my array data transformed to object object");
    //console.log(this.arrAds);
  }
  deleteItem(item:any){
    console.log(item);
    this.adService.deleteAd(item);
    
  }
  updateItem(item:any){
    this.adService.toEditItem(item);
    console.log(item);
    
  }

}

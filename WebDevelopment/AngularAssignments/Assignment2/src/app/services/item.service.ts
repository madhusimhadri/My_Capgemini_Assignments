import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { AdModel, IAds } from '../ad-model';

@Injectable({
  providedIn: 'root'
})
export class ItemService {
  tempItem:AdModel = null;
  private allAds:Array<AdModel> =[
    { title: "myTitle", name: "myName", category: "Furniture", description: "kdhkj" }
  ];
  constructor() { }
  getAllAds():Observable<AdModel[]>{
    return of(this.allAds);
  }
  addNewAd(ad:AdModel):void{
    this.allAds.push(ad);
    console.log(this.allAds);
  }
  getAdByName(name:string):Observable<AdModel>{
    let item = this.allAds.find(ad => ad.name === name);
    return of(item);
  }
  deleteAd(ad:AdModel):AdModel[]{
    const index = this.allAds.findIndex(item => item.name === ad.name);
    const deletedItem = this.allAds.splice(index,1);
    return deletedItem;
  }
  toEditItem(item:AdModel):void{
    this.tempItem = item;
  }
  getTempItem():Observable<AdModel>{
    return of(this.tempItem);
  }
  updateItem(item:AdModel):void{
    const dItem = this.allAds.findIndex(idata => idata.name === item.name);
    this.allAds.splice(dItem,1);
    this.allAds.push(item);
  }

}

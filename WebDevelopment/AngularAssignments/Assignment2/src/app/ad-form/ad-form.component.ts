import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Observable } from 'rxjs';
import { AdModel } from '../ad-model';
import { ItemService } from '../services/item.service';

@Component({
  selector: 'app-ad-form',
  templateUrl: './ad-form.component.html',
  styleUrls: ['./ad-form.component.css']
})
export class AdFormComponent implements OnInit {

  constructor(private adService:ItemService) { }
  //serviceItems:Observable<AdModel> = null;
  adsModel = new AdModel("myName","myTitle","","");
  @Output() childToParent = new EventEmitter<AdModel>();
  public categories=['Furniture','Hardware','Mobile'];
  ngOnInit(): void {
   
  }
  onSubmit(){
    this.childToParent.emit(this.adsModel);
    this.adService.addNewAd(this.adsModel);
  }

}

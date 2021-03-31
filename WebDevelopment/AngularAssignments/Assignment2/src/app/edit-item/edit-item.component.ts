import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router} from '@angular/router';
import { Observable } from 'rxjs';
import { AdModel, IAds } from '../ad-model';
import { ItemService } from '../services/item.service';

@Component({
  selector: 'app-edit-item',
  templateUrl: './edit-item.component.html',
  styleUrls: ['./edit-item.component.css']
})
export class EditItemComponent implements OnInit {
  
  serviceItem:Observable<AdModel>;
  constructor(private adService:ItemService, private route:ActivatedRoute,private router:Router) { }
  public categories=['Furniture','Hardware','Mobile'];

  public adModel:AdModel= new AdModel("","","","");

  public refModel:AdModel;
  public isReady = false;
  ngOnInit(): void {
    
    this.route.paramMap.subscribe((params:ParamMap)=>{
      this.isReady=true;
      let name:string = params.get('name').toString();
      this.serviceItem = this.adService.getAdByName(name);
      this.serviceItem.subscribe(data=>this.adModel = data);
      console.log("show");
      console.log(this.adModel);
      
    });
     
    //this.adModel = this.adService.getTempItem();
  }
  
  onSubmit(){
    let tempData = this.adService.getAdByName(this.adModel.name);
    //let tempData2:AdModel;
    tempData.subscribe(data=>this.refModel=data);
    this.adService.deleteAd(this.refModel);
    this.adService.addNewAd(this.adModel);
    this.isReady=false;
    this.router.navigateByUrl('/');

  }
  cancelUpdate(){
    this.isReady =false;
  }

}

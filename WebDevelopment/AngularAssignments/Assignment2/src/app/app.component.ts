import { Component, Input } from '@angular/core';
import { AdModel } from './ad-model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'A2n';
  public data:AdModel;
  childToParent(dat){
    this.data = dat;
    console.log(this.data);
    
  }
  addToArray(val){
    console.log(val);
  }
  
}

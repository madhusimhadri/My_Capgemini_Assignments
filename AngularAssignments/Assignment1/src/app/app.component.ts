import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap} from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'routing-Assignment';
  
  name="madhu";
  constructor(private route: ActivatedRoute,){}

  ngOnInit()
  {
    this.route.queryParams.subscribe(params => {
      this.name = params['name'];
    });
  }

}



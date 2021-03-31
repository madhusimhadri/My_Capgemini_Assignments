import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SecondComponent } from './second/second.component';
import { MenuComponent } from './menu/menu.component'; 
import { RestaurantComponent } from './restaurant/restaurant.component'; 

const routes: Routes = [
  {path: 'first-component', component: FirstComponent},
  {path: 'second-component', component: SecondComponent},
  {path: 'menu-component', component:MenuComponent},
  {path: 'restaurant-component', component:RestaurantComponent},
  { path: '',   redirectTo: '/first-component', pathMatch: 'full' },
  {path: '**',component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

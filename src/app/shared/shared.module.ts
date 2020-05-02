import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatToolbarModule, MatIconModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatToolbarModule,
    MatIconModule,
    NgbModule,
    RouterModule
  ],
  exports: [
    CommonModule,
    MatToolbarModule,
    MatIconModule,
    NgbModule,
    RouterModule
  ]
})
export class SharedModule { }

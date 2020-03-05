import { Book } from './../model/book.model';
import { HttpClient } from '@angular/common/http';
import { AdminRepository } from './../model/admin.repository';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {

  
  constructor(public repository: AdminRepository, private httpclient: HttpClient, public book: Book) { }

  ngOnInit() {
  }

 
}

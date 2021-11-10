import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sandbox',
  templateUrl: './sandbox.component.html',
  styleUrls: ['./sandbox.component.css']
})
export class SandboxComponent implements OnInit {

  constructor() { }


  children: Array<string> = [];
  newString!: string;

  ngOnInit(): void {
  }

  addChild() {
    // adding new child to the sandbox ( array )
    this.children.push(this.newString);
  }


}

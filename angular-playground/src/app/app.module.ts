import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PlaygroundComponent } from './components/playground/playground.component';
import { PoolComponent } from './components/playground/pool/pool.component';
import { SandboxComponent } from './components/playground/sandbox/sandbox.component';
import { CarouselComponent } from './components/playground/carousel/carousel.component';

@NgModule({
  declarations: [
    AppComponent,
    PlaygroundComponent,
    PoolComponent,
    SandboxComponent,
    CarouselComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
